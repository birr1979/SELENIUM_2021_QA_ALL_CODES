package SeleniumClass5;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.apache.logging.log4j.*;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class keyWords {

		public static WebDriver driver;
		// Read the properties file
		public static Properties objRepo = new Properties();
		public static FileInputStream fis_objRepo;
		private static Logger log = LogManager.getLogger(keyWords.class.getName());

		// Method to load all properties files
		public static void loadPropFiles() throws IOException {
						
			try {
			fis_objRepo = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\resources\\properties\\ObjectRepository.properties");
			log.info("ObjectRepository.properties File Found");
			}catch(Throwable t) {
				log.fatal("ObjectRepository.properties File Not Found");
				log.info("Stack Trace Error Message: " + t.getMessage());
				System.exit(0);
			}
			
			try {
			// Load the Properties File
			objRepo.load(fis_objRepo);
			log.debug("Properties Files Loaded Successfully");
			}catch(Throwable t) {
				log.fatal("Properties Files were not Loaded Successfully");
				log.info("Stack Trace Error Message: " + t.getMessage());
				System.exit(0);
			}

		}

		// Method to select from a drop down element
		public static void select(String key, String optionType, String option) {
			try {
			if (key.endsWith("_XPATH")) {
				WebElement dropDownElement = driver.findElement(By.xpath(objRepo.getProperty(key)));
				Select options = new Select(dropDownElement);
				if (optionType.equals("value")) {
					options.selectByValue(option);
				} else if (optionType.equals("text")) {
					options.selectByVisibleText(option);
				} else if (optionType.equals("index")) {
					options.selectByIndex(Integer.valueOf(option));
				}
			} else if (key.endsWith("_CSS")) {
				WebElement dropDownElement = driver.findElement(By.cssSelector(objRepo.getProperty(key)));
				Select options = new Select(dropDownElement);

				if (optionType.equals("value")) {
					options.selectByValue(option);
				} else if (optionType.equals("text")) {
					options.selectByVisibleText(option);
				} else if (optionType.equals("index")) {
					options.selectByIndex(Integer.valueOf(option));
				}
			}
			log.debug(option + " was selected from the " + key + " drop down");
			}catch(Throwable t) {
				log.error(option + " was not selected from the " + key + " drop down");
				log.info("Stack Trace Error Message: " + t.getMessage());
			}
		}

		// Method to start the browser
		public static void start_browser(String URLKey) {
			try {
			// Launch the appropriate browser & navigate to the URL
			if (objRepo.getProperty("browser").equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(objRepo.getProperty(URLKey));
			} else if (objRepo.getProperty("browser").equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(objRepo.getProperty(URLKey));
			}
			log.debug(objRepo.getProperty("browser") + " was Launched & Navigated to " + objRepo.getProperty(URLKey));
			}catch(Throwable t) {
				log.fatal(objRepo.getProperty("browser") + " Browser Not Started");
				log.info("Stack Trace Error Message: " + t.getMessage());
				System.exit(0);
			}
		}

		public static void click(String key) {
			try {
			if (key.endsWith("_XPATH")) {
				driver.findElement(By.xpath(objRepo.getProperty(key))).click();
			} else if (key.endsWith("_CSS")) {
				driver.findElement(By.cssSelector(objRepo.getProperty(key))).click();
			}
			log.debug("Successfully clicked on " + key + " element");
			}catch(Throwable t) {
				log.error("Error while clicking on: " + key + " element");
				log.info("Stack Trace Error Message: " + t.getMessage());
			}
		}

		public static void enterText(String key, String value) {
			try {
			if (key.endsWith("_XPATH")) {
				driver.findElement(By.xpath(objRepo.getProperty(key))).clear();
				driver.findElement(By.xpath(objRepo.getProperty(key))).sendKeys(value);
			} else if (key.endsWith("_CSS")) {
				driver.findElement(By.cssSelector(objRepo.getProperty(key))).clear();
				driver.findElement(By.cssSelector(objRepo.getProperty(key))).sendKeys(value);
			}
			log.debug("Entered '" + value + "' in " + key + " element" );
		}catch(Throwable t) {
			log.error("Unable to enter '" + value + "' in " + key + " element" );
			log.info("Stack Trace Error Message: " + t.getMessage());
		}

	}
	}


