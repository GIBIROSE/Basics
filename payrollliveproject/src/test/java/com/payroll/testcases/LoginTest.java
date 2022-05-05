package com.payroll.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.LoginPage;
import com.payroll.utilities.ExcelLibrary;
import com.payroll.utilities.Log;

public class LoginTest extends BaseClass {
	public LoginPage loginpg = new LoginPage();

	@BeforeMethod(groups= {"smoke"})
	public void launching() {
		launchApp();
	}

	@Test(priority = 1, groups = { "smoke" })
	public void validateURL() {
		LoginPage page = new LoginPage();
		page.verifyURL();
		String expected = "https://www.qabible.in/payrollapp/site/login";
		String actual = page.verifyURL();
		Assert.assertEquals(actual, expected);

	}

	@Test
	//(dataProvider = "userData", priority = 2, groups = { "smoke" })
	public void loginTestTitle() throws InterruptedException {
		 Log.startTestCase("LOGIN TO PAYROLL APPLICATION");
		
		LoginPage loginpg = new LoginPage();
		Log.info("Going to enter username and password for the application");
		loginpg.login(prop.getProperty("username"), prop.getProperty("password"));
		if (driver.getTitle().equals("Login")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

/*	@DataProvider(name = "userData")
	public Object[][] loginDemo() {
		Object[][] data = new Object[2][2];
		data[0][0] = "admin";
		data[0][1] = "admin123";
		data[1][0] = "admi";
		data[1][1] = "admin1234";

		return data;

	}*/

	@Test(priority = 3)
	public void validateInvalidLogin() {
		LoginPage loginpg = new LoginPage();
		String actual = loginpg.invalidLoginVerify();
		String expected = "Username cannot be blank.";
		Assert.assertEquals(actual, expected);

	}

	@Test(priority = 4)
	public void validateReset() {

		LoginPage loginpg = new LoginPage();
		String actual = loginpg.verifyPasswdReset();
		String expected = "Password Reset";
		Assert.assertEquals(actual, expected);
	}

	@AfterMethod(groups= {"smoke"})
	public void closeBrowser() {
		driver.close();
	}

}
