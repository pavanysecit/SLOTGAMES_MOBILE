package stepDefinition_TreasureBonanza;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TreasureBonanza_Gamble_WinAmount_SameAs_GambleAmount {
	AppiumDriver<MobileElement> driver;

	public TreasureBonanza_Gamble_WinAmount_SameAs_GambleAmount() throws InterruptedException {
		this.driver = TreasureBonanza_Login_URL.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, win amount, gamble button and gamble amount$")
	public void chrome_browser_valid_URL_valid_login_details_Treasure_Bonanza_slot_game_balance_spin_button_win_amount_gamble_button_and_gamble_amount() throws Throwable {
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

	@When("^Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount$")
	public void open_the_Treasure_Bonanza_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_amount() throws Throwable {
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
		//System.out.println("The lenght of gamble is :"+uyt.length);
		
		driver.findElement(By.id("gamble_btnCollect")).click();
		Assert.assertEquals(gamble, prewin);
		//String Balance1 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Win amount is :"+prewin);
		System.out.println("The testcase has passed");
	}

	@Then("^Win amount should be displayed as Gamble amount in the gamble page of the Treasure Bonanza slot game$")
	public void win_amount_should_be_displayed_as_Gamble_amount_in_the_gamble_page_of_the_Treasure_Bonanza_slot_game() throws Throwable {
		Thread.sleep(3000);
	    driver.quit();
	}
}
