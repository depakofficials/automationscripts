package usingtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionusingTestNG {

	@Test
	public void loginPage() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://integrator.actitime.com/auth/at");
		driver.manage().window().maximize();
		
		WebElement usernametextfield=driver.findElement(By.name("username"));
		WebElement passwordtextfield = driver.findElement(By.xpath("//input[@name='password']"));
		
		// 1. AssertTrue() Methods
		Assert.assertTrue(usernametextfield.isDisplayed());
		usernametextfield.click();
		//usernametextfield.sendKeys("Manager");
		
		Assert.assertTrue(passwordtextfield.isDisplayed());
		passwordtextfield.click();
		//passwordtextfield.sendKeys("Manager");
		
		// 2.AssertFalse() Methods
	/*	Assert.assertFalse(usernametextfield.isDisplayed());
		usernametextfield.sendKeys("Admin");
		
		Assert.assertFalse(passwordtextfield.isDisplayed());
		passwordtextfield.sendKeys("Admin"); 	*/
		
		// 3.AssertEqual() Methods 
		String expectedTitle = "//span[text()='actiTIME ']";
		Assert.assertEquals(expectedTitle, driver.getTitle());
		
		driver.quit();
	}
}
