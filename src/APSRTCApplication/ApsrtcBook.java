package APSRTCApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ApsrtcBook {
	WebDriver driver=new FirefoxDriver();
	//driver.manage().timeOuts().implicitlyWait(10,TimeUinit.SECONDS);

	@BeforeMethod
	public void launch()
	{
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();

	}
	@Test
	public void home()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		driver.findElement(By.name("source")).sendKeys("Hyderabad");
		driver.findElement(By.name("destination")).sendKeys("Kavali");
		driver.findElement(By.xpath("/html/body/div[4]/div/form/div[1]/div/div[1]/input[7]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/table/tbody/tr[2]/td[3]/a")).click();
		driver.findElement(By.name("/html/body/div[4]/div/form/div[1]/div/div[1]/input[9]")).click();
	}
	@AfterMethod
	public void close()
	{
		//driver.close();
	}

}


