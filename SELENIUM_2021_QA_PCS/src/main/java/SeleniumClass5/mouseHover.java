package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();


        //Actions Class


        WebElement mouseHover = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]"));
        Actions action = new Actions(driver);
        // to hover to the element we need to move the mouse over to that element
        action.moveToElement(mouseHover).build().perform();


        //click element
        WebElement clickElement = driver.findElement(By.xpath("//span[contains(text(),'AmazonSmile Charity Lists')]"));
        action.click(clickElement).build().perform();


    }

}
