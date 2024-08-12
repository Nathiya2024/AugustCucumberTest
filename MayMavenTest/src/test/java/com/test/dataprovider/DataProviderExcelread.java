package com.test.dataprovider;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcelread {

	@Test(dataProvider="credentials")
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
	//@DataProvider(name="credentials", parallel=true)
//	public String[][] data(){
//		String array[][]= null;
//		//int i,j;
//		String location ="./src/test/resources/TestData/testdata.xlsx";
//		XSSFWorkbook wbook=new XSSFWorkbook();
//		XSSFSheet sheet=wbook.getSheet("sheet1");
//		int noofrows=sheet.getPhysicalNumberOfRows();
//		for(int i=0; i<noofrows;i++) {
//			XSSFRow row = sheet.getRow(i);
//			int noofcells=row.getPhysicalNumberOfCells();
//			for(int j=0; j<noofcells;j++) {
//				XSSFCell cell=row.getCell(j);
//				String value =cell.getStringCellValue();
//				if(j==0) {
//				//	String array[][]= {value};
//				}else {
//					Object[] r2value = {value};
//				//	value2 = r2value;
//					
//				}
				
			//}
			
		//}
		
		}
//}
