package sampletestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import samplebase.BaseClass;
import sampletestpageobj.LoginPage;

public class LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() {
		driver.get(baseurl);

		LoginPage login = new LoginPage(driver);
		login.setUserName(username);

		login.setPassword(password);
		login.clickSubmit();

		if (driver.getTitle().equals("Login")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}
