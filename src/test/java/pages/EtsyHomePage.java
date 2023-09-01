package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class EtsyHomePage {
	
	public EtsyHomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(css = "ul > li > button.select-signin")
	public WebElement etsy_home_signin_btn;
	
	@FindBy(id = "join-neu-overlay-title")
	public WebElement register_page_signin_text;
	
	@FindBy(css = "div > button.select-register")
	public WebElement register_page_register_btn;
	
	@FindBy(xpath = "//input[@name='email']")
	public WebElement register_page_email_field;
	
	@FindBy(xpath = "//input[@name='email']")
	public WebElement etsy_signin_page_stay_signedin_box;
	
	@FindBy(xpath = "//input[@name='first_name']")
	public WebElement register_page_first_name_field;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement register_page_password_field;
	
	@FindBy(css = "div > h1.welcome-message-text:first-child")
	public WebElement etsy_login_home_page_welcome_message;
	
	@FindBy(xpath = "//*[@name='submit_attempt']")
	public WebElement register_page_final_register_btn;
	
	@FindBy(css = "div.wt-alert > div")
	public WebElement post_register_error_message;
	
	@FindBy(xpath = "//h1[contains(text(),'Create your account')]")
	public WebElement register_page_create_acct_header;

}
