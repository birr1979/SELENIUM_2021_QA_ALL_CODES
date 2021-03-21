package SeleniumClass5;

import java.io.*;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class code extends keyWords{

    

	public static void main(String[] args) throws IOException {
        System.out.println("banana".compareTo("mango"));
       
//        launchBrowser("chrome", "https://www.afrocouple.com");
        
        loadPropFiles();
        start_browser("testURL");
    }

}
