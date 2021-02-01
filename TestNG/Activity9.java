package Testng_sessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Activity9 {
	WebDriver driver;
	
	@BeforeTest
	public void browserAcess() {
		System.setProperty("webdriver.chrome.driver","C:\\Mounika\\softwares\\Chromedriver_win32\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("  https://www.training-support.net/selenium/javascript-alerts");
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Alert Test Has been started");
		driver.switchTo().defaultContent();
	}
	
	@Test(priority=1)
	public void simpleAlertTestCase() {
		try {
		driver.findElement(By.id("simple")).click();;
	    Alert simple=driver.switchTo().alert();
		String alerttext = simple.getText();
		System.out.println("Alert text is " +alerttext+"!");
		Assert.assertEquals("This is a JavaScript Alert!",alerttext);
		simple.accept();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	@Test(priority=2)
	public void confirmAlertTestCase() {
		try {
		   Reporter.log(" click on confirmation alert");
	       driver.findElement(By.id("confirm")).click();;
		   Alert confirm=driver.switchTo().alert();
		   String alerttext = confirm.getText();
		    System.out.println("Alert text is " +alerttext+"!");
			Assert.assertEquals("This is a JavaScript Confirmation!",alerttext);
			 confirm.accept();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
				
		
	}
	
	@Test(priority=3)
	public void promptAlertTestCase() {
		try {
				driver.findElement(By.id("prompt")).click();
			    Alert prompt=driver.switchTo().alert();
			    String alerttext = prompt.getText();
				System.out.println("Alert text is " +alerttext+"!");
				Assert.assertEquals("This is a JavaScript Prompt!",alerttext);
				prompt.sendKeys("This is prompt alert");
				prompt.accept();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
				
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

   
  
}
