package Homework;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import SeleniumClass5.browser;
public class calculator_Org extends browser{

	static String initialSavings="2500";
	static String yourAddition="250";
	static String annualInterestRate="3.55";
	static String yearsToInvest="10";
	static String incomeTaxRate="32.5";
	static String annualInflationRate="3.25";
static WebDriver driver;

	public static void main(String[] args) {

		//Lunch a Browser, Maximize the Window and set time out limit
	launchBrowser("chrome", "http://www.calculators.org/");

		//Navigate to www.calculators.org 
		

		//click on the 'saving' link
//		driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div[3]/div[2]/div[1]/div[1]/p/a/img")).click();
//		//Clear the default value in the input fields
//		List<WebElement> clearDefault= driver.findElements(By.xpath("//input[@type='number']"));
//		for (int i=0;i<clearDefault.size();i++) {
//			clearDefault.get(i).clear();
//		}

		//Enter “2500” in the ‘Initial Savings’ text box
		driver.findElement(By.name("principal")).sendKeys(initialSavings);
		System.out.println("Entered “2500” in the ‘Initial Savings’ text box");

		//Enter “250” in the ‘Your Monthly Addition’ text box
		driver.findElement(By.xpath("//input[@name='moAdd']")).sendKeys(yourAddition);
		System.out.println("Entered “250” in the ‘Your Monthly Addition’ text box");

		//Enter “3.55” in the ‘Annual Interest Rate’ text box
		driver.findElement(By.xpath("//input[@name='interest']")).sendKeys(annualInterestRate);;		
		System.out.println("Entered “3.55” in the ‘Annual Interest Rate’ text box");

		//Enter “10” in the ‘Years to Invest’ text box
		driver.findElement(By.xpath("//input[@name='payments']")).sendKeys(yearsToInvest);;
		System.out.println("Entered “10” in the ‘Years to Invest’ text box");

		//Enter “32.5” in the ‘Income Tax Rate’ text box
		driver.findElement(By.xpath("//input[@name='incometaxrate']")).sendKeys(incomeTaxRate);
		System.out.println("Entered “32.5” in the ‘Income Tax Rate’ text box");

		//Enter “3.25” in the ‘Annual Inflation Rate’ text box
		driver.findElement(By.xpath("//input[@name='inflationrate']")).sendKeys(annualInflationRate);
		System.out.println("Entered “3.25” in the ‘Annual Inflation Rate’ text box");

		//Click on the ‘Calculate’ button
		driver.findElement(By.xpath("//input[@value='Calculate']")).click();
		System.out.println("Click on the ‘Calculate’ button");

		//1st Try Capture, and display in the Console, the ‘Interest Earned’ Amount
		String x= driver.findElement(By.xpath("(//table//tbody//tr)[9]")).getText();
		String y= driver.findElement(By.xpath("(//td)[17]")).getText();
//		System.out.println(x+" is "+y );
		//2nd try
		List<WebElement> interestEarned = driver.findElements(By.xpath("//*[@name='totalint']"));
		int a=interestEarned.size();
		for (int i=0;i<a;i++) {
		System.out.println("Interest Earned: "+ interestEarned.get(i).getAttribute("value"));
		}
		

		driver.close();

	}

}



