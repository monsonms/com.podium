package com.podium.selenium.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.podium.selenium.core.JUnitTestBase;
import com.podium.selenium.pages.HomePage;

public class SampleJUnitTest extends JUnitTestBase {

  private HomePage homepage;
  
  private static final String PAGE_TITLE = 
		"Interaction Management for Local Business | Reviews, SMS, Feedback | Podium";

  @Test
  public void testHomePageHasAHeader() {
	homepage = new HomePage(driver, baseUrl);
	homepage.get();
	assertEquals(homepage.getTitle(), PAGE_TITLE);
  }
}
