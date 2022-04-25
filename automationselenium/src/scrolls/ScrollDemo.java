package scrolls;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
		
		driver.get("https://www.selenium.dev/");
		//WebElement das = driver.findElement(By.xpath("//a[@class='selenium-button selenium-ide text-uppercase font-weight-bold']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		//js.executeScript("arguments[0].scrollIntoView();",das);
		//js.executeScript("window.scrollBy(0,3000)");
		//driver.findElement(By.cssSelector("i[class*='facebook']")).click();
		//js.executeScript("alert('Welcome to Selenium')");

	}

}
