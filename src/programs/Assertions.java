package programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assertions {
	@Test
	public void launch()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String w=driver.getTitle();
		String s="Google";
	}
	//Assert.assertEquals(w,s);
	

}
