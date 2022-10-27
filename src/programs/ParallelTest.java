package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void testing(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
			  driver.get("https://adactinhotelapp.com/");
			  driver.findElement(By.name("username")).sendKeys("Thippesh");
			  driver.findElement(By.name("password")).sendKeys("Thippesh");
			  driver.findElement(By.name("login")).click();
			 
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			
			  driver.get("https://adactinhotelapp.com/");
			  driver.findElement(By.name("username")).sendKeys("Thippesh");
			  driver.findElement(By.name("password")).sendKeys("Thippesh");
			  driver.findElement(By.name("login")).click();
			 
		}
		
		
	}
	
	
	

}
