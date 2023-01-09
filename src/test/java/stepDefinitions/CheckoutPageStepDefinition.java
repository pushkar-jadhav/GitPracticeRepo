package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pages.CheckoutPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefinition {
	
	public WebDriver driver;
	public String landingProductName, offersProductName, landingPageHandle;
	TestContextSetup testContextSetup;
	CheckoutPage checkoutPage;
	
	public CheckoutPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.checkoutPage= testContextSetup.pageObjectManager.getcheckoutPage();
	}
	
	@Then("^User proceeds to checkout and validate the (.+) items in checkout page$")
    public void user_proceeds_to_checkout_and_validate_the_items_in_checkout_page(String name) throws Throwable {
	 
	 checkoutPage.proceedToCheckout();
	 //verify name in table to be completed
 }
 
    @Then("^verify user hass ability  to ener promo code and place the order$")
    public void verify_user_hass_ability_to_ener_promo_code_and_place_the_order() throws Throwable {
    	Assert.assertTrue(checkoutPage.verifyPromoButton());
		 Assert.assertTrue(checkoutPage.verifyPlaceOrderButton());
    }
	
}
