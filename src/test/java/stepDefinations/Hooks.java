package stepDefinations;

import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.DriverUtils;
import utils.ScreenShot;

public class Hooks {
	
	@After
	public void AfterSteps(Scenario scenario) throws IOException {
		DriverUtils.getDriver();
		if(scenario.isFailed()) {
			String testName = scenario.getName();
			//To get Feature name
			String name = scenario.getId();
			String modName = name.replaceAll("file:///D:/Java/Projects/MSEDCL-ExtentReport/src/test/resources/featureFiles/", "");
			String featureName = modName.split(":")[0];
			
			byte[] screenshot = ((TakesScreenshot)DriverUtils.driver).getScreenshotAs(OutputType.BYTES);
					
			scenario.attach(screenshot, "image/png", featureName);
				
			ScreenShot.getScreenshot(testName , featureName);	
		}
	}
	

	
}
