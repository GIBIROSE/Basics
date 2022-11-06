
package locatorss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AxesLocators {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		//case1 axes self
		System.out.println(driver.findElement(By.xpath("//a[normalize-space()='Apar Industries']/self::a")).getText());

		
		//case 2  axes parent
		driver.findElement(By.xpath("//a[normalize-space()='Apar Industries']/parent::td")).getText();
		
		//case 3 axes child dont know child exactly
		//a[normalize-space()='Apar Industries']/child::*
		
		//case 4 child
		List<WebElement>childopt=driver.findElements(By.xpath("//a[normalize-space()='Apar Industries']/ancestor::tr/child::*"));
		System.out.println(childopt.size());
		
		//case 4 ancestor
		driver.findElement(By.xpath("//a[normalize-space()='Apar Industries']/ancestor::tr")).getText();
		
		
		//descendant means grandchildren
		driver.findElements(By.xpath("//a[normalize-space()='Apar Industries']/ancestor::tr/descendant::*"));
		
		//a[normalize-space()='Apar Industries']/ancestor::tr/following::tr
		
		//a[normalize-space()='Apar Industries']/ancestor::tr/following-sibling::tr
		
		//a[normalize-space()='Apar Industries']/ancestor::tr/preceding-sibling::*
		
	}
	
	

}
