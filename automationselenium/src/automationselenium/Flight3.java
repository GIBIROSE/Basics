package automationselenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight3 {

	public static void main(String[] args) {
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

		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("ra");

		List<WebElement> optionsFlight = driver
				.findElements(By.xpath("//div[@class='css-1tli02a-autocompleteResults']/ul/li/div/div"));

		System.out.println("size of elements: " + optionsFlight.size());

		for (WebElement option : optionsFlight) {

			// System.out.println("hi");
			System.out.println(option.getText());

			if (option.getText().equalsIgnoreCase(
					"RAO Dr. Leite Lopes–Ribeirão Preto State Airport Ribeirão Preto, Sao Paulo State, Brazil")) {

				option.click();

				// driver.findElement(By.xpath("//input[@class='css-bwf0ll']")).click();
				break;

			}

		}

	}

}
