package TestScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import customMethods.ReadDataFromExcelToDataProvider;

public class TestDataFromExcelToDataProvider {
	
		@Test(dataProvider = "Testdata",enabled =true)
	public void test(String name) {
		System.out.println(name);
	}
	
	@DataProvider(name = "Testdata")
	public Object[][] getdata(String SheetName){
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\testData\\Data.xls";
		Object[][] arrayObject = ReadDataFromExcelToDataProvider.getExcelData(path, "Sheet 1");
		return arrayObject;
	}

}
