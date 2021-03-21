package SeleniumClass5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectable extends browser {

    public static void main(String[] args) {

        driver.get("https://jqueryui.com/selectable/");

        driver.switchTo().frame(0);
        List<WebElement> element = driver.findElements(By.xpath("(//body//ol//li)"));
        System.out.println("Size is: " + element.size());

        //option 1 to select all elements
        for (int i = 0; i < element.size(); i++) {

            action.keyDown(Keys.LEFT_CONTROL).build().perform();
            element.get(i).click();

        }

        //Option 2 to select individual elements

        action.clickAndHold().keyDown(Keys.CONTROL).build().perform();

        driver.findElement(By.xpath("(//body//ol//li)[1]")).click();
        driver.findElement(By.xpath("(//body//ol//li)[2]")).click();
        driver.findElement(By.xpath("(//body//ol//li)[3]")).click();
        driver.findElement(By.xpath("(//body//ol//li)[4]")).click();
        driver.findElement(By.xpath("(//body//ol//li)[5]")).click();
        driver.findElement(By.xpath("(//body//ol//li)[6]")).click();
        driver.findElement(By.xpath("(//body//ol//li)[7]")).click();


    }


}
