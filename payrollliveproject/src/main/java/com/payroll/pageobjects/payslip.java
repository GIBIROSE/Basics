package com.payroll.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class payslip {

	WebDriver driver;

	public payslip() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//div[@class='summary']")
	WebElement paySlipSummary;
	
	
	@FindBy(xpath="//a[@href='/payrollapp/payslip/pdf?id=2780']")
	WebElement paySlipDownloadButton;
	
	
	
	
}
