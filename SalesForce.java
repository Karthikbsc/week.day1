package week2.day1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("karthik");
		driver.findElement(By.name("UserLastName")).sendKeys("A");
		driver.findElement(By.name("UserEmail")).sendKeys("ka@gmail.com");
		
		WebElement dw = driver.findElement(By.name("UserTitle"));
		Select dp = new Select(dw);
		dp.selectByValue("Student / Personal Interest");
		
		driver.findElement(By.name("CompanyName")).sendKeys("TCS");
		
		WebElement dw1 = driver.findElement(By.name("CompanyEmployees"));
		Select dp1 = new Select(dw1);
		dp1.selectByValue("1600");
		
		driver.findElement(By.name("UserPhone")).sendKeys("998765432");
		
		WebElement dw2 = driver.findElement(By.name("CompanyCountry"));
		Select dp2 = new Select(dw2);
		dp2.selectByValue("IN");
		
		driver.findElement(By.className("checkbox-ui")).click();
		
		String currentUrl = driver.getCurrentUrl();
		String url = "https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk";
		
		if(url.equals(currentUrl))
		System.out.println("Test Pass");
		else 
		System.out.println("Test Fail");
			
		driver.close();
	}	
	}
	
