package com.podium.selenium.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.support.PageFactory;

import com.podium.selenium.core.JUnitTestBase;
import com.podium.selenium.pages.HomePage;

public class SampleJUnitTest extends JUnitTestBase {

  private HomePage homepage;
  
  private static final String PAGE_TITLE = 
		"Interaction Management for Local Business | Reviews, SMS, Feedback | Podium";

  @BeforeEach
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @Test
  public void testHomePageHasAHeader() {
    driver.get(baseUrl);
    assertEquals(homepage.getTitle(), PAGE_TITLE);
  }
}
