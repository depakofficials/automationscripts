package usingPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithOrangeHRMTest {
	
	WebDriver driver;
	
	public LoginWithOrangeHRMTest(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	WebElement userName;
	
	@FindBy(name = "password")
	WebElement passWord;
	
	@FindBy(xpath = " //button[text()=' Login '] ")
	WebElement loginbutton;
	
	public void setUsername(String name) {
		userName.click();
		userName.sendKeys(name);
	}
	
	public void setPassword(String paswrd) {
		passWord.sendKeys(paswrd);
	}
	
	public void setLoginButton() {
		loginbutton.click();
	}
}
