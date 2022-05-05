package com.payroll.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.HomePage;
import com.payroll.pageobjects.LoginPage;

public class HomePageTest extends BaseClass {
	public LoginPage pg;

	public HomePage home;

	@BeforeTest
	public void launching1() {
		launchApp();

	}

	@Test(priority=5)
	public void homeValidateLogo() throws InterruptedException {
		pg = new LoginPage();
		home = new HomePage();

		pg.login(prop.getProperty("username"), prop.getProperty("password"));

		boolean expected = true;

		boolean actual = home.validateLogo();
		Assert.assertEquals(actual, expected);

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
