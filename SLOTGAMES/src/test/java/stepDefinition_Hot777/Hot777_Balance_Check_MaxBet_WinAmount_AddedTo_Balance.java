package stepDefinition_Hot777;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Hot777_Balance_Check_MaxBet_WinAmount_AddedTo_Balance {
	AppiumDriver<MobileElement> driver;

	public Hot777_Balance_Check_MaxBet_WinAmount_AddedTo_Balance() throws InterruptedException {
		this.driver = Hot777_URL_Login.getDriver();
		//this.driver = Hot777_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Hot (\\d+) slot game, balance, spin button, gamble collect, max credit and bet value, win amount added to balance$")
	public void chrome_browser_valid_URL_valid_login_details_Hot_slot_game_balance_spin_button_gamble_collect_max_credit_and_bet_value_win_amount_added_to_balance(int arg1) throws Throwable {
	   
	}

	@When("^Open the Hot (\\d+) slot game by entering the valid URL in browser, enter the valid login details, spin till player wins, gamble screen, gamble collect, win amount added to main balance$")
	public void open_the_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_spin_till_player_wins_gamble_screen_gamble_collect_win_amount_added_to_main_balance(int arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));

		//Storing the value before spin or win
		String preWin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Current balance of the account: " +preWin);

		//Getting the bet value and Bet amount
		MobileElement creditValue = driver.findElement(By.id("hud_txtCredit"));
		Thread.sleep(1000);
		creditValue.click();
		Thread.sleep(1000);
		MobileElement credit4 = driver.findElement(By.id("hud_CreditPopup40.2"));
		credit4.click();
		Thread.sleep(2000);
		MobileElement creditValue4 = driver.findElement(By.id("hud_txtCredit"));
		String crdt4 =creditValue4.getText();
		System.out.println("Selected credit value is: " +crdt4);

		//Selecting bet amount as 160
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		MobileElement bet4_5 = driver.findElement(By.id("hud_BetPopup5160"));
		bet4_5.click();
		Thread.sleep(2000);
		MobileElement maxbet = driver.findElement(By.id("hud_txtBetAmount"));
		String maxbetval =maxbet.getText();
		System.out.println("Selected max betvalue is: " +maxbetval);

		// Start reel spin
		MobileElement start = driver.findElement(By.id("hud_btnSpin"));
		start.click();
		Thread.sleep(8000);	
		MobileElement winE = driver.findElement(By.id("hud_Hud_txtWin1"));

		String prewin = winE.getText();                   
		String winTex= winE.getText();

		while(prewin.isEmpty()){
			start.click();	
			Thread.sleep(8000);	
			winTex = winE.getText();
			prewin= prewin+winTex;
			System.out.println(winTex.isEmpty());	
		}
		System.out.println("Win amount:"+winTex);
		Thread.sleep(1000);
		MobileElement winAmt = driver.findElement(By.id("hud_Hud_txtWin1"));
		String Winamt =winAmt.getText();
		String winTex1 = Winamt.replaceAll(",", "");
		System.out.println("Win amount after replacing ',' from win amount: "+ winTex1);

		Thread.sleep(1000);
		String postWin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance before adding win amount is: "+"  "+postWin);
		String postWin1 = postWin.replaceAll(",", "");
		System.out.println("Balance before win amount :"+postWin1);
		Thread.sleep(2000);

		//Clicking on Collect button
		driver.findElement(By.id("hud_btnGamble")).click();
		Thread.sleep(3000);

		//Clicking on Collect button
		driver.findElement(By.id("gamble_btnCollect")).click();
		Thread.sleep(3000);

		String Balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String bal1 = Balance.replaceAll(",", "");
		System.out.println("Balance after win amount :"+bal1);
		Thread.sleep(2000);

		// add the balance with win amount 
		double conValue = Double.parseDouble(postWin1) + Double.parseDouble(winTex1);
		String dbi = String.format("%.2f", conValue);  
		System.out.println("Balance after adding win amount: "+dbi);
		Thread.sleep(2000);
		//Validate the balance after win amount added to balance
		Assert.assertEquals(dbi, bal1);
		Thread.sleep(2000);
		
		//Spin the reels after win amount is added to balance
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_btnSpin")));
		System.out.println("Spin button is present on the screen");
		start.click();
		Thread.sleep(4000);	
		System.out.println("User is able to spin after the winamount added to balance");
		System.out.println("Test case pass");
	}

	@Then("^MaxBet Win amount should get added to the main balance after win and balance should get increased with win amount in Hot (\\d+) slot game$")
	public void maxbet_Win_amount_should_get_added_to_the_main_balance_after_win_and_balance_should_get_increased_with_win_amount_in_Hot_slot_game(int arg1) throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}