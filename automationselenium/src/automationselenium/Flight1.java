package automationselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
		
		driver.findElement(By.xpath("//span[normalize-space()='Flights']")).click();
		driver.findElement(By.xpath("(//div[@data-testid='searchbox_controller_trip_type_ONEWAY'])[1]")).click();
		
		
		
		
		
		driver.findElement(By.xpath("(//input[@class='css-g0pg3f-SearchboxInput'])[2]")).click();
		driver.findElement(By.xpath("//span[@data-date-cell='2022-04-29']")).click();
	}

}
