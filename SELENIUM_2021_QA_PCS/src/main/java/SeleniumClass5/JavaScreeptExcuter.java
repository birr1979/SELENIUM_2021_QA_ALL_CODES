package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScreeptExcuter extends browser {

	public static void main(String[] args) {

//another way of doing the ActionsW3School.java
		launchBrowser("chrome", "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");

		driver.switchTo().frame("iframeResult");
		
		
		
		
		//create reference
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//myfunction() is in the DOM and is a onClick Operation. 
		js.executeScript("myFunction()");
		
		WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"mySubmit\"]"));
		
		js.executeScript("arguments[0].style.border='3px solid red'", submitButton);
		
		
		
		
		
	}

}
