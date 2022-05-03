package com.payroll.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.LoginPage;
import com.payroll.pageobjects.ResetPassword;

public class ResetTest extends BaseClass {

	ResetPassword reset = new ResetPassword();
	LoginPage loginpg = new LoginPage();

	@BeforeTest
	public void launching() {
		launchApp();
	}

	@Test
	public void verify() {
		reset.resetVerify();
		String expected="Password reset";
		String actual="ans";
		Assert.assertEquals(expected, actual);
		
		
		
		
	}
}
