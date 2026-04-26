package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	WebDriver driver;
	
	// Locator
	By productname = By.className("inventory_item_name");
	
	// Constructor
	public CartPage(WebDriver driver) {
		   this.driver = driver;
		
	}
	
	// Validation
	public String getProductName() {
		return driver.findElement(productname).getText();
	}
	
	
}
