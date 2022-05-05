package com.payroll.testcases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.HomePage;
import com.payroll.pageobjects.LoginPage;
import com.payroll.pageobjects.Payslip;
import com.payroll.pageobjects.Report;
import com.payroll.utilities.Log;

public class PayslipTest extends BaseClass {
	@BeforeMethod
	public void launching1() {
		launchApp();
	}

	@Test(priority = 31)
	public void validatePagination() {
		Log.startTestCase(" PAYROLL APPLICATION tc payslip");
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		HomePage home = new HomePage();
		home.validatePaySlipClick();
		Payslip slip = new Payslip();
		slip.verifyPagination();

	}

	@Test(priority = 29,groups= {"smoke"})
	public void verifyClientSearch() throws InterruptedException {
		Log.startTestCase(" PAYROLL APPLICATION tc1");
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		HomePage home = new HomePage();
		home.validatePaySlipClick();
		Payslip slip = new Payslip();
		boolean actual = slip.verifySummaryDetailsPaySlip();
		System.out.println(actual);
		boolean expected = true;
		Assert.assertEquals(actual, expected);

	}

	@Test(priority = 30,groups= {"sanity"})
	public void validateDownloadPayslip() throws AWTException {

		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		HomePage home = new HomePage();
		home.validatePaySlipClick();
		Payslip slip = new Payslip();
		slip.verifyDownloadPaySlipWorker();

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
