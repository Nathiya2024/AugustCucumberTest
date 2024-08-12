package com.testng.extentreports;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class TestngExtentReports extends BaseClass {

	@Test
	public void sample() throws IOException {
		
		createTestName("Jpet login");
		
		browserOpen("chrome");
		reportStatus("PASS", "Browser opened.");
		loadUrl("https://petstore.octoperf.com/actions/Catalog.action");
		reportStatus("PASS", "URL Successfully launched");
		findElementByXpath("//a[text()='Sign In']").click();
		findElementByXpath("//input[@name='username']").sendKeys("j2ee");
		reportStatus("PASS", "Username and password entered");
		findElementByXpath("//input[@name='signon']").click();
		reportStatus("PASS","SignOn button clicked");
		WebElement logout =findElementByXpath("//a[text()='Sign Out']");
		try {
		if(logout.isDisplayed()) {
			reportStatus("PASS SCREEENSHOT", "User successfully loggedin");
		}
		}catch(Exception e) {
			reportStatus("FAIL", "User not loggedin");
		}
		
	}
}
