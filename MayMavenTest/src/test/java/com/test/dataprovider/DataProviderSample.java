package com.test.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSample {

	@Test(dataProvider="userandpwd",dataProviderClass=DiffClassDataProvider.class)
	public void fblogin(String username, String password) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pass"));
		WebElement login=driver.findElement(By.name("login"));
		
		user.sendKeys(username);
		pwd.sendKeys(password);
		login.click();
		
	}
	@DataProvider(name="credentials", parallel=true)
	public Object[][] data(){
		return new Object[][] {{"Nathiya","Nathiya@123"},
						   {"Viji", "Viji@123"}};
		}
	}
	

