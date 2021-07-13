package runner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utils.DriverUtils;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/featureFiles/"
		,glue= {"stepDefinations"}
		//,tags = "@SmokeTest"
		,plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		,monochrome = true
		)
		

public class TestRunner {
	
	@AfterClass
	public static void close() {
		DriverUtils.close();
	}

}
