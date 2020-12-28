package stepDefinition_FrozenFruits;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FrozenFruits_Balance_Deduction_InCredits_AccordingToBetType3_3 {
	AppiumDriver<MobileElement> driver;

	public FrozenFruits_Balance_Deduction_InCredits_AccordingToBetType3_3() throws InterruptedException {
		this.driver = FrozenFruits_URL_Login.getDriver();
		//this.driver = FrozenFruits_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Frozen Fruits slot game, bet type as (\\d+)\\.(\\d+), bet value as HUNDRED, balance in credits and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Frozen_Fruits_slot_game_bet_type_as_bet_value_as_HUNDRED_balance_in_credits_and_spin_button(int arg1, int arg2) throws Throwable {
	   
	}

	@When("^Open the Frozen Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+), select the bet value as HUNDRED, click on spin button and check the balance in credits$")
	public void open_the_Frozen_Fruits_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_select_the_bet_value_as_HUNDRED_click_on_spin_button_and_check_the_balance_in_credits(int arg1, int arg2) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		//Storing the value before spin

		//Selecting the credit as 0.05 from the drop down
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_CreditPopup30.05")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.id("hud_txtCredit")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.05";
		Assert.assertEquals(actual, expected);


		
		MobileElement preSpin = driver.findElement(By.id("hud_Hud_txtBalance1"));
		preSpin.click();
		String prespin =preSpin.getText();
		String str = prespin.replaceAll(",", "");
        System.out.println(str);
		System.out.println("Current balance of the account Before spin: " +prespin);
		System.out.println("Balance before adding win amount is: "+"  "+str);
	
		//Selecting the bet amount as 100 from the drop down
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup3100")).click();
		Thread.sleep(2000);
		
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected1 = "100";
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

	@Then("^Balance should get deducted by HUNDRED, as bet type is selected as (\\d+)\\.(\\d+) and bet value as (\\d+) in Frozen Fruits game$")
	public void balance_should_get_deducted_by_HUNDRED_as_bet_type_is_selected_as_and_bet_value_as_in_Frozen_Fruits_game(int arg1, int arg2, int arg3) throws Throwable {
	   Thread.sleep(2000);
	   driver.quit();
	}
}
