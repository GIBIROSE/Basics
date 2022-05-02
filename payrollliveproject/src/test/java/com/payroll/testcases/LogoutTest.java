package com.payroll.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.payroll.pageobjects.Logout;

public class LogoutTest extends LoginTest {
	
	Logout logout=new Logout();
	
	@Test
	public void logoutTestVerify() {
		logout.logoutVerify();
		if(driver.getCurrentUrl().equals("https://www.qabible.in/payrollapp/site/login")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		}
	}


