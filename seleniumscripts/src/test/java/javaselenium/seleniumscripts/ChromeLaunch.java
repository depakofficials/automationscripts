package javaselenium.seleniumscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ChromeLaunch {
		public static void main(String[] args) throws Throwable {
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement emailtextfield = driver.findElement(By.id("email"));
		    emailtextfield.click();
		    emailtextfield.clear();
		    emailtextfield.sendKeys("deepakbe2889@gmail");
		    WebElement passwordtextfield = driver.findElement(By.id("pass"));
		    passwordtextfield.click();
		    passwordtextfield.clear();
		    passwordtextfield.sendKeys("12345678"); 
		    WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		    loginbutton.submit();
		    if (loginbutton.isSelected()) {
		    	System.out.println("Condition is Pass: TRUE");
		    } else {
				System.out.println("Condition is Fail : FALSE");
			}
		    driver.manage().window().minimize();
		    driver.quit(); 
		}
	
}
