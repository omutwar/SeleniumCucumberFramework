package step_definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EtsyHomePage;
import utilities.BrowserUtils;
import utilities.DataReader;
import utilities.Driver;
import static org.junit.Assert.*;

public class EtsyHomePageTest {
	private static Logger log = LogManager.getLogger(EtsyHomePageTest.class);

	private static WebDriver driver = Driver.getDriver();
	private BrowserUtils utils = new BrowserUtils();
	static EtsyHomePage etsyPage = new EtsyHomePage();

	@Given("User went to etsy landing page")
	public void user_went_to_etsy_landing_page() {
		log.info("Go to the landing page");
		driver.get(DataReader.getProperty("etsyURL"));
	}

	@Given("Clicked on sign in link")
	public void clicked_on_sign_in_link() {
		log.info("Wait for the register button to be clickable and click on it");
		utils.waitForElementToBeClickable(etsyPage.etsy_home_signin_btn);
		etsyPage.etsy_home_signin_btn.click();
		utils.waitForElementToBeClickable(etsyPage.register_page_register_btn);
		etsyPage.register_page_register_btn.click();
	}

	@Given("User should be directed to registration page and see {string} on the page")
	public void user_should_be_directed_to_registration_page_and_see_on_the_page(String bannerMessage) {
		log.info("Assert that the 'Create your account' banner is displayed");
		utils.waitForElementToBeVisible(etsyPage.register_page_create_acct_header);
		assertEquals(etsyPage.register_page_create_acct_header.getText(), bannerMessage);
	}

	@When("User enters {string} and {string} and {string}")
	public void user_enters_and_and(String email, String firstName, String password) throws InterruptedException {
		log.info("Enter email. first name, and password into the field");
		etsyPage.register_page_email_field.sendKeys(email);
		etsyPage.register_page_first_name_field.sendKeys(firstName);
		etsyPage.register_page_password_field.sendKeys(password);
//		utils.wait(3);
	}

	@When("Clicked register button")
	public void clicked_register_button() {
		log.info("After filled out the form, click on 'Register' button");
		utils.waitForElementToBeClickable(etsyPage.register_page_final_register_btn);
		etsyPage.register_page_final_register_btn.click();
	}

	@Then("User should see an error message")
	public void user_should_see_an_error_message() {
		log.info("Validate Error Message is properly displayed");
		utils.waitForElementToBeVisible(etsyPage.post_register_error_message);
		assertNotNull(etsyPage.post_register_error_message.getText(),
				"Assert that the error message is displayed on the page");
	}
	
	@When("Attempted to login with {string} and {string}")
	public void attempted_to_login_with_and(String email, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Unchecked stay signed in checkbox")
	public void unchecked_stay_signed_in_checkbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User clicked on signin button")
	public void user_clicked_on_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User should be logged in and see welcome message")
	public void user_should_be_logged_in_and_see_welcome_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
