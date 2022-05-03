package com.payroll.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.Clients;
import com.payroll.pageobjects.HomePage;
import com.payroll.pageobjects.LoginPage;

public class ClientTest extends BaseClass {

	public Clients client;
	public HomePage home;

	@BeforeTest
	public void launching1() {
		launchApp();
	}

	@Test
	public void verifyClientSearch() throws InterruptedException {
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		home = new HomePage();
		home.verifyClickClient();
		//Thread.sleep(6000);
		client = new Clients();
		boolean result = client.searchDisplay();
		Assert.assertTrue(result);

		// LoginPage pg = new LoginPage();
		// boolean actual = clients.searchClients();
		// boolean expected = true;
		// Assert.assertEquals(actual, expected);
	}
	/*
	 * @Test public void verifyclientSearchByID() { boolean actual =
	 * clients.searchClientByID(); boolean expected = true;
	 * Assert.assertEquals(actual, expected); }
	 * 
	 * @Test public void verifycreateClientDetails() throws Exception { String
	 * actual = clients.mainStep(); String expected = "Client Name";
	 * Assert.assertEquals(actual, expected);
	 * 
	 * }
	 */

}
