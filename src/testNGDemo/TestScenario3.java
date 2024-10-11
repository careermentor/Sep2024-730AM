package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario3 
{

	@Test(groups="Smoke")
	public void first_testcase()
	{
		System.out.println("this is first test case");
	}
	
	@Test(groups="Regression")
	public void second_testcase()
	{
		System.out.println("this is second test case");
	}
	
	@Test(groups={"Regression","Sanity"})
	public void third_testcase()
	{
		System.out.println("this is third test case");
		Assert.assertEquals(true, true);
	}
	
	@Test(dependsOnMethods="third_testcase")
	public void forth_testcase()
	{
		System.out.println("this is forth test case");
		
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("this is fifth test case");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("this is sixth test case");
	}
	
	@Test
	public void seventh_testcase()
	{
		System.out.println("this is seventh test case");
	}
	
	
}
