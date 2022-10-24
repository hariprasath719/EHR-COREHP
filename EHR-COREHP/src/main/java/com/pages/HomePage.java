package com.pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {

	private WebDriver driver;
	private static final Logger log = LogManager.getLogger(HomePage.class);
	
	
	
	
	
	
	// 1. By Locators: OR
	

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
	
	

	

}
