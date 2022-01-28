package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests; //cucumber testng intergration infos
import io.cucumber.testng.CucumberOptions; //cucumber infos

@CucumberOptions(
		features = "src/test/java/features",
		glue="stepDefinitions"
		)
public class TestRunner2 extends AbstractTestNGCucumberTests{	
	
	
}