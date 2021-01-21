package Selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;

	@BeforeMethod 
	public void browserAcess() {
		System.setProperty("webdriver.chrome.driver","C:\\Mounika\\softwares\\Chromedriver_win32\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		}
	
	
	@Test
	 public void verifyTitle() {
	
		String title =driver.getTitle();
		Assert.assertEquals(title, "SuiteCRM");
		System.out.println("Title of the page:" +title);
			
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	 

}
