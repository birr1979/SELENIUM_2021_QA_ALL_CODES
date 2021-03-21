package SeleniumClass5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class sortable extends browser {

    public static void main(String[] args) throws InterruptedException {
        launchBrowser("firefox", "https://jqueryui.com/sortable/");
        driver.switchTo().frame(0);
//		List<WebElement> element=driver.findElements(By.xpath("//ul//li"));
//		int x=(element.size());
//		double rand= (int)(7*Math.random());
//		for (int i=0;i<x;i++) {
//			Actions action=new Actions(driver);
//		element.get(i);
//		Thread.sleep(3000L);
//			action.dragAndDrop(element.get((int) rand), element.get((int) rand)).build().perform();
//		
//			
//		}
//		
//		System.out.println("done");


        WebElement element2 = driver.findElement(By.xpath("(//ul/li)[2]"));
        WebElement element6 = driver.findElement(By.xpath("(//ul/li)[6]"));
        WebElement element4 = driver.findElement(By.xpath("(//ul/li)[4]"));
        WebElement element5 = driver.findElement(By.xpath("(//ul/li)[5]"));
        Actions action = new Actions(driver);
        Thread.sleep(3000L);
        action.dragAndDrop(element2, element6).build().perform();
        Thread.sleep(3000L);
        action.dragAndDrop(element4, element5).build().perform();
    }

}
