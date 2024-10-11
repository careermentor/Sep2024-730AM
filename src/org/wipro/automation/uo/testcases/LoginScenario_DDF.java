package org.wipro.automation.uo.testcases;


import org.testng.annotations.Test;
import org.wipro.automation.uo.basePkg.InitiateBrowser;
import org.wipro.automation.uo.datagenerator.TestDataGenClass;
import org.wipro.automation.uo.pages.LoginPage;


public class LoginScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="static",dataProviderClass=TestDataGenClass.class)
	public void tc001_loginvalidation_validcredentail(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
	}
	
	}
