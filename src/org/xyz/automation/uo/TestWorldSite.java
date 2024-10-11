package org.xyz.automation.uo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class TestWorldSite 
{

	@Test
	public void validate_loginfunc() throws Exception
	{
		
		
		WebDriver driver = new ChromeDriver();  //launch a chrome browser
	
		driver.get("https://thetestingworld.com/testings/"); //pass the url
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("fld_username")).sendKeys("selenium");
		
		driver.findElement(By.cssSelector("[id='datepicker']")).sendKeys("07/18/1982");
		
		driver.findElement(By.xpath("//a[text()='18']")).click();
		
		//driver.findElement(By.xpath("//label[@for='tab2']")).click();
		
		//driver.findElement(By.xpath("//div[@id='tab-content2']/form/div/input[1]")).click();
		
		
	//	/html/body/div[4]/section/ul/li[1]/div/form/input[9]
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Florida"));
		
		Thread.sleep(5000);
		
		st.selectByVisibleText("Arizona");
		
		
		

	}
}


