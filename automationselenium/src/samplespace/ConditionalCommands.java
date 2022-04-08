package samplespace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		//status of web elements returns boolean value
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://demo.nopcommerce.com/register");
         //used for all webelements
         //if the particular element is displayed on the webpage it returns true, not returns false
         WebElement search=driver.findElement(By.id("small-searchterms"));
         System.out.println("display status is"+search.isDisplayed());
         System.out.println("enabled status of search button :"+search.isEnabled());
         
         //enabled means whether it is allowing to pass data
         
         WebElement register=driver.findElement(By.linkText("Register"));
         System.out.println("display status of register  :"+register.isDisplayed());
         System.out.println("enabled status of register  :"+register.isEnabled());
         
        // driver.findElement(By.linkText("Register"));
         
         // is selected basically used for radio or check boxes
       WebElement male=  driver.findElement(By.xpath("//input[@id='gender-male']"));
       System.out.println("selection status of male button is: "+male.isSelected());
         
       male.click();
       System.out.println("selection status of male button is: "+male.isSelected());
       
         
	}

}
