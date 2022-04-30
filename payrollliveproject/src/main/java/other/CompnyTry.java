package other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompnyTry {
	
	
	@Test(priority=1)
	public void displayDetails() throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.qabible.in/payrollapp/site/login");
	driver.findElement(By.id("loginform-username")).click();
	driver.findElement(By.id("loginform-username")).sendKeys("carol");
	driver.findElement(By.xpath("//input[@id='loginform-password']")).click();
	driver.findElement(By.xpath("//input[@id='loginform-password']")).sendKeys("1q2w3e4r");
	driver.findElement(By.xpath("//button[@name='login-button']")).click();
	Thread.sleep(2000);
	
	
	WebElement el=driver.findElement(By.xpath("//h1[normalize-space()='Payroll Application']"));
	
	String actualvalue=el.getText();
	String expectedValue="PAYROLL APPLICATION";
	
	Assert.assertEquals(actualvalue,expectedValue);
		
	
	System.out.println("pass");
	
	
	
	
	//p[normalize-space()='Welcome to Payroll Application']
	
	//a[@href='/payrollapp/company/index']
	//driver.findElement(By.xpath("//a[@href='/payrollapp/company/index']")).click();
	
	//WebElement ele=driver.findElement(By.xpath("//div[@class='col-sm-6 page-title']/h1"));
	//System.out.println(ele.getText());

}
}
