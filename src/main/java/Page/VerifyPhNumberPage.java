package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.VerifyPhNumberModel;

public class VerifyPhNumberPage extends VerifyPhNumberModel {
	public VerifyPhNumberPage(WebDriver driver) {
		super(driver);
	}
	public void typePhoneNumber(String PhoneNumber) {
		WebElement e = getPhNumber();
			e.sendKeys(PhoneNumber);

	}
	public void typeNextBtn() {
		WebElement e = getNextBtn();
			e.click();
			
		}
}

