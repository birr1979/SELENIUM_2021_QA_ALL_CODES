package ABCDEFGHIJK;


	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class ScrollByPixel {

	    WebDriver driver;
	    @Test
	    public void ByPixel() {
	       driver = new ChromeDriver();

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Launch the application		
	        driver.get("http://demo.guru99.com/test/guru99home/");

	        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
	        driver.manage().window().maximize();

	        // This  will scroll down the page by  1000 pixel vertical		
	        js.executeScript("window.scrollBy(0,1000)");
	        
	        /*
	         * There are a number of ways to scroll a page using Selenium WebDriver in Java. Some of them are discussed below.

If you want to scroll the page vertically to perform some action, you can do it using the following JavaScript.
        ((JavascriptExecutor)

driver).executeScript(“window.scrollTo(0,

document.body.scrollHeight)”);

            Where ‘JavascriptExecutor’ is an interface, which helps executing JavaScript through Selenium WebDriver. You can use the following code to import.

import org.openqa.selenium.JavascriptExecutor; 

2.      If you want to scroll at a particular element, you need to use the following JavaScript.

WebElement element =

driver.findElement(By.xpath(“//input [@id=’email’]”));

((JavascriptExecutor)

driver).executeScript(“arguments[0].scrollIntoView();”, element);

Where ‘element’ is the locator where you want to scroll.

3.      If you want to scroll at a particular coordinate, use the following JavaScript.  

((JavascriptExecutor)

driver).executeScript(“window.scrollBy(200,300)”);

Where ‘200,300’ are the coordinates.

If you want to scroll up in a vertical direction, you can use the following JavaScript.
((JavascriptExecutor)

driver).executeScript(“window.scrollTo(document.body.scrollHeight,0)”);

If you want to scroll horizontally in the right direction, use the following JavaScript.
((JavascriptExecutor)

driver).executeScript(“window.scrollBy(2000,0)”);

If you want to scroll horizontally in the left direction, use the following JavaScript.
((JavascriptExecutor)

driver).executeScript(“window.scrollBy(-2000,0)”);
	         */
	        
	        
	        
	    }
	}

