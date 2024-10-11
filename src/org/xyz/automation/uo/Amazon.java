package org.xyz.automation.uo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Amazon 
{

	@Test
	public void validate_loginfunc()
	{
		
		
		WebDriver driver = new ChromeDriver();  //launch a chrome browser
	
		driver.get("https://www.amazon.com/"); //pass the url
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		driver.findElement(By.id("twotabsearchtextbox")).submit();
		
	}
}


