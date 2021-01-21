package Selenium_project;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Activity6 {
	WebDriver driver;
	//WebDriverWait wait = new WebDriverWait(driver,30);

	@BeforeMethod 
	public void browserAcess() {
		System.setProperty("webdriver.chrome.driver","C:\\Mounika\\softwares\\Chromedriver_win32\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		
		

	}
	
	@Test
	 public void verifyActivityMenu() {
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		driver.manage().window().maximize();
		
	
	   	   List<WebElement> navbar = driver.findElements(By.cssSelector("div > ul > li >span >a"));
           
	   	   for(WebElement menu : navbar) {
	   		  
        	   if(menu.getAttribute("innerHTML").contains("Activities")) {
        		   
        		   System.out.println(menu.getAttribute("innerHTML") + "  element  is present is Navigation bar");
        	   }
	   	     
		   } 
	}
	   	 
	   	   
		  
	 

 @AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
}
	
