package usingtestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderusingwithOrangeHRM {
	WebDriver driver;
	@BeforeSuite
	public void setup() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-orgin=*");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(dataProvider = "passingTheData")
	public void loginPage(String username, String password) throws Throwable {
		WebElement usernametextfield = driver.findElement(By.xpath("//input[@name='username']"));
		usernametextfield.click();
		usernametextfield.clear();
		usernametextfield.sendKeys(username);
		WebElement passwordtextfield = driver.findElement(By.xpath("//input[@name='password']"));
		passwordtextfield.click();
		passwordtextfield.clear();
		passwordtextfield.sendKeys(password);
		WebElement loginbutton = driver.findElement(By.xpath("//button[text()=' Login ']"));
		loginbutton.click();
		Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed());
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void logout() {
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@DataProvider
	public Object[][] passingTheData() {
		Object [][] names= new Object[2][2];
		names[0][0] = "Admin";
		names[0][1] = "admin123";
		
		names[1][0] = "admin";
		names[1][1] = "admin123";
		
		return names;
	}
}
