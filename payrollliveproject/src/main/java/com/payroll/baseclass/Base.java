package com.payroll.baseclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	public String url="https://www.qabible.in/payrollapp/site/login";
	
	public String username="carol";
	public String password="1q2w3e4r";
	public static WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
	}

	/*@AfterClass
	public void tearDown() {
		driver.quit();
	}*/
}
