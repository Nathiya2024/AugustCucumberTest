package com.test.assertion.verify;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

	@Test
	public void assertMethod() {
		String name = "Nathiya";
		//Assert.assertEquals("Nathiya", name);
		//Assert.assertNotEquals("Nathia", name);
		
		boolean isDisplayed = true;
		
		Assert.assertTrue(isDisplayed);
	}
}
