package com.payroll.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.actiondriver.Action;

public class Workers {

	WebDriver driver;
	Action action=new Action();

	public Workers() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/payrollapp/worker/index']")
	WebElement workersbtn;

	@FindBy(id = "workersearch-first_name")
	WebElement searchFirstName;

	@FindBy(id = "workersearch-last_name")
	WebElement searchLastName;

	@FindBy(id = "workersearch-postcode")
	WebElement searchPostCode;

	@FindBy(id = "workersearch-ni_number")
	WebElement searchNiNumber;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchBox;

	@FindBy(xpath = "//button[@type='reset']")
	WebElement resetBox;

	@FindBy(xpath = "//td[normalize-space()='Manav Ram']")
	WebElement nameWorkerSample1;

	@FindBy(id = "worker-title")
	WebElement createWorkerTitle;

	@FindBy(id = "worker-first_name")
	WebElement createWorkerFirstName;

	@FindBy(xpath = "//input[@id='worker-last_name']")
	WebElement createWorkerLastName;

	@FindBy(id = "worker-phone")
	WebElement createWorkerPhone;

	@FindBy(id = "worker-email")
	WebElement createWorkerEmail;
	
	@FindBy(id="worker-gender")
	WebElement createWorkerGender;
	
	
	@FindBy(id="//input[@id='worker-dob']")
	WebElement createWorkerDOB;
	
	
	@FindBy(id="worker-address1")
	WebElement createWorkerAddress1;
	
	
	@FindBy(id="worker-postcode")
	WebElement createWorkerPostCode;
	
	
	@FindBy(xpath="//select[@id='worker-branch_id']")
	WebElement createWorkerSelectBranch;
	
	
	@FindBy(xpath="//select[@id='worker-division_id']")
	WebElement createWorkerSelectDivision;
	
	
	@FindBy(xpath="//select[@id='worker-employment_type']")
	WebElement createWorkerSelectEmployementType;
	
	
	@FindBy(id="worker-payslip_method")
	WebElement createWorkerPaySlipMethod;
	
	@FindBy(xpath="//select[@id='worker-engage_status']")
	WebElement createWorkerEngageStatus;
	
	@FindBy(xpath="//input[@id='worker-ni_number']")
	WebElement createWorkerNiNumber;
	
	
	@FindBy(xpath="//select[@id='worker-payment_method']")
	WebElement workerBankDetailsPaymentMethod;
	
	@FindBy(xpath="//input[@id='worker-ac_name']")
	WebElement workerBankDetailAccountName;
	
	@FindBy(xpath="//input[@id='worker-ac_no']")
	WebElement workerBankDetailAccountNumber;
	
	@FindBy(id="worker-sort_code")
	WebElement workerBankDetailSortCode;
	
	@FindBy(id="worker-start_date")
	WebElement workerBankDetailStartDate;
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement workerBankDetailSave;
	
	@FindBy(xpath="//td[normalize-space()='1']")
	WebElement  workersSearchResults;
	
	public boolean searchFirstName() {
		Action action=new Action();
		action.click(driver, searchFirstName);
		action.click(driver, searchBox);
		boolean result=workersSearchResults.isDisplayed();
		return result;
	}
	
	public boolean searchLastName() {
		Action action=new Action();
		action.click(driver, searchLastName);
		action.click(driver, searchBox);
		boolean result=workersSearchResults.isDisplayed();
		return result;
	}
	
	
	public boolean searchNiNumber() {
		Action action=new Action();
		action.click(driver, searchNiNumber);
		action.click(driver, searchBox);
		boolean result=workersSearchResults.isDisplayed();
		return result;
	}
	
	public boolean searchPostCode() {
		Action action=new Action();
		action.click(driver, searchPostCode);
		action.click(driver, searchBox);
		boolean result=workersSearchResults.isDisplayed();
		return result;
	}
	
	public boolean verifyResetBtn() {
		action.click(driver, resetBox);
		boolean output=resetBox.isEnabled();
		return output;
		
		
	}
	

}
