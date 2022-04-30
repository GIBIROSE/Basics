package sampletestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


import sampletestpageobj.Home1;


public class HomePageTest_001 {
	
	
	@Test
	public void verifyLoginTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.findElement(By.id("loginform-username")).click();
		driver.findElement(By.id("loginform-username")).sendKeys("carol");
		driver.findElement(By.xpath("//input[@id='loginform-password']")).click();
		driver.findElement(By.xpath("//input[@id='loginform-password']")).sendKeys("1q2w3e4r");
		driver.findElement(By.xpath("//button[@name='login-button']")).click();
		
		
		Home1 hg = new Home1();
		if(hg.welcomeMesg.getText().equals("Welcome to Payroll Application")) {
			System.out.println("success");
			Assert.assertTrue(true);
		} else {
			System.out.println("failure");
			Assert.assertTrue(false);
		}

		
	}

}
