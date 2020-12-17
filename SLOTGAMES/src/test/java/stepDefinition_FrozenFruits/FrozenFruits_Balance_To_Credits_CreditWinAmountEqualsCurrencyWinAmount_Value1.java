package stepDefinition_FrozenFruits;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FrozenFruits_Balance_To_Credits_CreditWinAmountEqualsCurrencyWinAmount_Value1 {
	AppiumDriver<MobileElement> driver;

	public FrozenFruits_Balance_To_Credits_CreditWinAmountEqualsCurrencyWinAmount_Value1() throws InterruptedException {
		this.driver = FrozenFruits_URL_Login.getDriver();
		//this.driver = FrozenFruits_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Frozen Fruits slot game, balance, spin button, win amount in currency, credits and win amount in credits$")
	public void chrome_browser_valid_URL_valid_login_details_Frozen_Fruits_slot_game_balance_spin_button_win_amount_in_currency_credits_and_win_amount_in_credits() throws Throwable {
	   
	}

	@When("^Open the Frozen Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Frozen Fruits slot game, click on spin button till player wins, click on balance, check the win amount and click on balance$")
	public void open_the_Frozen_Fruits_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_Frozen_Fruits_slot_game_click_on_spin_button_till_player_wins_click_on_balance_check_the_win_amount_and_click_on_balance() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));  
		//Storing the value before converting the balance into credits
		String preWin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String str = preWin.replaceAll(",", "");
		System.out.println("Current balance of the account Before Converting into credits: " +str);
		
		//Selecting the credit as 0.01 from the drop down and bet amount
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_CreditPopup10.01")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.id("hud_txtCredit")).getText();
		String creditValue = actual;
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.01";
		Assert.assertEquals(actual, expected);
		
		String betValue = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +betValue);
		Thread.sleep(2000);
		
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
		
		driver.findElement(By.id("hud_Hud_txtBalance1")).click();
		Thread.sleep(1000);
		String Wcrd = driver.findElement(By.id("hud_Hud_txtWin1")).getText();
		String str1 = Wcrd.replaceAll(",", "");
		System.out.println("Win amount in credits: " +str1);
		Thread.sleep(2000);

		
		//Converted win amount into credits and multiplying with credit value and it should equal to win amount in currency
		double conValue = Double.parseDouble(creditValue) * Double.parseDouble(str1);
		String dbi = String.format("%.2f", conValue);  
		System.out.println("Win Amount after multiplying win amount in credits with credit value: "+dbi);
		Thread.sleep(2000);
		Assert.assertEquals(dbi, winTex);
		Thread.sleep(2000);
	}

	@Then("^Win amount in credit multiplied by denomination is equal to win amount in currency in Frozen Fruits slot game$")
	public void win_amount_in_credit_multiplied_by_denomination_is_equal_to_win_amount_in_currency_in_Frozen_Fruits_slot_game() throws Throwable {
		   Thread.sleep(2000);
		   driver.quit();
	}
}
