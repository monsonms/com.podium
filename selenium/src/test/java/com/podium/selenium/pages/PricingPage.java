package com.podium.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PricingPage extends Page {
	private static final String PAGE_TITLE = "Pricing";
	private static final String HEADER_TEXT = "custom price quote";
	
	@FindBy(how = How.CSS, using = "h1")
	@CacheLookup
	public WebElement header;
	
	public PricingPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(driver, this);
	}
	
	public String getHeader() {
		return header.getText();
	}
	
	public Boolean titleIsPresent() {
		return getTitle().contains(PAGE_TITLE);
	}
	
	public Boolean headerIsPresent() {
		return getHeader().contains(HEADER_TEXT);
	}
}
