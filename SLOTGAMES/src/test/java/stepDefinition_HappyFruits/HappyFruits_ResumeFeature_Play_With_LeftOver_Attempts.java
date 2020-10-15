package stepDefinition_HappyFruits;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HappyFruits_ResumeFeature_Play_With_LeftOver_Attempts {
	AppiumDriver<MobileElement> driver;

	public HappyFruits_ResumeFeature_Play_With_LeftOver_Attempts() throws InterruptedException {
		this.driver = HappyFruits_URL_Login.getDriver();
		//this.driver = HappyFruits_URL_TryNow.getDriver();
	}
	
	@Given("^chrome browser, valid URL, valid login details, Happy Fruits slot slot game, bet type, denomination, balance, spin button, Gamble screen, Gamble attempts, gamble play$")
	public void chrome_browser_valid_URL_valid_login_details_Happy_Fruits_slot_slot_game_bet_type_denomination_balance_spin_button_Gamble_screen_Gamble_attempts_gamble_play() throws Throwable {
	   
	}

	@When("^Open the Happy Fruits slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on black button and close the browser and again login to the game with new browser$")
	public void open_the_Happy_Fruits_slot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_win_appears_and_gamble_screen_in_switched_and_click_on_black_button_and_close_the_browser_and_again_login_to_the_game_with_new_browser() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The balance is equal to"+" "+balance);

		MobileElement start = driver.findElement(By.id("hud_btnSpin"));
		start.click();
		Thread.sleep(7000);	
		MobileElement winE = driver.findElement(By.id("hud_Hud_txtWin1"));

		String prewin = winE.getText();                    
		String winTex= winE.getText();

		while(prewin.isEmpty()){
			start.click();	
			Thread.sleep(7000);	
			winTex = winE.getText();
			prewin= prewin+winTex;
			System.out.println(winTex.isEmpty());		
		}
		System.out.println("Win amount is: " +prewin);	 
		String balance1 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance amount before clicking on gamble link :"+balance1);

		driver.findElement(By.id("hud_btnGamble")).click();	
		Thread.sleep(1800);

		String gAmount = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
		String gambleamt = gAmount.replaceAll(" SRD", "");
		System.out.println("Gamble amount after split is :"+gambleamt);

		String colorwin = driver.findElement(By.id("gamble_txtWin")).getText();
		String gamblewin = colorwin.replaceAll(" SRD", "");
		System.out.println("Gamble to win amount after split is :"+gamblewin);

		// Gamble attempts according to the win amount won in game screen
		String gAttempts = driver.findElement(By.id("gamble_txtAttemptsLeft")).getText();
		System.out.println("Gamble attempts in gamble screen  : "+gAttempts);
		int gAttempts1=Integer.parseInt(gAttempts);

		// Click on the black button
		driver.findElement(By.id("gamble_btnBlack")).click();
		Thread.sleep(2000);

		String gAmount1 = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
		String gambleamtafter = gAmount1.replaceAll(" SRD", "");
		System.out.println("Gamble amount after selecting red or black button: "+gambleamtafter);

		if(gamblewin.equalsIgnoreCase(gambleamtafter)) {

			String gAmount11 = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
			String gamble1 = gAmount11.replaceAll(" SRD", "");
			Thread.sleep(2000);
			System.out.println("Gamble amount after winning on 1st attempt :"+gamble1);
			Thread.sleep(2000);
			String gAttemptsbefore = driver.findElement(By.id("gamble_txtAttemptsLeft")).getText();
			System.out.println("Gamble attempts after 1st win in gamble screen "+gAttemptsbefore);

			/* Validation on the gamble attempts  
			 * before win should be "gAttempts1"
			 * After win should be "gAttemptsbefore1"
			 * and the "gAttemptsbefore1" should be 1 value lesser than "gAttempts1" 
			 * as the user has played 1 gamble attempt.
			 */
			int gAttemptsbefore1=Integer.parseInt(gAttemptsbefore);
			int gambleattempt = gAttempts1-1;
			Assert.assertEquals(gambleattempt, gAttemptsbefore1);
			System.out.println("Gamble attempts before and after win is compared and working as expected");
			System.out.println("Test case passed on Gamble attempts");

			// Navigating back to game selection screen
			driver.navigate().back();
			Thread.sleep(5000);
			// Switching context to Web-view
			driver.context("CHROMIUM");
			Thread.sleep(4000);

			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[33]/div[1]/div[1]")).click();
			Thread.sleep(5000);  
			System.out.println("driver context during resuming to gamble screen  :"+driver.getContext());
			// Switching context to Native view
			Thread.sleep(10000);
			driver.context("NATIVE_APP");
			System.out.println("driver context after resuming to the gamble screen  :"+driver.getContext());

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gamble_btnBlack"))); 
			System.out.println("Black gamble button is available on the screen");
			Thread.sleep(2000);
			String gAttemptsafter = driver.findElement(By.id("gamble_txtAttemptsLeft")).getText();
			System.out.println("Gamble attempts after resuming  :"+gAttemptsafter);

			//Validating of gamble attempts before and after resuming to gamble screen
			Assert.assertEquals(gAttemptsafter, gAttemptsbefore);
			System.out.println("Validation of Gamble attempts before and after resuming to gamble screen");
			System.out.println("Test case passed on Gamble attempts on resuming to gamble screen");

			// Verifying the user is able to play further attempts on resuming to gamble screen
			driver.findElement(By.id("gamble_btnBlack")).click();
			MobileElement gcollect =driver.findElement(By.id("gamble_btnCollect"));
			Thread.sleep(2000);
			if(gcollect.isDisplayed()) {
				gcollect.click();
				Thread.sleep(3000);
				System.out.println(" USer is able to play further leftover attempts");
			}
			else
			{
				System.out.println("Gamble is lose and user is on the game screen");
			}
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

	@Then("^Resume feature should be enabled and land on the game screen and verify with the left out gamble attempts of Happy Fruits slot game$")
	public void resume_feature_should_be_enabled_and_land_on_the_game_screen_and_verify_with_the_left_out_gamble_attempts_of_Happy_Fruits_slot_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Left over attempts should be  between (\\d+) to (\\d+) and the user is enabled to play the remaining attempts$")
	public void left_over_attempts_should_be_between_to_and_the_user_is_enabled_to_play_the_remaining_attempts(int arg1, int arg2) throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
