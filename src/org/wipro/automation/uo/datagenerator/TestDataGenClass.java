package org.wipro.automation.uo.datagenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenClass 
{

	@DataProvider(name="static")
	public Object[][] testdata()
	{
		//String data = "user1";
		//Object[] data1 = {"user1","pass1"};  //1-D array
		Object[][] data2 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		return data2;
	}
	

	@DataProvider(name="static1")
	public Object[][] testdata1()
	{
		//String data = "user1";
		//Object[] data1 = {"user1","pass1"};  //1-D array
		Object[][] data2 = {{"fname1","10"},{"fname2","11"},{"fname3","12"}};
		return data2;
	}
	
}
