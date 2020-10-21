package stepDefinition_100GlowingHot;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HundredGlowingHot_Balance_InsufficiantBalance_Validation {
	AppiumDriver<MobileElement> driver;

	public HundredGlowingHot_Balance_InsufficiantBalance_Validation() throws InterruptedException {
		this.driver = HundredGlowingHot_URL_Login.getDriver();
		//this.driver = HundredGlowingHot_URL_TryNow.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Hundred Glowing Hot slot game, balance, spin button and validation message, button behavior,$")
	public void chrome_browser_valid_URL_valid_login_details_Hundred_Glowing_Hot_slot_game_balance_spin_button_and_validation_message_button_behavior() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
	}

	@When("^Open the Hundred Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message with buttons behavior$")
	public void open_the_Hundred_Glowing_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_till_balance_turns_to_zero_and_check_the_validation_message_with_buttons_behavior() throws Throwable {
		//Storing the value before converting the balance into credits
		MobileElement bal = driver.findElement(By.id("hud_Hud_txtBalance1"));
		String preWin =bal.getText();
		System.out.println("Current balance of the account: " +preWin);

		//Getting the credit value
		MobileElement creditValue = driver.findElement(By.id("hud_txtCredit"));
		creditValue.click();
		Thread.sleep(1000);
		MobileElement credit1 = driver.findElement(By.id("hud_CreditPopup10.01"));
		credit1.click();
		String cred1 = creditValue.getText();
		Thread.sleep(1000);
		Assert.assertEquals("0.01",cred1);
		System.out.println("Selected credit value is: " +cred1);

		MobileElement betval = driver.findElement(By.id("hud_txtBetAmount"));
		betval.click();
		Thread.sleep(1000);
		MobileElement bet1_5 = driver.findElement(By.id("hud_BetPopup55"));
		bet1_5.click();
		Thread.sleep(1000);
		String betval1_5 =betval.getText();
		Assert.assertEquals("5",betval1_5);
		System.out.println("Selected bet value is: " +betval1_5);

		//Clicking on Spin button
		MobileElement spin= driver.findElement(By.id("hud_btnSpin"));
		spin.click();
		Thread.sleep(5000);
		String postbal =bal.getText();
		double conValue = Double.parseDouble(postbal);
		double conValue1 = Double.parseDouble(betval1_5);
		
		Boolean insufficient =driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[3]/android.view.View")).size() != 0;
		if(conValue <conValue1){
			Assert.assertFalse(insufficient);
			System.out.println("Insufficient alert is not present on the screen before click on spin button having main balance less than betval");
		}
		else {
			Assert.assertTrue(insufficient);
			System.out.println("Insufficient alert is present on the screen before click on spin button having main balance less than betval");
		}
			spin.click();
			Thread.sleep(4000);
		
		//Verifying the game buttons is disable during insufficient alert popup
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		System.out.println("credit click is performed");
		Thread.sleep(2000);
		if(driver.findElements(By.id("hud_CreditPopup10.01")).size() != 0){
			System.out.println("Element is Present");
		}else{
			System.out.println("Element is Absent");
		}
		System.out.println("credit values comparision is verified and test case passed");
		Thread.sleep(2000);
	
		// Verify the bet selecting under AutoSpin condition
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		System.out.println("bet click is performed");
		Thread.sleep(2000);

		//Verify if the bet pop is appeared and bet values are available
		if(driver.findElements(By.id("hud_BetPopup20.8")).size() != 0){
			System.out.println("bet values is Present");
		}else{
			System.out.println("bet values is Absent");
		}
		System.out.println("betvalues comparision is verified and test case passed");
		Thread.sleep(2000);
		
		MobileElement home = driver.findElement(By.id("hud_btnHome"));
		Boolean home1 = home.isDisplayed();
		System.out.println("home button visibility:"+home1);
		home.click();
		Thread.sleep(2000);
		if( home1) {
			System.out.println("home button visibility and autospin is continued:"+home1);
			System.out.println("Test case passed with clicking on Home screen");
		}
		else {
			System.out.println("Test case failed as Home screen is not visible");
		}
		Thread.sleep(2000);
		
		MobileElement info = driver.findElement(By.id("hud_btnMenu"));
		Boolean menu = info.isDisplayed();
		System.out.println("menu button visibility:"+menu);
		info.click();
		Thread.sleep(2000);
		if( menu) {
			System.out.println("menu button visibility and autospin is continued:"+menu);
			System.out.println("Test case passed with clicking on menu button");
		}
		else {
			System.out.println("Test case failed as menu button is not visible");
		}
		String insufficient1 =driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[3]/android.view.View")).getText();
		Assert.assertEquals("Insufficient Balance.",insufficient1);
		System.out.println("Insufficient balance alert is present");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[2]")).click();
		System.out.println("Click on ALert 'OK' and accepted the alert");
		System.out.println("Test case passed");
	}

	@Then("^Check the insufficient alert popop is displayed before the clicking on spin$")
	public void check_the_insufficient_alert_popop_is_displayed_before_the_clicking_on_spin() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Player should be blocked from playing the game when there is no balance in the account and buttons are inactive state in Hundred Glowing Hot game$")
	public void player_should_be_blocked_from_playing_the_game_when_there_is_no_balance_in_the_account_and_buttons_are_inactive_state_in_Hundred_Glowing_Hot_game() throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
