package stepDefinition_TreasureBonanza;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TreasureBonanza_Gamble_GambleCount_For_BetType_1_And_Denomination_3 {
	AppiumDriver<MobileElement> driver;

	public TreasureBonanza_Gamble_GambleCount_For_BetType_1_And_Denomination_3() throws InterruptedException {
		this.driver = TreasureBonanza_Login_URL.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as (\\d+)\\.(\\d+), denomination as (\\d+)\\.(\\d+), balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_bet_type_as_denomination_as_balance_spin_button_win_amount_gamble_button_gamble_amount_game_info_page_and_gamble_count_in_gamble_page(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		
		MobileElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(15000);

		String parent1=driver.getWindowHandle();
		Set<String>s1=driver.getWindowHandles();

		System.out.println("Window for slot game is"+" "+s1);
		 
		Set<String> contx = driver.getContextHandles();
		String pk = driver.getContext();
		//System.out.println("The current contesx is"+" "+pk);
		for(String cont:contx){
			 System.out.println(cont);
		 }
		driver.context("NATIVE_APP");
		Thread.sleep(4000);
	}

	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as (\\d+)\\.(\\d+) & denomination as (\\d+)\\.(\\d+), click on spin button till player wins, click on gamble button and check the gamble count in gamble page$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_golden_hot_slot_game_select_bet_type_as_denomination_as_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_count_in_gamble_page(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The current balance of the account :" +balance);
		List<MobileElement> balanc = driver.findElementsByClassName("android.view.View");
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		for(MobileElement be:balanc)
		{
			
			if(be.getText().equals("1")){
				be.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String betValue = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +betValue);
		String actualB = betValue;
		String expectedB = "1";
		Assert.assertEquals(expectedB, actualB);
		Thread.sleep(2000);

		MobileElement start = driver.findElement(By.id("hud_btnSpin"));
		start.click();
		MobileElement winE = driver.findElement(By.id("hud_Hud_txtWin1"));

		String prewin = winE.getText();
		//System.out.println("Balance before win is"+" "+prewin);                    
		String winTex= winE.getText();
		                       
		while(prewin.isEmpty()){
			start.click();	
			Thread.sleep(4000);	
			winTex = winE.getText();
			prewin= prewin+winTex;
			System.out.println(winTex.isEmpty());		
		}
		System.out.println("Win amount is: " +prewin);	
		System.out.println("Maximum gamble win amount for bet amount 1 and credit value 0.01 is : 35 SRD");	                                                                                                                             
		Double maxV = Double.parseDouble(prewin);
		if(maxV < 35)
		   {
			   System.out.println("Win amount less than Gamble max value 35 i.e : "+" " +maxV +". Test Case Passed");
		   }
		else
		{
			System.out.println("Win amount greater than Gamble max value 35 : i.e "+" " +maxV +". Gamble link is not visible");
			boolean uy =! driver.findElement(By.id("hud_btnGamble")).isDisplayed();
			System.out.println(uy);
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
		if(monty>=0.1 && monty<=2.17)
		{
			System.out.println("The no. of attempts should be : "+" "+"5"+" "+" & no. of actual attempts are :"+attempts.getText());
			Assert.assertEquals("5",attempts.getText());
		}
	   else if(monty>2.17 && monty<=4.35){
		  System.out.println("The no. of attempts should be : "+" "+"4"+" "+"& no. of actual attempts are :"+attempts.getText());
		  
		  Assert.assertEquals("4", attempts.getText());
		}
	   else if(monty>4.35 && monty<=8.72){
		  System.out.println("The no. of attempts should be :"+" "+"3"+" "+"& no. of actual attempts are :"+attempts.getText());
		  
		  Assert.assertEquals("3",attempts.getText());
	   }
	   else if(monty>8.72 && monty<=17.45){
		  System.out.println("The no. of attempts should be :"+" "+"2"+" "+"& no. of actual attempts are :"+attempts.getText());
		  
		  Assert.assertEquals("2",attempts.getText());
	   }
	   else if(monty>17.45 && monty<=35){
		  System.out.println("The no. of attempts should be :"+" "+"1"+" "+"& no. of actual attempts are:"+attempts.getText());  
		  
		  Assert.assertEquals("1", attempts.getText());
	   }
		
		 driver.findElement(By.id("gamble_btnCollect")).click();
		 
		 System.out.println("The testcase has passed");
	}

	@Then("^Gamble count should be displayed on gamble page based on win amount and gamble max amount configured on the game info page for bet type (\\d+)\\.(\\d+) & denomination (\\d+)\\.(\\d+) Treasure Bonanza game$")
	public void gamble_count_should_be_displayed_on_gamble_page_based_on_win_amount_and_gamble_max_amount_configured_on_the_game_info_page_for_bet_type_denomination_Treasure_Bonanza_game(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
