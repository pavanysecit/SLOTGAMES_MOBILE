package stepDefinition_20FruityBrownie;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TwentyFruityBrownie_Balance_InsufficiantBalance_Validation {
	AppiumDriver<MobileElement> driver;

	public TwentyFruityBrownie_Balance_InsufficiantBalance_Validation() throws InterruptedException {
		this.driver = TwentyFruityBrownie_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Fruity Brownie slot game, balance, spin button and validation message$")
	public void chrome_browser_valid_URL_valid_login_details_Fruity_Brownie_slot_game_balance_spin_button_and_validation_message(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Open the (\\d+) Fruity Brownie slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message$")
	public void open_the_Fruity_Brownie_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_till_balance_turns_to_zero_and_check_the_validation_message(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Player should be blocked from playing the game when there is no balance in the account in (\\d+) Fruity Brownie game$")
	public void player_should_be_blocked_from_playing_the_game_when_there_is_no_balance_in_the_account_in_Fruity_Brownie_game(int arg1) throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
