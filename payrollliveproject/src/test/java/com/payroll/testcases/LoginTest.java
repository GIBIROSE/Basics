package com.payroll.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.LoginPage;
import com.payroll.utilities.ExcelLibrary;

public class LoginTest extends BaseClass {
	LoginPage loginpg;

	@BeforeTest
	public void launching() {
		launchApp();
	} 

	@Test
	public void verifyTxtLogin() {
		loginpg.loginText();
		String expected="Login";
		String actual=loginpg.loginText();
		Assert.assertEquals(actual, expected);

	}
	
	
	
	@Test
	public void loginTestTitle() throws InterruptedException {
		Thread.sleep(3000);
		LoginPage loginpg = new LoginPage();

		loginpg.login(prop.getProperty("username"), prop.getProperty("password"));
		if (driver.getTitle().equals("Login")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}
	
	/*@Test
	public void verifyReset() {
		String actual= loginpg.verifyReset();
		String expected="https://www.qabible.in/payrollapp/site/request-password-reset";
		Assert.assertEquals(actual, expected);
	}*/
	
	

	@Test
	public void loginCurrentUrl() {
		loginpg = new LoginPage();
		// Assert.assertTrue(loginPage.homePageElements());
		String expected = "https://www.qabible.in/payrollapp/site/login";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
		String title = driver.getTitle();
		String homepagetitle = "Login";
		Assert.assertEquals(title, homepagetitle, "title is different");

	}

	@Test

	public void loginEnabledDetails() {
		loginpg = new LoginPage();
		boolean expected = true;
		boolean actual = loginpg.loginButtonEnabled();
		Assert.assertEquals(actual, expected);

	}

	
	/*@DataProvider
	public Object[][] loginDemo() {
		Object[][] data = new Object[3][3];
		data[0][0] = "carol";
		data[0][1] = "1q2w3e4r";

		data[1][0] = "admin1";
		data[1][1] = "admin12345";

		data[2][0] = "admin2";
		data[2][1] = "admin1234";

		return data;

	}*/
	
	
	
	
	
	
	
	

}
