package com.payroll.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
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

	@FindBy(xpath = "//li[normalize-space()='Perfomance']")
	WebElement performanceGraph;

	@FindBy(xpath = "//a[@href='/payrollapp/report/deduction']")
	WebElement deductionHistoryClick;

	@FindBy(id = "select2-deductionsearch-worker_id-container")
	WebElement deductionHistorySelectWorker;

	@FindBy(xpath = "//span[@role='presentation']")
	WebElement deductionDownArrow;

	@FindBy(xpath = "//input[@role='textbox']")
	WebElement workerTxtBox;

	@FindBy(xpath = "//li[@id='select2-deductionsearch-worker_id-result-uxpn-3']")
	WebElement workerDeductioBtn;

	@FindBy(xpath = "//li[@class='select2-results__option']")
	WebElement allElements;
	
	@FindBy(id="invoicesearch-client_name")
	WebElement invoiceClientName;
	
	@FindBy(id="invoicesearch-client_id")
	WebElement invoiceClientNumber;
	
	@FindBy(xpath="//li[@class='select2-results__option']")
	WebElement invoiceSearch;
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchBtn;
	
	
	
	
	
	

	public void deductionSelectWorker() throws Exception {
		Action action=new Action();
		action.click(driver, deductionHistoryClick);
		action.click(driver, deductionDownArrow);
		//action.type(deductionDownArrow, "Tom Mathew Xaviour");
		//action.click(driver, workerDeductioBtn);
		//action.selectByIndex(deductionDownArrow, 2);
		action.explicitWait(driver, workerTxtBox, 10);
		//action.JSClick(driver, workerDeductioBtn);
		List<WebElement> alloptions = driver.findElements(By.xpath("//li[@role='option']"));
		for (WebElement option : alloptions) {
			if (option.getText().equalsIgnoreCase("Dennis  Benny")) {
				option.click();
				break;

			}
		}
		
		
		//action.selectByVisibleText("Tom Mathew Xaviour", workerTxtBox);
		
		//action.selectBySendkeys(null, deductionHistorySelectWorker)
		
		
	}

	public boolean verifyReortSummary() {
		summaryReport.isDisplayed();
		return summaryReport.isDisplayed();
	}

	public void exportPageDataDetails() {
		Action action = new Action();
		action.click(driver, exportPageDataBtn);
		action.click(driver, exportPageDataExcel);
		action.click(driver, exportPageDataPDF);

	}

	public void performanceGraphical() {
		Action action = new Action();
		action.click(driver, companyPerformanceClick);
		performanceGraph.isDisplayed();
	}

	public void verifyDeductionHistory() {

	}
}
