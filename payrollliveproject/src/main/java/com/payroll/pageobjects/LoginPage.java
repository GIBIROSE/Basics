
package com.payroll.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.actiondriver.Action;
import com.payroll.baseclass.BaseClass;

public class LoginPage extends BaseClass {

	Action action = new Action();

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "loginform-username")
	WebElement textUserName;

	@FindBy(name = "LoginForm[password]")
	WebElement txtPassword;

	@FindBy(name = "login-button")
	WebElement loginButton;

	@FindBy(linkText = "reset it")
	WebElement resetClick;
	
	@FindBy(xpath="//h1[normalize-space()='Login']")
	WebElement loginTxt;
	
	public String loginText() {
		String txtLogin=loginTxt.getText();
		return txtLogin;
	}
	
	

	public HomePage login(String uname, String pwd) {
		//Action action = new Action();
		action.type(textUserName, uname);
		action.type(txtPassword, pwd);
		action.click(driver, loginButton);
		return new HomePage();
	}
	
	
	public String verifyReset() {
		action.click(driver, resetClick);
	    String output=driver.getCurrentUrl();
	    return output;
	}
	
	
	
	public boolean loginButtonEnabled() {
		boolean valueLoginButton=loginButton.isEnabled();
		return valueLoginButton;
	}

}
