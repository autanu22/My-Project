package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

//import Page.CreateNewAccountPage;
import Page.HomePage;
import Page.VerifyPhNumberPage;

public class BaseTest {
	 static WebDriver driver;
	  static HomePage homepage;
	  static VerifyPhNumberPage VerifyPhoneNumberPage;
	  	
		@BeforeSuite
		public void setup() {
			System.setProperty("webdriver.chrome.driver", "/Users/autanuaich/Downloads/chromedriver");
			driver = new ChromeDriver();
			driver.get("https://accounts.google.com/signup");
			
			
		}
		public void getHomePage() {
			homepage = new HomePage(driver);
		}

		public void getVerifyPhNumberPage() {
			VerifyPhoneNumberPage  = new VerifyPhNumberPage(driver);
		
	}
		@DataProvider(name="dp")
		public Object[][] dataloader() throws IOException{
		
			Object[][] t;
			String filename ="data/sample.xls";
			String sheetname = "Sheet4";
			Lib.ExcelReader er = new Lib.ExcelReader(filename,sheetname);
			   t=er.exceltoArray();
			
			       return t;		
			
		}
}
