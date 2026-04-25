package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	// Locators
	By Username = By.id("user-name");
	By Password = By.xpath("//input[@id='password']");
	By LoginBtn = By.id("login-button");
	
	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		}

	// Actions
	public void login(String user, String pass) {
		driver.findElement(Username).sendKeys("user");
		driver.findElement(Password).sendKeys("pass");
		driver.findElement(LoginBtn).click();
	}

}
