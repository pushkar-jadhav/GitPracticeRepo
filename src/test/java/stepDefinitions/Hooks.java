package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	
	TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	@After
	public void tearDown() throws IOException
	{
		testContextSetup.testBase.webDriverManager().quit();
	}
	
	@AfterStep
	public void AddScreenshotToReport(Scenario scenario) throws IOException
	{
		byte[] filecontent = testContextSetup.commonUtilityMethods.CaptureScreenshot();
		if(scenario.isFailed())
		{
			scenario.attach(filecontent, "image/png", "screenshot");
		}
	}

}
