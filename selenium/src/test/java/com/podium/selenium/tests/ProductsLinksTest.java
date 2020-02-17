package com.podium.selenium.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.podium.selenium.core.JUnitTestBase;
import com.podium.selenium.pages.HomePage;
import com.podium.selenium.pages.PricingPage;
import com.podium.selenium.pages.ReviewsPage;

public class ProductsLinksTest extends JUnitTestBase {	
	  private HomePage homepage;
	  private ReviewsPage reviewsPage;
	  private PricingPage pricingPage;
	  
	  /**
	   * Just test 2 types of links for now
	   */
	  @Test
	  public void nagigateToProductsLinks() {
		homepage = new HomePage(driver, baseUrl);
		homepage.get();
		reviewsPage = homepage.clickReviews();
		assertTrue(reviewsPage.headerIsPresent());
		
		pricingPage = homepage.clickPricing();
		assertTrue(pricingPage.headerIsPresent());
	  }
}
