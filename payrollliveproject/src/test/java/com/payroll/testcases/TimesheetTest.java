package com.payroll.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.HomePage;
import com.payroll.pageobjects.LoginPage;
import com.payroll.pageobjects.Report;
import com.payroll.pageobjects.Timesheet;
import com.payroll.utilities.Log;

public class TimesheetTest extends BaseClass {

	@BeforeMethod
	public void launching1() {
		launchApp();
	}

	@Test(priority = 22)
	public void validateTimeSheetSearch() throws InterruptedException {
		//Log.startTestCase("LOGIN TO PAYROLL APPLICATION tc1");
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		HomePage home = new HomePage();
		home.validateTimeSheetClick();
		Timesheet sheet = new Timesheet();
		String actual = sheet.verifyApproveTimeSheets();
		System.out.println("Approval status is: "+actual);
		String expected = "Approved";
		Assert.assertEquals(actual, expected);
	}
	@Test(priority = 23)
	public void generatePaySlipValidate() {
		
		Log.startTestCase("LOGIN TO PAYROLL APPLICATION tc1");
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		HomePage home = new HomePage();
		home.validateTimeSheetClick();
		Timesheet sheet = new Timesheet();
		sheet.verifyGeneratePaySlip();
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
