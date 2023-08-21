package usingtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CrossBrowser {
	@BeforeTest
	private void chrome() {
		System.out.println("Launching Chrome Browser");
	}
	@AfterClass
	public void firefox() {
		System.out.println("Launching Firefox Browser");
	}
	@BeforeClass
	public void edge() {
		System.out.println("Launching Edge Browser");
	}
	@AfterTest
	public void ie()  {
		System.out.println("Launching Internet Explorer Browser");
	}
	@AfterMethod
	public void safari()  {
		System.out.println("Launching Safari Browser");
	}
	@BeforeMethod
	public void opera() {
		System.out.println("Launching Opera Browser");
	}
	@AfterTest
	public void browser() {
		System.out.println("Launching the Browser");
	}
	@Test
	public void selenium() {
		System.out.println("The User Interface");
	}
	
	
	

}
