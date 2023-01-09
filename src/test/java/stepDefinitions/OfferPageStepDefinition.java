package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OffersPage;
import utils.TestContextSetup;

public class OfferPageStepDefinition {

	public String offersProductName;
	TestContextSetup testContextSetup;
	OffersPage offerPage;
	public OfferPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.offerPage = testContextSetup.pageObjectManager.getOffersPage();
	}

	@When("User searched shortname {string} in offers page")
	public void user_searched_for_shortname_in_offers_page(String string) throws InterruptedException {
		//OffersPage offerPage = testContextSetup.pageObjectManager.getOffersPage();
		testContextSetup.commonUtilityMethods.switchToWindow(testContextSetup.landingPageHandle);
		
		offerPage.EnterSearchText(string);
		Thread.sleep(2000);
		offersProductName = offerPage.getProductNameOnOfferPage();
		System.out.println(offersProductName+" is extracted from Offers page");
	}
	
	@Then("check if product matches with landing page")
	public void check_if_product_matches_with_landing_page(){

		Assert.assertEquals(offersProductName, testContextSetup.landingProductName);
	}
	
	
	@When("^User searched for (.+) in offers page$")
	public void user_searched_for_beet_in_offers_page(String string) throws InterruptedException {
		//OffersPage offerPage = testContextSetup.pageObjectManager.getOffersPage();
		testContextSetup.commonUtilityMethods.switchToWindow(testContextSetup.landingPageHandle);
		
		offerPage.EnterSearchText(string);
		Thread.sleep(2000);
		offersProductName = offerPage.getProductNameOnOfferPage();
		System.out.println(offersProductName+" is extracted from Offers page");
	}
}
