package programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesPro {

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream fi=new FileInputStream("C:\\Users\\rn21423\\eclipse-workspace\\Java\\configure.properties");
		prop.load(fi);
		System.out.println(prop.getProperty("username"));
		WebDriver d=new ChromeDriver();
		d.get(prop.getProperty("Url"));
		d.findElement(By.name(prop.getProperty("name"))).sendKeys("username");
		d.findElement(By.name(prop.getProperty("pass"))).sendKeys("password");
		d.findElement(By.name(prop.getProperty("login"))).sendKeys("login");
				

	}

}
