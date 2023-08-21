package usingtestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class HardAssertionMethods {

	@Test
	void hardAssertion() {
		Assert.assertTrue(true);
		Assert.assertEquals("WebDriver", "WebDriver");
		Assert.assertEquals("Webpage", "Webpage");
		System.out.println("Successfully Passed");
	}
}
