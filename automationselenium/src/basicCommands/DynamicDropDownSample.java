package basicCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownSample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Search'][1]")).click();
		// driver.findElement(By.xpath("//input[@aria-label='Search'][1]")).sendKeys("Indiana");

		// xpath of role option is common for all
		List<WebElement> alloptions = driver.findElements(By.xpath("//li[@role='option']"));
		for (WebElement option : alloptions) {
			if (option.getText().equalsIgnoreCase("Indiana")) {
				option.click();
				break;

			}
		}
	}

}
