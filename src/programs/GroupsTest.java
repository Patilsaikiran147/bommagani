package programs;

import org.testng.annotations.Test;

public class GroupsTest {
	@Test(groups="smoke")
	public void testone()
	{
		System.out.println("one");
	}
	@Test
	public void testtwo()
	{
		System.out.println("two");
	}
	@Test(groups="sanity")
	public void testthree()
	{
		System.out.println("three");
	}
	@Test
	public void testfour()
	{
		System.out.println("four");
	}

}
