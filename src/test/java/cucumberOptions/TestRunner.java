package cucumberOptions;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.runner.RunWith;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(//stepNotifications = true,
		features="src/test/java/features",
     glue="src/test/java/stepDefinations"
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}
