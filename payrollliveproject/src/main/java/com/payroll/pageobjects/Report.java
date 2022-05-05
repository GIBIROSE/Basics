package com.payroll.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.actiondriver.Action;
import com.payroll.baseclass.BaseClass;

public class Report extends BaseClass {

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
	WebElement summaryReport;

	@FindBy(xpath = "//button[@id='w3']")
	WebElement exportPageDataBtn;

	@FindBy(xpath = "//a[normalize-space()='Excel']")
	WebElement exportPageDataExcel;

	@FindBy(xpath = "//a[normalize-space()='PDF']")
	WebElement exportPageDataPDF;

	@FindBy(xpath = "//a[@href='/payrollapp/report/perfomance']")
	WebElement companyPerformanceClick;

	@FindBy(xpath = "(//*[name()='rect'])[9]")
	WebElement graphPerformance;
	
	@FindBy(xpath="//li[normalize-space()='Perfomance']")
	WebElement performanceGraph;

	public boolean verifyReortSummary() {
		summaryReport.isDisplayed();
		return summaryReport.isDisplayed();
	}

	public void  exportPageDataDetails() {
		Action action=new Action();
		action.click(driver, exportPageDataBtn);
		action.click(driver, exportPageDataExcel);
		action.click(driver, exportPageDataPDF);
		
	}
	
	public void performanceGraphical() {
		Action action=new Action();
		action.click(driver, companyPerformanceClick);
		performanceGraph.isDisplayed();
	}
	
}
