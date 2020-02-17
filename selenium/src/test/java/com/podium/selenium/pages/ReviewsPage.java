package com.podium.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ReviewsPage extends Page {
	private static final String HEADER_TEXT = "Get chosen,";

	@FindBy(how = How.CSS, using = "h3")
	public WebElement header;

	public ReviewsPage(WebDriver webDriver) {
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
