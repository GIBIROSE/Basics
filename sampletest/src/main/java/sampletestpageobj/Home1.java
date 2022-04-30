package sampletestpageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home1 {
	
	
	public WebDriver driver;

	public 	Home1() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[normalize-space()='Welcome to Payroll Application']")
	public WebElement welcomeMesg;
	
	public void verifyMesg() {
	
		//welcomeMesg.getText();
	}


}
