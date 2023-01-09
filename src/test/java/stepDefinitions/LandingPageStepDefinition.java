package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition {
	
	public WebDriver driver;
	public String landingProductName, offersProductName, landingPageHandle;
	TestContextSetup testContextSetup;
	LandingPage landingPage;
	
	public LandingPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
	}
	@Given("^User is on GreenCart landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
		Assert.assertEquals(landingPage.getPageTitle(), "GreenKart - veg and fruits kart");
    }
	
	@When("User searched shortname {string} and extracted actual name of the product")
	public void user_searched_shortname_and_extracted_actual_name_of_the_product(String string) throws InterruptedException {
		//LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
		landingPage.EnterSearchText(string);
		Thread.sleep(2000);
		testContextSetup.landingProductName = landingPage.getProductNameOnLandingPage();
		testContextSetup.landingPageHandle = landingPage.getLandingPageHandle();
		landingPage.ClickTopDeals();
		System.out.println(testContextSetup.landingProductName+" is extracted from Homepage");
	}
	
	
	@When("^User searched with (.+) and extracted actual name of the product$")
	public void user_searched_with_beet_and_extracted_actual_name_of_the_product(String string) throws InterruptedException {
		//LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
		landingPage.EnterSearchText(string);
		Thread.sleep(2000);
		testContextSetup.landingProductName = landingPage.getProductNameOnLandingPage();
		testContextSetup.landingPageHandle = landingPage.getLandingPageHandle();
		System.out.println(testContextSetup.landingProductName+" is extracted from Homepage");
	}
	
	@When("User added {string} items of the selected product to cart")
    public void user_added_3_items_of_the_selected_product_to_cart(String quantity) throws Throwable {
		landingPage.addQuantity(quantity);
		landingPage.addToCart();
    }
}
