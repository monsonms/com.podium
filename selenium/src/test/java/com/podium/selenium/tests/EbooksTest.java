package com.podium.selenium.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.podium.selenium.core.JUnitTestBase;
import com.podium.selenium.pages.EbooksPage;
import com.podium.selenium.pages.GenericEbookPage;
import com.podium.selenium.pages.HomePage;

public class EbooksTest extends JUnitTestBase {
	private HomePage homepage;
	private EbooksPage ebooksPage;
	private GenericEbookPage ebookPage;

	@Test
	public void navigateToEbooks() {
		homepage = new HomePage(driver, baseUrl);
		homepage.get();
		ebooksPage = homepage.clickEbooksLink();
		ebookPage = ebooksPage.clickFirstEbook();
		assertTrue(ebookPage.isEbookSectionDisplayed());
	}
}
