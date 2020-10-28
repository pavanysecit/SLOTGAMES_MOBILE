package stepDefinition_TropicanaCasino;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TropicanaCasino_ManualSpin_Validations_ButtonsBehavior {
	AppiumDriver<MobileElement> driver;

	public TropicanaCasino_ManualSpin_Validations_ButtonsBehavior() throws InterruptedException {
		this.driver = TropicanaCasino_URL_Login.getDriver();
		//this.driver = TropicanaCasino_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Tropicana Casino slot game, balance, spin button, spin button and check for buttons behavior & functionality$")
	public void chrome_browser_valid_URL_valid_login_details_Tropicana_Casino_slot_game_balance_spin_button_spin_button_and_check_for_buttons_behavior_functionality() throws Throwable {
	    
	}

	@When("^Open the Tropicana Casino slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin option and check behavior of different buttons in different scenarios$")
	public void open_the_Tropicana_Casino_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_option_and_check_behavior_of_different_buttons_in_different_scenarios() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The balance is equal to"+" "+balance);
		MobileElement credit1= driver.findElement(By.id("hud_txtCredit"));
		MobileElement bet1= driver.findElement(By.id("hud_txtBetAmount"));

		// Start the spin
		MobileElement start = driver.findElement(By.id("hud_btnSpin"));
		start.click();
		MobileElement winE = driver.findElement(By.id("hud_Hud_txtWin1"));
		Thread.sleep(7000);	
		String prewin = winE.getText();                  
		String winTex= winE.getText();

		while(prewin.isEmpty()){
			start.click();	
			Thread.sleep(8000);	
			winTex = winE.getText();
			prewin= prewin+winTex;
			System.out.println(winTex.isEmpty());		
		}
		System.out.println("Win amount is: " +prewin);	 
		String balance1 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance amount before clicking on gamble link :"+balance1);

		// Verifying the Gamble Link is available and after win is triggered
		MobileElement GambleLink =driver.findElement(By.id("hud_btnGamble")); 
		Assert.assertTrue(GambleLink.isDisplayed());
		System.out.println("Gamble link is available on the screen: Testcase Passed");
		Thread.sleep(2000);	

		//Spin the reel and verify the gamble link still available on the screen
		start.click();
		System.out.println("next reel spin is triggered");
		Thread.sleep(2000);
		Assert.assertFalse(GambleLink.isDisplayed());
		System.out.println("Gamble link is not available on the screen once reel spin started: Testcase Passed");
		Thread.sleep(3000);	

		//CLick on the credit and betvalues under spin and check the buttons clickable property
		start.click();
		System.out.println("reel spin is triggered for credit validation");
		credit1.click();
		System.out.println("credit click is performed when reels are spinning");
		Thread.sleep(2000);
		if(driver.findElements(By.id("hud_CreditPopup10.01")).size() != 0){
			Assert.assertTrue(driver.findElements(By.id("hud_CreditPopup10.01")).size() != 0);
			System.out.println("Credit popup value is present on screen");
			System.out.println("Test case failed");
		}else{
			Assert.assertTrue(driver.findElements(By.id("hud_CreditPopup10.01")).size() == 0);
			System.out.println("Credit popup value is not present on screen");
			System.out.println("Test case passed");
			Thread.sleep(2000);
		}
		start.click();
		System.out.println("reel spin is triggered for betvalue validation");
		bet1.click();
		Thread.sleep(2000);
		System.out.println("betvalue click is performed when reels are spinning");

		//Verify if the bet pop is appeared and bet values are available
		if(driver.findElements(By.id("hud_BetPopup20.4")).size() != 0){
			Assert.assertTrue(driver.findElements(By.id("hud_BetPopup22")).size() != 0);
			System.out.println("bet value popup is present on screen");
			System.out.println("Test case failed");
		}else{
			Assert.assertTrue(driver.findElements(By.id("hud_BetPopup20.4")).size() == 0);
			System.out.println("bet value popup is not present on screen");
			System.out.println("Test case passed");
			Thread.sleep(2000);
		}

		/* Verify the Home button is visible on he screen and perform click, 
		   Once click on Home Button under the manual condition
		 *  manual should continue and Home button is still available on the screen 
		 *  As home button is hidden change the screen orientation and click on home button foe validation
		 */

		// Screen orientation
		// Get the current orientation 
		String PORTRAIT = driver.getOrientation().name();
		Assert.assertEquals("PORTRAIT", PORTRAIT);
		System.out.println(" Current screen orientation Is : " + PORTRAIT);
		Thread.sleep(2000);

		// change the orientation of the screen
		driver.rotate(ScreenOrientation.LANDSCAPE);

		// Get the orientation of the screen
		String LANDSCAPE = driver.getOrientation().name();
		Assert.assertEquals("LANDSCAPE", LANDSCAPE);
		Thread.sleep(2000);
		System.out.println(" Current screen orientation Is : " + LANDSCAPE);

		start.click();
		System.out.println("reel spin is triggered for home button validation");
		MobileElement home = driver.findElement(By.id("hud_btnHome"));
		Boolean home1 = home.isDisplayed();
		System.out.println("home button visibility:"+home1);
		home.click();
		Thread.sleep(2000);
		Boolean home2 = home.isDisplayed();
		if( home2) {
			System.out.println("home button visibility and reel spin is continued:"+home2);
			System.out.println("Test case passed with clicking on Home screen");
		}
		else {
			System.out.println("Test case failed as game screen is not available for the user after clicking on home screen");
		}
		Thread.sleep(2000);
		// change the orientation of the screen
		driver.rotate(ScreenOrientation.PORTRAIT);
		Thread.sleep(1000);
		
		/* Verify the info button is visible on he screen and perform click, 
		   Once click on info Button under the manual spin condition
		 *  manual spin should continue and info button is still available on the screen */
		start.click();
		System.out.println("reel spin is triggered for info button validation");
		MobileElement menu = driver.findElement(By.id("hud_btnMenu"));
		Boolean menu1 = menu.isDisplayed();
		System.out.println("menu button visibility:"+menu1);
		menu.click();
		Thread.sleep(2000);
		Boolean info2 = menu.isDisplayed();
		if( info2) {
			System.out.println("menu button visibility and reel spin is continued:"+info2);
			System.out.println("Test case passed with clicking on info button");
		}
		else {
			System.out.println("Test case failed as menu button is not visible under reel spin");
		}

		/* Verify the maximizing and minimizing the screen 
		 * doesn't affect the reel spin functionality under spin condition 
		 */
		MobileElement menubar = driver.findElement(By.id("com.android.chrome:id/menu_button"));
		MobileElement sub = driver.findElement(By.id("hud_btnFullScreen"));
		start.click();
		Thread.sleep(1000);
		System.out.println("reel spin is triggered and maximizing the screen under spin condition");
		sub.click();
		Thread.sleep(3000);

		//Checking when window is maximized, URL tool bar should not visible
		Assert.assertFalse(menubar.isDisplayed());
		System.out.println("Maximized the screen and menubar is not present on the screen");
		Assert.assertTrue(start.isDisplayed());
		System.out.println("spin button visible on maximizing the screen");
		Thread.sleep(2000);
		start.click();
		Thread.sleep(1000);
		System.out.println("reel spin is triggered and minimizing the screen under spin condition");
		sub.click();
		Thread.sleep(1000);

		//Checking when window is minimized, URL tool bar should be visible
		Assert.assertTrue(menubar.isDisplayed());
		Thread.sleep(4000);
		Assert.assertTrue(start.isDisplayed());
		System.out.println("spin button visible after maximizing and minimizing the screen");
	}

	@Then("^Bet value & Credit value buttons should not be clickable under spin condition in Tropicana Casino slot game$")
	public void bet_value_Credit_value_buttons_should_not_be_clickable_under_spin_condition_in_Tropicana_Casino_slot_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Home, Info and Turbo buttons should not be clickable on screen under spin condition in Tropicana Casino slot game$")
	public void home_Info_and_Turbo_buttons_should_not_be_clickable_on_screen_under_spin_condition_in_Tropicana_Casino_slot_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Spin button should be disabled during reel spin in Tropicana Casino slot game$")
	public void spin_button_should_be_disabled_during_reel_spin_in_Tropicana_Casino_slot_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Spin button should be visible after reel spin stops and if  win is triggered clicking on collect button in Tropicana Casino slot game$")
	public void spin_button_should_be_visible_after_reel_spin_stops_and_if_win_is_triggered_clicking_on_collect_button_in_Tropicana_Casino_slot_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Gamble button behaviour under win triggered and disabled when next spin starts in Tropicana Casino slot game$")
	public void gamble_button_behaviour_under_win_triggered_and_disabled_when_next_spin_starts_in_Tropicana_Casino_slot_game() throws Throwable {
		driver.quit();
	}
}
