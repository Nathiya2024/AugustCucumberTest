package com.test.parameters;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import com.base.utils.BaseClass;

public class Parametersample extends BaseClass {
	@Parameters("driver")
	@BeforeMethod
	public void launchJpetapp(String brow) {
		browserOpen(brow);
		loadUrl("https://petstore.octoperf.com/actions/Catalog.action");
	}
	@Parameters("user")
	@Test
	public void datasend(String user) {
		findBy(By.linkText("Sign In")).click();;
		findBy(By.name("username")).sendKeys(user);
		 
	}

}
