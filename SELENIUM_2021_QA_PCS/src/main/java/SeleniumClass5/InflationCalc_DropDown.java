package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InflationCalc_DropDown {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.calculator.net/inflation-calculator.html");

        driver.findElement(By.tagName("h1")).getText();
        String Header = driver.findElement(By.xpath("//h1")).getText();
        System.out.println(Header);

        if (Header.equals("Infilation Calculator")) {
            System.out.println("Page Header Verified");
        } else
            System.out.println("Error in page Title");


        driver.findElement(By.id("cstartingamount1")).clear();
        driver.findElement(By.id("cstartingamount1")).sendKeys("300");


        //select input from drop down list
        WebElement firstYearOption = driver.findElement(By.xpath("//select[@id='cinyear1']"));
        Select firstYearOptions = new Select(firstYearOption);
        firstYearOptions.selectByVisibleText("2017");

        //second year option
        WebElement secondYearOption = driver.findElement(By.id("coutyear1"));
        Select secondYearOptions = new Select(secondYearOption);
        secondYearOptions.selectByVisibleText("2014");

        driver.findElement(By.xpath("(//input[@alt='Calculate'])[1]")).click();
        System.out.println("clicked");

//??????????????finish the xpath locator
        WebElement actualResult = driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr/td/table/tbody/tr[1]/td[5]"));
        WebElement ActualResult = driver.findElement(By.xpath("((//table)[1]//tbody//td)[6]"));
        String Result = ActualResult.getText();
        System.out.println(Result);

        driver.close();

    }

}
