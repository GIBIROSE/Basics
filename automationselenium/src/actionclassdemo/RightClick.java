package actionclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick {
	@Test
	public void demoRightClick() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Binu\\Desktop\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(2000);
		Actions act = new Actions(driver);

		WebElement right = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		act.contextClick(right).build().perform();

		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-paste']"))
				.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();//close alert box paste
		
	}

}
