package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	
	
	public void search_and_select_textbox(WebDriver driver, String textbox_locator_xpath, String textbox_input, String client_search_results_xpath  ) {
		WebDriverWait wait1 = new WebDriverWait(driver,4);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(textbox_locator_xpath)));
		WebElement Search_textbox = driver.findElement(By.xpath(textbox_locator_xpath)); 
		Search_textbox.sendKeys(textbox_input+Keys.DOWN+"\n"); 
		WebDriverWait wait2 = new WebDriverWait(driver,4);
		wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath(client_search_results_xpath)));
		driver.findElement(By.xpath(client_search_results_xpath)).click();
		}
}
