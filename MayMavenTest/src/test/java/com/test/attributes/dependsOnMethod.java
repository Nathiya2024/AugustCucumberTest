package com.test.attributes;

import org.testng.annotations.Test;

public class dependsOnMethod {

	//How to use different class @Test in dependsOnMethods?
	   //declare with packagename.ClassName.methodName
	
	@Test(priority=2,dependsOnMethods="Test2")
	public void Test1() {
		System.out.println("Test1");
	}
	@Test(priority=3)
	public void Test2() {
		System.out.println("Test2");
	}
	@Test(dependsOnMethods="com.test.attributes.enabled.Test2")
	public void Test3() {
		System.out.println("Test3");
	}
}
