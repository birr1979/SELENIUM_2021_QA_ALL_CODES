package ResumeUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkedIn {
	
	static String url1="https://www.linkedin.com/";
	static String email="birr_1979@hotmail.com";
	static String password="Password";
	static String resume="\"C:\\Users\\birr_\\Desktop\\QA AUTOMATION\\Birhanu Sendek_Resume_2014.docx\"";
	
	
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();
	driver.get(url1);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	
	driver.findElement(By.id("session_key")).sendKeys(email);
	driver.findElement(By.id("session_password")).sendKeys(password);
	driver.findElement(By.xpath("//button[@class='sign-in-form__submit-button']")).click();
	driver.findElement(By.xpath("//div[@class='profile-rail-card__actor-link t-16 t-black t-bold']")).click();

	System.out.println("Profile loaded......");
String More="//button[@class='ml2 mr2 pv-s-profile-actions__overflow-toggle artdeco-button artdeco-button--muted artdeco-button--2 artdeco-button--secondary artdeco-dropdown__trigger artdeco-dropdown__trigger--placement-bottom ember-view']";
	driver.findElement(By.xpath(More)).click();

	System.out.println("More Clicked.....");


	driver.findElement(By.xpath("((//ul)[8]//li)[3]")).click();
	Thread.sleep(2000);
	
	System.out.println("upload started.....");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='resume-builder-upload']")).sendKeys(resume);;
	Thread.sleep(1000);
	System.out.println("resume clicked");
	
	
	
	driver.findElement(By.xpath("//button[@class='artdeco-button artdeco-button--2 artdeco-button--primary ember-view']")).click();
	driver.findElement(By.xpath("//button[@class='artdeco-button artdeco-button--2 artdeco-button--tertiary ember-view']")).click();
	System.out.println("Resume Uploading.......");
	
	//insert job title job Title
	
	driver.findElement(By.xpath("((//button[@class='mlA mr2 artdeco-button artdeco-button--2 artdeco-button--secondary ember-view'])//span[@class='artdeco-button__text'])[1]")).click();
//	driver.findElement(By.xpath("//div//input[@id='resume-builder-desired-title-modal__title-input']")).sendKeys("Senior QA Automation Engineer");
//	//click apply settings
//	driver.findElement(By.xpath("//button[@class='artdeco-button artdeco-button--2 artdeco-button--primary ember-view']")).click();
	driver.findElement(By.xpath("//button[@class='artdeco-button artdeco-button--2 artdeco-button--tertiary ember-view']")).click();

		System.out.println("BINGO....RESUME SUCCESSFULLY UPLOADED.");
		
		

	}

}
