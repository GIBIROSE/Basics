package com.payroll.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.Company;
import com.payroll.pageobjects.HomePage;
import com.payroll.pageobjects.LoginPage;

public class CompanyTest extends BaseClass {

	public HomePage home;

	@BeforeTest
	public void launching1() {
		launchApp();
	}

	
	@Test(priority=6,groups= {"smoke"})
	public void companyBtnVerify() {
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		home = new HomePage();
		home.validateCompany();
		Company company = new Company();
		String actual = company.verifyCompanyDetails();
		String expected = "FORBIDDEN (#403)";
		Assert.assertEquals(actual, expected);

	}
	
	@Test(priority=7)
	public void companyBtnVerifyAlertMesg() {
		LoginPage pg = new LoginPage();
		pg.login(prop.getProperty("username"), prop.getProperty("password"));
		home = new HomePage();
		home.validateCompany();
		Company company = new Company();
		boolean result = company.limitAccessToCompanyTabDetails();
		Assert.assertTrue(result);
	}

}
