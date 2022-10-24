package com.pages;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage {

	private WebDriver driver;
	private static final Logger log = LogManager.getLogger(LoginPage.class);
	
	// 1. By Locators: OR
	private By companycode_by = By.id("ProviderLogin_companyCodeTextBox");
	private By username_by = By.id("ProviderLogin_UserName");
	private By password_by = By.id("ProviderLogin_Password");
	private By loginbutton_by = By.id("ProviderLogin_Login");

	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public void open_login_page(String loginpageurl) {
		log.info("Entering URL: "+loginpageurl);
		driver.get(loginpageurl);
	}
	public String login_page_url_verfiy() {
		String loginpageurlverify = driver.getCurrentUrl();
		log.info("Verifying login page URL");
		return loginpageurlverify;
	}
	
	public boolean company_code_visibility() {
		boolean companycodevisibility = driver.findElement(companycode_by).isDisplayed();
		log.info("Checking Company Code Visibility");
		return companycodevisibility;
		

	}
	public void company_code_enter(String companycode) {
		WebDriverWait wait = new WebDriverWait(driver,4);
		wait.until(ExpectedConditions.presenceOfElementLocated(companycode_by));
		String value = driver.findElement(companycode_by).getText();
		if(value == null) {
	
		driver.findElement(companycode_by).sendKeys(companycode);
		log.info("companycode field was cleared and entered "+companycode);
		
		}
		else {
		
			driver.findElement(companycode_by).clear();
			driver.findElement(companycode_by).sendKeys(companycode);
			log.info(companycode +" was entered in companycode field");
		}
		
	}
	public boolean username_visibility() {
		boolean companycodevisibility = driver.findElement(username_by).isDisplayed();
		log.info("Checking Username Visibility");
		return companycodevisibility;
		

	}
	public void username_enter(String username) {
		WebDriverWait wait = new WebDriverWait(driver,4);
		wait.until(ExpectedConditions.presenceOfElementLocated(username_by));
		String value = driver.findElement(username_by).getText();
		if(value == null) {
		
		driver.findElement(username_by).sendKeys(username);
		log.info("Username field was cleared and entered "+username);
		
		}
		else {
			driver.findElement(username_by).clear();
			driver.findElement(username_by).sendKeys(username);
			log.info(username +" was entered in Username field");
		}
		
		
	}
	public boolean password_visibility() {
		boolean passwordvisibility = driver.findElement(password_by).isDisplayed();
		log.info("Checking password Visibility");
		return passwordvisibility;
		

	}
	public void password_enter(String password) {
		WebDriverWait wait = new WebDriverWait(driver,4);
		wait.until(ExpectedConditions.presenceOfElementLocated(password_by));
		String value = driver.findElement(password_by).getText();
		if(value == null) {
		
		driver.findElement(password_by).sendKeys(password);
		log.info("Passsword field was cleared and entered "+password);
		
		}
		else {
			driver.findElement(password_by).clear();
			driver.findElement(password_by).sendKeys(password);
			log.info(password +" was entered in Username field");
		}
		
	}
	public boolean loginbutton_visibility() {
		boolean loginbuttonvisibility = driver.findElement(loginbutton_by).isDisplayed();
		log.info("Checking loginbutton Visibility");
		return loginbuttonvisibility;
		
	}
	public void loginbutton_click() {
		WebDriverWait wait = new WebDriverWait(driver,4);
		wait.until(ExpectedConditions.presenceOfElementLocated(loginbutton_by));
		driver.findElement(loginbutton_by).click();	
		}


	

}
