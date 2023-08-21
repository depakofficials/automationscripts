package usingtestng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionusingMethods {
	SoftAssert softAssert=new SoftAssert();
	SoftAssert soft=new SoftAssert();
	@Test
	void softAssertionusingtestNG() {
		softAssert.assertTrue(true);
		softAssert.assertEquals("Webpage", "Webpage");
		softAssert.assertEquals("True", "False");
		System.out.println("Successfully Passed");
		softAssert.assertAll();
	}
	
	@AfterTest
	void executingAssertMethod() {
		soft.assertTrue(false);
		soft.assertEquals("File", "Files");
		soft.assertEquals("TestNG", "TestNG");
		soft.assertEquals("Kind", "Kind");
		System.out.println("Print the Correct Statement");
		soft.assertAll();
	}
}
