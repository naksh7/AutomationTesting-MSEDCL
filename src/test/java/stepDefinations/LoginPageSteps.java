package stepDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pageObjects.LoginPage;
import pageObjects.RegistrationPage;

public class LoginPageSteps {
	
	WebDriver driver;
	LoginPage lp = new LoginPage();
	
	 @Then("^LPCheck alert message displayed on clicking submit button$")
	    public void check_alert_message_displayed_on_clicking_submit_button() throws Throwable {
	        lp.checkAlertText();
	    }

	    @Then("^LPFill All the textboxes$")
	    public void fill_all_the_textboxes() throws Throwable {
	        lp.fillAllTextBox();
	    }
	    
	    @Then("^LPCheck textbox get cleared on clicking clear button$")
	    public void check_textbox_get_cleared_on_clicking_clear_button() throws Throwable {
	        lp.clearButton();
	    }
	    
	    @Then("^LPCheck following (.+) are present$")
	    public void check_following_are_present(String expected) throws Throwable {
	    	
	        lp.checkAllFields(expected);
	    }

}
