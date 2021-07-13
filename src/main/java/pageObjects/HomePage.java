package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.AssertionUtils;
import utils.DriverUtils;

public class HomePage {
	
	WebDriver driver = DriverUtils.getDriver();
	

		
	By logo = By.xpath("//img[@src='images/logo_billing.gif']");
	By banner = By.xpath("//img[@src='images/banner.jpg']");
	By leftPaneLinks = By.xpath("//div[@id='leftnav_notloggedin'] //li");
	By middlePaneBox = By.xpath("//div[@class='left'] //div[@class='section'] //h4");
	By rightPanelBox = By.xpath("//div[@class='right'] //div[@class='section'] //h4");
	By footerText = By.xpath("//div[@class='footer']");
	By allLinks = By.tagName("a");
	By footerLinks = By.xpath("//div[@class='footer'] //div //div //a");
	
	By registrationLink = By.id("leftnav_lblNewUser");
	By loginLink = By.id("leftnav_lblLogin");
	
	public void checkLogo() {
		Assert.assertTrue(driver.findElement(logo).isDisplayed());
	}
	
	public void checkleftPaneLinks(int expected) {
		Assert.assertTrue(driver.findElements(leftPaneLinks).size()==expected);
	}
	
	public void checkmiddlePanelBox(String expected) {
		AssertionUtils.assertMultipleThings(expected, middlePaneBox);	
	}
		
	public void checkBannerImage() {
		Assert.assertTrue(driver.findElement(banner).isDisplayed());
	}
	
	public List<WebElement> getallLinks() {
		return driver.findElements(allLinks);
	}
		
	public void checkRightPaneBox(String expected) {
		AssertionUtils.assertMultipleThings(expected, rightPanelBox);		
	}
	
	public void checkFooterLinksPaneBox(String expected) {	
		AssertionUtils.assertMultipleThings(expected, footerLinks);
	}
	
	public void getRegistrationPage() {
		driver.findElement(registrationLink).click();
	}
	public void getLoginPage() {
		driver.findElement(loginLink).click();
	}
	
	
}
