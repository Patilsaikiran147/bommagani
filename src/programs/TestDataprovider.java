package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataprovider {
	@Test(dataProvider="login", invocationCount=3)
	public void open(String un, String pwd)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
	}

	@DataProvider(name="login")
	public Object[][] logindata()
	{
	Object[][] data= {{"Thippesh","Thippesh"},{"tulasidevi","tulasidevi"}};
	return data;

}
}
