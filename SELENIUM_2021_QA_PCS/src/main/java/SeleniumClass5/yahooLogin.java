package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class yahooLogin extends browser {

    //instead of the explicite wait we can make our own method to return visiblisty of the element

    public static boolean isElementPresent(String xpath) {


        try {
            driver.findElement(By.xpath(xpath));
            return true;
        } catch (Throwable t) {
            return false;
        }

    }

    public static void main(String[] args) throws InterruptedException {

        launchBrowser("chrome", "https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%2Ffolders%2F1");
        driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("f@yahoo.com");
        driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();

        //we need explicit wait time
        //call the method to see if the element is present
        System.out.println("Element Present: " + isElementPresent("//p[@id='username-error']"));

        //Explicit wait time applied to capture the error message
        String x = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username-error")))).getText();
        System.out.println(x);
//OR	
        //check after the implicit Sleep time thread applied >> NOT RECOMENDED
        System.out.println("Element Present: " + isElementPresent("//p[@id='username-error']"));
        String k = driver.findElement(By.xpath("//*[@id=\"username-error\"]")).getText();
        Thread.sleep(1000);
        System.out.println(k);

        driver.close();


    }

}
