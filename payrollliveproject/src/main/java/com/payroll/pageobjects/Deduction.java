package com.payroll.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.actiondriver.Action;
import com.payroll.baseclass.BaseClass;

public class Deduction extends BaseClass {
	

	public Deduction() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/payrollapp/deduction/index']")
	WebElement deductionBtn;
	
	
	@FindBy(xpath="//a[@href='/payrollapp/deduction/view?id=5578']//span[@class='glyphicon glyphicon-eye-open']")
	WebElement deductionViewOneUserEyeBtn;
	
	@FindBy(xpath="//a[@href='/payrollapp/deduction/create']")
	WebElement  addDeductionSideTab;
	
	

	@FindBy(id = "select2-deduction-worker_id-container")
	WebElement addDeductionWorker1;
	
	@FindBy(xpath="//span[@id='select2-deduction-worker_id-container']")
	WebElement addDeductionWorker;

	@FindBy(xpath = "//select[@id='deduction-type']")
	WebElement addDeductionType;
	
	@FindBy(id="deduction-amount")
	WebElement addDeductionAmount;
	
	@FindBy(xpath="//input[@id='deduction-effective_from']")
	WebElement addDeductionEffectiveFrom;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement addDeductionSaveButton;
	
	@FindBy(xpath="//div[@class='summary']")
	WebElement summaryDetductionDetailsShow1to20;
	
	@FindBy(xpath="//ul[@class='breadcrumb']")
    WebElement detailedViewOneUser;	
	
	
	@FindBy(xpath="//th[normalize-space()='Worker']")
	WebElement addDeductionSavedDetailsPage;
	
	public boolean  addDeduction() {
		Action action = new Action();
		action.click(driver, addDeductionSideTab);
		
		
		action.explicitWait(driver, addDeductionWorker, 10);
		//action.selectByIndex(addDeductionWorker, 1);
		
		
		//action.selectByIndex(addDeductionWorker, 1);
		
		
		
		action.selectByIndex(addDeductionType, 1);
		action.type(addDeductionAmount, "39");
		
		
		
		action.click(driver, addDeductionWorker);
		action.type(addDeductionWorker, "Dennis Benny");
		action.click(driver, addDeductionSaveButton);
		boolean result = addDeductionSavedDetailsPage.isDisplayed();
		return result;
	}
	
	
	
	public boolean deductionVerifyViewAllWorkers() {
		Action action = new Action();
		action.click(driver, deductionBtn);
		boolean result = summaryDetductionDetailsShow1to20.isDisplayed();
		return result;
	}
	
	public boolean existingWorkerView() {
		Action action = new Action();
		action.click(driver, deductionViewOneUserEyeBtn);
		boolean result = detailedViewOneUser.isDisplayed();
		return result;
	}
	

}
