package com.test.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadPoolSize {

	@Test(invocationCount=4,threadPoolSize=2)
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("username")).sendKeys("NathiyaN");
		driver.findElement(By.name("password")).sendKeys("Nathi@98");
		driver.close();
	}
}
