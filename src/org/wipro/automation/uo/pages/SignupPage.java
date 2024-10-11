package org.wipro.automation.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.automation.uo.utiltiesPkg.ReadPropData;

public class SignupPage
{

	WebDriver driver;
	
	
	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void click_createnewaccountlink() throws Exception
	{
		driver.findElement(By.xpath(ReadPropData.readelement("login_createnewaccount_bttn_xpath"))).click();
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropData.readelement("signup_firstname_name"))).sendKeys(fname);
	}
	
	public void select_dob_day(String dbd) throws Exception
	{
		Select dob_d = new Select(driver.findElement(By.name(ReadPropData.readelement("signup_dob_day_name"))));
		dob_d.selectByVisibleText(dbd);
	}
	
	public void click_radiobttn_male() throws Exception
	{
		driver.findElement(By.xpath(ReadPropData.readelement("signup_gender_male_xpath"))).click();
	}
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropData.readelement("signup_signupbttn_name"))).click();
	}
}
