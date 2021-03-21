package SeleniumClass5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
//			driver= new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
//			
//			driver.get("http://demo.guru99.com/test/drag_drop.html");					
//	         
//			//Element which needs to drag.    		
//	        	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
//	         
//	         //Element on which need to drop.		
//	         WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
//	         		
//	         //Using Action class for drag and drop.		
//	         Actions act=new Actions(driver);					
//
//		//Dragged and dropped.		
//	         act.dragAndDrop(From, To).build().perform();	
//			


//			WebDriver driver = new ChromeDriver();
//			
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
//			driver.get("https://jqueryui.com/droppable/");
//			
//			//switch the Driver to the iframe --Special syntax
//			
//			driver.switchTo().frame(0); //since only 1 frame is in the DOM
//			
//			WebElement draggable=driver.findElement(By.xpath("//div[@id='draggable']"));
//			WebElement droppable=driver.findElement(By.xpath("//div[@id='droppable']"));
//			
//			Actions action =new Actions(driver);
//			Thread.sleep(3000L);
//			action.dragAndDrop(draggable, droppable).build().perform();
//			System.out.println("Dropped");


        //JAY


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

        driver.get("https://jqueryui.com/droppable/");

        //Switch WebDriver's focus to the iframe
        driver.switchTo().frame(0); //index specifies which frame to switch to

        WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action = new Actions(driver);

        Thread.sleep(3000L);

        action.dragAndDrop(draggable, droppable).build().perform();
        System.out.println("Dropped");
    }

}
