package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyPhNumberModel extends BaseModel {
	public VerifyPhNumberModel(WebDriver driver) {
		super (driver);
	}
	public WebElement getPhNumber() {
		//sychronization
		By locator = By.xpath("//input[@id='phoneNumberId']");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement e = driver.findElement(locator);
		return e;
	}
	public WebElement getNextBtn() {
		WebElement e = driver.findElement(By.xpath("//span[text()='Next']"));
		return e;
	}


}
