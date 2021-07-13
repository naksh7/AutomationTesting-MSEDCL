package pageObjects;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import data.RandomData;
import utils.AssertionUtils;
import utils.DriverUtils;

public class LoginPage {
	WebDriver driver = DriverUtils.getDriver();
	
	By allFields  = By.xpath("//table[@class='form_table'] //tr //span[1]");
	By loginId = By.id("loginId");
	By password = By.id("password");
	By txtInput = By.id("txtInput");
	By lblLoginButton = By.id("lblLoginButton");
	By lblClear = By.id("lblClear");
	
	
	public void checkAlertText() throws InterruptedException {
		driver.findElement(lblLoginButton).click();
		Thread.sleep(3000);
		String text = driver.switchTo().alert().getText();
		Alert ele = driver.switchTo().alert();
		driver.switchTo().alert().dismiss();
		
		Assert.assertNotNull(ele);
		
	}
	public void fillAllTextBox() {
		RandomData rd = new RandomData();
		driver.findElement(loginId).sendKeys(rd.getLoginName());
		driver.findElement(password).sendKeys(rd.getPassword());
		
	}
	public void clearButton() {
		driver.findElement(lblClear).click();
		Assert.assertTrue(driver.findElement(loginId).getText().isEmpty());
		Assert.assertTrue(driver.findElement(password).getText().isEmpty());
		
	}
	
	public void checkAllFields(String expected) {
		AssertionUtils.assertMultipleThings(expected, allFields);
	}
	
	
	
	

}
