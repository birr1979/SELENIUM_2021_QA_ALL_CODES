package Homework;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class homeWork2XPATH {
	//All the variables used as input.
	static String url="https://www.calculator.net/salary-calculator.html";
	static String expectedPageTitle="Salary Calculator";
	static String actualPageTitle="";
	static String salary= "35";
	static String salaryPayRate="";
	static String hoursPerWeek="40";
	static String daysPerWeek="5";
	static String holidaysPerYear="12";
	static String vacationDaysPerYear="14";

	public static void browser() {
		//Locating and lunching Chrome Driver
//		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Chrome is Launched.");
		driver.get(url);

		//Maximize the browser ands set timeout limit
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//Validate the Webpage
		actualPageTitle=driver.getTitle();
		if (actualPageTitle.equals(expectedPageTitle)) {
			System.out.println("Page is Loaded, validated, and Default data cleared Successfully.");
		}else {
			System.out.println("You are Landing on the Wrong Page");
		}
	}

	public static void main(String[] args) {
		browser();


		// int x=optionList.size(); //we can use this instead of (8) for the size of the Lists.
		//LOOPing Through the Salary Rate Options in the Select Element.
//System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get(url);
		for (int h=0;h<8;h++) { 
			

			//Maximize the browser ands set timeout limit
			driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			//Choosing the Inputs in the SELECT DropDown Element one by one for each calculation for each RATE SALARY AMOUNT 

			WebElement elementdrop = driver.findElement(By.xpath("//select"));
			Select dropOptions = new Select(elementdrop);
			List<WebElement> optionList=driver.findElements(By.tagName("option"));
			String rate= optionList.get(h).getText();
			dropOptions.selectByVisibleText(rate);

			//Clear all values in the input fields before each Inserts
			List<WebElement> cleardefaultinput=driver.findElements(By.xpath("//input[@type='text']"));
			for (int z=0; z<cleardefaultinput.size();z++) {
				cleardefaultinput.get(z).clear();
			}

			//XPATH --> conditional OR   ???//$x("//table[(@ class='panel')]")//child::input
			driver.findElement(By.xpath("//input[@id='camount' or @name='camount']")).sendKeys(salary);
			//XPATH --> Conditional AND
			driver.findElement(By.xpath("//input[@id='chours' and //td[contains(@align,'right')]]")).sendKeys(hoursPerWeek);
			//
			driver.findElement(By.xpath("//input[@name='cdays']")).sendKeys(daysPerWeek);
			//
			driver.findElement(By.name("cholidays")).sendKeys(holidaysPerYear);
			//
			driver.findElement(By.xpath("//input[starts-with(@name,'cvac')]")).sendKeys(vacationDaysPerYear);
			//
			System.out.println("Inputs are entered in the fields.");

			//Clicking Calculate button
			driver.findElement(By.xpath("//input[@type='image']")).click();
			System.out.println("Result: the Salary conversion to their corresponding values is done. ");

			//Capture all unadjusted values from the Results Table and Display the values.
			System.out.println("-------------------------------------------------------------------------");
			List<WebElement> results = driver.findElements(By.xpath("(((//table//tbody)[3])//tr)//td[2]"));
			List<WebElement> Results = driver.findElements(By.xpath("(((//table//tbody)[3])//tr)//td[1]"));
			for (int y=1;y<results.size();y++) {
			System.out.println("\n"+Results.get(y).getText() +" Unadjusted: "+results.get(y).getText());


				//Expected minimum Amount that are used to compare the results.
				double Actual=Double.valueOf(((results.get(y).getText()).replace("$", "").replace(",", "")));

				double [] minimumAmount= {38,250,1800,3250,3500,7500,20000,85000};
				for (int min=0;min<minimumAmount.length;min++) {
					double Expectedminimum=minimumAmount[min];

					if (Actual>=Expectedminimum) {
						System.out.println("You are doing pretty well!");
						break;
					}
					else {
						System.out.println("Let's make some more money!");
						break;
					}

				}
				System.out.println("-------------------------------------------------------------------------");
			}
			System.out.println("******************SALARY CALCULATION BY: Option #"+(h+1)+ " "+rate + "  **********************");	
			driver.quit();
		}		
	}
}








