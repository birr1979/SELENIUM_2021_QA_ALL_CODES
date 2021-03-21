package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchAmazon {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();


        driver.get("http://www.amazon.com");

        //enter iphone in the search bar

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12");

        // click on the search button

        driver.findElement(By.id("nav-search-submit-button")).click();
    }

}
