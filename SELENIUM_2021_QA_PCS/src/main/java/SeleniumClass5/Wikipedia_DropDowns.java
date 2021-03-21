package SeleniumClass5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Wikipedia_DropDowns {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //maximize the window
        driver.manage().window().maximize();

        //Apply a 10 second Implicit Wait
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

        //Navigate to the URL - https://www.wikipedia.org/
        driver.get("https://www.wikipedia.org/");

        //Locate the Languages Dropdown
        WebElement languageDropDown = driver.findElement(By.id("searchLanguage"));

        //Instantiate the Select Class
        Select languageOptions = new Select(languageDropDown);

        //Select the language
//		languageOptions.selectByVisibleText("Italiano");
//		languageOptions.selectByValue("ar");
        languageOptions.selectByIndex(10);

        //How many options are in the drop down?
//		languageOptions.getOptions();

//		WebElement myOption = driver.findElement(By.tagName("option"));
//		System.out.println(myOption.getAttribute("value"));

        List<WebElement> languageOptionList = driver.findElements(By.tagName("option"));
        System.out.println(languageOptionList.size());


    }

}
