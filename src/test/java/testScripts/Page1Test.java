package testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Page1;

public class Page1Test extends TestBase{
	
	public Page1 page1;
	public Page1Test() {
		super();
	}
	@BeforeMethod
	public void SetUp() {
		initialization();
		page1 = new Page1();
	}
	@Test
	public void FillData() throws InterruptedException {
		test = report.createTest("FillData");
//		page1.FillData();
		String a ="Prem";
		String b ="Kumar";
		Assert.assertEquals(a, b);
	}
	@Test
	public void demo() {
		test = report.createTest("demo");
		String a ="Prem";
		String b ="Prem";
		Assert.assertEquals(a, b);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
