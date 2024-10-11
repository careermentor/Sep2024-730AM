package org.xyz.automation.uo;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import oopsConcepts.DemoStaticKeyword;


public class FetchDataCompare 
{

	@Test
	public void validate_loginfunc()
	{
		
		
		WebDriver driver = new ChromeDriver();  //launch a chrome browser
	
		//step1
		
		String expURL = "https://thetestingworld.com/testings/";
		
		driver.get(expURL); //pass the url
		
		String actURL = driver.getCurrentUrl();;
		System.out.println(actURL);
		
		
		
		Assert.assertEquals(actURL, expURL); //hard assertion
		
		
		
		
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actURL, expURL);
		
		System.out.println("step 1 get failed");
		
		//step2
		String expTitle= "Login & Sign Up Forms";
		
		String actTItle = driver.getTitle();
		System.out.println(actTItle);
		
		sa.assertEquals(actTItle, expTitle, "This title is not matching");	//fail
		
		String extvalue_fldusername= "myusername";
		
		String actvalue_fldusername = driver.findElement(By.name("fld_username")).getAttribute("placeholder");
		System.out.println(actvalue_fldusername);
		
		sa.assertEquals(actvalue_fldusername, extvalue_fldusername);
		
		String expReadDetails = "Read Detail";
		
		String actReadDetails= driver.findElement(By.className("displayPopup")).getText();
		System.out.println(actReadDetails);
		
		Assert.assertEquals(actReadDetails, expReadDetails);
		
		Point abc = driver.findElement(By.name("fld_username")).getLocation();
		System.out.println(abc);
		
		//System.out.println(driver.getPageSource());
		
		boolean signupbttn = driver.findElement(By.cssSelector("[type='submit']")).isEnabled();
		System.out.println(signupbttn);
		Assert.assertEquals(signupbttn, true);
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());
		
		driver.close();
		
		sa.assertAll();
		
	}
	
	
	
	
	
}


