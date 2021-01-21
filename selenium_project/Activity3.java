package Selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {

	WebDriver driver;

	@BeforeMethod 
	public void browserAcess() {
		System.setProperty("webdriver.chrome.driver","C:\\Mounika\\softwares\\Chromedriver_win32\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/crm/");
	}
	
	@Test
	public void copyRightText() {
		 String copyriextght=driver.findElement(By.xpath("//a[@id='admin_options']")).getText();
		 System.out.println("Copy Right text for CRM is:" +copyriextght);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
