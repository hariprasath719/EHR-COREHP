package com.pages;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.ConfigReader;

public class LoginPage {

	private WebDriver driver;
	private static final Logger log = LogManager.getLogger(LoginPage.class);
	
	
	
	
	
	
	// 1. By Locators: OR
	private By companyCode = By.id("ProviderLogin_companyCodeTextBox");
	private By userName = By.id("ProviderLogin_UserName");
	private By passWord = By.id("ProviderLogin_Password");
	private By loginButton = By.linkText("ProviderLogin_Login");

	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	

	

}
