package stepDefinition_20FruityBrownie;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TwentyFruityBrownie_Transfer_Validation_AvailableBalance {
	AppiumDriver<MobileElement> driver;

	public TwentyFruityBrownie_Transfer_Validation_AvailableBalance() throws InterruptedException {
		this.driver = TwentyFruityBrownie_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Fruity Brownie game, balance greater than available balance, text field to transfer balance, Ok button and validation message$")
	public void chrome_browser_valid_URL_valid_login_details_Fruity_Brownie_game_balance_greater_than_available_balance_text_field_to_transfer_balance_Ok_button_and_validation_message(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Open the (\\d+) Fruity Brownie slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok butotn$")
	public void open_the_Fruity_Brownie_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_enter_the_amount_greater_than_available_balance_and_click_on_Ok_butotn(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Player should be blocked from loading the (\\d+) Fruity Brownie game when the amount entered in the transfer page is more than the available balance$")
	public void player_should_be_blocked_from_loading_the_Fruity_Brownie_game_when_the_amount_entered_in_the_transfer_page_is_more_than_the_available_balance(int arg1) throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
