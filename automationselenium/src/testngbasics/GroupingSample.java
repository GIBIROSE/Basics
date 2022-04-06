package testngbasics;

import org.testng.annotations.Test;

public class GroupingSample {
	
	@Test(groups= {"sanity"})
	public void testOne() {
		System.out.println("This is TC 1");
	}

	@Test(groups={"sanity"})
	public void testTwo() {
		System.out.println("This is TC 2");
	}

	@Test(groups={"smoke"})
	public void testThree() {
		System.out.println("This is TC 3");
	}

	@Test(groups={"regression"})
	public void testFour() {
		System.out.println("This is TC 4");
	}

	@Test(groups={"regression","smoke"})
	public void testFive() {
		System.out.println("This is TC 5");
	}

	@Test(groups={"smoke","sanity"})
	public void testSix() {
		System.out.println("This is TC 6");
	}

}
