package upskill.ebay.stepDef;

import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import upskill.ebay.pageAction.EbayHomePageActions;
import upskill.utilities.SetupDrivers;

public class EbayHomePageSteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	
	@Given("Open Ebay Homepage")
	public void open_ebay_homepage() throws Throwable {

	}
	
	@When("Search for shoes")
	public void search_for_shoes() throws Throwable {	    
	    EbayHomePageActionsObj.searchShoes();
	}
	
	@When("Search for Pants")
	public void search_for_pants() throws Throwable {	    
	    EbayHomePageActionsObj.searchPants();
	}
	
	@When("Search for Shirts")
	public void search_for_shirts() throws Throwable {	    
	    EbayHomePageActionsObj.searchShirts();
	}
	
	@Given("Search for {string}")
	public void search_for(String string) {
		EbayHomePageActionsObj.searchItems(string);
	    
	}
	
	@When("Mouse Hover to MyEbay Summary")
	public void mouse_hover_to_my_ebay_summary() throws InterruptedException {
		EbayHomePageActionsObj.mouseHoverMyEbay();
		
	}

	@Then("Click on Summary")
	public void click_on_summary() throws InterruptedException {
		EbayHomePageActionsObj.clickSummary();
	}

	@When("Mouse Hover to Hover Over Me")
	public void mouse_hover_to_hover_over_me() {
	    
	}

	@Then("Click on Link")
	public void click_on_link() {
	    
	}
	

}
