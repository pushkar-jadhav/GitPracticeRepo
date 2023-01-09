package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	public WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}

	private By checkoutCart_XP = By.xpath("//img[@alt='Cart']");
	private By btnProceedToCheckout_XP = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	private By btnApplyPromo_XP = By.xpath("//button[text()='Apply']");
	private By btnPlaceOrder_XP = By.xpath("//button[text()='Place Order']");
	//private By tblProductCart_XP = By.xpath("//table[@id='productCartTables']//tr/td[2]/p[@class='product-name']");

	
	
	public void proceedToCheckout() throws InterruptedException
	{
		driver.findElement(checkoutCart_XP).click();
		driver.findElement(btnProceedToCheckout_XP).click();
		Thread.sleep(2000);
	}
	
//	public String getProductNameOnLandingPage()
//	{
//		return driver.findElement(landingPageProduct_XP).getText().split("-")[0].trim();
//	}
	
	public boolean verifyPromoButton()
	{
		return driver.findElement(btnApplyPromo_XP).isDisplayed();
	}
	
	public boolean verifyPlaceOrderButton()
	{
		return driver.findElement(btnPlaceOrder_XP).isDisplayed();
	}
}
