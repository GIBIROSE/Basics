package com.payroll.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.Company;

public class CompanyTest extends HomePageTest {
	Company company = new Company();

	@Test
	public void companyPageDetails() {
		company.companyBtnClick();

		String actual = company.companyBtnClick();
		String expected = "Forbidden (#403)";
		Assert.assertEquals(actual, expected);
	}

}
