package stepDefinition_FruitFortune;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FruityFortune_AutoSpin_Check_WinAmount_AddedToBalance {
	AppiumDriver<MobileElement> driver;

	public FruityFortune_AutoSpin_Check_WinAmount_AddedToBalance() throws InterruptedException {
		this.driver = FruityFortune_URL_Login.getDriver();
		//this.driver = FruityFortune_URL_TryNow.getDriver();
		}
	
	
	@Given("^Chrome browser, valid URL, valid login details, Fruity Fortune slot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality after navigating from gamble page to game page$")
	public void chrome_browser_valid_URL_valid_login_details_Fruity_Fortune_slot_game_balance_spin_button_auto_spin_button_auto_spins_option_and_check_for_buttons_behavior_functionality_after_navigating_from_gamble_page_to_game_page() throws Throwable {
	    
	}

	@When("^Open the Fruity Fortune slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons after navigating from gamble page to game page$")
	public void open_the_Fruity_Fortune_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_auto_spin_option_under_auto_spin_drop_down_and_check_behavior_of_different_buttons_after_navigating_from_gamble_page_to_game_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		//Storing the value before converting the balance into credits
		String Bal = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance amount:" +Bal);

		// Select the credit 
		MobileElement cr1 =	driver.findElement(By.id("hud_txtCredit"));
		String credit1 =cr1.getText();
		System.out.println("Selected credit value: "+credit1);
		Thread.sleep(1000);

		// Select the bet 
		MobileElement bet1_1= driver.findElement(By.id("hud_txtBetAmount"));
		String Betval1_1 =bet1_1.getText();
		System.out.println("Selected betvalue value: "+Betval1_1);
		Thread.sleep(1000);

		// click on AutoSpin
		driver.findElement(By.id("hud_btnAuto")).click();
		Thread.sleep(2000);

		MobileElement winE = driver.findElement(By.id("hud_Hud_txtWin1"));
		String prewin = winE.getText();                    
		String winTex= winE.getText();

		while(prewin.isEmpty()){	
			Thread.sleep(1800);	
			winTex = winE.getText();
			prewin= prewin+winTex;
			System.out.println(winTex.isEmpty());		
		}
		driver.findElement(By.id("hud_btnGamble")).click();
		Thread.sleep(2000);
		System.out.println("Win amount is: " +prewin);
		String winTex1 = prewin.replaceAll(",", "");
		String balance1 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String bal1 = balance1.replaceAll(",", "");
		System.out.println("Balance amount before win amount adding:"+bal1);
		
		double conValue = Double.parseDouble(winTex1) + Double.parseDouble(bal1);
		String dbi = String.format("%.2f", conValue);  
		System.out.println("Balance amount to be validated "+dbi);
		
		driver.findElement(By.id("gamble_btnCollect")).click();
		Thread.sleep(0500);
		String balance2 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance amount after win amount adding:"+balance2);
		Assert.assertEquals(dbi, balance2);
		System.out.println("Balance is verified and win amount is added automatically to main balance");
	}
	
	@Then("^Bet value & Credit value buttons should not be clickable after navigating from gamble page$")
	public void bet_value_Credit_value_buttons_should_not_be_clickable_after_navigating_from_gamble_page() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Win amount should get added to the balance during autoplay$")
	public void win_amount_should_get_added_to_the_balance_during_autoplay() throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
