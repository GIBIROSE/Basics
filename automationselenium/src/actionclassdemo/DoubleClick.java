package actionclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick {
	@Test
	public void demoDoubleClick() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Binu\\Desktop\\seleniums\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		
		Actions act=new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).perform();
	

		
		
	}

}
