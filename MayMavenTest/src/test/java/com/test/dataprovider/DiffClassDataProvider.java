package com.test.dataprovider;

import org.testng.annotations.DataProvider;

public class DiffClassDataProvider {

	@DataProvider(name="userandpwd", parallel=true)
	public Object[][] data(){
		return new Object[][] {{"Bilal", "Bilal@123"},
							   {"Jothika", "Jothi@123"}};
}
}
