package actionclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	@Test
	public void demoMouseHover() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Binu\\Desktop\\seleniums\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		
		Actions act=new Actions(driver);
		 WebElement signup=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		 
		 act.moveToElement(signup).build().perform();
		 Thread.sleep(3000);
		 WebElement signupdrop= driver.findElement(By.xpath("//a[@class='nav-a'][1]"));
		 act.moveToElement(signupdrop).click().perform();
		 
		
	}

}
