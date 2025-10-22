package upskill.ebay.pageAction;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayHomePageLocators;
import upskill.ebay.pageElements.UpskillPracticeLocators;
import upskill.utilities.SetupDrivers;

public class UpskillPracticeActions {
	
	UpskillPracticeLocators UpskillPracticeLocatorsObj;
	
	public UpskillPracticeActions() {
		UpskillPracticeLocatorsObj = new UpskillPracticeLocators();
		PageFactory.initElements(SetupDrivers.driver, UpskillPracticeLocatorsObj);
	
	}

		public void openAutomationPracticePage() throws InterruptedException{
			SetupDrivers.driver.get("https://www.upskillconsultancy.com/automation-practice");
			Thread.sleep(5000);
		}
		
		public void switchIframe() throws InterruptedException{
			SetupDrivers.driver.switchTo().frame("htmlComp-iframe");
			//Thread.sleep(5000);
		}
		
		public void mousehover() throws InterruptedException{
			Actions actions = new Actions(SetupDrivers.driver);
			actions.moveToElement(UpskillPracticeLocatorsObj.btnHoverOverMe);
			actions.perform();
			Thread.sleep(5000);
		}
		
		public void clickLink() throws InterruptedException{
			UpskillPracticeLocatorsObj.linkClickHere.isEnabled();
			UpskillPracticeLocatorsObj.linkClickHere.click();
			Thread.sleep(5000);
		}
		
		public void selectDropdown() throws InterruptedException{
			Select dropDown = new Select(UpskillPracticeLocatorsObj.drpdwnSelectOption);
			dropDown.selectByVisibleText("Option 2");
			Thread.sleep(5000);
			dropDown.selectByIndex(1);
			Thread.sleep(5000);
			dropDown.selectByValue("3");
			Thread.sleep(5000);

		}
		
		public void verifyOptionSelected(){
			UpskillPracticeLocatorsObj.drpdwnSelectOption.isDisplayed();
		}
		
		public void clickAlert(){
			
		}
		
		public void clickOk(){
			
		}
		
		public void writeTextbox(){
			
		}
		
		public void clickRadio(){
			
		}
		
		public void clickCheckbox(){
			
		}
		
		public void openWindow(){
			
		}
		
		public void switchWindow(){
			
		}
		
		public void clickConfirm(){
			
		}
		
		public void verifyGreat(){
			
		}
		
		public void switchiFrame(){
			
		}	
		
		public void clickHome(){
			
		}
		
	}



