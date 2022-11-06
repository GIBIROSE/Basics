package basicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();// maximize window
		
		//driver.findElement(By.className("abs")).click();
		driver.findElement(By.id("txtUsername")).click();// clicking on username box using ID
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");// entering username
		driver.findElement(By.name("txtPassword")).click();// clicking password textbox using Name
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");// entering password
		//driver.findElement(By.id("btnLogin")).click();// login
		driver.findElement(By.className("button")).click();//using classname locator login button
		driver.findElement(By.className("panelTrigger")).click();// welcome
		//Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();// using LINKTEXT locator logout
		//driver.close();*/
		
		
		driver.findElement(By.id("txtUsername")).click();// clicking on username box using ID
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");// entering username
		driver.findElement(By.name("txtPassword")).click();// clicking password textbox using Name
		driver.findElement(By.name("txtPassword")).sendKeys("admin1234");// entering wrong password
		driver.findElement(By.className("button")).click();//using classname locator login button
		
		
		//login fails with invalid details invalid credentials message
		System.out.println(driver.findElement(By.cssSelector("span#spanMessage")).getText());
		
		
		//driver.findElement(By.linkText("Forgot your password?")).click();//Linktext forgot password
		driver.findElement(By.partialLinkText("Forgot")).click();//Linktext forgot password
		
		
		
		
		
		//Entering reset password orange Hrm username using css tagname#id
		driver.findElement(By.cssSelector("input#securityAuthentication_userName")).click();//css tagname#id
		driver.findElement(By.cssSelector("input#securityAuthentication_userName")).sendKeys("Admin");
		
		
		//entering reset password using css regular expression text and indexing 
		//driver.findElement(By.cssSelector("input[name*='security']:nth-child(2)")).click();
		//driver.findElement(By.cssSelector("input[name*='security']:nth-child(2)")).sendKeys("Admin");
		
		
		
		//tagname.classname
		driver.findElement(By.cssSelector("input.searchValues")).click();//Reset passwd using css tagname.classname
		
		System.out.println(driver.findElement(By.cssSelector("input.searchValues")).getText());
		
		
		
		//partial text css selector reset passwork click
		//driver.findElement(By.cssSelector("input[value*='reset']")).click();
		
		
		
		// using xpath reset password click
		driver.findElement(By.xpath("//input[@value='Reset Password']")).click();   
		
		
       // cancel near reset password using xpath
		driver.findElement(By.xpath("//input[@value='Cancel']")).click();



	}

}
