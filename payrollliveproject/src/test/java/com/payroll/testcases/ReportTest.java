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
import com.payroll.pageobjects.Report;
import com.payroll.pageobjects.Workers;
import com.payroll.utilities.Log;

public class ReportTest extends BaseClass {

	@BeforeMethod
	public void launching1() {
		launchApp();
	}

	@Test
	public void validateDeductionHistorySelectWorker() throws Exception {
		Log.startTestCase("PAYROLL APPLICATION");
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		HomePage home = new HomePage();
		home.validateReportClick();
		Report report = new Report();
		report.deductionSelectWorker();

	}

	@Test(priority = 24, groups = { "sanity" })
	public void verifyClientSearch() throws InterruptedException {
		Log.startTestCase("PAYROLL APPLICATION");
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		HomePage home = new HomePage();
		home.validateReportClick();
		Report report = new Report();
		boolean result = report.verifyReortSummary();
		Assert.assertTrue(result);

	}

	@Test(priority = 25)
	public void verifyExportPageDetails() {
		Log.startTestCase("LOGIN TO PAYROLL APPLICATION tc2");
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		HomePage home = new HomePage();
		home.validateReportClick();
		Report report = new Report();
		report.exportPageDataDetails();

	}

	@Test(priority = 26, groups = { "smoke" })
	public void verifyGraphicalData() {
		Log.startTestCase("LOGIN TO PAYROLL APPLICATION tc3");
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		HomePage home = new HomePage();
		home.validateReportClick();
		Report report = new Report();
		report.performanceGraphical();

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}