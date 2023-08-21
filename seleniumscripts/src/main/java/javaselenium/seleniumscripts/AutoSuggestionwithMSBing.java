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

public class AutoSuggestionwithMSBing {
	public static void main(String[] args) throws Throwable {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-orgin=*");
		WebDriver driver = new ChromeDriver(option);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchfield = driver.findElement(By.id("sb_form_q"));
		searchfield.sendKeys("selenium");
		wait.until(ExpectedConditions.visibilityOf(searchfield));
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//li[@role='option']//span"));
		System.out.println("The Size of Auto-Suggestions :"+autosuggestion.size());
		for (WebElement suggestion: autosuggestion) {
			if (suggestion.getText().equals("Selenium")) {
				suggestion.click();
				break;
			}
		}
		wait.until(ExpectedConditions.visibilityOf(searchfield));
		driver.manage().window().minimize();
		driver.quit();
	}
}
