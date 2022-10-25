package stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_002_HomePageSteps {

	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	private HomePage homepage = new HomePage(DriverFactory.getDriver());
	private static final Logger log = LogManager.getLogger(TC_002_HomePageSteps.class);
	
	
	
	@Given("User landed on homepage")
	public void user_landed_on_homepage() {
		loginpage.dologin();


	}

	
	@When("User clicks Ok in the alert")
	public void user_clicks_ok_in_the_alert() {
		homepage.time_zone_alert_handle();
	   
	}
	@Then("User checks the homepage URL should be as expected")
	public void user_checks_the_homepage_url_should_be_as_expected() {
		ConfigReader configReader = new ConfigReader();

		String expectedhomepageurl = configReader.init_prop().getProperty("homepageurl");

		String actualhomepageurl = homepage.home_page_url_verfiy();
		assertEquals(expectedhomepageurl, actualhomepageurl);
		log.info("verified homepage url "+actualhomepageurl);
		homepage.client_search();
		homepage.verify_client_search();
			
	}



}
