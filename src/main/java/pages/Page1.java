package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import customMethods.Methods;

public class Page1 extends TestBase{
	
	public Page1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id='close-fixedban']")
	static WebElement advertise;
	@FindBy(xpath = "//input[@id='firstName']")
	static WebElement firstname;
	@FindBy(xpath = "//input[@id='lastName']")
	static WebElement lastname;
	@FindBy(xpath = "//input[@id='userEmail']")
	static WebElement userEmail;
	@FindBy(xpath = "//input[@id='gender-radio-1']")
	static WebElement male;
	@FindBy(xpath = "//input[@id='userNumber']")
	static WebElement userNumber;
	@FindBy(xpath = "//input[@id='dateOfBirthInput']")
	static WebElement dob;
	@FindBy(xpath = "//div[@id='subjectsContainer']")
	static WebElement subjects;
	@FindBy(xpath = "//*[contains(text(),'Physics')]")
	static WebElement physics;
	@FindBy(xpath = "//label[contains(text(),'Sports')]")
	static WebElement hobbiesSports;
	@FindBy(xpath = "//input[@id='uploadPicture']")
	static WebElement uploadPicture;
	@FindBy(xpath = "//textarea[@id='currentAddress']")
	static WebElement currentAddress;
	@FindBy(xpath = "//div[@id='state']")
	static WebElement state;
	@FindBy(xpath = "//*[contains(text(),'NCR')]")
	static WebElement ncr;
	@FindBy(xpath = "//div[@id='city']")
	static WebElement city;
	@FindBy(xpath = "//*[contains(text(),'Delhi')]")
	static WebElement delhi;
	@FindBy(xpath = "//button[@id='submit']")
	static WebElement submit;
	@FindBy(xpath = "//button[@id='closeLargeModal']")
	static WebElement close;
	@FindBy(xpath = "//*[contains(text(),'Elements')]//parent::div[@class='header-text']")
	static WebElement elements;
	@FindBy(xpath = "//*[contains(text(),'Web Tables')]")
	static WebElement webTables;
	
	public  void  FillData() throws InterruptedException {
		Methods.Click(driver, advertise, 10);
		Methods.Sendkeys(driver, firstname,"Arun",10);
		Methods.Sendkeys(driver, lastname, "patak", 10);
		Methods.Sendkeys(driver, userEmail, "123asdf@gmail.com", 10);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",male);
		Methods.Sendkeys(driver, userNumber, "1234567890", 10);
		Actions action = new Actions(driver);
		action.moveToElement(dob).click()
		.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("12 Dec 2021").build().perform();
		Actions action1 = new Actions(driver);
		action1.moveToElement(subjects).click()
		.sendKeys("p").build().perform();

		Thread.sleep(1000);
		Methods.Click(driver, physics, 10);
		
		js.executeScript("window.scrollBy(0,300)");
		
		Methods.Click(driver, hobbiesSports, 10);
		String picPath =System.getProperty("user.dir")+"/Drivers/1.png";
		Methods.Sendkeys(driver, uploadPicture, picPath	, 10);
		Methods.Sendkeys(driver, currentAddress, "Beed", 10);
		Methods.Click(driver, state, 10);
		Methods.Click(driver, ncr, 10);
		Methods.Click(driver, city, 10);
		Methods.Click(driver, delhi, 10);
		Methods.Click(driver, submit, 10);
		Methods.Click(driver, close, 10);
		Methods.Click(driver, elements, 10);
		Methods.Click(driver, webTables, 10);
	}
	
}
