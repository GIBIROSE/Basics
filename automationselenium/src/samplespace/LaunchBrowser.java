package samplespace;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {

		// argument passes two parameters key ,values
		// Webdriver is an interface chrome driver is a class, default constructor
		// automatically invoke the browser
		// chromedriver objects can be used by webdriver also

		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://frontend.nopcommerce.com/");

		// webdrivermanager no need to download browses manually

		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://frontend.nopcommerce.com/");

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://frontend.nopcommerce.com/");

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://frontend.nopcommerce.com/");*/

	}

}
