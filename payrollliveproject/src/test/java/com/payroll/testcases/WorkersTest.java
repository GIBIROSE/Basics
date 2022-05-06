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
import com.payroll.pageobjects.Workers;

public class WorkersTest extends BaseClass {

	@BeforeMethod
	public void launching1() {
		launchApp();
	}

	@Test(priority = 1)
	public void verifyClientSearch() throws InterruptedException {
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		HomePage home = new HomePage();
		home.verifyClickWorkers();
		Workers work = new Workers();
		boolean result = work.searchDisplayWorkers();
		Assert.assertTrue(result);
	}

	@Test(priority = 2)
	public void verifyFirstNameSearchBtn() {

		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		HomePage home = new HomePage();
		home.verifyClickWorkers();
		Workers work = new Workers();
		boolean result = work.searchFirstName();
		Assert.assertTrue(result);

	}

	@Test(priority = 3)
	public void verifyCreateWorkerPossible() {

		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		HomePage home = new HomePage();
		home.verifyClickWorkers();
		Workers work = new Workers();
		boolean result = work.createWorkerVerify();
		Assert.assertTrue(result);

	}

	@Test(priority = 18)
	public void createNewWorker1() throws Exception {

		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		HomePage home = new HomePage();
		home.verifyClickWorkers();
		Workers work = new Workers();
		boolean result = work.enterCreateNewWorker();
		Assert.assertTrue(result);

	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
