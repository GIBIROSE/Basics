package com.payroll.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Company extends LoginPage {
	
	
	public Company() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//a[@href='/payrollapp/company/index']")
	WebElement companyButton;
	
	@FindBy(xpath="//div[@class='site-error']/h1")
	WebElement errorMesg;
	
	
	public String companyBtnClick() {
		companyButton.click();
		String error=errorMesg.getText();
		return error ;
	}
	
	
	
	public String errorType() {
		String error=errorMesg.getText();
		return error ;
	}

}
