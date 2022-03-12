package base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import reporting.ExtentReporting;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	//Create instance for Logger object
    public static Logger log = Logger.getLogger("devpinoyLogger");
    
    //get the reference of ExtentReports object to instantiate HTML reporting
    public static ExtentReports report = ExtentReporting.getExtentInstance();
    
    //indicate which test to include in report
    public static ExtentTest test;
	
	public TestBase()  {
		prop = new Properties();
		FileInputStream file=null;
		try {
		 file = new FileInputStream("F:\\eclipse-workspace\\Project\\src\\main\\java\\config\\config.properties");
		 prop.load(file);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void initialization() {
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("FF")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
}
