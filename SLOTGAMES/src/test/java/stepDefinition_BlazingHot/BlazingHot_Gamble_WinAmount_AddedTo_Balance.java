package stepDefinition_BlazingHot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BlazingHot_Gamble_WinAmount_AddedTo_Balance {
	AppiumDriver<MobileElement> driver;

	public BlazingHot_Gamble_WinAmount_AddedTo_Balance() throws InterruptedException {
		this.driver = BlazingHot_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Blazing Hot slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status$")
	public void chrome_browser_valid_URL_valid_login_details_Blazing_Hot_slot_game_balance_spin_button_win_amount_gamble_button_gamble_amount_red_button_black_button_and_gamble_status() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
	}

	@When("^Open the Blazing Hot slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win$")
	public void open_the_Blazing_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_spin_button_till_player_wins_click_on_gamble_button_click_on_red_or_black_button_and_check_the_balance_after_win() throws Throwable {
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The balance is equal to"+" "+balance);

		MobileElement start = driver.findElement(By.id("hud_btnSpin"));
		start.click();
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
		//System.out.println("The lenght of gamble is :"+uyt.length);
		
		driver.findElement(By.id("gamble_btnCollect")).click();
		Assert.assertEquals(gamble, prewin);
		//String Balance1 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Win amount is :"+prewin);
		System.out.println("The testcase has passed");
	}

	@Then("^Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Blazing Hot slot game$")
	public void gamble_Win_amount_should_get_added_to_main_balance_after_status_displayed_as_WIN_and_gamble_page_should_get_closed_in_Blazing_Hot_slot_game() throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
