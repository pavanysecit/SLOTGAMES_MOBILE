package stepDefinition_UltraHot;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class UltraHot_Balance_Deduction_AccordingToBetType4_3 {
	AppiumDriver<MobileElement> driver;

	public UltraHot_Balance_Deduction_AccordingToBetType4_3() throws InterruptedException {
		this.driver = UltraHot_URL_Login.getDriver();
		//this.driver = UltraHot_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as ONE, bet value as twenty five, balance and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Ultra_Hot_slot_game_bet_type_as_ONE_bet_value_as_twenty_five_balance_and_spin_button() throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 80);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE & bet value as twenty five, click on spin button and check the balance$")
	public void open_the_Ultra_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_ONE_bet_value_as_twenty_five_click_on_spin_button_and_check_the_balance() throws Throwable {
		//Storing the value before spin
		String preSpin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String str = preSpin.replaceAll(",", "");
		System.out.println("Current balance of the account Before spin: " +str);
		
		//Selecting the credit as 1 from the drop down
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_CreditPopup41")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.id("hud_txtCredit")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "1";
		Assert.assertEquals(actual, expected);
		
		//Selecting the bet amount as 25 from the drop down
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup325")).click();
		Thread.sleep(2000);
		
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected1 = "25";
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

	@Then("^Balance should get deducted by twenty five as bet type is selected as ONE in Ultra Hot game$")
	public void balance_should_get_deducted_by_twenty_five_as_bet_type_is_selected_as_ONE_in_Ultra_Hot_game() throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
