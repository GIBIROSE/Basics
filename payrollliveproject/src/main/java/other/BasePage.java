package other;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasePage {

	WebDriver driver;

	@Test
	@Parameters({ "browser" })
	public void setUpBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\seleniums\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\seleniums\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();

		}
		driver.get("https://www.qabible.in/payrollapp/site/login");

	}

}
