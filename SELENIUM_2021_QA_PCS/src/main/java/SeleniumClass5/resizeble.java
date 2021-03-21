package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class resizeble extends browser {

    public static void main(String[] args) throws InterruptedException {

        launchBrowser("chrome", "https://jqueryui.com/resizable/");
        driver.switchTo().frame(0);
        WebElement resize = driver.findElement(By.xpath("//body/div[@id='resizable']/div[3]"));
        System.out.println("Height: " + resize.getSize().getHeight() + " and width: " + resize.getSize().getWidth());

        Thread.sleep(3000L);
        action.dragAndDropBy(resize, 100, 0).build().perform();
        System.out.println("resize done");
        System.out.println("Height: " + resize.getSize().getHeight() + "and width: " + resize.getSize().getWidth());

    }

}
