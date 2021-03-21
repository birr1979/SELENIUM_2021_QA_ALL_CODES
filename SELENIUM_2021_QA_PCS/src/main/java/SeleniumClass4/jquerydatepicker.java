package SeleniumClass4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquerydatepicker {


    static String SetDate = "February 2022"; //dd/mm/yyyy
    static String day = "20";

    public static void main(String[] args) throws InterruptedException, ParseException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
        driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("02/12/2020");

        while (true) {
            String currentDateStr = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
//			System.out.println(currentDatestr);
            if (currentDateStr.equals(SetDate)) {
                break;
            } else {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            }

        }

        driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[4]/a")).click();


    }

}
