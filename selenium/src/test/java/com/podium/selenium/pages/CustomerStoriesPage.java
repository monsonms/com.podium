package com.podium.selenium.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CustomerStoriesPage extends Page {
	@FindBy(how = How.CSS, using = ".initvert")
	@CacheLookup
	public WebElement filterButton;
	
	@FindBy(how = How.LINK_TEXT, using = "Auto Services")
	@CacheLookup
	public WebElement autoServicesLink;
	
	@FindBy(how = How.CSS, using = ".story-card.auto-services h3")
	@CacheLookup
	public List<WebElement> stories;

	public CustomerStoriesPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickFilterButton() {
		filterButton.click();

	}
	
	public void clickAutoServicesLink() {
		autoServicesLink.click();

	}
	
	public Boolean areAutoServiceStoriesEnabled() {
		for(WebElement we: stories) {
			if(!we.getText().contains("AUTO SERVICES")) {
				return false;
			}
		}
		return true;
	}
}
