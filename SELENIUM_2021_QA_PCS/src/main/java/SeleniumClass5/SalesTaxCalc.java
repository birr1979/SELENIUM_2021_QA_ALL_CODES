
package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesTaxCalc {

    public static void main(String[] args) {

        /*
         * IMPORT keyboard shortcut - CTRL + SHIFT + O
         */

        //Launch Chrome
        ChromeDriver driver = new ChromeDriver();

        //Maximize the Browser Window
        driver.manage().window().maximize();


        //Navigate to the URL - https://www.calculator.net/sales-tax-calculator.html
        driver.get("https://www.calculator.net/sales-tax-calculator.html");

        //Get the Page Title
//		int pageTitleLength = driver.getTitle().length();
//		System.out.println(pageTitleLength);
        String pageTitle = driver.getTitle();

        //Validate that the Page Title is as expected
        if (pageTitle.equals("Sales Tax Calculator")) {
            System.out.println("Success - Page Title is Validated!");
        } else {
            System.out.println("Failure - Page Title is NOT Validated!");
        }

        /*
         * In order to perform any action on a web element
         * WebDriver needs to know WHICH Element AND
         * What action to perform
         *
         * --> 1st: Uniquely identify(locate) the element
         * --> 2nd: specify the action to be performed on that uniquely identified element
         */

        //Enter Before Tax Price

        //1st Clear the current contents
        driver.findElement(By.xpath("//input[@name='beforetax']")).clear();

        driver.findElement(By.xpath("//input[@name='beforetax']")).sendKeys("500");


        //Enter Sales Tax Rate
        WebElement taxRateElement = driver.findElement(By.xpath("//input[@name='taxrate']"));
        taxRateElement.clear();
        taxRateElement.sendKeys("7.5");

        //Click on Calculate button
        driver.findElement(By.xpath("//input[@alt='Calculate']")).click();

        //Capture the After Tax Price & display it in the console
        WebElement afterTaxPrice = driver.findElement(By.xpath("(//div[@id='content']//div[@class='verybigtext'])[3]"));
        String afterTax_Actual = afterTaxPrice.getText();

        String afterTax_Expected = "After Tax Price: $537.50";
        if (afterTax_Actual.equals(afterTax_Expected)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        driver.close();


    }

}
