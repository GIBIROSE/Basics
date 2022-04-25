package automationselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightBooking {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//span[@class='bui-tab__text'])[2]")).click();

		driver.findElement(By.xpath("(//div[@data-testid='searchbox_controller_trip_type_ONEWAY'])[1]")).click();

		// driver.findElement(By.xpath("(//input[@class='css-g0pg3f-SearchboxInput'])[2]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Where from?']")).click();
		driver.findElement(By.xpath("//input[@class='css-bwf0ll']")).click();

		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("trv");

		driver.findElement(By.xpath("//input[@class='css-bwf0ll']")).click();

		driver.findElement(By.xpath("//div[@class='css-16yo5ny']")).click();

		driver.findElement(By.xpath("//input[@class='css-1tl2oa1']")).click();

		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='css-1tl2oa1']")));
		firstResult.click();
		firstResult.sendKeys("kannur");

		// Thread.sleep(2000);

		// driver.findElement(By.xpath("//input[@class='css-1tl2oa1']")).sendKeys("kannur");

		driver.findElement(By.xpath("//input[@class='css-bwf0ll']")).click();

		driver.findElement(By.xpath("//div[@class='css-16yo5ny']")).click();

		driver.findElement(By.xpath("(//input[@class='css-g0pg3f-SearchboxInput'])[2]")).click();
		driver.findElement(By.xpath("//span[@data-date-cell='2022-04-29']")).click();
		
		driver.findElement(By.xpath("//button[@class='css-ya5gr9 wide']")).click();

	}
}
