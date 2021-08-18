package week2.day1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Karthik");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("ka93@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("ka93@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123#21");
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day1 = new Select(day);
		day1.selectByValue("24");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month1 = new Select(month);
		month1.selectByValue("10");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year1 = new Select(year);
		year1.selectByValue("2000");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		String url = driver.getCurrentUrl();
		System.out.println("Current Url :"+url);
		String url1 = "https://en-gb.facebook.com/";
 
		if(url.equals(url1))
			System.out.println("Test successfull");
 
 else
 
	 		System.out.println("Test Fail");
	 
 }
		
		
	}

