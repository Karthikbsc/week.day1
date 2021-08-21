package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("email")).sendKeys("ka@gmail.com");
		driver.findElement(By.xpath("//input[@value=\"Append \"]")).sendKeys("Done \t");
		
		WebElement webElement = driver.findElement(By.xpath("//input[@value=\"TestLeaf\"]"));
		System.out.println("Default text : "+webElement.getAttribute("value"));
		
		WebElement webElement2 = driver.findElement(By.xpath("//input[@value=\"Clear me!!\"]"));
		webElement2.clear();
		webElement2.sendKeys("Done");
		
		WebElement webElement3 = driver.findElement(By.xpath("//input[@disabled=\"true\"]"));
		boolean enabled = webElement3.isEnabled();
		
		if(enabled)
			System.out.println("Text Box is Enabled");
		else
			System.out.println("Text Box is Disabled");
	
	}

}
