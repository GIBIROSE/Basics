package samplebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import sampleconfig.ReadingConfigFile;

public class BaseClass {

	ReadingConfigFile readconfig = new ReadingConfigFile();

	public String baseurl = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public static WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void setUp(String brw) {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\traininingAutomationprograms\\sampletest\\Drivers\\chromedriver.exe");
		 */

		if (brw.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			driver = new ChromeDriver();
		}

		else if (brw.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getFireFoxPath());
			driver = new FirefoxDriver();
		}

		else if (brw.equals("edge")) {
			System.setProperty("webdriver.edge.driver", readconfig.getEdgePath());
			driver = new EdgeDriver();
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
