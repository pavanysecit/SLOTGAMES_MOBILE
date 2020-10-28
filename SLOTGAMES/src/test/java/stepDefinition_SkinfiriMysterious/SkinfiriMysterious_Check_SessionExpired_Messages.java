package stepDefinition_SkinfiriMysterious;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SkinfiriMysterious_Check_SessionExpired_Messages {
	AppiumDriver<MobileElement> driver;

	public SkinfiriMysterious_Check_SessionExpired_Messages() throws InterruptedException {
		this.driver = SkinfiriMysterious_URL_Login.getDriver();
		//this.driver = SkinfiriMysterious_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious slot game, balance, spin button, full screen, landscape mode ,session terminated messages$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_slot_game_balance_spin_button_full_screen_landscape_mode_session_terminated_messages() throws Throwable {
	   
	}

	@When("^Open the Skinfiri Mysterious slot game by entering the valid URL in browser, enter the valid login details, and full screen and change orientation of the screen, idle for more (\\d+)mins$")
	public void open_the_Skinfiri_Mysterious_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_and_full_screen_and_change_orientation_of_the_screen_idle_for_more_mins(int arg1) throws Throwable {
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
		Assert.assertEquals(dbi, balance2);
		System.out.println("Balance is verified and win amount is added automatically to main balance");
	}

	@Then("^User is addressed with valid error message on the screen 'Session Expired' in Skinfiri Mysterious slot game$")
	public void user_is_addressed_with_valid_error_message_on_the_screen_Session_Expired_in_Skinfiri_Mysterious_slot_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Again relauch other slot game and verify user is able to continue gameplay$")
	public void again_relauch_other_slot_game_and_verify_user_is_able_to_continue_gameplay() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
