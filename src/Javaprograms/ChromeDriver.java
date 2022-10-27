package Javaprograms;

public class ChromeDriver implements WebDriver {
	public void m1()
	{
		System.out.println("interface");
	}
	public void m2()
	{
		System.out.println("override");
	}

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.m1();
driver.m2();
	}

}
