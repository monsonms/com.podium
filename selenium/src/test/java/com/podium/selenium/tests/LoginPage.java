package com.podium.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.podium.selenium.pages.Page;

public class LoginPage extends Page {

	private static final String PAGE_TITLE = "Sign In";
	private static final String HEADER_TEXT = "custom price quote";
	private static final String ERROR_TEXT = "Email or mobile number is required";
	
	@FindBy(how = How.CSS, using = "h1")
	@CacheLookup
	public WebElement header;
	
	@FindBy(how = How.ID, using = "signInButton")
	@CacheLookup
	public WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='emailOrPhoneInput']/../div[2]")
	@CacheLookup
	public WebElement errorTextField;
	
	@FindBy(how = How.LINK_TEXT, using = "Forgot password?")
	@CacheLookup
	public WebElement forgotPasswordLink;
	
	public LoginPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(driver, this);
	}
	
	public String getHeader() {
		return header.getText();
	}
	
	public Boolean titleIsPresent() {
		System.out.println("Title: "+getTitle());
		return getTitle().contains(PAGE_TITLE);
	}
	
	public Boolean headerIsPresent() {
		return getHeader().contains(HEADER_TEXT);
	}

	public void clickLoginButton() {
		loginButton.click();
	}
	
	public String getErrorText() {
		return errorTextField.getText();
	}
	
	public Boolean errorTextIsPresent() {
		return getErrorText().contains(ERROR_TEXT);
	}
	
	public ForgotPasswordPage clickForgotPasswordLink() {
		forgotPasswordLink.click();
		return new 	ForgotPasswordPage(driver);
	}
}
