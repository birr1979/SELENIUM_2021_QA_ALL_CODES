
package SeleniumClass5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiLinks {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

        driver.get("https://www.wikipedia.org/");

        //Locate All Link Elements and store them in a List
        List<WebElement> linksList = driver.findElements(By.tagName("a"));
        System.out.println("Number of Links on the Wikipedia Home Page: " + linksList.size());

//		System.out.println(linksList);

        //Get the Text from each Link in the linksList List
//		for(int i = 0; i<linksList.size(); i++) {
//			System.out.println("Link # " + (i+1) + ": " + linksList.get(i).getText());
//			System.out.println("**************************************");
//		}

        //Get the URL for Each Link (href) in the linksList List (FOR EACH LOOP)
        int linkNumber = 1;
        String linkURL;
        for (WebElement link : linksList) {
            linkURL = link.getAttribute("href");
            System.out.println("Link # " + linkNumber + ": " + linkURL);
            System.out.println("*******************************");
            linkNumber++;
        }


    }

}
