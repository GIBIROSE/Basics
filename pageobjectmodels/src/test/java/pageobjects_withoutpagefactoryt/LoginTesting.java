package pageobjects_withoutpagefactoryt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pagemodels_withoutpagefactory.LoginPage;

public class LoginTesting {

	@Test
	public void verifyLogin() {

		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qabible.in/payrollapp/site/login");

		LoginPage page = new LoginPage(driver);
		page.enterUserName();
		page.enterPassword();
		page.clickLoginButton();

	}

}
