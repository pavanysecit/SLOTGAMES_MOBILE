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

public class SkinfiriMysterious_Gamble_Check_GambleLink_Availability_As_CreditAndBetValue_Changes {
	AppiumDriver<MobileElement> driver;

	public SkinfiriMysterious_Gamble_Check_GambleLink_Availability_As_CreditAndBetValue_Changes() throws InterruptedException {
		this.driver = SkinfiriMysterious_URL_Login.getDriver();
		//this.driver = SkinfiriMysterious_URL_TryNow.getDriver();
	}
		
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious slot game, balance, transfer button, bet values, credit values spin button and Gamble Link$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_slot_game_balance_transfer_button_bet_values_credit_values_spin_button_and_Gamble_Link() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
	}

	@When("^Open the Skinfiri Mysterious slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till player wins, enables Gamble link and change bet or credit$")
	public void open_the_Skinfiri_Mysterious_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_amount_click_on_spin_button_till_player_wins_enables_Gamble_link_and_change_bet_or_credit() throws Throwable {
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The balance is equal to"+" "+balance);
		MobileElement credit1= driver.findElement(By.id("hud_txtCredit"));
		MobileElement bet1= driver.findElement(By.id("hud_txtBetAmount"));

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
		String balance1 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance amount before clicking on gamble link :"+balance1);

		// Verifying the Gamble Link is available and after credit values changes
		MobileElement GambleLink =driver.findElement(By.id("hud_btnGamble")); 
		if(GambleLink.isDisplayed())
		{
			credit1.click();
			MobileElement cr2 = driver.findElement(By.id("hud_CreditPopup20.02"));
			cr2.click();
			Thread.sleep(2000);
			Assert.assertFalse(GambleLink.isDisplayed());
			System.out.println("Gamble link is not available on the screen: Testcase Passed");
		}
		else {
			System.out.println("Gamble link is available on the screen: Testcase Failed");
		}

		// Start the spin for second itteration for betvalue changes
		start.click();
		Thread.sleep(7000);	
		String prewin1 = winE.getText();                    
		String winTex1= winE.getText();

		while(prewin1.isEmpty()){
			start.click();	
			Thread.sleep(8000);	
			winTex1 = winE.getText();
			prewin1= prewin1+winTex1;
			System.out.println(winTex1.isEmpty());		
		}
		System.out.println("Win amount is: " +prewin1);	

		// Verifying the Gamble Link is available and after bet values changes
		if(GambleLink.isDisplayed())
		{
			bet1.click();
			Thread.sleep(2000);
			MobileElement bet2_2 = driver.findElement(By.id("hud_BetPopup20.8"));
			bet2_2.click();
			Thread.sleep(1000);
			Assert.assertFalse(GambleLink.isDisplayed());
			System.out.println("Gamble link is not available on the screen: Testcase Passed");
		}
		else {
			System.out.println("Gamble link is available on the screen: Testcase Failed");
		}


		//#######################################################################################################
		// Verifying the Gamble Link is available and after credit values changes to same credit value
		start.click();
		Thread.sleep(7000);
		String prewin2 = winE.getText();                  
		String winTex2= winE.getText();

		while(prewin2.isEmpty()){
			start.click();	
			Thread.sleep(8000);	
			winTex2 = winE.getText();
			prewin2= prewin2+winTex2;
			System.out.println(winTex2.isEmpty());		
		}
		System.out.println("Win amount is: " +prewin2);	 

		// Verifying the Gamble Link is available and after credit values changes
		if(GambleLink.isDisplayed())
		{
			credit1.click();
			MobileElement cr1 = driver.findElement(By.id(" "));
			cr1.click();
			Thread.sleep(2000);
			Assert.assertTrue(GambleLink.isDisplayed());
			System.out.println("Gamble link is available on the screen: Testcase Passed");
		}
		else {
			System.out.println("Gamble link is not available on the screen: Testcase Failed");
		}

		// Start the spin for fourth itteration for betvalue changes
		start.click();
		Thread.sleep(7000);	
		String prewin3 = winE.getText();                    
		String winTex3= winE.getText();

		while(prewin3.isEmpty()){
			start.click();	
			Thread.sleep(8000);	
			winTex3 = winE.getText();
			prewin3= prewin3+winTex3;
			System.out.println(winTex3.isEmpty());		
		}
		System.out.println("Win amount is: " +prewin1);	

		// Verifying the Gamble Link is available and after bet values changes
		if(GambleLink.isDisplayed())
		{
			bet1.click();
			Thread.sleep(2000);
			MobileElement bet1_1 = driver.findElement(By.id(" "));
			bet1_1.click();
			Thread.sleep(1000);
			Assert.assertTrue(GambleLink.isDisplayed());
			System.out.println("Gamble link is available on the screen: Testcase Passed");
		}
		else {
			System.out.println("Gamble link is not available on the screen: Testcase Failed");
		}
	}

	@Then("^Verify the gamble link on the screen and should not be available for the user$")
	public void verify_the_gamble_link_on_the_screen_and_should_not_be_available_for_the_user() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
