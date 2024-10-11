package org.wipro.automation.uo.utiltiesPkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreens 
{
	public static void takeresults(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;  //prt sc
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./TestResultsOutput/" + name + ".png");
		
		FileUtils.copyFile(f, fd);
	}
	
}
