package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Costco {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("http://www.costco.com");

        //click on the 'Sign In / Register' Link
        driver.findElement(By.linkText("Sign In / Register")).click();

        //Enter Username in the Username field
        driver.findElement(By.id("logonId")).sendKeys("jay.mathur+training@pcsconsultants.org");  //ctHidden form-control

        //click on Forgot password link - partialLinkText
        driver.findElement(By.partialLinkText("Forgot")).click();


    }

}
