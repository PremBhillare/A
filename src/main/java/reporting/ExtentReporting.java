package reporting;

import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporting {

    // To create a rich standalone HTML file with several configurations handled
    // using config() method.
    public static ExtentHtmlReporter htmlReporter;

    // This is used to provide/add information to the HTML report
    public static ExtentReports extent;

    // method to return the ExtentReports object variable
    public static ExtentReports getExtentInstance() {

        if (extent == null) {
            htmlReporter = new ExtentHtmlReporter(
                    System.getProperty("user.dir") + "/test-output/screenshots/extentReport.html");

            extent = new ExtentReports();

            // attach the report to extent object variable
            extent.attachReporter(htmlReporter);

            // attach the desired information on the report
            extent.setSystemInfo("User Name",System.getProperty("os.name"));
            extent.setSystemInfo("OS", System.getProperty("os.arch"));
            extent.setSystemInfo("User Name", System.getProperty("user.name"));
            extent.setSystemInfo("Java Version",System.getProperty("java.version"));
            htmlReporter.config().setDocumentTitle("Extent Report Result");

            // Name of the report
            htmlReporter.config().setReportName("Applied Selenium - POM");

            // Dark Theme
            htmlReporter.config().setTheme(Theme.DARK);

        }
        return extent;
    }

}
