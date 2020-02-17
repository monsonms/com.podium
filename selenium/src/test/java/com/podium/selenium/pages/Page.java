package com.podium.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page {

	protected static final Long TIMEOUT = 2000L;
	protected WebDriver driver;

	/*
	 * Constructor injecting the WebDriver interface
	 * 
	 * @param webDriver
	 */
	public Page(WebDriver driver) {
		this.driver = driver;
	}

	protected String getTitle() {
		return driver.getTitle();
	}
	
	protected void waitUntilClickable(WebElement we) {
		new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.elementToBeClickable(we));
	}
	
	protected void waitUntilVisible(WebElement we) {
		new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(we));
	}
}
