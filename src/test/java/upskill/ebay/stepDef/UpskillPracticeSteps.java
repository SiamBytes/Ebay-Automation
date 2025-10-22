package upskill.ebay.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import upskill.ebay.pageAction.UpskillPracticeActions;

public class UpskillPracticeSteps {
	
	UpskillPracticeActions UpskillPracticeActionsobj = new UpskillPracticeActions();

		@Given("^Open UpSkill Automation Practice page$")
		public void open_UpSkill_Automation_Practice_page() throws Throwable {
			UpskillPracticeActionsobj.openAutomationPracticePage();

		}

		@When("^Switch to Practice iFrame$")
		public void switch_to_Practice_iFrame() throws Throwable {
			UpskillPracticeActionsobj.switchIframe();

		}

		@When("^Mouse Hover to Hover Over Me$")
		public void mouse_Hover_to_Hover_Over_Me() throws Throwable {
			UpskillPracticeActionsobj.mousehover();

		}

		@Then("^Click on Link$")
		public void click_on_Link() throws Throwable {
			UpskillPracticeActionsobj.clickLink();

		}

		@When("^Select Option from dropdown$")
		public void select_Option_from_dropdown() throws Throwable {
			UpskillPracticeActionsobj.selectDropdown();

		}

		@Then("^Verify Option selected$")
		public void verify_Option_selected() throws Throwable {
			UpskillPracticeActionsobj.verifyOptionSelected();

		}

		@When("^Click on Alert$")
		public void click_on_Alert() throws Throwable {
			UpskillPracticeActionsobj.clickAlert();

		}

		@Then("^Click on OK$")
		public void click_on_OK() throws Throwable {
			UpskillPracticeActionsobj.clickOk();

		}

		@Then("^User should able to write on Textbox$")
		public void user_should_able_to_write_on_Textbox() throws Throwable {
			UpskillPracticeActionsobj.writeTextbox();

		}

		@Then("^Click on Radio (\\d+)$")
		public void click_on_Radio(int arg1) throws Throwable {
			UpskillPracticeActionsobj.clickRadio();

		}

		@Then("^Click on Checkbox (\\d+)$")
		public void click_on_Checkbox(int arg1) throws Throwable {
			UpskillPracticeActionsobj.clickCheckbox();

		}

		@When("^Click on Open Window$")
		public void click_on_Open_Window() throws Throwable {
			UpskillPracticeActionsobj.openWindow();

		}

		@Then("^Switch to new Window$")
		public void switch_to_new_Window() throws Throwable {
			UpskillPracticeActionsobj.switchWindow();

		}

		@When("^Click on Confirm$")
		public void click_on_Confirm() throws Throwable {
			UpskillPracticeActionsobj.clickConfirm();

		}

		@Then("^Verify Great$")
		public void verify_Great() throws Throwable {
			UpskillPracticeActionsobj.verifyGreat();

		}

		@When("^Switch to iFrame Home$")
		public void switch_to_iFrame_Home() throws Throwable {
			UpskillPracticeActionsobj.switchiFrame();

		}

		@Then("^Click on Home$")
		public void click_on_Home() throws Throwable {
			UpskillPracticeActionsobj.clickHome();

		}
	}


