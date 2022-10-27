package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepGenerator {

	public static WebDriver driver;
	@Given("^Open adactin page$")
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
	}
	@When("^Enter username$")
	public void un()
	{
		driver.findElement(By.name("username")).sendKeys("Thippesh");
	}
	@When("^Enter password$")
	public void pwd()
	{
		driver.findElement(By.name("password")).sendKeys("Thippesh");
	}
	@When("^Click on login button$")
	public void login()
	{
		driver.findElement(By.name("login")).click();
	}
	@Then("^Open Adactin home page$")
	public void open()
	{
	
	}
	
		

	}


