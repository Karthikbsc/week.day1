package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthik");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		
		WebElement dd1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select ddw = new Select(dd1);
		ddw.selectByIndex(1);
		
		WebElement dd2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select ddw1 = new Select(dd2);
		ddw1.selectByIndex(3);
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("karthik");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("a");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("MR");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/15/2020");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("MR");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("FCSU");
		driver.findElement(By.xpath("//input[@id='createLeadForm_annualRevenue']")).sendKeys("100000");
		
		WebElement dd3 = driver.findElement(By.xpath("//select[@id='createLeadForm_currencyUomId']"));
		Select ddw2 = new Select(dd3);
		ddw2.selectByIndex(70);
		
		WebElement dd4 = driver.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']"));
		Select ddw3 = new Select(dd4);
		ddw3.selectByIndex(5);
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_numberEmployees']")).sendKeys("100");
		
		WebElement dd5 = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		Select ddw4 = new Select(dd5);
		ddw4.selectByIndex(6);
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_sicCode']")).sendKeys("*****");
		driver.findElement(By.xpath("//input[@id='createLeadForm_tickerSymbol']")).sendKeys("$$$");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Nothing");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_importantNote']")).sendKeys("Nothing");
		
		WebElement webElement = driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']"));
		webElement.clear();
		webElement.sendKeys("+91");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("78");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9987654321");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneExtension']")).sendKeys("2456");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAskForName']")).sendKeys("karthik");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("karthikbsc93@gmail.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryWebUrl']")).sendKeys("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.xpath("//input[@id='createLeadForm_generalToName']")).sendKeys("karthik");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAttnName']")).sendKeys("sathish");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress1']")).sendKeys("Color homes,pattabiram");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress2']")).sendKeys("soranjeri");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalCity']")).sendKeys("chennai");
		
		WebElement webElement2 = driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']"));
		Select ddw5 = new Select(webElement2);
		ddw5.selectByValue("IND");
		
		WebElement dd6 = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select ddw6 = new Select (dd6);
		ddw6.selectByValue("IN-TN");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("600078");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		
	}

}
