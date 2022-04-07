package listenersTestng;

import org.testng.Assert;
import org.testng.annotations.Test;
@Test(testName="regression")
public class VehicleInsurance {
	
	@Test(priority=1)
	public void webLoginVehicle() {
		System.out.println("Vehicle TC 1");
	}

	@Test(priority=2)
	public void mobileLoginVehicle() {
		System.out.println("Vehicle TC 2");
	}

	@Test(priority=3)
	public void apiLoginVehicle() {
		System.out.println("Vehicle TC 3");
		Assert.assertTrue(false);
	}


}
