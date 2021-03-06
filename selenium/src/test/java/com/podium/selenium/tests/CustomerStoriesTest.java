package com.podium.selenium.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.podium.selenium.core.JUnitTestBase;
import com.podium.selenium.pages.CustomerStoriesPage;
import com.podium.selenium.pages.HomePage;

public class CustomerStoriesTest extends JUnitTestBase {
	private HomePage homepage;
	private CustomerStoriesPage customerStoriesPage;

	@Test
	public void nagigateToCustomerStories() {
		homepage = new HomePage(driver, baseUrl);
		homepage.get();
		customerStoriesPage = homepage.clickCustomerStories();
		customerStoriesPage.clickFilterButton();
		customerStoriesPage.clickAutoServicesLink();
		assertTrue(customerStoriesPage.areAutoServiceStoriesDisplayed());
	}
}
