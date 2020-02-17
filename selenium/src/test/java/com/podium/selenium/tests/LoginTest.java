package com.podium.selenium.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.podium.selenium.core.JUnitTestBase;
import com.podium.selenium.pages.ForgotPasswordPage;
import com.podium.selenium.pages.HomePage;
import com.podium.selenium.pages.LoginPage;

public class LoginTest extends JUnitTestBase {
	  private HomePage homepage;
	  private LoginPage loginPage;
	  private ForgotPasswordPage forgotPasswordPage;
	
	  /**
	   * I don't have a valid login so this will test the error case
	   */
	  @Test
	  public void testLoginPage() {
		homepage = new HomePage(driver, baseUrl);
		homepage.get();
	    loginPage = homepage.clickLoginLink();
	    assertTrue(loginPage.titleIsPresent());
	    
	    loginPage.clickLoginButton();
	    assertTrue(loginPage.errorTextIsPresent());
	    
	    forgotPasswordPage = loginPage.clickForgotPasswordLink();
	    assertTrue(forgotPasswordPage.isSendCodeButtonPresent());
	  }
}
