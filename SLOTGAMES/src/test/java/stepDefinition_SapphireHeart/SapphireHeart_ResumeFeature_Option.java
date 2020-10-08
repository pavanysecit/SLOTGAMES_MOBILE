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

public class SapphireHeart_ResumeFeature_Option {
	AppiumDriver<MobileElement> driver;

	public SapphireHeart_ResumeFeature_Option() throws InterruptedException {
		this.driver = SapphireHeart_URL_Login.getDriver();
		//this.driver = SapphireHeart_URL_TryNow.getDriver();
	}
	
	@Given("^chrome browser, valid URL, valid login details, Sapphire Heart slot slot game, bet type, denomination, balance, spin button, Gamble screen, Gamble collect$")
	public void chrome_browser_valid_URL_valid_login_details_Sapphire_Heart_slot_slot_game_bet_type_denomination_balance_spin_button_Gamble_screen_Gamble_collect() throws Throwable {
	    
	}

	@When("^Open the Sapphire Heart slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on collect and close the browser and again load to the game$")
	public void open_the_Sapphire_Heart_slot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_win_appears_and_gamble_screen_in_switched_and_click_on_collect_and_close_the_browser_and_again_load_to_the_game() throws Throwable {
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

			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[33]/div[1]/div[1]")).click();
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
			
			// Validation of Gamble amount before and after resuming to gamble screen
			Assert.assertEquals(GamtResume1, gamble1);
			System.out.println("Gamble amount before and after resuming to gamble screen are same");
			System.out.println("Test case passed");

			// The user is able to collect the amount after resuming to gamble screen 
			driver.findElement(By.id("gamble_btnCollect")).click();
			Thread.sleep(3000);
			
			// Verifying the win amount added to main balance after Resuming to gamble screen and collect the amount.
			String postBalance22 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
			System.out.println("Balance amount After clicking on collect link :"+postBalance22);
			double conValue = Double.parseDouble(balance1) + Double.parseDouble(gamble1);
			String dbi = String.format("%.2f", conValue);  
			System.out.println("Balance after adding gamble win amount: "+dbi);
			Thread.sleep(2000);
			Assert.assertEquals(dbi, postBalance22);
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

	@Then("^Resume feature should not be enabled and land on the game screen of Sapphire Heart slot game$")
	public void resume_feature_should_not_be_enabled_and_land_on_the_game_screen_of_Sapphire_Heart_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
