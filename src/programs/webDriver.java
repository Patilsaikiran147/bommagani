package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webDriver {

	@Test
	public void launch()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp/");
		 driver.findElement(By.name("username")).sendKeys("Thippes");
		  driver.findElement(By.name("password")).sendKeys("Thipesh");
		  driver.findElement(By.name("login")).click();
		
		
	
	}
	@Test
	public void app()
	{
		System.out.println("application");
	}
	@Test(dependsOnMethods="launch")
	public void hello()
	{
		System.out.println("Helloone");
	}
	@Test(priority=2)
	public void good()
	{
		System.out.println("Good Mor");
	}
	

}
