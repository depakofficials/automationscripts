package javaselenium.seleniumscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionsclass {
	public static void main(String[] args) throws Throwable {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://selectorshub.com/xpath%20practice%20page/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		// Inspect the Email Textfield and Write a Xpath
		WebElement emailtextfield = driver.findElement(By.xpath("//input[@id='userId']"));
		emailtextfield.click();
		emailtextfield.clear();
		emailtextfield.sendKeys("deepakbe2889@gmail.com");
		// Inspect the Password Textfield and Write an Xpath
		WebElement passwordtextfield = driver.findElement(By.name("Password"));
		passwordtextfield.click();
		passwordtextfield.clear();
		passwordtextfield.sendKeys("1234567780");
		// Inspect the Cars Drop Down 
		WebElement carsdropdown = driver.findElement(By.id("cars"));
		carsdropdown.click();
		WebElement optiondropdown = driver.findElement(By.xpath("//option[text()='Audi']"));
		action.click(optiondropdown).pause(Duration.ofSeconds(10)).perform();
		Thread.sleep(4000);
		driver.manage().window().minimize();
		driver.quit();
		
		
		
	}

}
