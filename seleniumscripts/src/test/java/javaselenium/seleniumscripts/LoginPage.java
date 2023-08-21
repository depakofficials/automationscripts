package javaselenium.seleniumscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement emailtextfield = driver.findElement(By.xpath("//input[@name='email']"));
	emailtextfield.click();
	emailtextfield.clear();
	emailtextfield.sendKeys("deepakofficials");
	WebElement passwordtextfield = driver.findElement(By.id("pass"));
	passwordtextfield.click();
	passwordtextfield.clear();
	passwordtextfield.sendKeys("6502472389");
	WebElement submitbutton = driver.findElement(By.name("login"));
	submitbutton.click();
	Thread.sleep(4000);
	driver.manage().window().minimize();
	driver.quit();


}
}
