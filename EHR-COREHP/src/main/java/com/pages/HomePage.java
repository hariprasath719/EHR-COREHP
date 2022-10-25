package com.pages;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.ConfigReader;
import com.qa.util.ElementUtil;


public class HomePage {

	private WebDriver driver;
	private static final Logger log = LogManager.getLogger(HomePage.class);
	ElementUtil reuse = new ElementUtil();
	ConfigReader configReader = new ConfigReader();
	
	
	
	
	
	
	
	// 1. By Locators: OR XPATHs
	private String client_search_textbox_locator_xpath = "//input[@id='searchName']";
	private String client_name_unique_value = configReader.init_prop().getProperty("clientnameuniquevalue");
	private String client_search_results_locator_xpath = "//h4[contains(text(),'"+client_name_unique_value+"')]";
	
	
	

	private By client_portal_clientname = By.xpath("//span[contains(text(),'"+client_name_unique_value+"')]");


	// 2. Constructor of the page class:
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String home_page_url_verfiy() {
		String homepageurlverify = driver.getCurrentUrl();
		log.info("Verifying home page URL");
		return homepageurlverify;
	}
	public boolean time_zone_alert_visibility() {
		WebDriverWait wait = new WebDriverWait(driver,4);
		if(wait.until(ExpectedConditions.alertIsPresent())== null) {
			return false;
		}
		else {
			return true;
		}
		
	}
	public void time_zone_alert_handle() {
	WebDriverWait wait = new WebDriverWait(driver,4);
	wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		log.info("Timezone alert hanled succcessfully");

	}
	public void client_search() {
		reuse.search_and_select_textbox(driver,client_search_textbox_locator_xpath, client_name_unique_value, client_search_results_locator_xpath);
		
		}
	public void verify_client_search() {
		WebDriverWait wait = new WebDriverWait(driver,4);
		wait.until(ExpectedConditions.visibilityOfElementLocated(client_portal_clientname));
		String clientnameandid = driver.findElement(client_portal_clientname).getText();	
		String client_portal_url =	driver.getCurrentUrl();
		log.info("client portal url: "+client_portal_url);
		log.info("client portal clientname: "+clientnameandid);
		log.warn("Verification pending, further implementation needed. Assesertion has to be initiated");
	
	}
	
	public void openClientPortal() {
		
		}
		
	}
	
	
	

	


