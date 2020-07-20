package stepDefinition_20FruityBrownie;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TwentyFruityBrownie_Balance_To_Credits_CreditWinAmountEqualsCurrencyWinAmount_Value2 {
	AppiumDriver<MobileElement> driver;

	public TwentyFruityBrownie_Balance_To_Credits_CreditWinAmountEqualsCurrencyWinAmount_Value2() throws InterruptedException {
		this.driver = TwentyFruityBrownie_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Fruity Brownie slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two$")
	public void chrome_browser_valid_URL_valid_login_details_Fruity_Brownie_slot_game_balance_spin_button_win_amount_in_currency_credits_and_win_amount_in_credits_for_denomination_drop_down_value_two(int arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		MobileElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();

		String parent1=driver.getWindowHandle();
		Set<String>s1=driver.getWindowHandles();

		System.out.println("Window for slot game is"+" "+s1);
		 
		Set<String> contx = driver.getContextHandles();
		String pk = driver.getContext();
		//System.out.println("The current contesx is"+" "+pk);
		for(String cont:contx){
			 System.out.println(cont);
		 }
		driver.context("NATIVE_APP");
		Thread.sleep(4000);
	}

	@When("^Open the (\\d+) Fruity Brownie slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance$")
	public void open_the_Fruity_Brownie_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_the_dinomination_drop_down_value_two_click_on_spin_button_till_player_wins_click_on_balance_check_the_win_amount_and_click_on_balance(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Win amount in credit multiplied by denomination drop down value two is equal to win amount in currency in (\\d+) Fruity Brownie slot game$")
	public void win_amount_in_credit_multiplied_by_denomination_drop_down_value_two_is_equal_to_win_amount_in_currency_in_Fruity_Brownie_slot_game(int arg1) throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
