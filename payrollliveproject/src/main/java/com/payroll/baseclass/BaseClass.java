package com.payroll.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.payroll.actiondriver.Action;
import com.payroll.utilities.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static Properties prop;
	public static WebDriver driver;

	
	@BeforeSuite(groups= {"smoke"})
	public void beforeSuiteLog() {
		ExtentManager.setExtent();
		DOMConfigurator.configure("log4j.xml");
	}
	
	
	
	
	// loadConfig method is to load the configuration
	@BeforeTest(groups= {"smoke"})
	public void loadConfig() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configuration\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	 //@Parameters("browser")
	// @ BeforeClass(alwaysRun=true)
	public void launchApp() {

		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			//WebDriverManager.iedriver().setup();
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			//driver = new InternetExplorerDriver();
		}
		// Maximize the screen
		driver.manage().window().maximize();
		Action action = new Action();
		// Implicit TimeOuts
		action.implicitWait(driver, 10);
		// PageLoad TimeOuts
		action.pageLoadTimeOut(driver, 30);
		driver.get(prop.getProperty("url"));

	}

	/*@AfterTest
	public void tearDown() {
		driver.close();
	}*/
	@AfterSuite(groups= {"smoke"})
	public void aftersuite()
	{
		ExtentManager.endReport();
		
	}
}
