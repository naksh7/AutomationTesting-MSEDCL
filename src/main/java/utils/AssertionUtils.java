package utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AssertionUtils {
	
	public static void assertMultipleThings(String expected, By middlePaneBox) {	
		List<WebElement> boxes = DriverUtils.getDriver().findElements(middlePaneBox);
		ArrayList<String> boxList = new ArrayList<String>();
		for(int i=0;i<boxes.size();i++) {
			boxList.add(boxes.get(i).getText());
		}
		Assert.assertTrue(boxList.contains(expected), String.format("The expected link name %s", expected));
	}

}
