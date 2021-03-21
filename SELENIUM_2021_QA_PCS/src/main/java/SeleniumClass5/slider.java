package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {


    // resize object
    //right click


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/slider/");

        //switch the Driver to the iframe --Special syntax

        driver.switchTo().frame(0); //since only 1 frame is in the DOM

        WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));

        Actions action = new Actions(driver);
        Thread.sleep(3000L);
        //drag to the right
        action.dragAndDropBy(slider, 450, 0).build().perform();

        //drag to the left
        action.dragAndDropBy(slider, -100, 0).build().perform();


    }

}
