package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.HomeModel;

public class HomePage extends HomeModel {
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	public void typeFirstName(String firstname) {
	WebElement e = getFirstName();
		e.sendKeys(firstname);
		
	}
	public void typelastName(String lastname) {
		WebElement e = getLastName();
			e.sendKeys(lastname);
			
		}

	public void typeUsername(String Username) {
		WebElement e = getUsername();
			e.sendKeys(Username);
			
		}
	public void typePassword(String Password) {
		WebElement e = getPassword();
			e.sendKeys(Password);
			
		}
	public void typeConPassword(String ConPassword) {
		WebElement e = getConPassword();
			e.sendKeys(ConPassword);
			
		}
	public void typeShowPassword() {
		WebElement e = getShowPassword();
			e.click();
			
		}
	public void typeNextBtn() {
		WebElement e = getNextBtn();
			e.click();
			
		}
	
			


	

}
