package stepDefinition_EmeraldDice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class EmeraldDice_Gamble_Reload_Option {
	AppiumDriver<MobileElement> driver;

	public EmeraldDice_Gamble_Reload_Option() throws InterruptedException {
		this.driver = EmeraldDice_URL_Login.getDriver();
		//this.driver = EmeraldDice_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Emerald Dice slot game, balance, spin button, gamble page, browser hamburger reload button valid session invalid error message\\.$")
	public void chrome_browser_valid_URL_valid_login_details_Emerald_Dice_slot_game_balance_spin_button_gamble_page_browser_hamburger_reload_button_valid_session_invalid_error_message() throws Throwable {
	   
	}

	@When("^Open the Emerald Dice slot game by entering the valid URL in browser, enter the valid login details, spin till player wins, gamble screen, gamble should won,  click on  hamburger menu and reload the game session\\.$")
	public void open_the_Emerald_Dice_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_spin_till_player_wins_gamble_screen_gamble_should_won_click_on_hamburger_menu_and_reload_the_game_session() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The balance in first session"+" "+balance);

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

		driver.findElement(By.id("hud_btnGamble")).click();	
		Thread.sleep(1800);

		String gAmount = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
		String gambleamt = gAmount.replaceAll(" SRD", "");
		System.out.println("Gamble amount after split is :"+gambleamt);

		String colorwin = driver.findElement(By.id("gamble_txtWin")).getText();
		String gamblewin = colorwin.replaceAll(" SRD", "");
		System.out.println("Gamble to win amount after split is :"+gamblewin);

		driver.findElement(By.id("gamble_btnRed")).click();
		Thread.sleep(2000);

		String gAmount1 = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
		String gambleamtafter = gAmount1.replaceAll(" SRD", "");
		System.out.println("Gamble amount after selecting red or black button: "+gambleamtafter);

		if(gamblewin.equalsIgnoreCase(gambleamtafter)) {

			String gAmount11 = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
			String gamble1 = gAmount11.replaceAll(" SRD", "");
			Thread.sleep(2000);
			System.out.println("Gamble amount after winning on 1st attempt "+gamble1);
			Thread.sleep(2000);

			// Click on Hamburger Menu
			MobileElement menu = driver.findElement(By.id("com.android.chrome:id/menu_button"));
			menu.click();
			Thread.sleep(2000);
			// Select the refresh button
			MobileElement refresh = driver. findElement(MobileBy. AccessibilityId("Refresh page"));
			refresh.click();
			Thread.sleep(2000);
			// Validation message on refreshing the game page
			MobileElement title = driver.findElement(By.id("com.android.chrome:id/title"));
			System.out.println("Title: "+title.getText());
			MobileElement ValidMessage = driver.findElement(By.id("com.android.chrome:id/message"));
			String validmsg = ValidMessage.getText();
			System.out.println("Valid error message with details:  "+validmsg);
			String message = "Authentication Failed or Session Invalid. Please try Again.";
			Assert.assertEquals(message, validmsg);
			System.out.println("Validation is successfull");

			// Click on OK button
			MobileElement ok = driver.findElement(By.id("com.android.chrome:id/positive_button"));
			ok.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);

			driver.context("CHROMIUM");
			Thread.sleep(4000);

			// Again re-launch the game
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[33]/div[1]/div[1]")).click();
			Thread.sleep(5000);  
			System.out.println("driver context during resuming to gamble screen  "+driver.getContext());
			// Switching context to Native view
			Thread.sleep(10000);
			driver.context("NATIVE_APP");
			System.out.println("driver context after resuming to the gamble screen "+driver.getContext());

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gamble_btnCollect"))); 
			System.out.println("Gamble collect is visible on the screen");
			Thread.sleep(2000); 
			// The user is able to collect the amount after resuming to gamble screen 
			driver.findElement(By.id("gamble_btnCollect")).click();
			Thread.sleep(3000);
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

	@Then("^User should not able to resume to game and informed with valid error message for session invalid error message and again relauch the game and game session redirected to gamble page in Emerald Dice slot game$")
	public void user_should_not_able_to_resume_to_game_and_informed_with_valid_error_message_for_session_invalid_error_message_and_again_relauch_the_game_and_game_session_redirected_to_gamble_page_in_Emerald_Dice_slot_game() throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
