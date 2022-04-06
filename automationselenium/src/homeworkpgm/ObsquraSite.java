package homeworkpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ObsquraSite {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniums\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@href='simple-form-demo.php']")).click();

		// 1.simple form demo
		driver.findElement(By.xpath("//input[@placeholder='Message']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Message']")).sendKeys("happy");
		driver.findElement(By.cssSelector("button#button-one")).click();// click show message
		//System.out.println(driver.findElement(By.cssSelector("button#button-one")).getText());// message show
		System.out.println(driver.findElement(By.cssSelector("div.my-2")).getText());// your message css tag.class

		driver.findElement(By.xpath("//input[@id='value-a']")).click();
		driver.findElement(By.xpath("//input[@id='value-a']")).sendKeys("12");
		driver.findElement(By.id("value-b")).click();
		driver.findElement(By.id("value-b")).sendKeys("20");
		driver.findElement(By.xpath("//button[@id='button-two']")).click();// click total
		System.out.println(driver.findElement(By.cssSelector("div#message-two")).getText());// show sum output

		// 2.checkbox demo
		driver.findElement(By.xpath("//a[@href='check-box-demo.php']")).click();// checkbox demo click
		// single check box
		driver.findElement(By.cssSelector("label[for*='grid']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#message-one")).getText());
		// multiple check box

		driver.findElement(By.cssSelector("input#button-two")).click();// select all
		
		System.out.println("Number of check boxes in CheckBoxDemo page: "
				+ driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		// 3. radio buttons select
		driver.findElement(By.xpath("//a[@href='radio-button-demo.php']")).click();
		driver.findElement(By.cssSelector("input#inlineRadio1")).click();// male click
		driver.findElement(By.id("button-one")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='message-one']")).getText());

		// group radio buttons select
		driver.findElement(By.xpath("//input[@id='inlineRadio11']")).click();
		driver.findElement(By.xpath("//input[@id='inlineRadio22']")).click();// age group
		driver.findElement(By.cssSelector("button#button-two")).click();// get results
		// show message
		System.out.println(driver.findElement(By.xpath("//div[@id='message-two']")).getText());

		System.out.println("Number of check boxes in RadioButtonDemo page: "
				+ driver.findElements(By.xpath("//input[@type='radio']")).size());

		// 4.select input dropdown colours
		// select single colour from dropdown
		driver.findElement(By.xpath("//a[@href='select-input.php']")).click();
		WebElement sdrop = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select dropdown = new Select(sdrop);
		dropdown.selectByValue("Red");
		System.out.println(driver.findElement(By.xpath("//div[@id='message-one']")).getText());

		// mulltiple colours select
		WebElement sdrop1 = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select dropdown1 = new Select(sdrop1);
		dropdown1.selectByValue("Green");
		driver.findElement(By.xpath("//button[@id='button-first']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='message-two']")).getText());

		//5. form submit
		driver.findElement(By.xpath("//a[@href='form-submit.php']")).click();
		driver.findElement(By.xpath("//input[@id='validationCustom01']")).click();
		driver.findElement(By.xpath("//input[@id='validationCustom01']")).sendKeys("Diya");

		driver.findElement(By.xpath("//input[@id='validationCustom02']")).click();
		driver.findElement(By.xpath("//input[@id='validationCustom02']")).sendKeys("Agarwal");

		driver.findElement(By.cssSelector("input[id='validationCustomUsername']")).click();
		driver.findElement(By.cssSelector("input[id='validationCustomUsername']")).sendKeys("diya123");

		driver.findElement(By.xpath("//input[@placeholder='City']")).click();
		driver.findElement(By.xpath("//input[@placeholder='City']")).sendKeys("Trivandrum");

		driver.findElement(By.xpath("//input[@placeholder='State']")).click();
		driver.findElement(By.xpath("//input[@placeholder='State']")).sendKeys("Kerala");

		driver.findElement(By.xpath("//input[@id='validationCustom05']")).click();
		driver.findElement(By.xpath("//input[@id='validationCustom05']")).sendKeys("689678");// pincode

		driver.findElement(By.xpath("//input[@id='invalidCheck']")).click();// acceptance button click

		driver.findElement(By.xpath("//button[@type='submit']")).click();// submit click

		// submit message
		System.out.println(driver.findElement(By.xpath("//div[@id='message-one']")).getText());
		driver.close();

	}

}
