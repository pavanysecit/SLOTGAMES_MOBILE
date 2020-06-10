package stepDefinition_DeluxeFruits;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeluxeFruits_Balance_Deduction_AccordingToBetType2_3 {
	AppiumDriver<MobileElement> driver;

	public DeluxeFruits_Balance_Deduction_AccordingToBetType2_3() throws InterruptedException {
		this.driver = DeluxeFruits_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Deluxe Fruits game, bet type as (\\d+)\\.(\\d+), bet value as TWO, bet value drop down, balance and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Deluxe_Fruits_game_bet_type_as_bet_value_as_TWO_bet_value_drop_down_balance_and_spin_button(int arg1, int arg2) throws Throwable {
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

	@When("^Open the Deluxe Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+), select the bet value to TWO, click on spin button and check the Deluxe Fruits slot game balance$")
	public void open_the_Deluxe_Fruits_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_select_the_bet_value_to_TWO_click_on_spin_button_and_check_the_Deluxe_Fruits_slot_game_balance(int arg1, int arg2) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 90);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));    
		//Storing the value before spin
		String preSpin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Current balance of the account Before spin: " +preSpin);
		
		//Selecting the credit as 0.02 from the drop down
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		driver.findElement(By.id("hud_btnCredit")).click();
		Thread.sleep(2000);
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("0.02")){
				be.click();
				Thread.sleep(3000);
				break;
			}	
		}
		String actual = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.02";
		Assert.assertEquals(actual, expected);
		
		//Selecting bet amount as 2	
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("2")){
				be.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +actual1);
		String expected1 = "2";
		Assert.assertEquals(actual1, expected1);
		Thread.sleep(2000);
		String betValue = actual1;
		
		//Clicking on Spin button
		driver.findElement(By.id("hud_btnSpin")).click();
		Thread.sleep(5000);
		
		//Storing the value after spin
		String postSpin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Current balance of the account After spin: " +postSpin);
		
		//Deducting bet value from the preSpin and formating string to double
		double fValue = Double.parseDouble(preSpin) - Double.parseDouble(betValue);
		String dbi = String.format("%.2f", fValue);  
		System.out.println("Final balance after deducting bet amount from the balance : "+dbi);
		
		Assert.assertEquals(dbi,postSpin); 
		Thread.sleep(2000);
	}

	@Then("^Existing Balance should get deducted by TWO as bet type is selected as (\\d+)\\.(\\d+) & bet value as TWO in Deluxe Fruits slot game$")
	public void existing_Balance_should_get_deducted_by_TWO_as_bet_type_is_selected_as_bet_value_as_TWO_in_Deluxe_Fruits_slot_game(int arg1, int arg2) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
