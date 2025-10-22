package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	//Validate Shoes Items
	@FindBy(xpath="//span[2][contain(text(), 'shoes')]")
	public WebElement txtShoes;
	
	//Validate Pants Items
	@FindBy(xpath="//span[2][contain(text(), 'pants')]")
	public WebElement txtPants;
		
	//Validate Shirts Items
	@FindBy(xpath="//span[2][contain(text(), 'shirts')]")
	public WebElement txtShirts;

	//Check Box Brand Adidas
	@FindBy(xpath="//input[@aria-label= 'adidas']")
	public WebElement cbxBrandAdidas;
	
	//Check Box Brand Nike
	@FindBy(xpath="//input[@aria-label= 'Nike']")
	public WebElement cbxBrandNike;
	
	//Check Box Brand Unbranded
	@FindBy(xpath="//input[@aria-label= 'Unbranded']")
	public WebElement cbxBrandUnbranded;
	

}
