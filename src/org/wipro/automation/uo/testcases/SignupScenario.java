package org.wipro.automation.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.uo.basePkg.InitiateBrowser;
import org.wipro.automation.uo.datagenerator.TestDataGenClass;
import org.wipro.automation.uo.pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{

	@Test(dataProvider="static1",dataProviderClass=TestDataGenClass.class)
	public void tc002_signupvalidation_validcredentail(String firstname, String dob_d ) throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_createnewaccountlink();
		sign.enter_firstname(firstname);
		sign.select_dob_day(dob_d);
		sign.click_radiobttn_male();
		sign.click_signupbttn();
		
	}
	
}
