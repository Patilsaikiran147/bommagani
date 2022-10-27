package HelpersPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReusableMethods {
	public static WebDriver driver;
	public static void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		

	}
	public void close()
	{
		driver.close();
	}

}

