package com.test.attributes;

import org.testng.annotations.Test;

public class Priority {

	//If we didn't give anypriorty the test will be
	//executed as per the ascending order
	
	//Which test will execute, if 2 tests are having same priorities -> based on ASCII
		//What will happen, If we didn't declare any priority for @Test
		    //by default, it will make the @Test as 0th priority
		//Can we declare negative numbers on priority? 
		    //yes, we can 
	@Test(priority=1)
	public void Testtt() {
		System.out.println("Test 1");
	}
	
	@Test(priority=2)
	public void Testst() {
		System.out.println("Test 2");
	}
	
	@Test(priority =3)
	public void Testzt() {
		System.out.println("Test 3");
	}
	
	@Test
	public void Testat() {
		System.out.println("Test 4");
	}
	@Test(priority =-2)
	public void Testkt() {
		System.out.println("Test 5");
	}
}
