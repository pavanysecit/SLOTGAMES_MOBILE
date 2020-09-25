package stepDefinition_BouncingFruits;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BouncingFruits_AutoSpin_Validations_GamblePage {
	AppiumDriver<MobileElement> driver;

	public BouncingFruits_AutoSpin_Validations_GamblePage() throws InterruptedException {
		this.driver = BouncingFruits_URL_Login.getDriver();
		//this.driver = BouncingFruits_URL_TryNow.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Bouncing Fruits slot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality after navigating from gamble page to game page$")
	public void chrome_browser_valid_URL_valid_login_details_Bouncing_Fruits_slot_game_balance_spin_button_auto_spin_button_auto_spins_option_and_check_for_buttons_behavior_functionality_after_navigating_from_gamble_page_to_game_page() throws Throwable {
		
	}

	@When("^Open the Bouncing Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons after navigating from gamble page to game page in Bouncing Fruits slot game$")
	public void open_the_Bouncing_Fruits_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_auto_spin_option_under_auto_spin_drop_down_and_check_behavior_of_different_buttons_after_navigating_from_gamble_page_to_game_page_in_Bouncing_Fruits_slot_game() throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 80);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		String Bal = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance amount:" +Bal);

		driver.findElement(By.id("hud_txtCredit")).click();
		//		Thread.sleep(1000);
		MobileElement cr4 = driver.findElement(By.id("hud_CreditPopup40.5"));
		String credit4 =cr4.getText();
		System.out.println(credit4);
		cr4.click();
		//		Thread.sleep(1000);

		driver.findElement(By.id("hud_txtBetAmount")).click();
		//		Thread.sleep(1000);
		MobileElement bet4_3= driver.findElement(By.id("hud_BetPopup350"));
		String Betval4_3 =bet4_3.getText();
		System.out.println(Betval4_3);
		bet4_3.click();
		//		Thread.sleep(0500);

		driver.findElement(By.id("hud_btnAuto")).click();
		//		Thread.sleep(0500);

		MobileElement winE = driver.findElement(By.id("hud_Hud_txtWin1"));
		String prewin = winE.getText();
		//System.out.println("Balance before win is"+" "+prewin);                    
		String winTex= winE.getText();

		while(prewin.isEmpty()){	
			String Bal1 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
			String zerobal = "0.00";
			if(Bal1 == zerobal) {
				Thread.sleep(1000);
				MobileElement insuffientbal = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[3]"));
				insuffientbal.click();
				driver.quit();
			}else {
				Thread.sleep(1000);	
				winTex = winE.getText();
				prewin= prewin+winTex;
				System.out.println(winTex.isEmpty());
			}		
		}
		//		for(;;){
		//			
		//			if(insuffient.isDisplayed() == true) {
		//				insuffient.click();	
		//				break;
		//			}
		//		}
		System.out.println("Win amount is: " +prewin);	
		driver.findElement(By.id("hud_btnGamble")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("gamble_btnCollect")).click();
		Thread.sleep(0500);

		String postWin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance before adding win amount is: "+"  "+postWin);
		Thread.sleep(2000);

		MobileElement stop=(MobileElement) wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_btnSpin")));
		stop.click();
		Thread.sleep(3000);

		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		MobileElement cr3 = driver.findElement(By.id("hud_CreditPopup30.05"));
		String credit3 =cr3.getText();
		System.out.println(credit3);
		cr3.click();
		Thread.sleep(2000);

		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		MobileElement bet3_5= driver.findElement(By.id("hud_BetPopup520"));
		String Betval3_5 =bet3_5.getText();
		System.out.println(Betval3_5);
		bet3_5.click();
		Thread.sleep(1000);
		driver.findElement(By.id("hud_btnAuto")).click();
		Thread.sleep(2000);
		stop.click();
		Thread.sleep(1000);

		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		MobileElement cr41 = driver.findElement(By.id("hud_CreditPopup40.5"));
		String credit41 =cr41.getText();
		System.out.println(credit41);
		cr41.click();
		Thread.sleep(2000);

		MobileElement start=(MobileElement) wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_btnSpin")));
		Boolean strt =start.isDisplayed();
		if( strt) {
			System.out.println("start button is visible :"+strt);
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed as spin button is not visible");
		}
		Thread.sleep(3000);
	}

	@Then("^Bet value & Credit value buttons should not be clickable after navigating from gamble page in Bouncing Fruits slot game$")
	public void bet_value_Credit_value_buttons_should_not_be_clickable_after_navigating_from_gamble_page_in_Bouncing_Fruits_slot_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Win amount should get added to the balance during autoplay in Bouncing Fruits slot game$")
	public void win_amount_should_get_added_to_the_balance_during_autoplay_in_Bouncing_Fruits_slot_game() throws Throwable {
		Thread.sleep(1000);
	    driver.quit();
	}
}
