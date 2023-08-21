package javaselenium.seleniumscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class CrossBrowser {
	public static void main(String[] args) throws Throwable {
		String browsername="Firefox";
		if (browsername.equals("Chrome")) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
			driver.manage().window().minimize();
			driver.quit();
		} else if (browsername.equals("Firefox")) {
			WebDriver drivers=new FirefoxDriver();
			drivers.get("https://www.instagram.com/accounts/login/");
			drivers.manage().window().maximize();
			drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(5000);
			System.out.println(drivers.getTitle());
			drivers.manage().window().minimize();
			drivers.quit();
		} else if (browsername.equals("Edge")) {
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
			driver.manage().window().minimize();
			driver.quit();
		} else {
			System.err.println("FALSE : Invalid Browser !");
		}	
	}

}
