package tests;

import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest  {
	
	@Test
	public void openWebsiteTest() {
		System.out.println("Website Open sucessfully");
	}
	
	@Test
	public void verifyTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void verifyURL() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
