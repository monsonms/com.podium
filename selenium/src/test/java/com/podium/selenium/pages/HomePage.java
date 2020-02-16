package com.podium.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Page {  
  @FindBy(how = How.XPATH, using = "//li/a[contains(text(), 'Customer Stories')]")
  @CacheLookup
  public WebElement customerStoriesButton;
  
  @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Resources')]")
  @CacheLookup
  public WebElement resourcesButton;

  public HomePage(WebDriver webDriver) {
    super(webDriver);
  }
  
  public CustomerStoriesPage clickCustomerStories() {
	  new Actions(driver).moveToElement(resourcesButton).build().perform();
	  new WebDriverWait(driver, 2000).until(ExpectedConditions.elementToBeClickable(customerStoriesButton));
	  customerStoriesButton.click();
	  return new CustomerStoriesPage(driver);
  }
}
