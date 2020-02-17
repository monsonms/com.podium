package com.podium.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DemoPage extends Page {
	@FindBy(how = How.CSS, using = ".videoInForm")
	@CacheLookup
	public WebElement video;

	public DemoPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(driver, this);
	}

	public Boolean videoIsDisplayed() {
		waitUntilVisible(video);
		return video.isDisplayed();
	}
}
