package testngbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SwagLabsDataProvider {
	
	
	@Test(dataProvider = "getLogin")
	public void loginTest(String username, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).click();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();

	}

	@DataProvider
	public Object[][] getLogin() {
		Object[][] data = new Object[2][2];
		data[0][0] = "standard_user";
		data[0][1] = "secret_sauce";
		data[1][0] = "abcd";
		data[1][1] = "1234";

		return data;

	}


}
