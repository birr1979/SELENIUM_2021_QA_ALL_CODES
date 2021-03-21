package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {

    public void GmailLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin");
        driver.findElement(By.id("identifierId")).sendKeys("ethio2323");

        driver.findElement(By.id("identifierNext")).click();
        driver.findElement(By.id("Passwd")).sendKeys("wewdasdads");
        driver.findElement(By.id("identifierNext")).click();

    }

    public static void main(String[] args) {
        GmailLogin Login = new GmailLogin();
        Login.GmailLogin();

    }

}
