package with_pagefactorytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import with_pagefactory.LoginPages;

public class LoginTestWithPageFactory {
	@Test
	public void verifyLogin() {

		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		
		LoginPages pages=PageFactory.initElements(driver,LoginPages.class );
		pages.verifyLogin();
		
		
	}
	

	
	

}
