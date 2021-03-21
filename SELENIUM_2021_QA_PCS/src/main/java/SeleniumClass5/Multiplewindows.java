package SeleniumClass5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Multiplewindows extends browser {

	public static void main(String[] args) {

launchBrowser("Chrome","https://www.amazon.com/");
driver.getTitle();


//Open the best sellers Link in the new window
//CTRL+Click link and SHIFT + CLICK link

//locate the best seller element
WebElement bestSellerLink=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
		

action.keyDown(Keys.SHIFT).click(bestSellerLink).build().perform();

int x= driver.getWindowHandles().size();
System.out.println("Number of windows opened: "+x);

//Get the window handle for the second window;
HashSet<String> set = new HashSet<String>();
//or
Set<String> windowHandles=driver.getWindowHandles();
Iterator<String> itr=windowHandles.iterator();


System.out.println(windowHandles );

String handle1=itr.next(), handle2=itr.next();

System.out.println("the first handle: " +handle1 +"and The second handle: "+handle2);
//switch back to specific window
driver.switchTo().window(handle2);
//confirm its the right one
String ExpectedBanner= "Best Sellers";

String pageBanner=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).getText();
System.out.println(pageBanner);
if(ExpectedBanner.equals(pageBanner)) {
	System.out.println("Successfully Switched");
}else {
	System.out.println("windows switch failed");
}







	}

}
