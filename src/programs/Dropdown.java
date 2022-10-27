package programs;


import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.findElement(By.name("username")).sendKeys("Thippesh");
		
		driver.findElement(By.name("password")).sendKeys("Thippesh");
		driver.findElement(By.name("login")).click();
		Select s=new Select(driver.findElement(By.name("location")));
		List<WebElement> w=s.getOptions();
		System.out.println(w.size());
		for(int i=0;i<w.size();i++)
		{
			if(w.get(i).getText().contains("Lo"))
			{
				
				System.out.println(w.get(i).getText());
			}
			/*
			 * else { System.out.println("not matched"); }
			 */
		}
	}
}

			
		
		
		
		

	


