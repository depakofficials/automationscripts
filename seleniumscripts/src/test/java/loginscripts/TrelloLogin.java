package loginscripts;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloLogin {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://trello.com/en/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		System.out.println(driver.getTitle());
		// Inspect the Email textfield and give the SendKeys
		WebElement emailtextfield = driver.findElement(By.xpath("//input[@name='user' and @id='user']"));
		emailtextfield.click();
		emailtextfield.clear();
		emailtextfield.sendKeys("deepakbe2899@gmail.com");
		// Inspect the Contine Button and write the Xpath and click on Continue Button 
		WebElement continuebutton = driver.findElement(By.xpath("//input[@id='login']"));
		continuebutton.click();
		Thread.sleep(4000);
		// Inspect the Password Textfield and sent the SendKeys 
		WebElement passwordtextfield = driver.findElement(By.xpath("//input[@id='password']"));
		passwordtextfield.click();
		passwordtextfield.clear();
		passwordtextfield.sendKeys("Deepak#123456789");
		// Inspect the Show Password Button
		WebElement showbutton = driver.findElement(By.xpath("//span[@aria-hidden='true']"));
		showbutton.click();
		Thread.sleep(3000);
		WebElement hiddenbutton = driver.findElement(By.xpath("//span[@aria-hidden='true']"));
		hiddenbutton.click();
		Thread.sleep(3000);
		// Inspect the Login Button and Click on 
		WebElement loginbutton = driver.findElement(By.xpath("//span[text()='Log in']"));
		loginbutton.click();
		Thread.sleep(10000);
		System.out.println(driver.getTitle());
		driver.manage().window().minimize();
		driver.quit();
	}

}
