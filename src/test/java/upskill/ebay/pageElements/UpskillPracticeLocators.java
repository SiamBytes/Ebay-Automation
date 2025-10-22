package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpskillPracticeLocators {
	
	//Open UpSkill Automation Practice page
		@FindBy(xpath="//input[@placeholder='Type to search car brands')]")
		public WebElement txtbxOpenPage;
		
	//Switch to Practice iFrame
		@FindBy(xpath="//iframe[@name='htmlComp-iframe']")
		public WebElement switchIframe;
				
	//Mouse Hover to Hover Over Me
		@FindBy(xpath="//button[contains(text(),'Hover Over Me!')]")
		public WebElement btnHoverOverMe;
				
	//Click on Link
		@FindBy(xpath="//a[contains(text(),'Link 1')]")
		public WebElement linkClickHere;
				
	//Select Option from dropdown
		@FindBy(xpath="//select[@aria-label='Default select ']")
		public WebElement drpdwnSelectOption;
				
	//Verify Option selected
		@FindBy(xpath="//option[@value='2']")
		public WebElement lblVerifyOption;
				
	//Click on Alert
		@FindBy(xpath="//button[contains(text(),'Alert')]")
		public WebElement btnClickAlert;
				
	//Click on OK
		@FindBy(xpath="//button[contains(text(),'OK')]")
		public WebElement btnClickOK;
				
	//User should able to write on Textbox
		@FindBy(xpath="//input[@placeholder='Your Name']")
		public WebElement txtbxWrite;
				
	//Click on Radio 
		@FindBy(xpath="//input[@type='radio']")
		public WebElement radioClick;
				
	//Click on Checkbox
		@FindBy(xpath="///input[@type='checkbox']")
		public WebElement chkboxClick;
	
	//Click on Open Window
		@FindBy(xpath="//button[contains(text(),'Open Window')]")
		public WebElement btnOpenWindow;
					
	//Switch to new Window
		@FindBy(xpath="//")
		public WebElement windowSwitch;
						
	//Click on Confirm
		@FindBy(xpath="//button[contains(text(),'Confirm')]")
		public WebElement btnConfirm;
						
	//Verify Great
		@FindBy(xpath="//")
		public WebElement lblVerifyGreat;
					
	//Switch to iFrame Home
		@FindBy(xpath="//span[contains(text(),'Home')]")
		public WebElement iframeHome;
						
	//Click on Home
		@FindBy(xpath="//span[contains(text(),'Home')]")
		public WebElement linkHome;
}

