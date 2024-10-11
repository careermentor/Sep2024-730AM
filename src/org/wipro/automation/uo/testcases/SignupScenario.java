package org.wipro.automation.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.uo.basePkg.InitiateBrowser;
import org.wipro.automation.uo.pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{

	@Test
	public void tc002_signupvalidation_validcredentail() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_createnewaccountlink();
		sign.enter_firstname("selenium");
		sign.select_dob_day("12");
		sign.click_radiobttn_male();
		sign.click_signupbttn();
		
	}
	
}
