package TestScript;

import HelpersPackage.ReusableMethods;
import PageObjects.LoginHotel;
import PageObjects.SearchHotel;

public class Runpageobjects extends ReusableMethods  {

	public static void main(String[] args) {
		LoginHotel login=new LoginHotel();
		SearchHotel s=new SearchHotel();
		launch();
		driver.findElement(login.usernamebox).sendKeys("Thippesh");
        driver.findElement(login.passwordbox).sendKeys("Thippesh");
        driver.findElement(login.login1).click();
        
	}

}
