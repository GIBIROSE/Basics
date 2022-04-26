package other;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PayRollBaseClass {

	
		public WebDriver driver;
		public Properties prop;

		public WebDriver launch() throws IOException 
		{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\traininingAutomationprograms\\payrollliveproject\\src\\main\\resources\\data.properties");

			prop.load(fis);
			String browserName = prop.getProperty("browser");

			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
				System.setProperty("webdriver.gecko.driver","D:\\skillup\\geckodriver.exe");
				
			} 

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;

		}

	}


