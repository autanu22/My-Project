package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModel extends BaseModel {
	public HomeModel(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getFirstName() {
		WebElement e = driver.findElement(By.xpath("//input[@name='firstName']"));
		return e;
	}
	public WebElement getLastName() {
		WebElement e = driver.findElement(By.xpath("//input[@name='lastName']"));
		return e;
	}
	public WebElement getUsername() {
		
		WebElement e = driver.findElement(By.xpath("//input[@name=\"Username\"]"));
		return e;
	}
	public WebElement getPassword() {
		WebElement e = driver.findElement(By.xpath("//input[@name='Passwd']"));
		return e;
	}
	public WebElement getConPassword() {
		WebElement e = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		return e;
	}
	public WebElement getShowPassword() {
		WebElement e = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
		return e;
	}
	public WebElement getNextBtn() {
		WebElement e = driver.findElement(By.xpath("//span[text()='Next']"));
		return e;
	}

}
