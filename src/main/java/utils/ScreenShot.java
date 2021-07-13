package utils;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShot {

//This Block deletes feature folder of the previous run screenshot result

	public static void deleteFolder(File featureFolder){
		for (File subFile : featureFolder.listFiles()) {
			if(subFile.isDirectory()) {
				deleteFolder(subFile);
			} else {
				subFile.delete();
			}
		}
		featureFolder.delete();
	}

	public static void getScreenshot(String testName, String featureName) {

		String folderPath = System.getProperty("user.dir")+"\\reports\\screenshot\\"+featureName;
		File featureFolder = new File(folderPath);
		
		if(featureFolder.exists()) {
			deleteFolder(featureFolder);
		}

		TakesScreenshot ss = (TakesScreenshot) DriverUtils.driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+"\\reports\\screenshot\\"+featureName+"\\"+testName+".png";
		try {
			FileUtils.copyFile(source, new File(dest));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


