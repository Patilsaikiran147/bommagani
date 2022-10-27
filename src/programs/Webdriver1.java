package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Webdriver1 {
	WebDriver driver;
	@BeforeSuite
	public void lanuch()
	{
		 driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
	}
	@AfterSuite
	/*
	 * public void Closeb() { driver.close(); }
	 */
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("Thippesh");
		driver.findElement(By.name("password")).sendKeys("Thippesh");
		driver.findElement(By.name("login")).click();
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.linkText("Logout"));
	}
	@Test
	public void searchHotel()
	{
		Select  s=new Select(driver.findElement(By.name("location")));
		s.selectByVisibleText("London");
		Select  s1=new Select(driver.findElement(By.name("hotels")));
		s1.selectByVisibleText("Hotel Sunshine");
		Select  s2=new Select(driver.findElement(By.name("room_type")));
		s2.selectByVisibleText("Double");
		Select  s3=new Select(driver.findElement(By.name("room_nos")));
		s3.selectByIndex(2);
		driver.findElement(By.name("datepick_in")).clear();
		driver.findElement(By.name("datepick_in")).sendKeys("29-07-2022");
		driver.findElement(By.name("datepick_out")).clear();
		driver.findElement(By.name("datepick_out")).sendKeys("30-07-2022");
		Select  s4=new Select(driver.findElement(By.name("adult_room")));
		s4.selectByIndex(1);
		Select  s5=new Select(driver.findElement(By.name("child_room")));
		s5.selectByIndex(2);
		driver.findElement(By.name("Submit")).click();
	}
	
	}


