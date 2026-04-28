package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest  {
	
	@Test(dataProvider = "loginData")
	public void loginTest(String username, String password) {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
		
		String currentUrl = driver.getCurrentUrl();
		
		if(username.equals("standard_user") && password.equals("secret_sauce")) {
			Assert.assertTrue(currentUrl.contains("inventory"));
		} 
		else {
			Assert.assertFalse(currentUrl.contains("inventory"));
		}
		
	}
	
	@DataProvider
	public Object[][] loginData() {
		return new Object[][] {
			{"standard_user", "secret_sauce"},
            {"locked_out_user", "secret_sauce"},
            {"invalid_user", "wrong_pass"}
        };
		}
	
	
	

}

