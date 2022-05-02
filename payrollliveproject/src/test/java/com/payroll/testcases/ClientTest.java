package com.payroll.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.payroll.pageobjects.Clients;

public class ClientTest extends CompanyTest {

	Clients clients = new Clients();

	@Test
	public void verifyClientSearch() throws InterruptedException {
		Thread.sleep(3000);

		boolean actual = clients.searchClients();
		boolean expected = true;
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void verifyclientSearchByID() {
		boolean actual = clients.searchClientByID();
		boolean expected = true;
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void verifycreateClientDetails() {
		String actual = clients.mainStep();
		String expected = "Client Name";
		Assert.assertEquals(actual, expected);

	}

}
