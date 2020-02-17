package com.podium.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PricingPage extends Page {
	private static final String HEADER_TEXT = "TRUSTED BY OVER 180,000 USERS";
	
	@FindBy(how = How.CSS, using = "h3")
	public WebElement header;
	
	public PricingPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(driver, this);
	}
	
	public String getHeader() {
		waitUntilVisible(header);
		return header.getText();
	}
	
	public Boolean headerIsPresent() {
		return getHeader().contains(HEADER_TEXT);
	}
}
