package testScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import customMethods.ReadDataFromExcelToDataProvider;

public class TestDataFromExcel extends TestBase{

	@BeforeMethod
	public void Setup() {
//		initialization();
	}
	
	@Test(dataProvider = "TestData")
	public void test(String name) {
		System.out.println(name);
	}
	
	@AfterMethod
	public void TearDown() {
//		driver.close();
	}
	
	@DataProvider(name="TestData")
	public Object [][] getdata(){
		String file = System.getProperty("user.dir")+"\\src\\main\\java\\testData\\Data.xls";
		Object array [][]= ReadDataFromExcelToDataProvider.getExcelData(file, "Sheet1");
		return array;
	}
}
