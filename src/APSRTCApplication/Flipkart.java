package APSRTCApplication;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Flipkart {
	WebDriver driver=new ChromeDriver();
@BeforeSuite
public void launch()
{
	driver.manage().deleteAllCookies();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
}
@Test
public void search() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("t shirts");
	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String s=driver.getWindowHandle();
	//driver.switchTo().window(s);
	System.out.println(s);
	js.executeScript("window.scrollBy(0,1000)");
	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[4]/div/div[1]/div/a")).click();
	Thread.sleep(3000);
	driver.switchTo().window("CDwindow-188CB09F9BEBA52BE172BDB225DD3DDB");
	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("laptops");

//	Set<String> windowHandles = driver.getWindowHandles();
//
//	for(String k:windowHandles)
//	{
//		if(!k.equals(s))
//		{
//			System.out.println(k);
//			Thread.sleep(3000);
//			//driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[4]/div[1]/div[2]/div/div/div/div[2]/span")).click();
//			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("laptops");
//		}
//	}
	
}
@AfterSuite
public void clos()
{
	//driver.close();
}
	

}
