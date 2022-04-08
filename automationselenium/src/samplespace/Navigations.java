package samplespace;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Navigations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        //driver.get("https://www.amazon.in/");
        
        driver.navigate().to("https://demo.nopcommerce.com/register");
        driver.navigate().to("https://www.amazon.in/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        

	}

}
