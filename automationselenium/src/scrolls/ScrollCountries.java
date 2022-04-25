package scrolls;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollCountries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//1. case---> scrolling by pixel
		//js.executeScript("window.scrollBy(0,1000)", "");
		
		//2.scroll into the value till we need
		//3. scroll till end
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		
		
		

	}

}
