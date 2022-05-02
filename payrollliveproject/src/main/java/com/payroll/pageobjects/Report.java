package com.payroll.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Report {
	WebDriver driver;

	public Report() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Report']")
	WebElement reportClick;

	@FindBy(xpath = "//span[@class='select2-selection__placeholder']")
	WebElement selectWorkerID;

	@FindBy(xpath = "ratesearch-created_at_range")
	WebElement selectTimeSheetDateRange;

	@FindBy(xpath = "//div[@class='summary']")
	WebElement summary;

	@FindBy(xpath = "//span[@class='caret']")
	WebElement exportPageDataBtn;

	@FindBy(xpath = "//a[normalize-space()='Excel']")
	WebElement exportPageDataExcel;

	@FindBy(xpath = "//a[normalize-space()='PDF']")
	WebElement exportPageDataPDF;

	@FindBy(xpath = "//a[@href='/payrollapp/report/perfomance']")
	WebElement companyPerformanceClick;

	@FindBy(xpath = "(//*[name()='rect'])[9]")
	WebElement graphPerformance;

}
