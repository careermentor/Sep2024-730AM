package org.wipro.automation.uo.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.wipro.automation.uo.basePkg.InitiateBrowser;
import org.wipro.automation.uo.pages.LoginPage;
import org.wipro.automation.uo.utiltiesPkg.ReadPropData;
import org.xyz.automation.uo.CaptureScreens;

public class LoginScenario extends InitiateBrowser
{

	@Test
	public void tc001_loginvalidation_validcredentail() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(ReadPropData.readconfig("username"));
		login.enter_password(ReadPropData.readconfig("password"));
		login.click_loginbttn();
		
		String ExpHomePage = "Facebook";
		String ActHomePage = driver.getTitle();
		
		Assert.assertEquals(ActHomePage, ExpHomePage);
		
		CaptureScreens.takeresults(driver, "tc001_loginvalidation_validcredentail");
		
		//driver.findElement(By.id("email")).sendKeys("user1");
		
	}
	
}
