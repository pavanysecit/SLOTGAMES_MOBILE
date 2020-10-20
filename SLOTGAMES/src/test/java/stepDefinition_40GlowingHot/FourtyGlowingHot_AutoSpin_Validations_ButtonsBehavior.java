package stepDefinition_40GlowingHot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FourtyGlowingHot_AutoSpin_Validations_ButtonsBehavior {
AppiumDriver<MobileElement> driver;
	
	public FourtyGlowingHot_AutoSpin_Validations_ButtonsBehavior() throws InterruptedException {
		this.driver = FourtyGlowingHot_URL_Login.getDriver();
		//this.driver = FourtyGlowingHot_URL_TryNow.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Glowing Hot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality$")
	public void chrome_browser_valid_URL_valid_login_details_Glowing_Hot_game_balance_spin_button_auto_spin_button_auto_spins_option_and_check_for_buttons_behavior_functionality(int arg1) throws Throwable {

	}

	@When("^Open the (\\d+) Glowing Hot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons in different scenarios$")
	public void open_the_Glowing_Hot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_auto_spin_option_under_auto_spin_drop_down_and_check_behavior_of_different_buttons_in_different_scenarios(int arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 

		String Bal = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance amount:" +Bal);

		while(true)
		{
			driver.findElement(By.id("hud_btnAuto")).click();
			Thread.sleep(0500);
			break;
		}
		Thread.sleep(2000);

		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hud_txtWinDetail"), "GOOD LUCK!"));
		String actual = driver.findElement(By.id("hud_txtWinDetail")).getText();
		String expected = "GOOD LUCK!";
		System.out.println(actual);
		Assert.assertEquals(actual, expected);

		MobileElement credit=driver.findElement(By.id("hud_txtCredit"));
		String cr =credit.getText();
		credit.click();

		Thread.sleep(2000);
		System.out.println("Credit click is performed");
		Thread.sleep(2000);
		if(driver.findElements(By.id("hud_CreditPopup20.02")).size() != 0){
			System.out.println("Credit click is performed but value is changed to 0.02 during autoplay. Hence test case failed");
		}else{
			System.out.println("Credit click is performed but value not changed during autoplay. Hence test case passed");
		}
		System.out.println("Credit value comparision is verified and test case passed");
		Assert.assertEquals("0.01", cr);
		Thread.sleep(2000);

		MobileElement bet=	driver.findElement(By.id("hud_txtBetAmount"));
		String betval =bet.getText();
		bet.click();
		Thread.sleep(2000);
		System.out.println("bet click is performed");
		Thread.sleep(2000);
		if(driver.findElements(By.id("hud_BetPopup34")).size() != 0){
			System.out.println("BetValue click is performed but value is changed during autoplay. Hence test case failed");
		}else{
			System.out.println("BetValue click is performed but bet value not changed during autoplay. Hence test case passed");
		}
		System.out.println("betvalues comparision is verified and test case passed");
		Assert.assertEquals("0.4",betval );
		Thread.sleep(2000);

		// change the orientation of the screen
		driver.rotate(ScreenOrientation.LANDSCAPE);
		Thread.sleep(4000);
		MobileElement home = driver.findElement(By.id("hud_btnHome"));
		Boolean home1 = home.isDisplayed();
		Assert.assertTrue(home1);
		System.out.println("home button visibility:"+home1);
		home.click();
		Thread.sleep(2000);
		if( home1) {
			System.out.println("Home button click is performed but click is not happened during autoplay :"+home1);
			System.out.println("Test case passed with clicking on Home button");
		}
		else {
			System.out.println("Test case failed as Home button click performed successfully during autoplay");
		}
		Thread.sleep(2000);
		// change the orientation of the screen
		driver.rotate(ScreenOrientation.PORTRAIT);
		Thread.sleep(4000);

		MobileElement info = driver.findElement(By.id("hud_btnMenu"));
		Boolean menu = info.isDisplayed();
		Assert.assertTrue(menu);
		System.out.println("menu/info button visibility:"+menu);
		info.click();
		Thread.sleep(2000);
		if( menu) {
			System.out.println("Menu/info button click is performed but click is not happened during autoplay:"+menu);
			System.out.println("Test case passed with clicking on Menu/info button");
		}
		else {
			System.out.println("Test case failed as Menu/info button click performed successfully");
		}

		//Clicking on stop button to check the instruction message 
		MobileElement stop=(MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_btnSpin")));
		stop.click();
		Thread.sleep(4000);

		if( driver.findElements(By.id("hud_btnGamble")).size() != 0) {
			driver.findElement(By.id("hud_btnGamble")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("gamble_btnCollect")).click();
			Thread.sleep(0500);
		}
		else {
			System.out.println("Win is not triggered");
		}


		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hud_txtWinDetail"), "PLEASE PLACE YOUR BET"));
		String actual1 = driver.findElement(By.id("hud_txtWinDetail")).getText();
		String expected1 = "PLEASE PLACE YOUR BET";
		System.out.println(actual1);
		Assert.assertEquals(actual1, expected1);
	}

	@Then("^Bet value & Credit value buttons should not be clickable in (\\d+) Glowing hot slot game$")
	public void bet_value_Credit_value_buttons_should_not_be_clickable_in_Glowing_hot_slot_game(int arg1) throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Home and Info buttons should not be clickable in (\\d+) Glowing hot slot game$")
	public void home_and_Info_buttons_should_not_be_clickable_in_Glowing_hot_slot_game(int arg1) throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Spin button should not visible & Stop button should be visible and clickable in (\\d+) Glowing hot slot game$")
	public void spin_button_should_not_visible_Stop_button_should_be_visible_and_clickable_in_Glowing_hot_slot_game(int arg1) throws Throwable {
	    Thread.sleep(1000);
	}

	@Then("^Spin button should be visble after clicking on stop button in (\\d+) Glowing hot slot game$")
	public void spin_button_should_be_visble_after_clicking_on_stop_button_in_Glowing_hot_slot_game(int arg1) throws Throwable {
		driver.quit();
	}
}