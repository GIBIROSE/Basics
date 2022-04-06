package actionclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop {
	@Test
	public void demoDragDrop() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Binu\\Desktop\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/drag-drop.php");

		WebElement source1 = driver.findElement(By.xpath("//span[@draggable='true'][1]"));
		//WebElement source1 = driver.findElement(By.xpath("//span[normalize-space()='Draggable n°1']"));
		
		
		// WebElement
		// source2=driver.findElement(By.xpath("//span[@draggable='true'][2]"));
		// WebElement
		// source3=driver.findElement(By.xpath("//span[@draggable='true'][3]"));
		// WebElement
		// source4=driver.findElement(By.xpath("//span[@draggable='true'][4]"));

		WebElement destination = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(source1).moveToElement(destination).release().build().perform();
		//act.dragAndDrop(source1, destination).build().perform();
	
		
		
	}

}
