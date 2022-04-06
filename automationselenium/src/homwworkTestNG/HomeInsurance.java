package homwworkTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeInsurance {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Executing before  class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Executing before every method");
	}

	@Test(priority = 1)
	public void webLoginVehicle() {
		System.out.println("Home TC 1");
	}

	@Test(priority = 2)
	public void mobileLoginVehicle() {
		System.out.println("Home TC 2");
	}

	@Test(priority = 3)
	public void apiLoginVehicle() {
		System.out.println("Home TC 3");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Executing after every method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Executing after class");
	}

	

}
