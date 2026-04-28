package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;

public class AddToCartTest {

	public class addToCartTest extends BaseTest {
		
		@Test
		public void addToCartFlow() throws InterruptedException {
			
			// Login
			LoginPage loginPage = new LoginPage(driver);
			loginPage.login("standard_user", "secret_sauce");

			System.out.println("URL after login: " + driver.getCurrentUrl());
			Thread.sleep(2000); // temporary fix (we'll improve later)
			
			// AddToProduct
			HomePage homePage = new HomePage(driver);
			homePage.addProducttoCart();
			homePage.clickCart();
			
			
			// Validate cart
			CartPage cartPage = new CartPage(driver);
			String product = cartPage.getProductName();
			
			Assert.assertEquals(product,"Sauce Labs Backpack");
	        }
		
		
	}
	
	
	
}
