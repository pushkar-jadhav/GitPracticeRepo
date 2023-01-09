package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pages.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String landingProductName;
	public String landingPageHandle;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public CommonUtilityMethods commonUtilityMethods;
	
	public TestContextSetup() throws IOException
	{
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.webDriverManager());
		commonUtilityMethods = new CommonUtilityMethods(testBase.webDriverManager());
	}
	
	
}
