package SeleniumClass5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.logging.log4j.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainMethods {

    public static Properties fileProperties = new Properties();
    public static FileInputStream properties;
    private static org.apache.logging.log4j.Logger log= LogManager.getLogger(MainMethods.class.getName() );
    protected  static Actions action;
    protected static WebDriverWait wait;
     protected static WebDriver driver;
   public static   FileInputStream file;
   public static  List <String> testData = new ArrayList();
    //1. Create a method to load the property file

    public static void loadPropFiles() throws IOException {
        FileInputStream properties = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\Config.Properties");
        fileProperties.load(properties);
    }

    //2. Create a method to call the browser
    public static void launchBrowser(String browser, String url) throws ArithmeticException{
   try {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            //Explicite wait time to capture the error message
            wait = new WebDriverWait(driver, 5);
            driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
            driver.get(fileProperties.getProperty(url));
            action = new Actions(driver);

        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, 5);
            driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
            driver.get(url);
            action = new Actions(driver);
        }
       log.info("Browser launched success!");
       
} catch(Throwable t) {
            log.info("error happened");
           System.out.println(t.getMessage());
            }
        
    }

    //3. create a method to send key to a field
    public static void sendKey(String key, String value) throws ArithmeticException{
        driver.findElement(By.xpath(fileProperties.getProperty(key))).clear();
        driver.findElement(By.xpath(fileProperties.getProperty(key))).sendKeys(value);
    }

    //4. create a method to click.
    public static void click(String key) {
        driver.findElement(By.xpath(fileProperties.getProperty(key))).click();
    }

    //5. create a method for select method in the
    public static void select(String key, String optionType, String option) {
      
    	try {
			if (optionType.endsWith("_XPATH")) {
			    WebElement ElementOptions = driver.findElement(By.xpath(fileProperties.getProperty(key)));
			    Select element = new Select(ElementOptions);
			    if (optionType.equalsIgnoreCase("value")) {
			        element.selectByValue(option);
			    } else if (optionType.equalsIgnoreCase("text")) {
			        element.selectByVisibleText(option);
			    } else if (optionType.equalsIgnoreCase("index")) {
			        element.selectByIndex((Integer.valueOf(option)));
			    }
			} else if (optionType.endsWith("_CSS")) {
			    WebElement ElementOptions = driver.findElement(By.cssSelector(fileProperties.getProperty(key)));
			    Select element = new Select(ElementOptions);
			    if (optionType.equalsIgnoreCase("value")) {
			        element.selectByValue(option);
			    } else if (optionType.equalsIgnoreCase("text")) {
			        element.selectByVisibleText(option);
			    } else if (optionType.equalsIgnoreCase("index")) {
			        element.selectByIndex((Integer.valueOf(option)));
			    }
			}
		} catch (Throwable e) {

			log.error("select failed");
			
			e.printStackTrace();
		}
    }

    //6. Create a method to select from a calendar
    static int currentDay, currentMonth, currentYear;
    static int targetDay, targetMonth, targetYear;
    static int jumpMonthBy, jumpYearBy;

    //6.1. Create a method to get the current date that retrieve the Gregorian calendar day

    public static void getcurrentdate() {
        Calendar cal = Calendar.getInstance();
        currentDay = cal.get(Calendar.DAY_OF_MONTH);
        currentMonth = cal.get(Calendar.MONTH);
        currentYear = cal.get(Calendar.YEAR);
    }

    //6.2. Create a method to for the target day MM/DD/YYYY

    public static void targetDate(String dateString) {
        //index of first occurrence of "/"
        int firstIndex = dateString.indexOf("/");
        //index of last occurrence of "/"
        int lastIndex = dateString.lastIndexOf("/");
        //capture the date numbers
        String MM = dateString.substring(0, firstIndex);
        targetMonth = Integer.valueOf(MM);
        String DD = dateString.substring(firstIndex + 1, lastIndex);
        targetDay = Integer.valueOf(DD);
        String YYYY = dateString.substring(lastIndex + 1, dateString.length());
        targetYear = Integer.valueOf(YYYY);

    }
    //6.3. create a method to determine how many years to jump

    public static void yearsToJump() {
        if ((targetYear - currentYear) > 0) {
            jumpYearBy = (targetYear - currentYear);
        } else {
            jumpYearBy = (currentYear - targetYear);
        }
    }

    //6.4. create a method to determine how many Month to jump

    public static void monthToJump() {
        if ((targetYear > currentYear)) {//clicking forward
            jumpMonthBy = ((jumpYearBy * 12) + (targetMonth - currentMonth));
        } else if (targetYear == currentYear) {
            if (targetMonth > currentMonth) {
                jumpMonthBy = ((jumpYearBy * 12) + (targetMonth - currentMonth));
            } else {
                jumpMonthBy = ((jumpYearBy * 12) + (currentMonth - targetMonth));
            }
        } else if (targetYear < currentYear) {
            jumpMonthBy = (jumpYearBy * 12) + (currentMonth - targetMonth);
        }

    }

    //6.5. clicking the Calendar Element
    public static void SelectCalander(String key, int jumpMonthBy) {
        monthToJump();

        for (int i = 0; i < jumpMonthBy; i++) {
            if (true) {
                driver.findElement(By.xpath(fileProperties.getProperty(key))).click();
            } else {
                driver.findElement(By.xpath(fileProperties.getProperty(key))).click();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        monthToJump();
        yearsToJump();
        targetDate("12/08/2020");

        System.out.println("TargetDate is: " + targetMonth + "/" + targetDay + "/" + targetYear);
        System.out.println("CurrentDate is: " + currentDay + "/" + currentMonth + "/" + currentYear);
        System.out.println("Jump Month By is " + jumpMonthBy);
        System.out.println("Jump Year By is: " + jumpYearBy);

//    x=   readExcelFile("C:\\Programming Related\\Eclipse\\Excel\\apachePOI.xlsx", "Demo", "TestCase", "Laptop Search");
//testData.add(e)

      
      
    }
    
    
    
    //7. a method to Read a data form EXCEL file
    public static List<String> readExcelFile(String filePath, String WSName, String RWHeader, String SearchData) throws IOException {
    	
	
	//import the file 
	file=new FileInputStream(filePath);
	
	//Access the workbook
	
	XSSFWorkbook workbook =new XSSFWorkbook(file);
	
	//the workbook has access to file object allowing the workbook to access the excel file
	
	XSSFSheet worksheet=workbook.getSheet(WSName);
	
	//now the worksheet has access to all the rows in the worksheet(a collection of rows)
	//access the laptop search test case in the worksheet row
	//to do this we need to use Iterator to iterate in each rows to find the required data.
	
	Iterator<Row> rows =worksheet.iterator();
	
	// now we have all the rows using hasNext() and next() methods
	
	//New we need to focus on the test case column header row
	
	Row rowHeader=	rows.next(); // rowHeader has access to the 1st row(is a collection of cells)
	
	//now lets access each cell
	
	Iterator<org.apache.poi.ss.usermodel.Cell> cells=rowHeader.cellIterator();
		
	
	//read the cells and verify  to get the index
	
	int x=0; int colIndex=0; //default index is starting 0;
	
	while (cells.hasNext()) {
		org.apache.poi.ss.usermodel.Cell cellValue=cells.next();
		if (cellValue.getStringCellValue().equals(RWHeader)) {
			colIndex=x;
		}
		x++;
	}
	System.out.println(" column index is : "+ colIndex);
	
	
	//Iterate all rows
	
	while(rows.hasNext()) {
		Row currentRow=rows.next();
		if(currentRow.getCell(colIndex).getStringCellValue().equalsIgnoreCase(SearchData)) {
			Iterator<org.apache.poi.ss.usermodel.Cell> testRowCell= currentRow.cellIterator();
			
			
			//Iterate in the cells
			while(testRowCell.hasNext()) {
				
				org.apache.poi.ss.usermodel.Cell testCell=testRowCell.next();
				
//				testData.add(testCell.getStringCellValue());
				
				//instead of the above retrival in the Array 
				
				switch (testCell.getCellType()) {
				case STRING: 
				String string=(testCell.getStringCellValue());
				testData.add(string);
				break;
				case NUMERIC:	
				String numeric=String.valueOf(testCell.getNumericCellValue());
				testData.add(numeric);
				break;
				case BOOLEAN:	
				String Boolean=String.valueOf(testCell.getBooleanCellValue());
				testData.add(Boolean);
				break;
				default:
					String str=(testCell.getStringCellValue());
					testData.add(str);
					
				
				}
				
				
			}
			
		}
	}
	return testData;
    }

	
    	
    	
	}
    
    





