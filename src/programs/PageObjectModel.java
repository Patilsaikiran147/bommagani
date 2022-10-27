package programs;

import org.openqa.selenium.WebDriver;

public class PageObjectModel {

	public static WebDriver driver;
	public void launch()
	{
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		

	}
	public void close()
	{
		driver.close();
	}

}
