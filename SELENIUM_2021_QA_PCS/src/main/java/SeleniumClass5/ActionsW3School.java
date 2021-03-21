package SeleniumClass5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActionsW3School extends browser{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
launchBrowser("chrome", "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");

//list of the iframes

		List <WebElement> x = driver.findElements(By.tagName("iframe"));
		System.out.println("List of Iframes: " +x.size());
		
		
		//retrive iframe ids
		
//		for(WebElement ele:x) {
//			String y=x.getAttribute("id");
//					
//					
//					
//					System.out.println(y);
//			
			
			
			//clcick on the iframe object "tryit"
			driver.switchTo().frame("iframeResult");
			driver.findElement(By.xpath("/html/body/button")).click();
			
			//switch back to main frame
			
			driver.switchTo().parentFrame();
		//OR
		//	driver.switchTo().defaultContent();			
			
			
			driver.findElement(By.xpath("/html/body/div[5]/div/button")).click();
		}
		
	}

//}
