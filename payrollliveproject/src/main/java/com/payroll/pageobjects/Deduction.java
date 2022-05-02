package com.payroll.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deduction {
	WebDriver driver;

	public Deduction() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/payrollapp/deduction/index']")
	WebElement deductionClick;

	@FindBy(id = "select2-deduction-worker_id-container")
	WebElement addDeductionWorker;

	@FindBy(xpath = "//select[@id='deduction-type']")
	WebElement addDeductionType;
	
	@FindBy(id="deduction-amount")
	WebElement addDeductionAmount;
	
	@FindBy(xpath="//input[@id='deduction-effective_from']")
	WebElement addDeductionEffectiveFrom;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement addDeductionSaveButton;
	
	
	

}
