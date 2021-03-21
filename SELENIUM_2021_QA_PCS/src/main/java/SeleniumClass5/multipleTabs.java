package SeleniumClass5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class multipleTabs extends browser {

	public static void main(String[] args) {
		launchBrowser("Firefox","https://www.amazon.com/");
		driver.getTitle();
		
		//Open the best sellers Link in the new window
		//CTRL+Click link and SHIFT + CLICK link --multiple tabs

		//locate the best seller element
		WebElement bestSellerLink=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
				

		action.keyDown(Keys.CONTROL).click(bestSellerLink).build().perform();

		List<String> tabs=new ArrayList<String> (driver.getWindowHandles());
		System.out.println(tabs);
		
	
		
		driver.switchTo().window(tabs.get(1));

		HashSet<String> set = new HashSet<String>();
		

	}

}
