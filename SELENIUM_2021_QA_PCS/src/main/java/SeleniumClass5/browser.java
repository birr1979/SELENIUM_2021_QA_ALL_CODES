package SeleniumClass5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.tools.sjavac.Log;

public class browser {
   protected  static Actions action;
   protected static WebDriverWait wait;
    protected static WebDriver driver;

    @SuppressWarnings("restriction")
	public static void launchBrowser(String browser, String url) {
     try {
    	 if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            //Explicite wait time to capture the error message
            wait = new WebDriverWait(driver, 5);
            driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
            driver.get(url);
            action = new Actions(driver);

        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, 5);
            driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
            driver.get(url);
            action = new Actions(driver);
        }
     }catch (Exception t) {
    	 t.printStackTrace();
    	 Log.error("error happened B");
    	
     }
    	
        
        
    }

}
