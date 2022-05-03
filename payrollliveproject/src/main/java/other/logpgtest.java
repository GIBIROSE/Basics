package other;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.LoginPage;

public class logpgtest extends BaseClass {

	logpg p=new logpg();

	@BeforeMethod
	public void setup() {
		launchApp();
	}

	/*@AfterMethod
	public void tearDown() {
		driver.quit();
	}*/

	@Test
	public void loginTestTitle() throws InterruptedException {
		Thread.sleep(3000);

		p.login(prop.getProperty("username"), prop.getProperty("password"));
		if (driver.getTitle().equals("Login")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
}
