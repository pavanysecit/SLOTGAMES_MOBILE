package stepDefinition_GoldenCrown;

import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class GoldenCrown_Balance_To_Credits_CreditWinAmountEqualsCurrencyWinAmount_Value2 {
AppiumDriver<MobileElement> driver;

	public GoldenCrown_Balance_To_Credits_CreditWinAmountEqualsCurrencyWinAmount_Value2() throws InterruptedException {
		this.driver = GoldenCrown_URL_Login.getDriver();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[18]/div[1]")).click();
		Thread.sleep(2000);
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Golden Crown slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Crown_slot_game_balance_spin_button_win_amount_in_currency_credits_and_win_amount_in_credits_for_denomination_drop_down_value_two() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[18]/div[1]")).click();
		Thread.sleep(2000);
		
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

	@When("^Open the Golden Crown slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance$")
	public void open_the_Golden_Crown_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_the_dinomination_drop_down_value_two_click_on_spin_button_till_player_wins_click_on_balance_check_the_win_amount_and_click_on_balance() throws Throwable {
		//Storing the value before converting the balance into credits
		String preWin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Current balance of the account Before Converting into credits: " +preWin);
		
		//Getting the bet value and Bet amount
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		driver.findElement(By.id("hud_btnCredit")).click();
		Thread.sleep(2000);
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("0.02")){
				Thread.sleep(2000);
				be.click();
				Thread.sleep(2000);
			}	
		}
		
		String actual = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("uuuu: " +actual);
		String creditValue = actual;
		String expected = "0.02";
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

	@Then("^Win amount in credit multiplied by denomination drop down value two is equal to win amount in currency in Golden Crown slot game$")
	public void win_amount_in_credit_multiplied_by_denomination_drop_down_value_two_is_equal_to_win_amount_in_currency_in_Golden_Crown_slot_game() throws Throwable {
	    driver.quit();
	}
}
