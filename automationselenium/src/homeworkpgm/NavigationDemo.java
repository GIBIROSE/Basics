package homeworkpgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().to("https://www.amazon.in");

		Thread.sleep(3000);
		driver.navigate().back();// go back to flipkart page
		Thread.sleep(3000);
		driver.navigate().forward();// go forward to the amazon page
		Thread.sleep(3000);
		driver.navigate().refresh();// refresh the amazon page


	}

}
