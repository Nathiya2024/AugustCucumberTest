package com.test.assertion.verify;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void softAssertMethod() {
		String name = "Nathiya";
		SoftAssert verify = new SoftAssert();
		
		verify.assertEquals("Nathiy",name);
		
		
	}
}
