package programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadriven {

	public static void main(String[] args) throws IOException {
		File src=new File("C:\\Users\\rn21423\\Downloads\\Book 13.xlsx");
        FileInputStream fis=new FileInputStream(src);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet s=wb.getSheetAt(0);
        int rc=s.getLastRowNum();
        System.out.println(rc);
        for(int i=0;i<=rc;i++)
        {
        String un=s.getRow(i).getCell(0).getStringCellValue();
        String pwd=s.getRow(i).getCell(1).getStringCellValue();
		
		  System.out.println(un+ " "+pwd); 
		 WebDriver driver=new ChromeDriver();
			
			  driver.manage().window().maximize();
			  driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
			  driver.findElement(By.name("username")).sendKeys(un);
			  driver.findElement(By.name("password")).sendKeys(pwd);
			  driver.findElement(By.name("login")).click();
			 
		 
	}
	}
}


