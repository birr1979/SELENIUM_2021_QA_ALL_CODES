package SeleniumClass3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HoursCalc {

    static String startTime = "5:30";
    static String endTime = "10:30";
    static String AM = "AM";
    static String PM = "a";

    public void importmethod() {
        System.out.println("imported from selenium Class 3");
    }

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

        driver.get("https://www.calculator.net/hours-calculator.html");


        //Validate that We're on the Correct Page
        String expectedHeader = "Hours Calculator";
        String actualHeader = driver.findElement(By.tagName("h1")).getText();
        if (expectedHeader.equals(actualHeader)) {
            System.out.println("We're on the Right Page!");
        } else {
            System.out.println("We're Lost!");
        }

        //Enter the Start Time in Calc1
        driver.findElement(By.xpath("//input[@name='starttime']")).clear();
        driver.findElement(By.xpath("//input[@name='starttime']")).sendKeys(startTime);

        //Select AM/PM for the Start Time in Calc1
        //1st: Locate the Dropdown
        WebElement startTime_AMPM = driver.findElement(By.xpath("//select[@name='startunit']"));

        //2nd: Instantiate the Select Class
        Select firstAMPM = new Select(startTime_AMPM);

        //3rd: Select PM from the drop down
        firstAMPM.selectByVisibleText(AM);

        //Enter End Time in Calc1
        driver.findElement(By.xpath("//input[@name='endtime']")).clear();
        driver.findElement(By.xpath("//input[@name='endtime']")).sendKeys(endTime);

        //Select AM/PM for the End Time in Calc1
        //1st: Locate the end time drop down
        WebElement endTime_AMPM = driver.findElement(By.xpath("//select[@name='endunit']"));

        //2nd: Instantiate the Select Class
        Select secondAMPM = new Select(endTime_AMPM);

        //3rd: Select AM from the drop down
        secondAMPM.selectByValue(PM);

        //Click on Calculate
//		driver.findElement(By.xpath("(//table[@class='panel'])[1]//tbody//input[@type='image']")).click();
        driver.findElement(By.xpath("(//input[@type='image'])[1]")).click();
        //Capture the Number of Hours Between Start & End Time
        String hoursResult = driver.findElement(By.xpath("(//p[@class='verybigtext'])[1]")).getText();


        //Validate that Start Time (hour) + hoursResult = End Time (hour)
        //1st: Format the start & end times
        //5:30
        //splitting the startTime string and storing the 2 values (hour:minute) into an array of Strings
        String[] startTime_split = startTime.split(":");
        //Converting the 1st item in startTime_split String array from a String to an Int using Integer wrapper
        int startHour = Integer.valueOf(startTime_split[0]);

        //splitting the endTime string and storing the 2 values (hour:minute) into an array of Strings
        String[] endTime_split = endTime.split((":"));
        //Converting the 1st item in the endTime_split String array from a String to an Int using Integer wrapper
        int endHour = Integer.valueOf(endTime_split[0]);

        //splitting the hoursResult string and storing the 2 values (hour text) into an array of strings
        String[] hoursResult_split = hoursResult.split(" ");

        int resultHour = Integer.valueOf(hoursResult_split[0]);

        if ((startHour + resultHour) == endHour) {
            System.out.println("Test Passed");
            System.out.println("Starting Hour: " + startHour + " + " + resultHour + "(Resulting Hour) = Ending Hour: " + endHour);
        } else {
            System.out.println("Test Failed");
        }


    }

}