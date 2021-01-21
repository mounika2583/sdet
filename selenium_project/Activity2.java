package Selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Activity2 {

	WebDriver driver;

	@BeforeMethod 
	public void browserAcess() {
		System.setProperty("webdriver.chrome.driver","C:\\Mounika\\softwares\\Chromedriver_win32\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/crm/");

	}
	
	@Test
	public void headerImage() {
		
		//identify the image
		WebElement image = driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
		System.out.println("Image URL is:" +image.getAttribute("src"));
	    
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
