package SeleniumClass5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmialautologin {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        String url = "https://accounts.google.com/signin";
        driver.get(url);
        driver.findElement(By.id("identifierId")).sendKeys("cp8805");
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("xxxxxx");
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
    }
}