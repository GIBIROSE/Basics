package com.payroll.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.payroll.actiondriver.Action;

import com.payroll.baseclass.BaseClass;

public class HomePage extends LoginPage{
	
	
	
	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/payrollapp/site/index']")
	WebElement dashboard;
	
	
	
	@FindBy(xpath="//h1[normalize-space()='Payroll Application']")
	WebElement appName;
	
	@FindBy(xpath="//p[normalize-space()='Welcome to Payroll Application']")
	WebElement welcomeMesg;
	
	@FindBy(xpath="//img[@alt='logo']")
	WebElement logoApp;
	
	@FindBy(xpath="//div[@class='col-sm-6 page-title'] //h1")
	WebElement titleApp;
	
	public void welcome() {
		
	}
	public boolean validateLogo() {
		Action action = new Action();
		return action.isDisplayed(driver, logoApp);
	}
	
	public void validateTitle() {
		Action action = new Action();
		//action.g
		
	}
	public String validateWelcomeMesg() {
		String messageWelcome=welcomeMesg.getText();
		return messageWelcome;
	}
	public String validateAppName() {
		String appNameDashboard=appName.getText();
		return appNameDashboard;
	}
	
	
	
	
	

}
