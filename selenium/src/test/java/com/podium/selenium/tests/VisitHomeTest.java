package com.podium.selenium.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.podium.selenium.core.BaseTest;

public class VisitHomeTest extends BaseTest {
	
	private static final String PAGE_TITLE = 
			"Interaction Management for Local Business | Reviews, SMS, Feedback | Podium";
	
	@Test
	public void visitHomePage() {
		driver.get(URL);
		assertEquals(driver.getTitle(), PAGE_TITLE);
	}

}
