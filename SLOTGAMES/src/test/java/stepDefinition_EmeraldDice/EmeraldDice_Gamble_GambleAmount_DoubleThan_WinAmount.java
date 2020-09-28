package stepDefinition_EmeraldDice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class EmeraldDice_Gamble_GambleAmount_DoubleThan_WinAmount {
	AppiumDriver<MobileElement> driver;

	public EmeraldDice_Gamble_GambleAmount_DoubleThan_WinAmount() throws InterruptedException {
		this.driver = EmeraldDice_URL_Login.getDriver();
		//this.driver = EmeraldDice_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Emerald Dice slot game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Emerald_Dice_slot_game_balance_spin_button_win_amount_gamble_button_gamble_amount_and_gamble_to_win_amount() throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 80);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the Emerald Dice slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Emerald Dice slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount$")
	public void open_the_Emerald_Dice_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_Emerald_Dice_slot_game_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_to_win_amount() throws Throwable {
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The current balance of the account :" +balance);
		

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
		                                                                                                                             
		
		Thread.sleep(2000);
		driver.findElement(By.id("hud_btnGamble")).click();		          
		String gAmount = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
		System.out.println("Gamble amount is :"+gAmount);
		Thread.sleep(2000);
		String[] uyt = gAmount.split(" ");
		String gamble="";
		for(int i=0;i<uyt.length;i++){
			System.out.println(uyt[i]);
			if(i==0){
			gamble=gamble+uyt[i];
			}
		}
		System.out.println("Gamble amount after split is :"+gamble);
		double db=Double.parseDouble(gamble);
	
		String prt = driver.findElement(By.id("gamble_txtWin")).getText();
		System.out.println("The value of Gamble To Win is :"+" "+prt);
		String[] prt1 = prt.split(" ");
		String gambleD="";
		for(int i=0;i<prt1.length;i++){
			System.out.println(prt1[i]);
			if(i==0){
			gambleD=gambleD+prt1[i];
			}
		}
		double poi = Double.parseDouble(gambleD);
		System.out.println("Expected Gamble To Win amount is: "+" "+poi);
		double expected = db*2;
		System.out.println("Expected value is : "+" "+expected);
		double actual = poi;
		System.out.println("Actual value is : "+" "+poi);
		//Assert.assertEquals(expected, actual, DELTA);
		Assert.assertEquals(Double.doubleToLongBits(expected), Double.doubleToLongBits(actual));
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[13]")).click();
                                 		
		System.out.println("The testcase has passed");		
	}

	@Then("^Gamble To Win amount should be double than Gamble amount in the gamble page of the Emerald Dice slot game$")
	public void gamble_To_Win_amount_should_be_double_than_Gamble_amount_in_the_gamble_page_of_the_Emerald_Dice_slot_game() throws Throwable {
		Thread.sleep(3000);
	    driver.quit();
	}
}
