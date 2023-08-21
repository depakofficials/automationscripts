package loginscripts;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateNewTabInChromeBrowser {
	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-orgin=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.open()");
		ArrayList<String>array=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(array.get(array.size()-1));
		driver.get("https://www.github.com/depakofficials/");
		System.out.println(driver.getTitle());

	}
}
