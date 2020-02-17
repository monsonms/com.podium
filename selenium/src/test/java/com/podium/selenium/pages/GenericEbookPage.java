package com.podium.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GenericEbookPage extends Page {
	@FindBy(how = How.CSS, using = "section.pod-resource-download-page-section")
	@CacheLookup
	public WebElement ebookSection;

	public GenericEbookPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(driver, this);
	}

	public Boolean isEbookSectionDisplayed() {
		waitUntilVisible(ebookSection);
		return ebookSection.isDisplayed();
	}
}
