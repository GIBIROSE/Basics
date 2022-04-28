package sampletestpageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "loginform-username")
	WebElement textUserName;

	@FindBy(name = "LoginForm[password]")
	WebElement txtPassword;

	@FindBy(name = "login-button")
	WebElement loginButton;

	@FindBy(linkText = "reset it")
	WebElement resetClick;

	public void setUserName(String uname) {

		textUserName.sendKeys(uname);

	}

	public void setPassword(String pwd) {

		txtPassword.sendKeys(pwd);

	}

	public void clickSubmit() {

		loginButton.click();

	}

}
