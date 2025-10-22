package upskill.ebay.stepDef;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import upskill.ebay.pageAction.EbaySearchResultActions;


public class EbaySearchResultSteps {
	
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	
	
	@Then("Item list should have only shoes related products")
	public void item_list_should_have_only_shoes_related_products() throws InterruptedException {
		Thread.sleep(2000);
		EbaySearchResultActionsObj.verifyShoesItems();
	}
	@Then("Item list should have only Pants related products")
	public void item_list_should_have_only_pants_related_products() throws InterruptedException {
		Thread.sleep(2000);
		EbaySearchResultActionsObj.verifyPantsItems();
	}
	@Then("Item list should have only Shirts related products")
	public void item_list_should_have_only_shirts_related_products() throws InterruptedException {
		Thread.sleep(2000);
		EbaySearchResultActionsObj.verifyShirtsItems();
	}
	
	@When("Filter by {string}")
	public void filter_by(String brand) throws InterruptedException {
		Thread.sleep(2000);
		EbaySearchResultActionsObj.filterBrand(brand);
	}
	
	@Then("Item list should have products of {string}")
	public void item_list_should_have_products_of(String brand) throws InterruptedException {
		Thread.sleep(2000);
		EbaySearchResultActionsObj.verifyBrandItems(brand);
	    
	}
	

}
