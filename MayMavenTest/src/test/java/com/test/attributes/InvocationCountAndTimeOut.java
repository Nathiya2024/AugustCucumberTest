package com.test.attributes;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class InvocationCountAndTimeOut extends BaseClass {

	@Test(invocationCount=2, invocationTimeOut=20000)
	public void login() {
		browserOpen("chrome");
		loadUrl("https://petstore.octoperf.com/actions/Catalog.action");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("username")).sendKeys("NathiyaN");
		driver.findElement(By.name("password")).sendKeys("Nathi@98");
		driver.close();
		//System.out.println("Login");
	}

}
