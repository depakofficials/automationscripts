package javaselenium.seleniumscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestionwithGoogle {
	public static void main(String[] args) throws Throwable {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-orgin=*");
		WebDriver driver=new ChromeDriver(option);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchtextfield = driver.findElement(By.name("q"));
		searchtextfield.sendKeys("selenium");
		wait.until(ExpectedConditions.visibilityOf(searchtextfield));
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]//span"));
		System.out.println("Thew size of Selenium auto-suggestion is :"+autosuggestion.size());
		for (WebElement suggestionelement: autosuggestion) {
			if (suggestionelement.getText().contains(" webdriver download")) {
				suggestionelement.click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
