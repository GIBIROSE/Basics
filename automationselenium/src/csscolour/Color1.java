package csscolour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Color1 {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();// maximize window
	
	//driver.findElement(By.className("abs")).click();
	driver.findElement(By.id("txtUsername")).click();// clicking on username box using ID
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");// entering username
	driver.findElement(By.name("txtPassword")).click();// clicking password textbox using Name
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");// entering password
	//driver.findElement(By.id("btnLogin")).click();// login
	driver.findElement(By.className("button")).click();

}}

