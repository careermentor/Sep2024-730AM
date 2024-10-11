package org.wipro.automation.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.uo.basePkg.InitiateBrowser;
import org.wipro.automation.uo.pages.LoginPage;

public class LoginScenario extends InitiateBrowser
{

	@Test
	public void tc001_loginvalidation_validcredentail() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username("user1");
		login.enter_password("pass1234");
		login.click_loginbttn();
		
	}
	
}
