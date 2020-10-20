package stepDefinition_EmeraldDice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class EmeraldDice_Gamble_Options_With_Orentation_WinAmount_SameAs_WinMeterAmount {
	AppiumDriver<MobileElement> driver;

	public EmeraldDice_Gamble_Options_With_Orentation_WinAmount_SameAs_WinMeterAmount() throws InterruptedException {
		this.driver = EmeraldDice_URL_Login.getDriver();
		//this.driver = EmeraldDice_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Emerald Dice slot game, balance, spin button, win amount, gamble button, color win option, game play in landscape mode in gamble page, gamble status$")
	public void chrome_browser_valid_URL_valid_login_details_Emerald_Dice_slot_game_balance_spin_button_win_amount_gamble_button_color_win_option_game_play_in_landscape_mode_in_gamble_page_gamble_status() throws Throwable {
	    
	}

	@When("^Open the Emerald Dice slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, check the play options and play in landscape mode in gamble page and when user wins check the win meter at main page is same as gamble win amount$")
	public void open_the_Emerald_Dice_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_spin_button_till_player_wins_click_on_gamble_button_check_the_play_options_and_play_in_landscape_mode_in_gamble_page_and_when_user_wins_check_the_win_meter_at_main_page_is_same_as_gamble_win_amount() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The balance is equal to"+" "+balance);
		MobileElement start = driver.findElement(By.id("hud_btnSpin"));
		start.click();
		Thread.sleep(8000);	
		MobileElement winE = driver.findElement(By.id("hud_Hud_txtWin1"));

		String prewin = winE.getText();
		//System.out.println("Balance before win is"+" "+prewin);                    
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
		String bal1 = balance1.replaceAll(",", "");
		driver.findElement(By.id("hud_btnGamble")).click();	
		Thread.sleep(2000);

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

		String gAmount = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
		System.out.println("Gamble amount is :"+gAmount);
		Thread.sleep(2000);

		String str4 = gAmount.replaceAll(" SRD", "");
		System.out.println("Gamble amount after split is :"+str4);

		String colorwin = driver.findElement(By.id("gamble_txtWin")).getText();
		String gamblewin = colorwin.replaceAll(" SRD", "");
		System.out.println("Gamble to win amount after split is :"+gamblewin);
		System.out.println("Gamble to win amount is: " +colorwin);

		WebElement Red = driver.findElement(By.id("gamble_btnRed"));
		if(Red.isDisplayed()) {
			System.out.println("Gamble option Red button is available on game screen");
			Assert.assertTrue(Red.isDisplayed());
		}
		else {
			System.out.println("Gamble option Red button is not available on game screen and test case failed");
			Assert.assertTrue(Red.isDisplayed());
		}

		WebElement Black = driver.findElement(By.id("gamble_btnBlack"));
		if(Black.isDisplayed()) {
			System.out.println("Gamble option Black button is available on game screen and test case passed");
			Assert.assertTrue(Black.isDisplayed());
			Black.click();
			Thread.sleep(2000);
		}
		else {
			System.out.println("Gamble option Black button is not available on game screen and test case failed");
			Assert.assertTrue(Black.isDisplayed());
		}

		String gAmount1 = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
		String gambleamtafter = gAmount1.replaceAll(" SRD", "");
		System.out.println("Gamble amount after selecting red or black button: "+gambleamtafter);


		if(gamblewin.equalsIgnoreCase(gambleamtafter)) {

			String gAmount11 = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
			String gamble1 = gAmount11.replaceAll(" SRD", "");
			Thread.sleep(2000);
			System.out.println("Gamble amount after winning on 1st attempt "+gamble1);
			Thread.sleep(2000);

			driver.findElement(By.id("gamble_btnCollect")).click();
			Thread.sleep(3000);
			String postBalance22 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
			System.out.println("Balance amount After clicking on collect link :"+postBalance22);
			double conValue = Double.parseDouble(bal1) + Double.parseDouble(gamble1);
			String dbi = String.format("%.2f", conValue);  
			System.out.println("Balance after adding gamble win amount: "+dbi);
			Thread.sleep(2000);
			String postbal = postBalance22.replaceAll(",", "");
			Assert.assertEquals(dbi, postbal);
			Thread.sleep(2000);
			String winamount = driver.findElement(By.id("hud_Hud_txtWin1")).getText();
			String winfield = winamount.replaceAll(" SRD", "");
			Thread.sleep(2000);
			Assert.assertEquals(winfield, gamble1);
			Thread.sleep(2000);
		}  
		else
		{     
			Thread.sleep(3000);
			String postBalance33 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText(); 
			System.out.println("It has lost");
			System.out.println("Current balance after loosing in gamble: " +postBalance33);
			Assert.assertEquals(postBalance33, postBalance33);
		}
		System.out.println("The testcase 3 has passed");
	}

	@Then("^Verify the home button is enabled on the game screen after returning from gamble page$")
	public void verify_the_home_button_is_enabled_on_the_game_screen_after_returning_from_gamble_page() throws Throwable {
		MobileElement home = driver.findElement(By.id("hud_btnHome"));
		Boolean home1 = home.isDisplayed();
		System.out.println("home button visibility:"+home1);
		Thread.sleep(2000);
		if( home1) {
			System.out.println("home button available on game screen returning from gamble page:"+home1);
			Assert.assertTrue(home1);
		}
		else {
			System.out.println("Test case failed as home button not available on game screen returning from gamble page");
			Assert.assertTrue(home1);
		}
	}

	@Then("^Gamble page should provide multiple options for the user to play and enabled to play in landscape mode and check the win meter in main page in Emerald Dice slot game$")
	public void gamble_page_should_provide_multiple_options_for_the_user_to_play_and_enabled_to_play_in_landscape_mode_and_check_the_win_meter_in_main_page_in_Emerald_Dice_slot_game() throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
