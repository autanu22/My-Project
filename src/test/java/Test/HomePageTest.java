package Test;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	@Test(dataProvider="dp")
	public void homepageTest(String FirstName, String LastName,String email, String Pass, String ConPass) {
		getHomePage();
		
		//String firstname = "Joe";
		homepage.typeFirstName(FirstName);
		homepage.typelastName(LastName);
		homepage.typeUsername(email);
		homepage.typePassword(Pass);
		homepage.typeConPassword(ConPass);
		homepage.typeShowPassword();
		homepage.typeNextBtn();


		

	}

}
