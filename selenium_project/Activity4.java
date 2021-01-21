package Selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4  {
	WebDriver driver;

	@BeforeMethod 
	public void browserAcess() {
		System.setProperty("webdriver.chrome.driver","C:\\Mounika\\softwares\\Chromedriver_win32\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		

	}
	
	@Test
	 public void verifyCredentials()  {
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		driver.manage().window().maximize();
		Assert.assertTrue(driver.findElement(By.xpath("//a[@id='tab0']")).isDisplayed()," User failed to enter SuitCRM website");
			
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	 

}
