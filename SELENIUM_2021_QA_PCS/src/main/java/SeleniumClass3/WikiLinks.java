package SeleniumClass3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiLinks {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
//1st . find all links and store them

        List<WebElement> LinksList = driver.findElements(By.tagName("a"));
        System.out.println("The number of links on wiki: " + LinksList.size());
//get the text for the lists
//for (int i=0;i<LinksList.size();i++) {
//	System.out.println("Link # "+(i+1) +" "+LinksList.get(i).getText());
//	System.out.println("********************************************************");
//	
//}

//get the links with the href names

        int i = 1;
        for (WebElement link : LinksList) {
//		String linkURL= link.getAttribute("href");
            System.out.println("Link # " + i + "  " + link.getAttribute("href"));
            i++;

        }

        driver.close();


    }

}
