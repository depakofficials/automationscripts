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

public class AutoSuggestionwithFlipkart {
	public static void main(String[] args) throws Throwable {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-orgin=*");
		WebDriver driver = new ChromeDriver(option);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement confirmationpopups = driver.findElement(By.xpath("//button[text()='✕']"));
		wait.until(ExpectedConditions.visibilityOf(confirmationpopups));
		confirmationpopups.click();
		WebElement flipkartsearchtectfield = driver.findElement(By.name("q"));
		flipkartsearchtectfield.click();
		flipkartsearchtectfield.sendKeys("mobiles");
		wait.until(ExpectedConditions.visibilityOf(flipkartsearchtectfield));
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//a[@class='_3izBDY']//div[@class='lrtEPN _17d0yO']//span"));
		System.out.println(autosuggestion.size());
		for (WebElement dropdownsuggestion : autosuggestion) {
			if (dropdownsuggestion.getText().contains(" phone 5g")) {
				dropdownsuggestion.click();
				break;
			}		
		}
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
