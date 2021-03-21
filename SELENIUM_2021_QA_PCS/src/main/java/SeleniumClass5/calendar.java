package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class calendar extends browser {
    static String targetMonthYear = "June 2022";
    static String day = "23";


    public static void main(String[] args) {
        launchBrowser("chromE", "https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
        //driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("02/12/2018");
        driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();

        while (true) {
            String currentDate = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
            if (targetMonthYear.equals(currentDate)) {
                break;

            } else
                driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();//forward click

        }
        driver.findElement(By.xpath("//td//a[text()='" + day + "']")).click(); // ROMAN:- this is the one we Missed

    }

}
