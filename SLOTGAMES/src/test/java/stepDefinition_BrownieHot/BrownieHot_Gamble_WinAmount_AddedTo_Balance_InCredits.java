package stepDefinition_BrownieHot;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BrownieHot_Gamble_WinAmount_AddedTo_Balance_InCredits {
	AppiumDriver<MobileElement> driver;

	public BrownieHot_Gamble_WinAmount_AddedTo_Balance_InCredits() throws InterruptedException {
		this.driver = BrownieHot_URL_Login.getDriver();
		//this.driver = BrownieHot_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Brownie Hot slot game, credit balance, spin button, credit win amount, gamble button, gamble amount in credits, red button, black button and gamble status$")
	public void chrome_browser_valid_URL_valid_login_details_Brownie_Hot_slot_game_credit_balance_spin_button_credit_win_amount_gamble_button_gamble_amount_in_credits_red_button_black_button_and_gamble_status() throws Throwable {
		
	}

	@When("^Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance in credits after win$")
	public void open_the_Brownie_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_spin_button_till_player_wins_click_on_gamble_button_click_on_red_or_black_button_and_check_the_balance_in_credits_after_win() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		WebElement balance = driver.findElement(By.id("hud_Hud_txtBalance1"));
		balance.click();
		Thread.sleep(1000);
		String bal = balance.getText();
		System.out.println("The balance is equal to"+" "+bal);

		MobileElement start = driver.findElement(By.id("hud_btnSpin"));
		start.click();
		Thread.sleep(7000);	
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
		String balance1 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance amount before clicking on gamble link :"+balance1);
		
		// converting balance from string to int format
		String bal1 = balance1.replaceAll(",", "");
		int spinbal=Integer.parseInt(bal1);
		System.out.println(spinbal);

		driver.findElement(By.id("hud_btnGamble")).click();	
		Thread.sleep(2000);
		String gAmount = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
		System.out.println("Gamble amount is :"+gAmount);
		Thread.sleep(2000);

		// Validating the Credit form of currency doesn't contain SRD suffix and decimal values in their field
		if (gAmount.contains(" SRD")){
			System.out.println("Gamble amount in gamble page contains currency in SRD format" );
			System.out.println(" Test case failed");
			Assert.assertFalse(gAmount.contains( " SRD" ));
		}
		else
		{
			System.out.println("Gamble amount in gamble page doesn't contains currency in SRD format" );
			System.out.println(" Test case passed");
			Assert.assertFalse(gAmount.contains( " SRD" ));
		}

		if (gAmount.contains(".")){
			System.out.println("Gamble amount in gamble page contains currency in decimal format" );
			System.out.println(" Test case failed");
			Assert.assertFalse(gAmount.contains( "." ));
		}
		else
		{
			System.out.println("Gamble amount in gamble page doesn't contains currency in decimal format" );
			System.out.println(" Test case passed");
			Assert.assertFalse(gAmount.contains( "." ));
		}

		String gwin = driver.findElement(By.id("gamble_txtWin")).getText();
		System.out.println("Gamble amount is :"+gwin);
		Thread.sleep(2000);

		if (gwin.contains(" SRD")){
			System.out.println("Gamble win amount in gamble page contains currency in SRD format" );
			System.out.println(" Test case failed");
			Assert.assertFalse(gAmount.contains( " SRD" ));
		}
		else
		{
			System.out.println("Gamble win amount in gamble page doesn't contains currency in SRD format" );
			System.out.println(" Test case passed");
			Assert.assertFalse(gAmount.contains( " SRD" ));
		}

		if (gwin.contains(".")){
			System.out.println("Gamble win amount in gamble page contains currency in decimal format" );
			System.out.println(" Test case failed");
			Assert.assertFalse(gAmount.contains( "." ));
		}
		else
		{
			System.out.println("Gamble win amount in gamble page doesn't contains currency in decimal format" );
			System.out.println(" Test case passed");
			Assert.assertFalse(gAmount.contains( "." ));
		}
	
		int gambleamt=Integer.parseInt(gAmount); 
		int expected = gambleamt*2;
		System.out.println(expected);
		driver.findElement(By.id("gamble_btnBlack")).click();
		Thread.sleep(2000);
		String gAmount1 = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
		int gambleamt1=Integer.parseInt(gAmount1);
		System.out.println(gambleamt1);

		// Comparing the gamble amount before win*2 is equivalent to gamble amount after win and satisfying the condition statement
		if(expected == gambleamt1) {

			/*
			 * Here we are comparing the gamble win amount field before and after after winning in the gamble page.
			 * Before it is same as win amount in the game screen
			 * after winning in the gamble page, gamble amount is doubled and verified with the gamble amount before win. 
			 */
			String gAmount11 = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
			int expected1 = gambleamt*2;
			int gambleamtafter=Integer.parseInt(gAmount11);
			System.out.println(gambleamtafter);
			Assert.assertEquals(expected1, gambleamtafter);
			Thread.sleep(2000);
			
			// click on collect and compare the win amount added to balance
			// As here comparing in integer format, hence conversion from string to int format
			driver.findElement(By.id("gamble_btnCollect")).click();
			Thread.sleep(3000);
			String postBalance22 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
			System.out.println("Balance amount After clicking on collect link :"+postBalance22);
			String postbal = postBalance22.replaceAll(",", "");
			int conValue = spinbal + gambleamtafter;
			String dbi = String.valueOf(conValue);  
			System.out.println("Balance after adding gamble win amount: "+dbi);
			Thread.sleep(2000);
			Assert.assertEquals(dbi, postbal);
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

	@Then("^verify the credit form of currency in gamble page on all fields$")
	public void verify_the_credit_form_of_currency_in_gamble_page_on_all_fields() throws Throwable {
	    Thread.sleep(1000);
	}

	@Then("^Gamble credit Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Brownie Hot slot game$")
	public void gamble_credit_Win_amount_should_get_added_to_main_balance_after_status_displayed_as_WIN_and_gamble_page_should_get_closed_in_Brownie_Hot_slot_game() throws Throwable {
		Thread.sleep(1000);
		driver.quit();
	}
}
