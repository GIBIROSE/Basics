package com.payroll.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.LoginPage;

public class LoginTest extends BaseClass {

	@BeforeTest
	public void launching() {
		launchApp();
	}

	@Test
	public void loginTest_001() {

		LoginPage loginpg = new LoginPage();
		loginpg.login(prop.getProperty("username"), prop.getProperty("password"));
		if (driver.getTitle().equals("Login")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}
