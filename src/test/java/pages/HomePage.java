package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	// Locators
	By addtocartBtn = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By carticon = By.xpath("//a[@class='shopping_cart_link']");
	
	// Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	// Action
	public void addProducttoCart() {
		driver.findElement(addtocartBtn).click();
		
	}
	
	public void clickCart() {
		driver.findElement(carticon).click();
	}
	
	
	

}
