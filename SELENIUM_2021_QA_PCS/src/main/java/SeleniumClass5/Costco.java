package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Costco {

    public static void main(String[] args) {

ChromeOptions options=new ChromeOptions();
options.addArguments("headless");
        WebDriver driver = new ChromeDriver();
System.out.println("Browser launched");
        driver.get("http://www.costco.com");
        System.out.println("Navigated to Costco homepage");

        //click on the 'Sign In / Register' Link
        driver.findElement(By.linkText("Sign In / Register")).click();
System.out.println("SignIn/register Clicked");
        //Enter Username in the Username field
        driver.findElement(By.id("logonId")).sendKeys("jay.mathur+training@pcsconsultants.org");  //ctHidden form-control
System.out.println("Username entered");
        //click on Forgot password link - partialLinkText
        driver.findElement(By.partialLinkText("Forgot")).click();
        System.out.println("forgot password link clicked");


    }

}
