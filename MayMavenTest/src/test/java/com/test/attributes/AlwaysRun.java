package com.test.attributes;

import org.testng.annotations.Test;

public class AlwaysRun {

	@Test(enabled=true)
	public void Test1() {
		int i = 1/0;
				System.out.println("Test1");
	}
	
	@Test(dependsOnMethods="Test1", alwaysRun=true)
	public void Test2() {
		System.out.println("Test2");
	}
}
