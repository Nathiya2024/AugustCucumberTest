package com.test.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleAnnotations {

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before class");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before Method");
	}
	
	@Test
	public void Test2() {
		System.out.println("Test1");
	}
	
	@Test
	public void Test1() {
		System.out.println("Test2");
	}
	
	@Test
	public void Test3() {
		System.out.println("Test3");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");
	}
}
