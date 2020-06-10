package stepDefinition_DeluxeFruits;

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

public class DeluxeFruits_Balance_To_Credits_CreditWinAmountEqualsCurrencyWinAmount_Value1 {
	AppiumDriver<MobileElement> driver;

	public DeluxeFruits_Balance_To_Credits_CreditWinAmountEqualsCurrencyWinAmount_Value1() throws InterruptedException {
		this.driver = DeluxeFruits_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Deluxe Fruits slot game, balance, spin button, win amount in currency, credits and win amount in credits$")
	public void chrome_browser_valid_URL_valid_login_details_Deluxe_Fruits_slot_game_balance_spin_button_win_amount_in_currency_credits_and_win_amount_in_credits() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		MobileElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();

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

	@When("^Open the Ultra Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Deluxe Fruits slot game, click on spin button till player wins, click on balance, check the win amount and click on balance$")
	public void open_the_Ultra_Glowing_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_Deluxe_Fruits_slot_game_click_on_spin_button_till_player_wins_click_on_balance_check_the_win_amount_and_click_on_balance() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));  
		//Storing the value before converting the balance into credits
		String preWin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Current balance of the account Before Converting into credits: " +preWin);
		
		//Getting the bet value and Bet amount
		String creditValue = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is: " +creditValue);
		String actual = creditValue;
		String expected = "0.01";
		Assert.assertEquals(expected, actual);
		Thread.sleep(1000);
		
		String betValue = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +betValue);
		Thread.sleep(2000);
		System.out.println("Credit Value is: " +creditValue);
		
		//Clicking on start button
		MobileElement start = driver.findElement(By.id("hud_btnSpin"));
		start.click();
		Thread.sleep(2000);

		
		//Getting win amount
		MobileElement winE = driver.findElement(By.id("hud_Hud_txtWin1"));
		
		String winTex = winE.getText();
		while(winTex.isEmpty())
		 {
			Thread.sleep(4500);
			start.click();
			Thread.sleep(1000);
			winTex=	winE.getText();
			System.out.println(winTex.isEmpty());	
		 }
		System.out.println("The Win is : "+"  "+winTex);
		System.out.println(winTex.isEmpty());
		
		driver.findElement(By.id("hud_Hud_txtBalance1")).click();
		Thread.sleep(1000);
		String Wcrd = driver.findElement(By.id("hud_Hud_txtWin1")).getText();
		System.out.println("Win amount in credits: " +Wcrd);
		Thread.sleep(2000);

		
		//Converted win amount into credits and multiplying with credit value and it should equal to win amount in currency
		double conValue = Double.parseDouble(creditValue) * Double.parseDouble(Wcrd);
		String dbi = String.format("%.2f", conValue);  
		System.out.println("Win Amount after multiplying balance in credits with bet credit value: "+dbi);
		Thread.sleep(2000);
		Assert.assertEquals(dbi, winTex);
		Thread.sleep(2000);
	}

	@Then("^Win amount in credit multiplied by denomination is equal to win amount in currency in Deluxe Fruits slot game$")
	public void win_amount_in_credit_multiplied_by_denomination_is_equal_to_win_amount_in_currency_in_Deluxe_Fruits_slot_game() throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
