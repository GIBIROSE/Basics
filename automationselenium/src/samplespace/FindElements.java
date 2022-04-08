package samplespace;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// find elements always returns multiple web elements

		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");

		// case 1--->
		// locator pointing to multiple elements shows all elements
		List<WebElement> Links = driver.findElements(By.xpath("//div[@class='footer-upper']//div"));
		System.out.println("Number of elements :" + Links.size());
		// for returning all links
		for (WebElement ele : Links) {
			System.out.println(ele.getText());
		}

		// case 2
		// locator pointing to single element returns single element
		//List<WebElement> Links1 = driver.findElements(By.xpath("//input[@id='small-searchterms']"));
		List<WebElement> Links1 = driver.findElements(By.xpath("(//a[normalize-space()='Computers'])[1]"));
		//a[normalize-space()='Computers']
		System.out.println("Number of elements :" + Links1.size());
		for (WebElement ele1 : Links1) {
			System.out.println(ele1.getText());
		}
		
		//case 3
		// if doesnot matches with the locator it doesnot throw exception
		//returns size as zero
		List<WebElement> Links2=driver.findElements(By.xpath("//div[@class='header-menuuu']"));
		System.out.println("Number of elements :" + Links2.size());
		
		for (WebElement ele2 : Links2) {
			System.out.println(ele2.getText());
		}

	}

}
