package stepDefinition_PerfectGems;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PerfectGems_AutoSpin_Check_WinAmount_AddedToBalance {
	AppiumDriver<MobileElement> driver;

	public PerfectGems_AutoSpin_Check_WinAmount_AddedToBalance() throws InterruptedException {
		this.driver = PerfectGems_URL_Login.getDriver();
		//this.driver = PerfectGems_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, Autospin button, win amount added to balance$")
	public void chrome_browser_valid_URL_valid_login_details_Perfect_Gems_slot_game_balance_Autospin_button_win_amount_added_to_balance() throws Throwable {
	   
	}

	@When("^Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, select autospin, play till win triggers and observe win amount added to main balance in next spin itteration$")
	public void open_the_Perfect_Gems_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_autospin_play_till_win_triggers_and_observe_win_amount_added_to_main_balance_in_next_spin_itteration() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
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
		String bal2 = balance2.replaceAll(",", "");
		Assert.assertEquals(dbi, balance2);
		System.out.println("Balance is verified and win amount is added automatically to main balance");
	}

	@Then("^Automatically Win amount should get added to the main balance after win and balance should get increased with win amount and next spin should continue in Perfect Gems slot game$")
	public void automatically_Win_amount_should_get_added_to_the_main_balance_after_win_and_balance_should_get_increased_with_win_amount_and_next_spin_should_continue_in_Perfect_Gems_slot_game() throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
