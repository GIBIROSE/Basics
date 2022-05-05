package com.payroll.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.Clients;
import com.payroll.pageobjects.HomePage;
import com.payroll.pageobjects.LoginPage;

public class ClientTest extends BaseClass {

	public Clients client;
	public HomePage home;

	@BeforeMethod
	public void launching1() {
		launchApp();
	}

	@Test(priority = 8,groups= {"smoke"})
	public void verifyClientSearch() throws InterruptedException {
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		home = new HomePage();
		home.verifyClickClient();
		// Thread.sleep(6000);
		client = new Clients();
		boolean result = client.searchDisplay();
		Assert.assertTrue(result);

	}

	@Test(priority = 9)
	public void verifySearchByName() {
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		home = new HomePage();
		home.verifyClickClient();
		// Thread.sleep(6000);
		client = new Clients();
		boolean result = client.searchClients();
		Assert.assertTrue(result);

	}

	@Test(priority = 10)
	public void verifySearchByID() {
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		home = new HomePage();
		home.verifyClickClient();
		// Thread.sleep(6000);
		client = new Clients();
		boolean result = client.searchClientByID();
		Assert.assertTrue(result);

	}

	@Test(priority = 11)
	public void verifyResetBtn() {
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		home = new HomePage();
		home.verifyClickClient();
		// Thread.sleep(6000);
		client = new Clients();
		client.resetEnbledVerify();
	} 
	@Test(priority = 12,groups= {"sanity"})
	public void verifyCreateClient() throws Exception {
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		home = new HomePage();
		home.verifyClickClient();
		// Thread.sleep(6000);
		client = new Clients();
		client.createClientStep();
		//String expected="hi hello";
		//Assert.assertEquals(actual,expected);
	}
	
	@Test(priority = 13)
	public void viewExistingUserVerify() {
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		home = new HomePage();
		home.verifyClickClient();
		// Thread.sleep(6000);
		client = new Clients();
		boolean expected=client.viewExistngClient();
		boolean actual=true;
		Assert.assertEquals(actual,expected);
		
	}
	
	
	@Test(priority = 14)
	public void verifyEditExistingClient() {
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		home = new HomePage();
		home.verifyClickClient();
		// Thread.sleep(6000);
		client = new Clients();
		boolean expected=client.editExistingClient();
		boolean actual=true;
		Assert.assertEquals(actual,expected);
		
		
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
	

}
