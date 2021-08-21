package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("//h5[text()='Button']")).click();
		
		WebElement webElement = driver.findElement(By.id("position"));
		System.out.println("Position of Button (x, y) :" +webElement.getLocation());
		
		
		WebElement webElement2 = driver.findElement(By.id("color"));
		System.out.println("Find Button Color : "+webElement2.getAttribute("style"));
		
		WebElement webElement3 = driver.findElement(By.id("size"));
		System.out.println("Find the height and width : "+webElement3.getSize());
		

	}

}
