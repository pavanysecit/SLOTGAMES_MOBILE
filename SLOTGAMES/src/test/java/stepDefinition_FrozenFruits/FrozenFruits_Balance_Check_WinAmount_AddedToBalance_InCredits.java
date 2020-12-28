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

public class FrozenFruits_Balance_Check_WinAmount_AddedToBalance_InCredits {
	AppiumDriver<MobileElement> driver;

	public FrozenFruits_Balance_Check_WinAmount_AddedToBalance_InCredits() throws InterruptedException {
		this.driver = FrozenFruits_URL_Login.getDriver();
		//this.driver = FrozenFruits_URL_TryNow.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Frozen Fruits slot game, balance, transfer button, credit balance form, spin button and win amount in credits$")
	public void chrome_browser_valid_URL_valid_login_details_Frozen_Fruits_slot_game_balance_transfer_button_credit_balance_form_spin_button_and_win_amount_in_credits() throws Throwable {
	    
	}

	@When("^Open the Frozen Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on  balance window to change to credit form, click on spin button till user win and check the balance after win in credits$")
	public void open_the_Frozen_Fruits_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_amount_click_on_balance_window_to_change_to_credit_form_click_on_spin_button_till_user_win_and_check_the_balance_after_win_in_credits() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		//Storing the value before spin
		MobileElement preSpin = driver.findElement(By.id("hud_Hud_txtBalance1"));
		preSpin.click();
		String prespin =preSpin.getText();
		String str = prespin.replaceAll(",", "");
        System.out.println(str);
		System.out.println("Current balance of the account Before spin: " +prespin);
		System.out.println("Balance before adding win amount is: "+"  "+str);
		
		//Selecting the credit as 0.5 from the drop down
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_CreditPopup40.5")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.id("hud_txtCredit")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.5";
		Assert.assertEquals(actual, expected);
		
		//Selecting the bet amount as 40 from the drop down
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup240")).click();
		Thread.sleep(2000);
		
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected1 = "40";
		System.out.println("Selected bet value is : " +actual1);
		Assert.assertEquals(actual1, expected1);
		
		//Clicking on start button
		MobileElement start = driver.findElement(By.id("hud_btnSpin"));
		start.click();
		Thread.sleep(2000);

		while(driver.findElements(By.id("hud_btnGamble")).size() != 0){
		 {
			start.click();
			Thread.sleep(7000);
			//System.out.println(winE.isEmpty());
		 }
		}
		//Thread.sleep(2000);
		//Getting win amount
		MobileElement winE = driver.findElement(By.id("hud_Hud_txtWin1"));
		String winTex = winE.getText();

		System.out.println("The Win is : "+"  "+winTex);
		//System.out.println(winE.isEmpty());
		
		String postWin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String str1 = postWin.replaceAll(",", "");
        String str22 = ".00";
        String pt = str1 + str22;
		System.out.println("Balance before adding win amount is: "+"  "+pt);
		//Thread.sleep(4000);
		
		
		Thread.sleep(3000);

		//Clicking on Collect button
		driver.findElement(By.id("gamble_btnCollect")).click();
		Thread.sleep(6000);
		String Balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String str2 = Balance.replaceAll(",", "");
        String str33 = ".00";
        String pt33 = str2 + str33;
		Thread.sleep(2000);
		//Converted win amount into credits and multiplying with credit value and it should equal to win amount in currency
		double conValue = Double.parseDouble(winTex) + Double.parseDouble(pt);
		String dbi = String.format("%.2f", conValue);  
		System.out.println("Balance after adding win amount: "+dbi);
		Thread.sleep(2000);
		Assert.assertEquals(dbi, pt33);
		Thread.sleep(2000);
	}

	@Then("^Win amount should get added to the credit field after win and credit should get increased with win amount in (\\d+) Blazing hot slot game$")
	public void win_amount_should_get_added_to_the_credit_field_after_win_and_credit_should_get_increased_with_win_amount_in_Blazing_hot_slot_game(int arg1) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
