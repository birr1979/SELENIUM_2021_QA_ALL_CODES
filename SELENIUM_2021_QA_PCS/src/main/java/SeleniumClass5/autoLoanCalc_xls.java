package SeleniumClass5;

import java.io.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class autoLoanCalc_xls extends MainMethods{

	public static void main(String[] args) throws IOException {
	
		loadPropFiles();
		launchBrowser("Chrome", "https://www.calculator.net/auto-loan-calculator.html");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
//		Enter the inputs
	List<String> testData= readExcelFile("C:\\Programming Related\\Eclipse\\eclipse-workspace\\SELENIUM_2021_QA_PCS\\testData\\apatche.xlsx", "AUTO","TCID","TC001");
	driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	System.out.println(driver.getTitle());
	
	System.out.println(testData.get(1)+testData.get(6));
	sendKey("autoPrice_XPATH",testData.get(1));
//	sendKey("loanTerm_XPATH",testData.get(2));
//	sendKey("interestRate_XPATH",testData.get(3));
//	sendKey("downPayment_XPATH",testData.get(4));
//	sendKey("tradeInValue_XPATH",testData.get(5));
	select("state_XPATH","value",testData.get(6));
	sendKey("salesTax_XPATH",testData.get(7));
	click("otherFees_XPATH");
	click("calculate_XPATH");
	
	System.out.println("done");
	
		
	}

}
