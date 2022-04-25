package automationselenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FlightMakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//div[@data-cy='outsideModal']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='fromCity'])[1]")).click();

		Thread.sleep(2000);
		/*
		 * List<WebElement>
		 * airportOptions=driver.findElements(By.xpath("//li[@role='option']"));
		 * 
		 * 
		 * 
		 * for(WebElement option:airportOptions) {
		 * 
		 * 
		 * if (option.getText().equalsIgnoreCase("Bangkok, Thailand")) { option.click();
		 * break; } }
		 */

		//WebElement airpo = driver.findElement(By.xpath("//li[@role='option']"));
		//Select  drp=new Select(airpo);

		List<WebElement> alloptions = driver.findElements(By.xpath("//li[@role='option']"));

		for (WebElement option : alloptions) {
			if (option.getText().equals("Bangkok, Thailand")) {

				option.click();
				break;

			}
		}
	}
}
