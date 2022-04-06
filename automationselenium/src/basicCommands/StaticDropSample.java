package basicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		
		WebElement sdrop = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select dropdown = new Select(sdrop);
		dropdown.selectByValue("Red");
		System.out.println(driver.findElement(By.xpath("//div[@id='message-one']")).getText());


	}

}
