package ABCDEFGHIJK;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class fullPageScreenShot {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		Date date= new Date();
		String file=date.toString().replace(":", "_").replace(" ", "_");
		
		String fileName= file.substring(0,19);
		System.out.println(fileName);
//driver= new ChromeDriver();
		driver=new FirefoxDriver();
driver.get("https://www.afrocouple.com");
File ScreenShoot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(ScreenShoot, new File("C:\\Programming Related\\Eclipse\\eclipse-workspace\\SELENIUM_2021_QA_PCS\\screenShots\\"+fileName+"_Web.jpg"));
System.out.println("Done");
		
//take a screeshoot of the entile page  method ViewportPasting will scroll the page down
Screenshot screenshot = new AShot()
						.shootingStrategy(ShootingStrategies.viewportPasting(500)).takeScreenshot(driver);

ImageIO.write(screenshot.getImage(), "png", new File("C:\\Programming Related\\Eclipse\\eclipse-workspace\\SELENIUM_2021_QA_PCS\\screenShots\\"+fileName+"_full.png"));


System.out.println("full screenShot is done.");



	}

}
