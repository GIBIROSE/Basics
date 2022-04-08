package samplespace;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleUrlPagesource {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://frontend.nopcommerce.com/");
		
		System.out.println("title of the page is: "+driver.getTitle());//title
		System.out.println("Current url of the page is: "+driver.getCurrentUrl());//current url
		//System.out.println("page source html code"driver.getPageSource());// html page code 
		
	}

}
