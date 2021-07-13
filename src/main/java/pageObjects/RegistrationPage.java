package pageObjects;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import data.RandomData;
import utils.AssertionUtils;
import utils.DriverUtils;

public class RegistrationPage {

	WebDriver driver = DriverUtils.getDriver();
	
	By allFields  = By.xpath("//table[@class='form_table'] //tr //span[1]");
	By submitButton = By.id("lblSubmit");
	By clearButton = By.id("lblClear");
	
	By consumerNumber = By.id("consumerNumber");
	By mobileNumber = By.id("mobileNumber");
	By email = By.id("email");
	By txtEmailOTP = By.id("txtEmailOTP");
	By loginName = By.id("loginName");
	By password = By.id("password");
	By confirmPassword = By.id("confirmPassword");

	
	
	public void checkAllFields(String expected) {
		AssertionUtils.assertMultipleThings(expected, allFields);
	}
	
	public void checkAlertText() throws InterruptedException {
		driver.findElement(submitButton).click();
		Thread.sleep(3000);
		String text = driver.switchTo().alert().getText();
		Alert ele = driver.switchTo().alert();
		driver.switchTo().alert().dismiss();
		
		Assert.assertNotNull(ele);
	}

	public void fillAllTextBox() {
		RandomData rd = new RandomData();
		driver.findElement(consumerNumber).sendKeys(rd.getConsumerNumber());
		driver.findElement(mobileNumber).sendKeys(rd.getMobileNumber());
		driver.findElement(email).sendKeys(rd.getEmail());
		//driver.findElement(txtEmailOTP).sendKeys(rd.getTxtEmailOTP());
		driver.findElement(loginName).sendKeys(rd.getLoginName());
		driver.findElement(password).sendKeys(rd.getPassword());
		driver.findElement(confirmPassword).sendKeys(rd.getPassword());
	}
	
	public void clickSubmit() {
		driver.findElement(submitButton).click();
	}
	
	public void clearButton() {
		driver.findElement(clearButton).click();
		Assert.assertTrue(driver.findElement(consumerNumber).getText().isEmpty());
		Assert.assertTrue(driver.findElement(mobileNumber).getText().isEmpty());
		Assert.assertTrue(driver.findElement(email).getText().isEmpty());
		Assert.assertTrue(driver.findElement(txtEmailOTP).getText().isEmpty());
		Assert.assertTrue(driver.findElement(loginName).getText().isEmpty());
		Assert.assertTrue(driver.findElement(password).getText().isEmpty());
		Assert.assertTrue(driver.findElement(confirmPassword).getText().isEmpty());
	}
	
}
