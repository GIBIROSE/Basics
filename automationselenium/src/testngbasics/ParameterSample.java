package testngbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterSample {
	
	@Parameters({"URL"})
	@Test
	public void demo(String siteurl) {
		
		System.out.println(siteurl);
		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(siteurl);
		
		
	}

}
