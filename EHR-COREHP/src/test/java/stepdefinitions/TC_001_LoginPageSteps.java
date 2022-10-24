package stepdefinitions;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_001_LoginPageSteps {


	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	private static final Logger log = LogManager.getLogger(TC_001_LoginPageSteps.class);
	 


	
	



@Given("User is on login Page using Login Page URL")
public void user_is_on_login_page_using_login_page_url() {
	
	ConfigReader configReader = new ConfigReader();
	String expected_login_pageurl = configReader.init_prop().getProperty("loginpageurl");

	loginpage.open_login_page(expected_login_pageurl);

	log.info("LoginPage loaded");
	String actual_login_page_url = loginpage.login_page_url_verfiy();
	assertEquals(expected_login_pageurl, actual_login_page_url);
	log.info("LoginPage URL is : "+actual_login_page_url);
}

@When("User sees the Company Code field")
public void user_sees_the_company_code_field() {
	boolean companycodevisibility = loginpage.company_code_visibility();
	assertTrue(companycodevisibility);
	log.info("Company Code field was Visible");
}
@Then("Enters Valid Company Code")
public void enters_valid_company_code() {
	ConfigReader configReader = new ConfigReader();
String company_code_value = configReader.init_prop().getProperty("companycode");
loginpage.company_code_enter(company_code_value);
}
@When("User sees the Username field")
public void user_sees_the_username_field() {
	boolean usernamevisibility = loginpage.username_visibility();
	assertTrue(usernamevisibility);
	log.info("Username field was Visible");
}
@Then("Enters valid Username")
public void enters_valid_username() {
	ConfigReader configReader = new ConfigReader();
	String username_value = configReader.init_prop().getProperty("username");
	loginpage.username_enter(username_value);

}
@When("User sees the Password field")
public void user_sees_the_password_field() {
	boolean passwordvisibility = loginpage.password_visibility();
	assertTrue(passwordvisibility);
	log.info("Password field was Visible");
}
@Then("Enters Valid Password")
public void enters_valid_password() {
	ConfigReader configReader = new ConfigReader();
	String password_value = configReader.init_prop().getProperty("password");
	loginpage.password_enter(password_value);
}

@When("User sees the Login button")
public void user_sees_the_login_button() {
	boolean loginbuttonvisibility = loginpage.password_visibility();
	assertTrue(loginbuttonvisibility);
	log.info("Login Button field was Visible");
}
@Then("Clicks on Login button")
public void clicks_on_login_button() {
   loginpage.loginbutton_click();
}




	
	
	
	
	

}
