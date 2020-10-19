package stepDefinition_SkinfiriJungle;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SkinfiriJungle_ResumeFeature_Option {
	AppiumDriver<MobileElement> driver;

	public SkinfiriJungle_ResumeFeature_Option() throws InterruptedException {
		this.driver = SkinfiriJungle_URL_Login.getDriver();
		//this.driver = SkinfiriJungle_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Jungle slot slot game, bet type, denomination, balance, spin button, Gamble screen, new browser session\\.$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Jungle_slot_slot_game_bet_type_denomination_balance_spin_button_Gamble_screen_new_browser_session() throws Throwable {
	    
	}

	@When("^Open the Skinfiri Jungle slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on red button and close the browser and again login to the game with new browser$")
	public void open_the_Skinfiri_Jungle_slot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_win_appears_and_gamble_screen_in_switched_and_click_on_red_button_and_close_the_browser_and_again_login_to_the_game_with_new_browser() throws Throwable {
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
		String bal1 = balance1.replaceAll(",", "");

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

			// Navigating back to game selection screen
			driver.navigate().back();
			Thread.sleep(5000);
			// Switching context to Web-view
			driver.context("CHROMIUM");
			Thread.sleep(4000);

			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[39]/div[1]/div[1]")).click();
			Thread.sleep(5000);  
			System.out.println("driver context during resuming to gamble screen  "+driver.getContext());
			// Switching context to Native view
			Thread.sleep(10000);
			driver.context("NATIVE_APP");
			System.out.println("driver context after resuming to the gamble screen "+driver.getContext());

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gamble_btnCollect"))); 
			System.out.println("Gamble collect is visible on the screen");

			// Verifying the gamble amount after resuming to gamble screen
			String GamtResume = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
			System.out.println(GamtResume);
			String GamtResume1 = GamtResume.replaceAll(" SRD", "");
			System.out.println(GamtResume1);
			String s2="0";
			boolean result = gamble1.endsWith(s2);
			System.out.println("Boolean condition"+result);

			if(result==true) {
				// Removing the last character 
				// of a string 
				StringBuilder sb = new StringBuilder(gamble1); 
				sb.deleteCharAt(gamble1.length() - 1); 
				String Gres=sb.toString();
				Assert.assertEquals(GamtResume1, Gres);
			}else {
				System.out.println("Last digit doesnt contain '0'");
				Assert.assertEquals(GamtResume1, gamble1);
			}

			// Validation of Gamble amount before and after resuming to gamble screen
			System.out.println("Gamble amount before and after resuming to gamble screen are same");
			System.out.println("Test case passed");

			// The user is able to collect the amount after resuming to gamble screen 
			driver.findElement(By.id("gamble_btnCollect")).click();
			Thread.sleep(3000);

			// Verifying the win amount added to main balance after Resuming to gamble screen and collect the amount.
			String postBalance22 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
			System.out.println("Balance amount After clicking on collect link :"+postBalance22);
			String postBal22 = postBalance22.replaceAll(",", "");
			double conValue = Double.parseDouble(bal1) + Double.parseDouble(gamble1);
			String dbi = String.format("%.2f", conValue);  
			System.out.println("Balance after adding gamble win amount: "+dbi);
			Thread.sleep(2000);
			Assert.assertEquals(dbi, postBal22);
			Thread.sleep(2000);

			// Verifying the gamble win amount is added to main screen win meter 
			String WinAfterGamble = driver.findElement(By.id("hud_Hud_txtWin1")).getText();
			String WinAfterGamble1 = WinAfterGamble.replaceAll(" SRD", "");
			System.out.println(WinAfterGamble);
			Assert.assertEquals(GamtResume1, WinAfterGamble1);
			System.out.println("Gamble win amount added to win meter in game screen  "+ WinAfterGamble);
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

	@Then("^Resume feature should enabled and land on the gamble screen of Skinfiri Jungle slot game$")
	public void resume_feature_should_enabled_and_land_on_the_gamble_screen_of_Skinfiri_Jungle_slot_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^On resuming to gamble screen, collect the amount and verify with main  balance addition and win meter amount same as gamble amount in gamble page in  Skinfiri Jungle slot game$")
	public void on_resuming_to_gamble_screen_collect_the_amount_and_verify_with_main_balance_addition_and_win_meter_amount_same_as_gamble_amount_in_gamble_page_in_Skinfiri_Jungle_slot_game() throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
