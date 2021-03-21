package SeleniumClass5;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class select extends browser {

    public static void main(String[] args) throws InterruptedException {

        launchBrowser("fireFox", "https://jqueryui.com/selectable/");
        driver.switchTo().frame(0);


        List<WebElement> element = new ArrayList();
        element = driver.findElements(By.xpath("//ol//li"));

//		Actions action=new Actions(driver);
//		action.keyDown(Keys.LEFT_CONTROL).build().perform();
//		WebElement select7= driver.findElement(By.xpath("(//ol//li)[7]"));
//		select7.click();
//		WebElement select4= driver.findElement(By.xpath("(//ol//li)[4]"));
//		select4.click();


        for (int i = 0; i < element.size(); i++) {
            Actions action = new Actions(driver);
            action.keyDown(Keys.CONTROL).build().perform();
            element.get(i).click();


        }

    }

}
