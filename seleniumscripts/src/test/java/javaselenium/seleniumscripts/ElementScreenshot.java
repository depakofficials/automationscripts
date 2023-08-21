package javaselenium.seleniumscripts;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ElementScreenshot {

	public static void main(String[] args) {
		try {
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.flipkart.com/");
			WebElement cancelbutton=driver.findElement(By.xpath("//button[text()='✕']"));
			cancelbutton.click();
			Thread.sleep(3000);
			WebElement tss	=driver.findElement(By.xpath("//img[@title='Flipkart']"));
			TakesScreenshot ts=(TakesScreenshot)driver;
			File tempfile = tss.getScreenshotAs(OutputType.FILE);
			File destfile = new File("./pictures/Icon.png");
			FileUtils.copyFile(tempfile, destfile);
			driver.quit();
		} catch (Exception e) {
			System.out.println("Insuffient Found");
		}
	}
}
