package Test;

import org.testng.annotations.Test;

public class VerifyPhNumberPageTest extends BaseTest {
	@Test(dataProvider="dp")
	public void getVerifyPhNumberPageTest(String FirstName, String LastName,String email, String Pass, String ConPass, String PhoneNumber) throws InterruptedException {
		getHomePage();
		
		
		homepage.typeFirstName(FirstName);
		homepage.typelastName(LastName);
		homepage.typeUsername(email);
		homepage.typePassword(Pass);
		homepage.typeConPassword(ConPass);
		homepage.typeShowPassword();
		homepage.typeNextBtn();
		
		Thread.sleep(4000);
		
		getVerifyPhNumberPage();
		VerifyPhoneNumberPage.typePhoneNumber(PhoneNumber);
		VerifyPhoneNumberPage.getNextBtn();


}

	
	}
