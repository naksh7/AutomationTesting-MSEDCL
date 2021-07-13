package stepDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pageObjects.RegistrationPage;


public class RegistrationPageSteps {
	WebDriver driver;
	RegistrationPage rp = new RegistrationPage();
	
		    
	    @Then("^Check following (.+) are present$")
	    public void check_following_are_present(String expected) throws Throwable {
	        rp.checkAllFields(expected);
	    }

	    @Then("^Check alert message displayed on clicking submit button$")
	    public void check_alert_message_displayed_on_clicking_submit_button() throws Throwable {
	        rp.checkAlertText();
	    }

	    @Then("^Fill All the textboxes$")
	    public void fill_all_the_textboxes() throws Throwable {
	        rp.fillAllTextBox();
	    }
	    
	    @Then("^Check textbox get cleared on clicking clear button$")
	    public void check_textbox_get_cleared_on_clicking_clear_button() throws Throwable {
	        rp.clearButton();
	    }

}
	    
