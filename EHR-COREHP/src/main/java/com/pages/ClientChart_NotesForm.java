package com.pages;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.ConfigReader;



public class ClientChart_NotesForm {

	private WebDriver driver;
	private static final Logger log = LogManager.getLogger(ClientChart_NotesForm.class);
	
	// 1. By Locators: OR
	private By New_Notes_button_locator_xpath = By.xpath("//a[contains(text(),'New Notes')]");
	private By Date_field_calendar_locator_xpath = By.xpath("//div[@id='ctl00_MainContent_view1Extender_ItemContainer5']//a");
	private By Date_field_calander_today_locator_xpath = By.xpath("//div[@id='ctl00_MainContent_view1Extender_Item5$CalendarBehavior_today']");
	private By loginbutton_by = By.id("ProviderLogin_Login");

	// 2. Constructor of the page class:
	public ClientChart_NotesForm(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	
	

}
