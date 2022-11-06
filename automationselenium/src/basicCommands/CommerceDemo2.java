package basicCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommerceDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin-demo.nopcommerce.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement u_name = driver.findElement(By.id("Email"));
		u_name.click();
		u_name.clear();
		u_name.sendKeys("admin@yourstore.com");

		WebElement u_pwd = driver.findElement(By.id("Password"));
		u_pwd.click();
		u_pwd.clear();
		u_pwd.sendKeys("admin");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
