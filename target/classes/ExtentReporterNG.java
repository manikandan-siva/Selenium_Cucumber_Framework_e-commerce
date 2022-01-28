package resources;

import com.aventstack.extentreports.ExtentReports; //extentreport executor class access
import com.aventstack.extentreports.reporter.ExtentSparkReporter; //extent report properties class

public class ExtentReporterNG {
	
	//static to use it without object
	//report executor
	static ExtentReports reportExecutor;
	
	//config method
	public static ExtentReports extentReporterConfig()
	{
		//report path
		String reportPath = System.getProperty("user.dir")+"\\reports\\TestReport.html";
		
		//report properties
		ExtentSparkReporter repProp = new ExtentSparkReporter(reportPath); //path is mandatory
		repProp.config().setReportName("E-commerce account creation and validation"); // title inside the page
		repProp.config().setDocumentTitle("E-commerce Site Testing"); //tab title
		
		//report executor
		reportExecutor = new ExtentReports();
		reportExecutor.attachReporter(repProp);
		reportExecutor.setSystemInfo("Tester", "Tester1");
		
		return reportExecutor;
		
		
	}
}
