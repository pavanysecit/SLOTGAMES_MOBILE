package stepDefinition_GreatEgypt;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class GreatEgypt_Balance_Check_WinAmount_AddedToBalance {
	AppiumDriver<MobileElement> driver;

	public GreatEgypt_Balance_Check_WinAmount_AddedToBalance() throws InterruptedException {
		this.driver = GreatEgypt_URL_Login.getDriver();
		//this.driver = GreatEgypt_URL_TryNow.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Great Egypt slot game, balance, transfer button, spin button and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Great_Egypt_slot_game_balance_transfer_button_spin_button_and_win_amount() throws Throwable {
	    
	}

	@When("^Open the Great Egypt slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win in Great Egypt slot game$")
	public void open_the_Great_Egypt_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_amount_click_on_spin_button_till_user_win_and_check_the_balance_after_win_in_Great_Egypt_slot_game() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		//Storing the value before spin
		String preSpin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String str = preSpin.replaceAll(",", "");
		System.out.println("Current balance of the account Before spin: " +str);
		
		//Selecting the credit as 0.5 from the drop down
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_CreditPopup40.5")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.id("hud_txtCredit")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.5";
		Assert.assertEquals(actual, expected);
		
		//Selecting the bet amount as 50 from the drop down
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup350")).click();
		Thread.sleep(2000);
		
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected1 = "50";
		System.out.println("Selected bet value is : " +actual1);
		Assert.assertEquals(actual1, expected1);
		
		//Clicking on start button
		MobileElement start = driver.findElement(By.id("hud_btnSpin"));
		start.click();
		Thread.sleep(2000);

		
		//Getting win amount
		MobileElement winE = driver.findElement(By.id("hud_Hud_txtWin1"));
		
		String winTex = winE.getText();
		while(winTex.isEmpty())
		 {
			start.click();
			Thread.sleep(8000);
			winTex=	winE.getText();
			System.out.println(winTex.isEmpty());
		 }
		Thread.sleep(2000);
		System.out.println("The Win is : "+"  "+winTex);
		System.out.println(winTex.isEmpty());
		
		String postWin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String str1 = postWin.replaceAll(",", "");
		System.out.println("Balance before adding win amount is: "+"  "+str1);
		Thread.sleep(2000);
		
		driver.findElement(By.id("hud_btnGamble")).click();
		Thread.sleep(3000);

		//Clicking on Collect button
		driver.findElement(By.id("gamble_btnCollect")).click();
		Thread.sleep(6000);
		String Balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String str2 = Balance.replaceAll(",", "");
		Thread.sleep(2000);
		//Converted win amount into credits and multiplying with credit value and it should equal to win amount in currency
		double conValue = Double.parseDouble(winTex) + Double.parseDouble(str1);
		String dbi = String.format("%.2f", conValue);  
		System.out.println("Balance after adding win amount: "+dbi);
		Thread.sleep(2000);
		Assert.assertEquals(dbi, str2);
		Thread.sleep(2000);
	}

	@Then("^Win amount should get added to the balance after win and balance should get increased with win amount in Great Egypt slot game$")
	public void win_amount_should_get_added_to_the_balance_after_win_and_balance_should_get_increased_with_win_amount_in_Great_Egypt_slot_game() throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
