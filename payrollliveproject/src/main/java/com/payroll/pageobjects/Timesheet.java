package com.payroll.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.actiondriver.Action;
import com.payroll.baseclass.BaseClass;

public class Timesheet  extends BaseClass{
	

	public Timesheet() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/payrollapp/timesheet/index']")
	WebElement timeSheetClick;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement approveTimeSheet;

	@FindBy(xpath = "//button[@value='playslip']")
	WebElement generatePaySlip;

	@FindBy(xpath = "//button[@value='invoice']")
	WebElement generateInvoice;

	@FindBy(xpath = "//a[@data-sort='client_id']")
	WebElement pendingTimeSheetsClientName;

	@FindBy(xpath = "//a[@href='/payrollapp/timesheet/view?id=9632']//span[@class='glyphicon glyphicon-eye-open']")
	WebElement pendingTimeSheetView;

	@FindBy(xpath = "//a[@href='/payrollapp/timesheet/update?id=9699']//span[@class='glyphicon glyphicon-pencil']")
	WebElement pendingTimeSheetUpdate;

	@FindBy(xpath = "//a[@href='/payrollapp/timesheet/approvedlist']")
	WebElement approvedTimeSheets;

	@FindBy(xpath = "//a[@href='/payrollapp/timesheet/view?id=61']//span[@class='glyphicon glyphicon-eye-open']")
	WebElement viewApprovedTimeSheets;

	@FindBy(xpath = "//a[@href='/payrollapp/timesheet/create']")
	WebElement createTimeSheets;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	WebElement createTimeSheetSkip;// after skip switch to alert

	@FindBy(xpath = "//input[@id='file-logo']")
	WebElement createTimeSheetBrowse;// test to upload file

	@FindBy(xpath = "//span[normalize-space()='Upload']")
	WebElement createTimeSheetUpload;

	@FindBy(id = "timesheet-branch_id")
	WebElement createTimeSheetSelectBranch;

	@FindBy(xpath = "//select[@id='timesheet-division_id']")
	WebElement createTimeSheetSelectDivision;

	@FindBy(id = "timesheet-timesheet_number")
	WebElement createTimeSheetNumber;

	@FindBy(xpath = "//div[@class='form-group field-timesheet-client_id required']//span[@role='combobox']")
	WebElement createTimeSheetSelectClient;

	@FindBy(id = "timesheet-date")
	WebElement createTimeSheetWeekEndDate;

	@FindBy(id = "timesheet-category")
	WebElement createTimeSheetSelectCategory;

	@FindBy(id = "select2-timesheet-worker_id-container")
	WebElement createTimeSheetSelectWorker;

	@FindBy(xpath = "//select[@id='rate-0-type_id']")
	WebElement createTimeSheetDescription;

	@FindBy(id = "rate-0-units")
	WebElement createTimeSheetRatesUnits;

	@FindBy(xpath = "//input[@id='rate-0-pay']")
	WebElement createTimeSheetRatesPay;

	@FindBy(id = "rate-0-bill")
	WebElement createTimeSheetBill;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement createTimeSheetSaveButton;

	@FindBy(xpath = "//th[normalize-space()='Timesheet Number']")
	WebElement createdTimeSheetShowBtn;
	
	@FindBy(xpath="(//td[contains(text(),'Pending')])[1]")
	WebElement approvalStatusOneTimeSheet;
	
	public String verifyApproveTimeSheets() {
		Action action=new Action();
		action.click(driver, approveTimeSheet);
		String output=approvalStatusOneTimeSheet.getText();
		return output;
	}
	
	
	
	public void verifyGeneratePaySlip() {
		
		Action action=new Action();
		action.click(driver, generatePaySlip);
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
