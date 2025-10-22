package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePageLocators {
	
	//Search Text Box
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txtbxSearch;
	
	//Search Button
	@FindBy(xpath="//button[@value='Search']")
	public WebElement btnSearch;
	
	//My eBay Link
	@FindBy(xpath="//span[contains(text(),'My eBay')]")
	public WebElement linkMyEbay;
	
	//Summary
	@FindBy(xpath="//a[contains(text(),'Summary')]")
	public WebElement linkSummary;
}
