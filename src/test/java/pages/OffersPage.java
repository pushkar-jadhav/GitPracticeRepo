package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

	public WebDriver driver;
	
	public OffersPage(WebDriver driver)
	{
		this.driver=driver;
	}
	

	private By offersSearchBox_XP = By.xpath("//input[@id='search-field']");
	private By tblOffersProduct_XP = By.xpath("//table//tr/td[1]");
	
	public void EnterSearchText(String searchText)
	{
		driver.findElement(offersSearchBox_XP).sendKeys(searchText);
	}
	
	public String getProductNameOnOfferPage()
	{
		return driver.findElement(tblOffersProduct_XP).getText().trim();
	}
}
