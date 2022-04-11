package homeworkpgm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();// maximize window
		driver.findElement(By.id("txtUsername")).click();// clicking on username box
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");// entering username
		driver.findElement(By.name("txtPassword")).click();// clicking password textbox
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");// entering password
		driver.findElement(By.id("btnLogin")).click();// login

		driver.findElement(By.id("MP_link")).click();// marketplace click

		driver.findElement(By.id("title")).click();// LDAP click

		driver.findElement(By.id("buyBtn1")).click();// Request click
		Thread.sleep(3000);

		driver.findElement(By.id("email")).click();// email click

		driver.findElement(By.id("email")).sendKeys("gibi@gmail.com");

		driver.findElement(By.name("contactNumber")).click();// contact num click
		driver.findElement(By.name("contactNumber")).sendKeys("123456");

		driver.findElement(By.name("organization")).click();// organization click
		driver.findElement(By.name("organization")).sendKeys("company1");

		driver.findElement(By.id("modal_confirm_buy")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("welcome")).click();// welcome click
		
		//giving implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
	}

}
