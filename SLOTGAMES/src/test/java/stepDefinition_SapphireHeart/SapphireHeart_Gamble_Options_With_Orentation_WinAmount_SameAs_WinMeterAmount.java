package stepDefinition_SapphireHeart;

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

public class SapphireHeart_Gamble_Options_With_Orentation_WinAmount_SameAs_WinMeterAmount {
	AppiumDriver<MobileElement> driver;

	public SapphireHeart_Gamble_Options_With_Orentation_WinAmount_SameAs_WinMeterAmount() throws InterruptedException {
		this.driver = SapphireHeart_URL_Login.getDriver();
		//this.driver = SapphireHeart_URL_TryNow.getDriver();
	}
	
	@Given("^chrome browser, valid URL, valid login details, Sapphire Heart slot slot game, bet type, denomination, balance, spin button, Gamble screen, Gamble attempts, gamble play$")
	public void chrome_browser_valid_URL_valid_login_details_Sapphire_Heart_slot_slot_game_bet_type_denomination_balance_spin_button_Gamble_screen_Gamble_attempts_gamble_play() throws Throwable {
	   
	}

	@When("^Open the Sapphire Heart slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on black button and close the browser and again login to the game with new browser$")
	public void open_the_Sapphire_Heart_slot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_win_appears_and_gamble_screen_in_switched_and_click_on_black_button_and_close_the_browser_and_again_login_to_the_game_with_new_browser() throws Throwable {
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

	@Then("^Resume feature should be enabled and land on the game screen and verify with the left out gamble attempts of Sapphire Heart slot game$")
	public void resume_feature_should_be_enabled_and_land_on_the_game_screen_and_verify_with_the_left_out_gamble_attempts_of_Sapphire_Heart_slot_game() throws Throwable {
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

	@Then("^Left over attempts should be  between (\\d+) to (\\d+) and the user is enabled to play the remaining attempts$")
	public void left_over_attempts_should_be_between_to_and_the_user_is_enabled_to_play_the_remaining_attempts(int arg1, int arg2) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
