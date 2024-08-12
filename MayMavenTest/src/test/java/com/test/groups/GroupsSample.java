package com.test.groups;

import org.testng.annotations.Test;

public class GroupsSample {

	@Test(groups= {"LoginPage","Regression"})
	public void login1() {
		System.out.println("Login1");
	}
	
	@Test(groups= {"LoginPage","Regression"})
	public void login2() {
		System.out.println("Login2");
	}
	@Test(groups= {"HomePage","Regression"})
	public void home1() {
		System.out.println("home1");
	}
	@Test(groups= {"HomePage","Regression"})
	public void home2() {
		System.out.println("home2");
	}
	@Test(groups= {"PDP Page","Regression"})
	public void PDP1() {
		System.out.println("PDP1");
	}
	@Test(groups= {"PDP Page","Regression"})
	public void PDP2() {
		System.out.println("PDP2");
	}
	
	
	
	
}
