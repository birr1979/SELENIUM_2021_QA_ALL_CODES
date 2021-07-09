package SeleniumClass3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class returnXpath {
	public static WebDriver driver=new ChromeDriver();

	public static void main(String[] args) {
//		driver.get("https://www.google.com");
//		
//		getXpath(div[input]);
//	}
//
//	public static String getXpath(WebElement ele) {
//	    String str = ele.toString();
//	    String[] listString = null;
//	    if(str.contains("xpath"))
//	      listString = str.split("xpath:");
//	    else if(str.contains("id"))
//	      listString = str.split("id:");
//	    String last = listString[1].trim();
//	    return last.substring(0, last.length() - 1);
	
		driver.manage().window().maximize();
		driver.get("https://twitter.com/login");
		
		List<WebElement> divElement=driver.findElements(By.xpath("//div//input"));
		WebElement html=driver.findElement(By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/label[1]/div[1]/div[2]/div[1]/input[1]"));
		System.out.println(html.getAttribute("outerHTML"));
		for (int i=0;i<divElement.size();i++) {
			System.out.println(divElement.get(i).getTagName()+divElement.get(i).getAttribute("id"));
		}
		
driver.close();
	}
	
	
}
