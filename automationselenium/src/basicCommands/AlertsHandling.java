package basicCommands;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		
		//giving implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		WebElement frameEle=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frameEle);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Hello Sunday!!!!");
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@id='getwebsitebtn']")).click();
		
		

	}

}
