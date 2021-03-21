package SeleniumClass4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hotelsCalendar {

    static String month = "December, 2023";
    static String day = "16";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://phptravels.net/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

        //check the default date
        driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();


        Thread.sleep(2000);

        while (true) {
            String x = driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav")).getText();
            String[] xx = x.split("\n");
            String text = (xx[0] + " " + xx[1]);
            if (text.equals(month)) {
                break;
            } else {
                driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav/div[3]")).click();
            }

        }
        driver.findElement(By.xpath("((//div[@class='datepicker--cells datepicker--cells-days'])//div[contains(text()," + day + ")])[1]")).click();


//		driver.close();

    }

}
