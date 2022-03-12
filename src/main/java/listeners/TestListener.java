package listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import base.TestBase;
import testUtils.TestUtilities;

public class TestListener extends TestBase implements ITestListener{

	public void onFinish(ITestContext arg0) {
        // TODO Auto-generated method stub
        
    }

    public void onStart(ITestContext arg0) {
        
        
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub
        
    }

    public void onTestFailure(ITestResult arg0) {
        try {
            
            test.log(Status.FAIL, "Failed Case is: " + arg0.getName());
            test.addScreenCaptureFromPath(TestUtilities.takeScreenShot(arg0.getName()));
            test.log(Status.FAIL, arg0.getName()+" FAIL with error " + arg0.getThrowable());
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        report.flush();
        
    }

    public void onTestSkipped(ITestResult arg0) {
        // TODO Auto-generated method stub
        
    }

    public void onTestStart(ITestResult arg0) {
               
         // TODO Auto-generated method stub
    } 

    public void onTestSuccess(ITestResult arg0) {
       
    	try {
    		test.log(Status.PASS, "Pass: " + arg0.getName());            
    		test.addScreenCaptureFromPath(TestUtilities.takeScreenShot(arg0.getName()));
            	
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        report.flush();
        
    }

	

}
