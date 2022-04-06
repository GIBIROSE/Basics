package homwworkTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VehicleInsurance {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Executing before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Executing before every method");
	}

	@Test(priority = 1)
	public void webLoginVehicle() {
		System.out.println("Vehicle TC 1");
	}

	@Test(priority = 2)
	public void mobileLoginVehicle() {
		System.out.println("Vehicle TC 2");
	}

	@Test(priority = 3)
	public void apiLoginVehicle() {
		System.out.println("Vehicle TC 3");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Executing after every method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Executing after class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Executes before test ");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Executes after test ");
	}

	@BeforeSuite
	public void beforeSuites() {
		System.out.println("Executes before suites ");
	}

	@AfterSuite
	public void afterSuites() {
		System.out.println("Executes after suites ");
	}


}
