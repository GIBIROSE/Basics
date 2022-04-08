package samplespace;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		
		WebElement country=driver.findElement(By.id("input-country"));
		Select drp=new Select(country);
		//case1--->
		//drp.selectByVisibleText("Algeria");
		
		//case---> 2if attribute value is present in html code , some cases may not be there
		//drp.selectByValue("3");
		
		//case --->3use by index starts from 0 , select with assumption
		drp.selectByIndex(2);
		
		
		
		

	}

}
