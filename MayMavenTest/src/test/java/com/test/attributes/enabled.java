package com.test.attributes;

import org.testng.annotations.Test;

public class enabled {

	//If we give enabled = false it will skip the execution
	@Test(enabled=false)
	public void Test1() {
		System.out.println("Test 1");
	}
	
	@Test()
	public void Test2() {
		System.out.println("Test 2");
	}
}
