package stepDefinition_SoccerMania;

import java.util.List;
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

public class SoccerMania_Balance_Check_WinAmount_AddedToBalance {
AppiumDriver<MobileElement> driver;

	public SoccerMania_Balance_Check_WinAmount_AddedToBalance() throws InterruptedException {
		this.driver = SoccerMania_Login_URL.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, transfer button, spin button and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Soccer_Mania_slot_game_balance_transfer_button_spin_button_and_win_amount() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		MobileElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		//Thread.sleep(60000);

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

	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win in Soccer Mania slot game$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_amount_click_on_spin_button_till_user_win_and_check_the_balance_after_win_in_Soccer_Mania_slot_game() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
		
		//Storing the value before spin or win
		String preWin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Current balance of the account Before Converting into credits: " +preWin);
		
		//Getting the bet value and Bet amount	
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		driver.findElement(By.id("hud_btnCredit")).click();
		Thread.sleep(2000);
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("0.5")){
				be.click();
				Thread.sleep(3000);
				break;
			}	
		}
		
		String actual = driver.findElement(By.id("hud_txtCreditValue")).getText();
		String creditValue = actual;
		String expected = "0.5";
		Assert.assertEquals(expected, actual);
		Thread.sleep(1000);
		
		String betValue = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Bet amount is: " +betValue);
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
			start.click();
			Thread.sleep(4000);
			winTex=	winE.getText();
			System.out.println(winTex.isEmpty());
		 }
		Thread.sleep(2000);
		System.out.println("The Win is : "+"  "+winTex);
		System.out.println(winTex.isEmpty());
		
		String postWin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance before adding win amount is: "+"  "+postWin);
		Thread.sleep(2000);
		
		driver.findElement(By.id("hud_btnGamble")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("hud_btnSpin")).click();
		Thread.sleep(4000);
		String Balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		Thread.sleep(2000);
		//Converted win amount into credits and multiplying with credit value and it should equal to win amount in currency
		double conValue = Double.parseDouble(winTex) + Double.parseDouble(postWin);
		String dbi = String.format("%.2f", conValue);  
		System.out.println("Balance after adding win amount: "+dbi);
		Thread.sleep(2000);
		Assert.assertEquals(dbi, Balance);
		Thread.sleep(2000);
	}

	@Then("^Win amount should get added to the balance after win and balance should get increased with win amount in Soccer Mania slot game$")
	public void win_amount_should_get_added_to_the_balance_after_win_and_balance_should_get_increased_with_win_amount_in_Soccer_Mania_slot_game() throws Throwable {
		driver.quit();
	}
}
