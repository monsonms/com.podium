package com.podium.selenium.core;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
	protected static WebDriver driver;
	public static final String URL = "https://podium.com";
	
	@BeforeAll
	public static void setUp() {			
		ChromeOptions chromeOpts = new ChromeOptions();
		driver = new ChromeDriver(chromeOpts);
	 }

	@AfterAll
	public static void tearDown() {
		driver.quit();
	}
}
