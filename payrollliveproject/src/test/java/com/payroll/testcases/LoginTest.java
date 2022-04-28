package com.payroll.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.payroll.baseclass.Base;
import com.payroll.pageobjects.LoginPage;

public class LoginTest extends Base {

	@Test
	public void loginCase() {
		/*driver.get(url);
		LoginPage login = new LoginPage(driver);
		login.setUserName(username);
		login.setPassword(password);
		login.clickSubmit();
		
		if(driver.getTitle().equals("Login"))
		{
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}*/
		driver.get("https://www.youtube.com/");
		System.out.println("hi");
		
		
		
	}

}
