package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest  {
	
	@Test
	public void validLoginTest() {
		LoginPage loginPage = new LoginPage(driver);
	    
		loginPage.login("standard_user", "secret_sauce");
		
		// validation
		String curentUrl = driver.getCurrentUrl();
		Assert.assertTrue(curentUrl.contains("Inventory"));
		
	
	}
	
	@Test
	public void invalidLoginTest() {

	    LoginPage loginPage = new LoginPage(driver);

	    loginPage.login("wrong_user", "wrong_pass");

	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertFalse(currentUrl.contains("inventory"));
	}
	
	
	
	

}
