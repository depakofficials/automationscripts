package javaselenium.seleniumscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestion {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		WebElement searchtextfield = driver.findElement(By.name("q"));
		searchtextfield.click();
		Thread.sleep(3000);
		searchtextfield.sendKeys("selenium");
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//textarea[@id='APjFqb']"));
		for (WebElement webElement : autosuggestion) {
			if (webElement.equals("selenium testing")) {
				webElement.click();
			}
			
		}
		Thread.sleep(3000);
		driver.manage().window().minimize();
		//driver.quit();
		
		
	}
}
