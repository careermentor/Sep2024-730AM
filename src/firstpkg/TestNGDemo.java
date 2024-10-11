package firstpkg;

import org.testng.annotations.Test;

public class TestNGDemo 
{

	@Test(groups="Smoke")
	public void meth1()
	{
		System.out.println("testing demo");
	}
	
}
