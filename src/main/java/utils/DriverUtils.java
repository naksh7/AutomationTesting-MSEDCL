package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;


public class DriverUtils {

	public static WebDriver driver;	
	
	public static void initDriver() {
		String pathofDriver = ConfigUtils.getPropertyByKey("pathofDriver");
		String browser = ConfigUtils.getPropertyByKey("browser");
		
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",pathofDriver);
			driver = new ChromeDriver();
		}
		else if(browser.equals("opera")) {
			System.setProperty("webdriver.opera.driver",pathofDriver);
			driver = new OperaDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",pathofDriver);
			driver = new FirefoxDriver();
		}
		else
			System.out.println("Browser not selected or wrong choice is wrong please choose from opera, chrome, firefox");
		
		driver.get(ConfigUtils.getPropertyByKey("URL"));		
	}
	
	public static WebDriver getDriver() {
		if(driver==null) {
			initDriver();
		}
		return driver;
	}
	
	  public static void close() {
	        driver.quit();
	        driver = null;
	    }
	

}
