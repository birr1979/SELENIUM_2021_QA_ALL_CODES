package SeleniumClass3;

import java.util.Iterator;
import java.util.List;
import SeleniumClass5.browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test extends browser{

    //All the variables used as input.
	
    static String url = "https://www.calculator.net/salary-calculator.html";
    static String expectedPageTitle = "Salary Calculator";
    static String actualPageTitle = "";
    static String salary = "90000";
    //		static String salaryPayRate= "Year";
    static String hoursPerWeek = "48";
    static String daysPerWeek = "6";
    static String holidaysPerYear = "12";
    static String vacationDaysPerYear = "24";

    public static void main(String[] args) {
        //The browser driver location -Chrome Driver
       launchBrowser("chrome", url);
    	System.out.println("Chrome is Launched.");
        
    	//Clear all values in the input fields

    	List<WebElement> cleardefaultinput = driver.findElements(By.xpath("//input[@type='text']"));
        for (int i = 0; i < cleardefaultinput.size(); i++) {
            cleardefaultinput.get(i).clear();

        }


        WebElement elementdrop = driver.findElement(By.xpath("//select"));
        Select droptions = new Select(elementdrop);
        List<WebElement> optionList = driver.findElements(By.tagName("option"));
        int x = optionList.size();


        for (int i = 0; i < x; i++) {
            String rate = optionList.get(i).getText();
            droptions.selectByVisibleText(rate);
        }


//			System.out.println();


////			String[] options={""};
//			for(int i=0;i<elementdrop.length();i++) {
////				options=elementdrop;
//				System.out.println(elementdrop);
//			}
//			
////			
////			for(WebElement value:elementdrop)
////			{ 
////				
////				Select salaryPayRatesOptions=new Select(salaryPayRates);
////			
////				salaryPayRatesOptions.selectByVisibleText(x);
////				System.out.println("Inputs are entered in the fields.");
////			  String x=value.getText();
//			  System.out.println("value names" + x);
//			  
//			  
//			 }
//			
//			
//			WebElement salaryPayRates = driver.findElement(By.xpath("//select"));
//		
//			
//			


//			driver.close();
//			driver.findElement(By.xpath("//input[@name='camount']")).clear();
//			driver.findElement(By.xpath("//input[@name='chours']")).clear();
//			driver.findElement(By.xpath("//input[@name='cdays']")).clear();
//			driver.findElement(By.xpath("//input[@name='cholidays']")).clear();
//			driver.findElement(By.xpath("//input[@name='cvacation']")).clear();

    }
}
