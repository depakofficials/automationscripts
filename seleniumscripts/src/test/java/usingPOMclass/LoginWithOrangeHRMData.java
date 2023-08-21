package usingPOMclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LoginWithOrangeHRMData {
	
	@Test
	public void verifytheloginbuttonpage() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origin=*");
		WebDriver driver=new ChromeDriver(option);
		
		LoginWithOrangeHRMTest loginpage = new LoginWithOrangeHRMTest(driver);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		loginpage.setUsername("Admin");
		loginpage.setPassword("admin123");
		loginpage.setLoginButton();
		
		if (driver.getPageSource().contains("Dashboard")) {
			System.out.println("PASS : Login Successfully ");
		} else {
			System.out.println("FAILED : Invalid Data");
		}
		
		driver.quit();
	}
}
