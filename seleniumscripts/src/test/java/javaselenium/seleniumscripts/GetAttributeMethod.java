package javaselenium.seleniumscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetAttributeMethod {
	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-orgin=*");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement usernametextfield = driver.findElement(By.name("username"));
		System.out.println(usernametextfield.getAttribute("name"));
		System.out.println(usernametextfield.getAttribute("placeholder"));
		System.out.println(usernametextfield.getAttribute("autofocus"));
		System.out.println(usernametextfield.getAttribute("data-v-1f99f73c"));
		System.out.println(usernametextfield.getAttribute("class"));
		driver.manage().window().minimize();
		driver.quit();
	}
}
