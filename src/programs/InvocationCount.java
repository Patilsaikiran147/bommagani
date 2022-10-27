package programs;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(threadPoolSize=2, invocationCount=10, timeOut=5000)
	public void invoke()
	{
		System.out.println("Display");
	}

}
