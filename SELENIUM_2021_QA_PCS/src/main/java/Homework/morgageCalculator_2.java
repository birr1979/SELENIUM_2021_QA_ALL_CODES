package Homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class morgageCalculator_2 {

	//Input Variables

	static String homeValue= "500000";
	static String downPayment="75000";
	static String downPaymentVariable="";
	static String loanAmount= "";
	static String interestRate="2.75";
	static String startDate= "Mar, 2021"; 
	static String loanTerm="15";
	static String propertyTax="3400";
	static String PMI="0.5";
	static String homeInsurance="1800";
	static String monthlyHOA="200";
	static String loanType ="Conventional";
	static String buyORRefinancce="Buy";


	public static void main(String[] args) {
		//Test Script 1) USING XPATH Locators

		//Launch Browser and set parameters
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

		//Insert or Select values in the field
		driver.findElement(By.id("homeval")).sendKeys(homeValue);
		driver.findElement(By.xpath("//input[@name ='param[downpayment]']")).sendKeys(downPayment);
		//$ or % for down payment select radio button
		driver.findElement(By.xpath("//input[@value='money']")).click();
		//loan amount Auto-Calculated

		driver.findElement(By.xpath("//input[@id='intrstsrate']")).sendKeys(interestRate);
		driver.findElement(By.xpath("//input[@id='loanterm' and @name='param[term]']")).sendKeys(loanTerm);
		//Start Date
		driver.findElement(By.xpath("//input[@id='pptytax' or @name='param[property_tax]']")).sendKeys(propertyTax);
		driver.findElement(By.xpath("//input[@id='pmi' or @name='param[pmi]']")).sendKeys(PMI);
		driver.findElement(By.xpath("//input[@id='hoi' or @name='param[hoi]']")).sendKeys(homeInsurance);
		driver.findElement(By.xpath("//input[@name='param[hoa]']")).sendKeys(monthlyHOA);
		//LoanType
		WebElement loanType =driver.findElement(By.name("param[milserve]"));
		Select loantype=new Select(loanType);
		loantype.selectByValue("3");

		//Buy or Refinance
		WebElement buyRefi=driver.findElement(By.name("param[refiorbuy]"));
		Select Buyrefi= new Select(buyRefi);
		Buyrefi.selectByIndex(1);

		//Click Calculate button

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		//Capture (and display) the Payment with PMI value
		WebElement PaymentWithPMI =driver.findElement(By.xpath("(//div//h3)[3]"));


		System.out.println("Payment with PMI: "+PaymentWithPMI.getText());


		driver.close();




	}

}
