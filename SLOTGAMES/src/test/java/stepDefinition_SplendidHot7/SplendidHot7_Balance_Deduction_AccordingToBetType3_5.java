package stepDefinition_SplendidHot7;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SplendidHot7_Balance_Deduction_AccordingToBetType3_5 {
	AppiumDriver<MobileElement> driver;

	public SplendidHot7_Balance_Deduction_AccordingToBetType3_5() throws InterruptedException {
		this.driver = SplendidHot7_URL_Login.getDriver();
		//this.driver = SplendidHot7_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Splendid Hot Seven slot game, bet type as (\\d+)\\.(\\d+) from drop down, bet value as TWENTY FOUR, balance, spin button and balance after spin$")
	public void chrome_browser_valid_URL_valid_login_details_Splendid_Hot_Seven_slot_game_bet_type_as_from_drop_down_bet_value_as_TWENTY_FOUR_balance_spin_button_and_balance_after_spin(int arg1, int arg2) throws Throwable {
	   
	}

	@When("^Open the Splendid Hot Seven slot game by entering the valid URL in browser, enter the valid login details, select the bet type as TWENTY FOUR from bet type drop down, click on spin button and check the balance after spin$")
	public void open_the_Splendid_Hot_Seven_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_TWENTY_FOUR_from_bet_type_drop_down_click_on_spin_button_and_check_the_balance_after_spin() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		//Storing the value before spin
		String preSpin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String str = preSpin.replaceAll(",", "");
		System.out.println("Current balance of the account Before spin: " +str);
		
		//Selecting the credit as 0.03 from the drop down
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_CreditPopup30.03")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.id("hud_txtCredit")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.03";
		Assert.assertEquals(actual, expected);
		
		//Selecting the bet amount as 24 from the drop down
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup524")).click();
		Thread.sleep(2000);
		
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected1 = "24";
		System.out.println("Selected bet value is : " +actual1);
		Assert.assertEquals(actual1, expected1);
			
		//Clicking on Spin button
		driver.findElement(By.id("hud_btnSpin")).click();
		Thread.sleep(5000);
		
		//Storing the value after spin
		String postSpin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String str1 = postSpin.replaceAll(",", "");
		System.out.println("Current balance of the account After spin: " +str1);
		
		//Deducting bet value from the preSpin and formating string to double
		double fValue = Double.parseDouble(str) - Double.parseDouble(actual1);
		String dbi = String.format("%.2f", fValue);  
		System.out.println("Final balance after deducting bet amount from the balance : "+dbi);
		
		Assert.assertEquals(dbi,str1);
	}

	@Then("^Balance should get deducted by TWENTY FOUR if bet type is selected as (\\d+)\\.(\\d+) & bet value as (\\d+) in Splendid Hot Seven slot game$")
	public void balance_should_get_deducted_by_TWENTY_FOUR_if_bet_type_is_selected_as_bet_value_as_in_Splendid_Hot_Seven_slot_game(int arg1, int arg2, int arg3) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
