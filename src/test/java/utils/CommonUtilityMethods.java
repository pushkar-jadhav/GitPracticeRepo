package utils;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CommonUtilityMethods {
	
	public WebDriver driver;
	
	public CommonUtilityMethods(WebDriver driver)
	{
		this.driver=driver;
	}

	public void switchToWindow(String parentWindow)
	{
		Set<String> windowHandles = driver.getWindowHandles();
		for(String s:windowHandles)
		{
			if(!s.equals(parentWindow))
			{
				driver.switchTo().window(s);
			}
		}
	}
	
	public byte[] CaptureScreenshot() throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] filecontent = FileUtils.readFileToByteArray(source);
		return filecontent;
	}
}
