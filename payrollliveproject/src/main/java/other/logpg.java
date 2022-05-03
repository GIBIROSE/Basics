package other;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.actiondriver.Action;
import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.HomePage;

public class logpg extends BaseClass {
	
Action action = new Action();
//ebDriver driver;
	
	public logpg() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "loginform-username")
	WebElement textUserName;

	@FindBy(name = "LoginForm[password]")
	WebElement txtPassword;

	@FindBy(name = "login-button")
	WebElement loginButton;
	
	
	public HomePage login(String uname, String pwd) {
		//Action action = new Action();
		action.type(textUserName, uname);
		action.type(txtPassword, pwd);
		action.click(driver, loginButton);
		return new HomePage();
	}

}
