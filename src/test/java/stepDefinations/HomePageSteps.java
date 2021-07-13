package stepDefinations;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.HomePage;


public class HomePageSteps {
	WebDriver driver;
	HomePage hp;
		
	 @Given("^Go to URL$")
	    public void go_to_url() throws Throwable {
	        hp = new HomePage();
	    }

	    @Then("^Banner should present$")
	    public void banenr_should_present() throws Throwable {
	        hp.checkBannerImage();
	    }
	    
	    @Then("^Logo should present$")
	    public void logo_should_present() throws Throwable {
	        hp.checkLogo();
	    }

	    @Then("^Check connection code for all links and navigation of the links$")
	    public void check_connection_code_for_all_links_and_navigation_of_the_links() throws Throwable {
	        System.out.println("not implementd");
	    }

	    @Then("Check Left navigation pane has {int} links")
	    public void check_left_navigation_pane_has_links(Integer expected) {
	        hp.checkleftPaneLinks(expected);
	    }

	    @Then("^Check middle section for (.+)$")
	    public void check_middle_section_for(String middleblocks) throws Throwable {
	        hp.checkmiddlePanelBox(middleblocks);
	    }

	    @Then("^Check right section for (.+)$")
	    public void check_right_section_for(String rightBlocks) throws Throwable {
	        hp.checkRightPaneBox(rightBlocks);
	    }
	    
	    @Then("^Check footer section for (.+)$")
	    public void check_footer_section_for(String footerLinks) throws Throwable {
	        hp.checkFooterLinksPaneBox(footerLinks);
	    }
	    
	    @Then("^Go To Registration Page$")
	    public void go_to_registration_page() throws Throwable {
	    	hp = new HomePage();
	    	hp.getRegistrationPage();
	    }
	   
	    @Then("^Go To Login Page$")
	    public void go_to_Login_page() throws Throwable {
	    	hp = new HomePage();
	    	hp.getLoginPage();
	    }
	   
}
