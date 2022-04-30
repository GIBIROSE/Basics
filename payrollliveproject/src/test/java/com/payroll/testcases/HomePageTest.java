package com.payroll.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.payroll.pageobjects.HomePage;

public class HomePageTest  extends LoginTest{
	HomePage home=new HomePage();
	
	@Test
	public void homeTest_001() throws InterruptedException    {
		//HomePage home=new HomePage();
		System.out.println("Home1");

		Thread.sleep(3000);
		home.validateLogo();
		boolean result=home.validateLogo();
		System.out.println(result);
		
		} 
	@Test
	public void homeTest_002() {
		System.out.println("Home2");
		String msg=home.validateWelcomeMesg();
		System.out.println(msg);
		System.out.println("Home02");
		
	}
	
	
	@Test
	public void appNameAvailable() {
		
	}
		
	}


