package SeleniumClass3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WikiLinkList {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);


        driver.get(" https://www.wikipedia.org/   ");
//		WebElement DropDown = driver.findElement(By.id("searchLanguage"));
        /*
         * //drop down element Select LanguageOptions=new Select(DropDown); //selecting
         * the value from the drop down
         *
         * LanguageOptions.selectByVisibleText("Italiano");
         * LanguageOptions.selectByValue("es"); LanguageOptions.selectByIndex(10); //how
         * many options in the dropdown //interview
         * LanguageOptions.getAllSelectedOptions();
         *
         * //interview
         *
         * WebElement Options= driver.findElement(By.tagName("option"));
         * System.out.println(Options.getAttribute("value"));
         * System.out.println(driver.findElements(By.tagName("options")));
         *
         * //actual way to do it, USING THE JAVA ARRAY LIST.--JAVA COLLACTION FRAMEWORK
         * List<WebElement> wiki = driver.findElements(By.linkText(null));
         */
        List<WebElement> WikiLink = driver.findElements(By.tagName("a"));
        //Countt
        System.out.println("Links number is: " + WikiLink.size());
        System.out.println("Size Printed");
//		for (WebElement Links: WikiLink) {
//			System.out.println(Links.getSize());
//			System.out.println(Links.getText()+Links.getAttribute("herf"));
//			
	}
        
        


    }

}
