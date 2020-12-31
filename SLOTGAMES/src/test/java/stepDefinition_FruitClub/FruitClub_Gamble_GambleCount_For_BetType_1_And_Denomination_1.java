package stepDefinition_FruitClub;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FruitClub_Gamble_GambleCount_For_BetType_1_And_Denomination_1 {
	AppiumDriver<MobileElement> driver;

	public FruitClub_Gamble_GambleCount_For_BetType_1_And_Denomination_1() throws InterruptedException {
		this.driver = FruitClub_URL_Login.getDriver();
		//this.driver = FruitClub_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Fruit Club slot game, transfer button, bet type as (\\d+)\\.(\\d+), denomination as (\\d+)\\.(\\d+), balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count$")
	public void chrome_browser_valid_URL_valid_login_details_Fruit_Club_slot_game_transfer_button_bet_type_as_denomination_as_balance_spin_button_win_amount_gamble_button_gamble_amount_game_info_page_and_gamble_count(int arg1, int arg2, int arg3, int arg4) throws Throwable {
	    
	}

	@When("^Open the Fruit Club slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Fruit Club slot game, transfer the amount, select bet type as (\\d+)\\.(\\d+) & denomination as (\\d+)\\.(\\d+), click on spin button till player wins, click on gamble button and check the gamble count$")
	public void open_the_Fruit_Club_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_Fruit_Club_slot_game_transfer_the_amount_select_bet_type_as_denomination_as_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_count(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The current balance of the account :" +balance);

		// Select the credit 
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(1000);
		MobileElement cr1 = driver.findElement(By.id("hud_CreditPopup10.02"));
		String credit1 =cr1.getText();
		System.out.println("Selected credit type: " +credit1);
		String expectedA = "0.02";
		Assert.assertEquals(expectedA, credit1);
		cr1.click();
		Thread.sleep(1000);

		// select the bet value
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(1000);
		MobileElement bet1_1= driver.findElement(By.id("hud_BetPopup10.1"));
		String Betval1_1 =bet1_1.getText();
		System.out.println("Selected bet value: " +Betval1_1);
		String expectedB = "0.1";
		Assert.assertEquals(expectedB, Betval1_1);
		Thread.sleep(2000);
		bet1_1.click();

		MobileElement start = driver.findElement(By.id("hud_btnSpin"));
		start.click();
		Thread.sleep(8000);
		MobileElement winE = driver.findElement(By.id("hud_Hud_txtWin1"));

		String prewin = winE.getText();
		//System.out.println("Balance before win is"+" "+prewin);                    
		String winTex= winE.getText();

		while(prewin.isEmpty()){
			start.click();	
			Thread.sleep(8000);	
			winTex = winE.getText();
			prewin= prewin+winTex;
			System.out.println(winTex.isEmpty());		
		}
		System.out.println("Win amount is: " +prewin);	
		System.out.println("Maximum gamble win amount for bet amount 0.2 and credit value 0.02 is : 3.5 SRD");	                                                                                                                             
		Double maxV = Double.parseDouble(prewin);
		if(maxV < 3.5)
		{
			System.out.println("Win amount less than Gamble max value 3.5 i.e : "+" " +maxV +". Test Case Passed");
		}
		else
		{
			System.out.println("Win amount greater than Gamble max value 3.5 : i.e "+" " +maxV +". Test Case Failed");
			driver.findElement(By.id("hud_btnGamble")).isDisplayed();
			Thread.sleep(2000);
			driver.quit();
		}
		Thread.sleep(2000);
		driver.findElement(By.id("hud_btnGamble")).click();	
		Thread.sleep(3000);
		Double monty = Double.parseDouble(prewin);
		System.out.println("Gamble amount is equal to win amount & the amount is :"+" "+monty);
		MobileElement attempts = driver.findElement(By.id("gamble_txtAttemptsLeft"));

		System.out.println("No. of attempts left :"+" "+attempts.getText());
		if(monty>=0.1 && monty<=0.2)
		{
			System.out.println("The no. of attempts should be : "+" "+"5"+" "+" & no. of actual attempts are :"+attempts.getText());
			Assert.assertEquals("5",attempts.getText());
		}
	   else if(monty>0.2 && monty<=0.4){
		  System.out.println("The no. of attempts should be : "+" "+"4"+" "+"& no. of actual attempts are :"+attempts.getText());
		  
		  Assert.assertEquals("4", attempts.getText());
		}
	   else if(monty>0.4 && monty<=0.8){
		  System.out.println("The no. of attempts should be :"+" "+"3"+" "+"& no. of actual attempts are :"+attempts.getText());
		  
		  Assert.assertEquals("3",attempts.getText());
	   }
	   else if(monty>0.8 && monty<=1.6){
		  System.out.println("The no. of attempts should be :"+" "+"2"+" "+"& no. of actual attempts are :"+attempts.getText());
		  
		  Assert.assertEquals("2",attempts.getText());
	   }
	   else if(monty>1.6 && monty<=3.5){
		  System.out.println("The no. of attempts should be :"+" "+"1"+" "+"& no. of actual attempts are:"+attempts.getText());  
		  
		  Assert.assertEquals("1", attempts.getText());
	   }
		 driver.findElement(By.id("gamble_btnCollect")).click();
		 System.out.println("The testcase has passed");
	}

	@Then("^Gamble count should be displayed based on winning amount and max amount of the gamble configured on the game info page for bet type (\\d+)\\.(\\d+) and denomination (\\d+)\\.(\\d+) in Fruit Club game$")
	public void gamble_count_should_be_displayed_based_on_winning_amount_and_max_amount_of_the_gamble_configured_on_the_game_info_page_for_bet_type_and_denomination_in_Fruit_Club_game(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}