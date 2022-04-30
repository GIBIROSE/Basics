package com.payroll.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Company extends LoginPage {
	
	
	public Company() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//div[@class='site-error']/h1")
	WebElement errorMesg;
	
	
	public String errorType() {
		String error=errorMesg.getText();
		return error ;
	}

}
