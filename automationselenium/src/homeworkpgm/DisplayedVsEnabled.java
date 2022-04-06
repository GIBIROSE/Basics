package homeworkpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedVsEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");

		driver.manage().window().maximize();

		// is displayed and is selected

		// is Displayed means whether the element is present or not
		System.out.println(driver.findElement(By.xpath("//input[@id='single-input-field']")).isDisplayed());

		// is enabled means whether it accepts value or not
		System.out.println(driver.findElement(By.xpath("//input[@id='single-input-field']")).isEnabled());

		// is selected
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		// driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		System.out.println("Selection status  of male radio button is: "
				+ driver.findElement(By.xpath("//input[@id='inlineRadio1']")).isSelected());

	}

}
