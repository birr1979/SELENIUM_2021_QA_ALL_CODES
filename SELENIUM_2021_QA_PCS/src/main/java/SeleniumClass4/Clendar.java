package SeleniumClass4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clendar {

    static String month = "March 2022";
    static String day = "3";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.expedia.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        //click on the calendar tab
        driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();

        //capture the default date displayed in the calendar

        String x = driver.findElement(By.xpath("(//h2[@class='uitk-date-picker-month-name uitk-type-medium'])[1]")).getText();
        System.out.println("the default text on the calendar is : " + x);

        while (true) {
            String element = driver.findElement(By.xpath("(//h2[@class='uitk-date-picker-month-name uitk-type-medium'])[1]")).getText();
            if (element.equals(month)) {
                System.out.println("Month and date is matched with default.");
                break;
            } else {
                System.out.println("Month and date is not matched with default and clicking....");
                driver.findElement(By.xpath("(//button[@data-stid='date-picker-paging'])[2]")).click();
            }

        }

        driver.findElement(By.xpath("(//tbody//tr//td//button[@data-day=" + day + "])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@data-stid='apply-date-picker']")).click();

    }

}
