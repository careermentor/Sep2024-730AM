package org.xyz.automation.uo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class HandleBrowser 
{

	@Test
	public void browserhandle() throws Exception
	{
		WebDriver driver = new ChromeDriver();  //launch a chrome browser
		
		driver.get("https://www.facebook.com"); //pass the url
		
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.close();
		//driver.quit();
		
	}
}
