package com.pages;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.ConfigReader;



public class ClientPortalPage {

	private WebDriver driver;
	private static final Logger log = LogManager.getLogger(ClientPortalPage.class);
	
	// 1. By Locators: OR
	
	private String form_link_locator_CssSelector = "a[onclick='ShowFormArea();']";
	private String form_input_textbox_locator_CssSelector = "//input[@class='dropdown-toggle form-control searchForms ui-autocomplete-input']";
	private String form_Notes_locator_xpath = "//a[contains(text(),'Notes')][2]";
	

	// 2. Constructor of the page class:
	public ClientPortalPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	
	

}
