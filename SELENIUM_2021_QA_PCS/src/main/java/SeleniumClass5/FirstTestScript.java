package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestScript {

    public static void main(String[] args) {

//		//Tell IDE where Firefox Driver (Gecko Driver) is sitting
        System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");

        // Tell IDE where Chrome Driver is sitting
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
//		
//		//Create an object of the Firefox Driver class
//		FirefoxDriver driver = new FirefoxDriver();
        WebDriver driver = new FirefoxDriver();
        driver = new FirefoxDriver();

        // Navigate to amazon.com
        driver.get("http://www.amazon.com");

        // Get the Page Title
        String pageTitle = driver.getTitle();
        System.out.println("Firefox -- Page Title is: " + pageTitle);

        //Close the browser
        driver.close();
//		driver.quit();

        // Create an object of the Chrome Driver class
//		ChromeDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver = new ChromeDriver();
//		
//		//Navigate to amazon.com
        driver.get("http://www.amazon.com");


        // Get the Page Title
        pageTitle = driver.getTitle();
        System.out.println("Chrome -- Page Title is: " + pageTitle);

        driver.close();
//		driver.quit();

    }

}
