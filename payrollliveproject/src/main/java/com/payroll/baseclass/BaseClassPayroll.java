package com.payroll.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClassPayroll {

	public WebDriver driver;
	public Properties prop;
	
	
	public static void main(String[] args) throws IOException {
		BaseClassPayroll ln=new BaseClassPayroll();
		ln.callDriver();
	}

	public WebDriver callDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\traininingAutomationprograms\\payrollliveproject\\src\\main\\resources\\TestData\\data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver", "C:\\seleniums\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		}
		else if (browserName.equalsIgnoreCase("edge")) {
			driver = new FirefoxDriver();
			System.setProperty("webdriver.edge.driver", "C:\\seleniums\\edgedriver_win64\\msedgedriver.exe");
		
		}
		return driver;

	}
}


