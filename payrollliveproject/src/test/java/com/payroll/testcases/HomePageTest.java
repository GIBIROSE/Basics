package com.payroll.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.HomePage;
import com.payroll.pageobjects.LoginPage;

public class HomePageTest extends BaseClass {
	LoginPage pg=new LoginPage();
	HomePage home = new HomePage();

	
	/*public void displayLogin() {
		
		
	}*/
	@BeforeTest
	public void launching() {
		launchApp();
	
	}
	
	
	@Test
	public void homeValidateLogo() throws InterruptedException {
		//home = new HomePage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		
		boolean expected = true;

		boolean actual = home.validateLogo();
		Assert.assertEquals(actual, expected);
		String actual1 = home.validateAppName();
		String expected1 = "Payroll Application";
		Assert.assertEquals(actual1, expected1);
		String actual2 = home.validateWelcomeMesg();
		String expected2 = "Welcome to Payroll Application";
		// String = driver.getCurrentUrl();
		Assert.assertEquals(actual2, expected2);
		
		

	}
/*
	@Test
	public void appNameAvailable() {
		//home = new HomePage();
		String actual = home.validateAppName();
		String expected = "Payroll Application";
		Assert.assertEquals(actual, expected);

	}

	@Test
	public void homeValidateWelcomeMesg() {
		home = new HomePage();
		String actual = home.validateWelcomeMesg();
		String expected = "Welcome to Payroll Application";
		// String = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);

	}*/

}
