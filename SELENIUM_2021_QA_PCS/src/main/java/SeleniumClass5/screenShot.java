package SeleniumClass5;

import java.io.*;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class screenShot extends browser{
	
	public static void takeScreenshot() throws IOException {
		Date myDate= new Date();
		System.out.println(myDate);

				String fileName= myDate.toString().replace(":", "_").replace(" ","_");
				System.out.println(fileName);
				
				//extract the date
				String day=fileName.substring(0,10);
				String time=fileName.substring(11,19);
		
				//take screen shoot
		
				File ScreenShoot= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				//copy the file to a specified location
			
				FileUtils.copyFile(ScreenShoot, new File(System.getProperty("user.dir")+"//screenShots",day+time+"new.jpg"));
			System.out.println("Screen Captured and saved in "+System.getProperty("user.dir"));
	}
	public static void main(String[] args) throws IOException {

launchBrowser("chrome","https://www.amazon.com/");
//Highlight the page with java script
WebElement ScreenHighlight=driver.findElement(By.xpath("//*[@id=\"desktop-grid-2\"]"));

JavascriptExecutor js= ((JavascriptExecutor)driver);
js.executeScript("arguments[0].style.border='3px solid red'", ScreenHighlight);
		
		takeScreenshot();
		

	}

}
