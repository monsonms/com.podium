package com.podium.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.podium.selenium.pages.LoginPage;

public class HomePage extends Page {
	@FindBy(how = How.XPATH, using = "//li/a[contains(text(), 'Customer Stories')]")
	@CacheLookup
	public WebElement customerStoriesButton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Resources')]")
	@CacheLookup
	public WebElement resourcesButton;

	@FindBy(how = How.XPATH, using = "//li[contains(@class,'wpmm_dropdown_menu')]/span[contains(text(), 'Products')]")
	@CacheLookup
	public WebElement productsButton;

	@FindBy(how = How.XPATH, using = "//li/a[contains(text(), 'Reviews')]")
	@CacheLookup
	public WebElement reviewsButton;

	@FindBy(how = How.LINK_TEXT, using = "Pricing")
	@CacheLookup
	public WebElement pricingLink;

	@FindBy(how = How.LINK_TEXT, using = "Login")
	@CacheLookup
	public WebElement loginLink;

	@FindBy(how = How.LINK_TEXT, using = "Watch Demo")
	@CacheLookup
	public WebElement watchDemoLink;

	@FindBy(how = How.LINK_TEXT, using = "Ebooks")
	@CacheLookup
	public WebElement ebooksLink;

	String url;

	public HomePage(WebDriver webDriver, String url) {
		super(webDriver);
		this.url = url;
		PageFactory.initElements(driver, this);
	}

	public void get() {
		driver.get(url);
	}

	public CustomerStoriesPage clickCustomerStories() {
		new Actions(driver).moveToElement(resourcesButton).build().perform();
		waitUntilClickable(customerStoriesButton);
		customerStoriesButton.click();
		return new CustomerStoriesPage(driver);
	}

	public ReviewsPage clickReviewsLink() {
		new Actions(driver).moveToElement(productsButton).build().perform();
		waitUntilClickable(reviewsButton);
		reviewsButton.click();
		return new ReviewsPage(driver);
	}

	public PricingPage clickPricingLink() {
		pricingLink.click();
		return new PricingPage(driver);
	}

	public LoginPage clickLoginLink() {
		waitUntilClickable(loginLink);
		loginLink.click();
		return new LoginPage(driver);
	}

	public DemoPage clickWatchDemoLink() {
		waitUntilClickable(watchDemoLink);
		watchDemoLink.click();
		return new DemoPage(driver);
	}

	public EbooksPage clickEbooksLink() {
		new Actions(driver).moveToElement(resourcesButton).build().perform();
		waitUntilClickable(ebooksLink);
		ebooksLink.click();
		return new EbooksPage(driver);
	}
}
