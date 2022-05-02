package com.payroll.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.actiondriver.Action;

public class Logout extends LoginPage {
	WebDriver driver;

	public Logout() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	WebElement logoutBtn;

	public void logoutVerify() {
		Action act = new Action();
		act.click(driver, logoutBtn);
	}
}
