package stepDefinition_FruitClub;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FruitClub_Balance_Deduction_AccordingToBetType1_3 {
	AppiumDriver<MobileElement> driver;

	public FruitClub_Balance_Deduction_AccordingToBetType1_3() throws InterruptedException {
		this.driver = FruitClub_URL_Login.getDriver();
		//this.driver = FruitClub_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Fruit Club slot game, bet type as (\\d+)\\.(\\d+), bet value as (\\d+)\\.(\\d+), balance, spin button and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Fruit_Club_slot_game_bet_type_as_bet_value_as_balance_spin_button_and_win_amount(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the Fruit Club slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+), select the bet value as (\\d+)\\.(\\d+), click on spin button, check the win amount and check the balance$")
	public void open_the_Fruit_Club_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_select_the_bet_value_as_click_on_spin_button_check_the_win_amount_and_check_the_balance(int arg1, int arg2, int arg3, int arg4) throws Throwable {
	    
	}

	@Then("^Current Balance should get deducted by (\\d+)\\.(\\d+) as bet type is selected as (\\d+)\\.(\\d+) and bet value as (\\d+)\\.(\\d+) in Fruit Club game$")
	public void current_Balance_should_get_deducted_by_as_bet_type_is_selected_as_and_bet_value_as_in_Fruit_Club_game(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}