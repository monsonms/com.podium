package com.podium.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EbooksPage extends Page {
	@FindBy(how = How.CSS, using = "#ebooks > a:nth-child(1) > img")
	@CacheLookup
	public WebElement firstEbook;

	public EbooksPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(driver, this);
	}

	public GenericEbookPage clickFirstEbook() {
		firstEbook.click();
		return new GenericEbookPage(driver);
	}
}
