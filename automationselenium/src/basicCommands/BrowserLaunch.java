package basicCommands;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.close();*/
		System.setProperty("webdriver.gecko.driver", "C:\\seleniums\\geckodriver-v0.30.0-win64\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.close();
		
		
		/*System.setProperty("webdriver.edge.driver", "C:\\seleniums\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		driver.close();*/

	}

}
