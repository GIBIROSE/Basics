package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[@href='#Tabbed']/self::a")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']/parent::a")).click();

		Set <String> s = driver.getWindowHandles();
		for (String i : s) {
			System.out.println(i);
			
		
			
		}

	}

}
