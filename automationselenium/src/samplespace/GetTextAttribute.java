package samplespace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAttribute {
	// default value present at email and password field
	//sometimes attributes maynot be there such cases we can use getText() method

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.cssSelector("input[id='Email']"));
		// ele.clear();
		// ele.sendKeys("admin@yourstore.com");

		// driver.findElement(By.xpath("//input[@id='Password']")).clear();

		// driver.findElement(By.xpath("//button[@type='submit']")).click();//login
		// click

		// capturing attribute value getattribute need to pass parameters
		System.out.println("attribute value is :" + ele.getAttribute("value"));

		//

		System.out.println("Input field text  of username field  is :" + ele.getText());// username field no innertext

		
		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Inner text of login is: "+loginbutton.getText());// login inner text
		
		
		//no attributes forAdmin area demo field 
		// xpath is taken from immediate parent  and then inside tag as no attributes for them
		WebElement heading=driver.findElement(By.xpath("//div[@class='page-title']//h1"));
		System.out.println("heading name is :"+heading.getText());
																							

	}

}
