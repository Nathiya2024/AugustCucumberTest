package com.test.groups;

import org.testng.annotations.Test;

public class GroupOfGroupsSample {

	@Test(groups = {"Cart Page", "Regression"})
	public void cart1() {
		System.out.println("Cart1");
	}
	
	@Test(groups= {"Cart Page", "Regression"})
	public void cart2() {
		System.out.println("cart2");
	}
}
