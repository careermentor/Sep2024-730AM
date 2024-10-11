package org.xyz.automation.uo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FirstAutomation 
{
	WebDriver driver;  //global variable
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver= new ChromeDriver();  //launch a chrome browser
		
		driver.get("https://www.facebook.com"); //pass the url
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
	

	@Test
	public void validate_loginfunc() throws Exception
	{
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("user1");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		//driver.findElement(By.id("email")).clear();
		//driver.findElement(By.id("email")).sendKeys("user2");
		
		//driver.findElement(By.name("pass")).sendKeys("pass1234");
		//driver.findElement(By.cssSelector("[type='submit']")).click();
		//driver.close();
	}
	
	@Test(enabled=false)
	public void validate_signupfunc() throws InterruptedException
	{
		
		
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		
		
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
		WebElement dob = driver.findElement(By.name("birthday_day"));
		Select dob_day = new Select(dob);
		
		//dob_day.selectByIndex(4);
		//dob_day.selectByValue("5");
		dob_day.selectByVisibleText("5");
		
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
	}
}
