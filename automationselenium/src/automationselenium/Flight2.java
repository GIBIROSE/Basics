package automationselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flight2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");

		Actions act = new Actions(driver);

		act.doubleClick(driver.findElement(By.xpath("//label[@for='fromCity']"))).perform();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin ']/div/input"))
				.sendKeys("Kansas");
		Thread.sleep(3000);

		List<WebElement> optionsFlight = driver.findElements(By.xpath("//p[@class='font14 appendBottom5 blackText']"));
		for (WebElement option : optionsFlight) {
			int text = optionsFlight.size();
			System.out.println(text);

			if (option.getText().equals("Kansas City, United States")) {

				option.click();
				break;

			}
		}


	}

}
