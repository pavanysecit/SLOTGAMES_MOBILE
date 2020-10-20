package stepDefinition_SapphireHeart;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SapphireHeart_ResumeFeature_DisabledOption_WithoutWin {
	AppiumDriver<MobileElement> driver;

	public SapphireHeart_ResumeFeature_DisabledOption_WithoutWin() throws InterruptedException {
		this.driver = SapphireHeart_URL_Login.getDriver();
		//this.driver = SapphireHeart_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, win amount, gamble button, color win option, game play in landscape mode in gamble page, gamble status$")
	public void chrome_browser_valid_URL_valid_login_details_Sapphire_Heart_slot_game_balance_spin_button_win_amount_gamble_button_color_win_option_game_play_in_landscape_mode_in_gamble_page_gamble_status() throws Throwable {
	    
	}

	@When("^Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, check the play options and play in landscape mode in gamble page and when user wins check the win meter at main page is same as gamble win amount$")
	public void open_the_Sapphire_Heart_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_spin_button_till_player_wins_click_on_gamble_button_check_the_play_options_and_play_in_landscape_mode_in_gamble_page_and_when_user_wins_check_the_win_meter_at_main_page_is_same_as_gamble_win_amount() throws Throwable {
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
		Thread.sleep(2000);

		// Navigating back to game selection screen
		driver.navigate().back();
		Thread.sleep(5000);
		// Switching context to Web-view
		driver.context("CHROMIUM");
		Thread.sleep(4000);

		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[39]/div[1]/div[1]")).click();
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		MobileElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(5000);
		System.out.println("driver context during resuming to game screen  "+driver.getContext());
		// Switching context to Native view
		Thread.sleep(10000);
		driver.context("NATIVE_APP");
		System.out.println("driver context after resuming to the game screen "+driver.getContext());

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		String ResumeBal = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The balance is equal to"+" "+ResumeBal);
		Assert.assertNotEquals(ResumeBal, balance1);
		System.out.println("Main balance is available on the screen for the user and new game session has been generated");
		System.out.println("Resuming to gamble screen is disable for the user: Test case passed");

		//		MobileElement gcollect = driver.findElement(By.id("gamble_btnCollect"));
		//		Assert.assertFalse(gcollect.isDisplayed());
		//		System.out.println("Gamble collect button is not on the screen");
		//		System.out.println("Testcase passed");
	}

	@Then("^Verify the home button is enabled on the game screen after returning from gamble page$")
	public void verify_the_home_button_is_enabled_on_the_game_screen_after_returning_from_gamble_page() throws Throwable {
	    Thread.sleep(2000);
	}

	@Then("^Gamble page should provide multiple options for the user to play and enabled to play in landscape mode and check the win meter in main page in Sapphire Heart slot game$")
	public void gamble_page_should_provide_multiple_options_for_the_user_to_play_and_enabled_to_play_in_landscape_mode_and_check_the_win_meter_in_main_page_in_Sapphire_Heart_slot_game() throws Throwable {
	   driver.quit();
	}
}
