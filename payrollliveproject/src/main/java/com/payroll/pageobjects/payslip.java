package com.payroll.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.actiondriver.Action;
import com.payroll.baseclass.BaseClass;

public class Payslip extends BaseClass {

	public Payslip() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='summary']")
	WebElement paySlipSummary;

	@FindBy(xpath = "//a[@href='/payrollapp/payslip/pdf?id=2780']")
	WebElement paySlipDownloadButton;
	
	
	@FindBy(xpath="//a[@href='/payrollapp/payslip/pdf?id=2781']//span[@class='glyphicon glyphicon-paperclip']")
	WebElement downloadOneWorkerPayslip;
	
	@FindBy(xpath="//a[@href='/payrollapp/payslip/index?page=6&per-page=40']")
	WebElement pagination6;
	
	@FindBy(xpath="//a[@href='/payrollapp/payslip/index?page=10&per-page=40']")
	WebElement pagination10;
	
	public void verifyPagination() {
		Action action=new Action();
		action.click(driver, pagination6);
		action.click(driver, pagination10);
	}
	
	

	public boolean verifySummaryDetailsPaySlip() {
		boolean output = paySlipDownloadButton.isDisplayed();
		return output;

	}
	
	public void verifyDownloadPaySlipWorker() throws AWTException {
		downloadOneWorkerPayslip.click();
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_S);
		Action action=new Action();
		action.explicitWait(driver, downloadOneWorkerPayslip, 10);
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}
