package SeleniumClass4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class indeed_com {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        driver.get("https://wwww.indeed.com");
        driver.findElement(By.xpath("//input[@id='text-input-what']")).sendKeys("QA Automation Engineer");


        //Clear the text by keyboard shortcuts. keys Enum

        WebElement Where = driver.findElement(By.name("l"));
        Where.sendKeys(Keys.CONTROL + "a");
        Where.sendKeys(Keys.DELETE);

        driver.findElement(By.name("l")).sendKeys("Washington DC");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        List<WebElement> Results = driver.findElements(By.xpath("((//td[@id='resultsCol'])//div[@class='jobsearch-SerpJobCard unifiedRow row result clickcard'])//h2//a"));
        for (int i = 0; i < Results.size(); i++) {


            String ResultsTitle = Results.get(i).getAttribute("title");

            System.out.println((i + 1) + ". " + ResultsTitle);

        }

        driver.close();

    }

}
