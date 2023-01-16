package utility;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass {
	private ExtentHtmlReporter htmlReporter;
	private ExtentReports extent;
	private ExtentTest test;
	
	
	
	protected Webutill ut=new Webutill();
	@BeforeClass
	public void launchBrowser() {
		ut.launchBrowser();
		
	}
	
   @BeforeMethod
   public void setmethod(Method methodname) {
	test=extent.createTest(methodname.getName());
   }
   

	@AfterClass
	public void close() {
		//ut.close();
	}
	
	@BeforeTest
	public void SetRepoert() {
		htmlReporter =new ExtentHtmlReporter("ExtentReporet//Testcasereport.html");    //Fd

		 htmlReporter.config().setDocumentTitle("Automation Report");
		 htmlReporter.config().setReportName("Functional Report");
		 htmlReporter.config().setTheme(Theme.STANDARD);
		 
		 extent=new ExtentReports();
		 
		 extent.attachReporter(htmlReporter);
		 extent.setSystemInfo("HostName", "CBSL");
		 extent.setSystemInfo("Enviroment", "Local");
		 extent.setSystemInfo("Os", "Windos 10");
		 extent.setSystemInfo("User Name", "Asif");
		 
	}
	@AfterMethod
	public void Getresult(ITestResult result) {
		if(result.getStatus()== ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"Testcase fail",ExtentColor.RED));
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable()+"Testcase fail",ExtentColor.RED));
			ut.Screenshot(result.getName());
			
		}
		else if(result.getStatus() == ITestResult.SKIP){
			
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
			}
		else if(result.getStatus() == ITestResult.SUCCESS){

			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
			}
		
		}
	@AfterTest
	   public void endreport() {
		   extent.flush();
	   }
}
