package stepDefinition_TropicanaForest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TropicanaForest_Balance_Deduction_InCredits_AccordingToBetType1_2 {
	AppiumDriver<MobileElement> driver;

	public TropicanaForest_Balance_Deduction_InCredits_AccordingToBetType1_2() throws InterruptedException {
		this.driver = TropicanaForest_URL_Login.getDriver();
		//this.driver = TropicanaForest_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Tropicana Forest slot game, bet type as (\\d+)\\.(\\d+), bet value as FOURTY, balance in credits and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Tropicana_Forest_slot_game_bet_type_as_bet_value_as_FOURTY_balance_in_credits_and_spin_button(int arg1, int arg2) throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 80);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the Tropicana Forest slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+), select the bet value as FOURTY, click on spin button and check the balance in credits$")
	public void open_the_Tropicana_Forest_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_select_the_bet_value_as_FOURTY_click_on_spin_button_and_check_the_balance_in_credits(int arg1, int arg2) throws Throwable {
		//Storing the value before spin
		MobileElement preSpin = driver.findElement(By.id("hud_Hud_txtBalance1"));
		preSpin.click();
		String prespin =preSpin.getText();
		String str = prespin.replaceAll(",", "");
        System.out.println(str);
		System.out.println("Current balance of the account Before spin: " +prespin);
		System.out.println("Balance before adding win amount is: "+"  "+str);
	
		
		//Selecting the credit as 0.01 from the drop down
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_CreditPopup10.01")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.id("hud_txtCredit")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.01";
		Assert.assertEquals(actual, expected);

		//Selecting the bet amount as 40 from the drop down
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup240")).click();
		Thread.sleep(2000);
		
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected1 = "40";
		String betValue =actual1;
		System.out.println("Selected bet value is : " +betValue);
		Assert.assertEquals(actual1, expected1);
		
		//Clicking on Spin button
		driver.findElement(By.id("hud_btnSpin")).click();
		Thread.sleep(3000);

		//Storing the value after spin
		String postSpin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Current balance of the account After spin: " +postSpin);
		String str2 = postSpin.replaceAll(",", "");
        System.out.println(str2);
        String str22 = ".00";
        String pt = str2 + str22;
        System.out.println("Balance before adding win amount is: "+"  "+pt);

		//Deducting bet value from the preSpin and formating string to double
		double fValue = Double.parseDouble(str) - Double.parseDouble(betValue);
		String dbi = String.format("%.2f", fValue);  
		System.out.println("Final balance after deducting bet amount from the balance : "+dbi);
		Assert.assertEquals(dbi,pt);
	}

	@Then("^Balance should get deducted by FOURTY as bet type is selected as (\\d+)\\.(\\d+) and bet value as (\\d+) in Tropicana Forest game$")
	public void balance_should_get_deducted_by_FOURTY_as_bet_type_is_selected_as_and_bet_value_as_in_Tropicana_Forest_game(int arg1, int arg2, int arg3) throws Throwable {
		Thread.sleep(1000);
		driver.quit();
	}
}