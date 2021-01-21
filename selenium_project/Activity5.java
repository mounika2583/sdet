package Selenium_project;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
	WebDriver driver;

	@BeforeMethod 
	public void browserAcess() {
		System.setProperty("webdriver.chrome.driver","C:\\Mounika\\softwares\\Chromedriver_win32\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		driver.manage().window().maximize();
		

	}
	
	@Test
	 public void navigationColor() {
		
	    String navigation=	driver.findElement(By.xpath("//nav[@role='navigation']//div[@class='container-fluid']")).getCssValue("color");
	    System.out.println("Color of navigation Bar:" +navigation);
		Assert.assertEquals(navigation,"rgba(83, 77, 100, 1)" );
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
}