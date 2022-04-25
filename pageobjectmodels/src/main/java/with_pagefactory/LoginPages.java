package with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages {
	WebDriver driver;

	public LoginPages(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(id = "loginform-username")
	WebElement username;

	@FindBy(xpath = "//input[@id='loginform-password']")
	WebElement password;

	@FindBy(xpath = "//button[@name='login-button']")
	WebElement loginButton;

	public void verifyLogin() {
		username.sendKeys("carol");
		password.sendKeys("1q2w3e4r");
		loginButton.click();

	}

}
