package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick_contextClick extends browser {

    public static void main(String[] args) throws InterruptedException {


        launchBrowser("chrome", "http://deluxe-menu.com/popup-mode-sample.html");

        WebElement rightClick = driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
        action.contextClick(rightClick).build().perform();

        WebElement productInfo = driver.findElement(By.xpath("//*[@id=\"dm2m1i1tdT\"]"));
        action.moveToElement(productInfo).build().perform();
        Thread.sleep(1000L);
        WebElement supportedBrowser = driver.findElement(By.xpath("//td[@id='dm2m2i4tdT']"));
        action.moveToElement(supportedBrowser).build().perform();

        WebElement WindowsOs = driver.findElement(By.xpath("//td[@id='dm2m4i0tdT']"));
        action.moveToElement(WindowsOs).build().perform();

        WebElement firefox = driver.findElement(By.xpath("//*[@id=\"dm2m5i1tdT\"]"));
        action.click(firefox).build().perform();


    }

}
