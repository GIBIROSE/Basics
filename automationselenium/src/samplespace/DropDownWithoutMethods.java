package samplespace;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithoutMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		
		WebElement country=driver.findElement(By.id("input-country"));
		Select drp=new Select(country);
		
		
		List<WebElement> alloptions=drp.getOptions();
		
		for(WebElement option:alloptions ) {
			if(option.getText().equals("Denmark")) {
				
				option.click();
				break;
				
			}
		}
		
		
		
		

	}

}
