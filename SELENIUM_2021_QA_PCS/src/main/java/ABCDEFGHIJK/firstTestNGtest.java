package ABCDEFGHIJK;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstTestNGtest {
	@Test // needs TestNG library 
	//convert to test NG project or create a project 
	public void firstTest() {
		   WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

	        driver.get("https://www.wikipedia.org/");
	        System.out.println("Page title is "+driver.getTitle());
	}
	

}
