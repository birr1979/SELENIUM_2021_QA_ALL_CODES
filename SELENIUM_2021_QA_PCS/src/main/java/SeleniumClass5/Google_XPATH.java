package SeleniumClass5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_XPATH {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //Allows upto a 3 second pause between each step --> Implicit Wait
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("http://www.google.com");

        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium HQ");

        driver.findElement(By.xpath("//input[@value='Google Search']")).click();

    }

}
