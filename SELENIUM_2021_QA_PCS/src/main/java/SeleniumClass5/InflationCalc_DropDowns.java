package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InflationCalc_DropDowns {

    public static void main(String[] args) {

        //Launch Chrome
        ChromeDriver driver = new ChromeDriver();

        //Maximize the Window
        driver.manage().window().maximize();

        //Navigate to the URL - https://www.calculator.net/inflation-calculator.html
        driver.get("https://www.calculator.net/inflation-calculator.html");

        //Validate that we're on the correct page
//		String pageHeader = driver.findElement(By.tagName("h1")).getText();
        String pageHeader_Actual = driver.findElement(By.xpath("//h1")).getText();
        String pageHeader_Expected = "Inflation Calculator";
        if (pageHeader_Actual.equals(pageHeader_Expected)) {
            System.out.println("We're on the right page!");
        } else {
            System.out.println("Something went wrong, we're lost!");
        }

        //Enter Dollar amount in 1st Calculator
        WebElement dollarAmountElement = driver.findElement(By.xpath("//input[@id='cstartingamount1']"));
        dollarAmountElement.clear();
        dollarAmountElement.sendKeys("300");

        //Select the 1st year value from the Dropdown
        //1st: locate the dropdown element and refer to it using a webelement variable
        WebElement firstYearList = driver.findElement(By.xpath("//select[@id='cinyear1']"));
        //2nd: Instantiate the Select Class and provide the WebElement reference to it's constructor
        Select firstYearOptions = new Select(firstYearList);
        firstYearOptions.selectByVisibleText("2015");
//		firstYearOptions.selectByValue("2015");
//		firstYearOptions.selectByIndex(6);


        //Select the 2nd year value from the 2nd Dropdown
        WebElement secondYearList = driver.findElement(By.xpath("//select[@id='coutyear1']"));
        Select secondYearOptions = new Select(secondYearList);
        secondYearOptions.selectByVisibleText("2020");

        //Click on Calculate
        driver.findElement(By.xpath("(//input[@alt='Calculate'])[1]")).click();

        //Capture the Result
        WebElement result = driver.findElement(By.xpath("((//table)[1]//tbody//td)[6]"));
        String actualResult = result.getText();


        //Validate result
        String expectedResult = "$323.96";
        if (actualResult.equals(expectedResult)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed!");
        }

    }

}
