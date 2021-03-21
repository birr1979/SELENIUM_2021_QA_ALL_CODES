package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calculatorSalesTax {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        ///CTRL+SHIFT +O to import.
        //All Selenium classes.
        //https://www.selenium.dev/selenium/docs/api/java/allclasses-noframe.html

        driver.get("https://www.calculator.net/sales-tax-calculator.html");
        System.out.println(driver.getTitle());
        if (driver.getTitle().equals("Sales Tax Calculator")) {
            System.out.println("Page Validated.");

        } else {
            System.out.println("Page Not Validated.");
        }

        //to maximize

        driver.manage().window().maximize();


        //how do we handle notes (results and methods creation)??????????????????

        //we will use X-Path to locate elements  relative and absolute.
        //	$x("//input[@name='beforetax']")
        driver.findElement(By.xpath("//input[@name='beforetax']")).clear();
        driver.findElement(By.xpath("//input[@name='beforetax']")).sendKeys("500");
        WebElement taxrate = driver.findElement(By.xpath("//input[@name='taxrate']"));
        taxrate.clear();
        taxrate.sendKeys("7.5");
        driver.findElement(By.xpath("//input[@alt='Calculate']")).click();

        System.out.println("Sales Tax Calculated Successfully.");


        //verifay the result element by xpath


        System.out.println(driver.findElement(By.xpath("//div[@class='verybigtext'][3]")).getText());


//			
        System.out.println("result is Printed.");
//		driver.close();
    }

}
