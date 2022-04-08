package samplespace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");

		// findelements always returns single elements
		// case----> 1 locator pointing single element
		WebElement search = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		search.sendKeys("mobiles");

		// case 2 ---> locator pointing multiple elements 22 elements here and using
		// find element
		// returns first element
		WebElement footer = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(footer.getText());
		System.out.println(footer.getAttribute("href"));
		
		//case3----> giving incorrect locatr shows NO SUCH ELEMENT EXCEPTION
		//button[@type='submit']-- correct locator we giving wrong
		
		WebElement submit=driver.findElement(By.xpath("//button[@type='subm']"));

	}

}
