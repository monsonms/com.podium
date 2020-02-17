package com.podium.selenium.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.podium.selenium.core.JUnitTestBase;
import com.podium.selenium.pages.DemoPage;
import com.podium.selenium.pages.HomePage;

public class WatchDemoTest extends JUnitTestBase {
	private HomePage homepage;
	private DemoPage demoPage;

	@Test
	public void testLoginPage() {
		homepage = new HomePage(driver, baseUrl);
		homepage.get();
		demoPage = homepage.clickWatchDemoLink();
		assertTrue(demoPage.videoIsDisplayed());
	}
}
