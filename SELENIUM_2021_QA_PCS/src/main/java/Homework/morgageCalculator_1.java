package Homework;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class morgageCalculator_1 {

	//Input Variables

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



	public static void main(String[] args) throws IOException {
		
		Properties morcalc=new Properties();
		FileInputStream morcalcfile=new FileInputStream("C:\\Programming Related\\Eclipse\\eclipse-workspace\\SeleniumHomeWroks\\src\\main\\resources\\properties\\resources.properties");
		morcalc.load(morcalcfile);
		
		
		WebDriver driver= new ChromeDriver();
		driver.get(morcalc.getProperty("morcalcURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		//Test Script 1) USING WebDriver Locators
		
		//Launch Browser and set parameters
		
		//Insert or Select values in the field
		driver.findElement(By.id("homeval")).sendKeys(morcalc.getProperty("homeValue"));
		driver.findElement(By.name("param[downpayment]")).sendKeys(downPayment);
		//$ or % for down payment select radio button
		//verify the $ radio button is selected by default and waith until is checked
		

		Boolean l= driver.findElement(By.xpath("//input[@value='money']")).isSelected();
		Boolean x=driver.findElement(By.xpath("//input[@value='percent']")).isSelected();
		System.out.println("is $ button selected: "+l+" and is % button selected: "+ x);
		
		if (l.equals(true)) {
			System.out.println("$ Radio is checked");
		}else {
			System.out.println("$ Radio is not checked");
			driver.findElement(By.xpath("//input[@value='percent']")).click();
		}
			
		//loan amount Auto-Calculated

		driver.findElement(By.id("intrstsrate")).sendKeys(interestRate);
		driver.findElement(By.id("loanterm")).sendKeys(loanTerm);
		//Start Date
		driver.findElement(By.id("pptytax")).sendKeys(propertyTax);
		driver.findElement(By.name("param[pmi]")).sendKeys(PMI);
		driver.findElement(By.id("hoi")).sendKeys(homeInsurance);
		driver.findElement(By.id("hoa")).sendKeys(monthlyHOA);
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
		String k =driver.findElement(By.xpath("(//div[@class='left-cell'])[1]")).getText();


		System.out.println(k+": "+PaymentWithPMI.getText());

		driver.close();




	}

}
