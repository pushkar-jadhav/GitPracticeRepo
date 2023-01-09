package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}

	private By landingSearchBox_XP = By.xpath("//input[@type='search']");
	private By landingPageProduct_XP = By.xpath("//h4[@class='product-name']");
	private By topDealsLink_XP = By.xpath("//a[contains(@href,'offers')]");
	private By btnAddQuantity_XP = By.xpath("//a[@class='increment']");
	private By btnAddToCart_XP = By.xpath("//button[text()='ADD TO CART']");
	
	public void EnterSearchText(String searchText)
	{
		driver.findElement(landingSearchBox_XP).sendKeys(searchText);
	}
	
	public String getProductNameOnLandingPage()
	{
		return driver.findElement(landingPageProduct_XP).getText().split("-")[0].trim();
	}
	
	public String getLandingPageHandle()
	{
		return driver.getWindowHandle();
	}
	
	public void ClickTopDeals()
	{
		driver.findElement(topDealsLink_XP).click();
	}
	
	public void addQuantity(String qty)
	{
		int count = Integer.parseInt(qty);
		for(int i=0;i<count-1;i++)
		{
			driver.findElement(btnAddQuantity_XP).click();
		}
	}
	
	public void addToCart()
	{
		driver.findElement(btnAddToCart_XP).click();
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
}
