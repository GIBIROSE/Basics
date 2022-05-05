
package com.payroll.pageobjects;

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
	
	@FindBy(xpath="//h1[normalize-space()='Password reset']")
	WebElement pwdResetNextPageText;
	
	@FindBy(xpath="//h1[normalize-space()='Login']")
	WebElement loginTxt;
	
	@FindBy(xpath="//p[normalize-space()='Username cannot be blank.']")
	WebElement usernameErrorText;
	
	@FindBy(xpath="//p[normalize-space()='Password cannot be blank.']")
	WebElement passwordErrorText;
	
	public String verifyURL() {
		return driver.getCurrentUrl();
	}
	
	
	
	public String loginText() {
		String txtLogin=loginTxt.getText();
		return txtLogin;
	}
	
	public void invalidLogin(String un,String pwd) {
		textUserName.sendKeys(un);
		txtPassword.sendKeys(pwd);
		loginButton.click();
	}
	
	
	
	
	public String invalidLoginVerify() {
		Action action=new Action();
		action.type(textUserName, "    ");
		action.type(txtPassword, "    ");
		action.click(driver, loginButton);
		String output=usernameErrorText.getText();
		return output;
		
	}
	
	public void invalidLoginVerifyPassword() {
		Action action=new Action();
		action.type(textUserName, "    ");
		action.type(txtPassword, "    ");
		action.click(driver, loginButton);
		passwordErrorText.getText();
	}
	
	public String verifyPasswdReset() {
		
		Action action=new Action();
		action.type(textUserName, "    ");
		action.type(txtPassword, "    ");
		action.click(driver, loginButton);
		action.click(driver, resetClick);
		String output=pwdResetNextPageText.getText();
		return output;
		
		
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
