package stepDefinition_SkinfiriLotto;

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

public class SkinfiriLotto_Balance_Deduction_AccordingToBetType3_4 {
	AppiumDriver<MobileElement> driver;

	public SkinfiriLotto_Balance_Deduction_AccordingToBetType3_4() throws InterruptedException {
		this.driver = SkinfiriLotto_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Lotto slot game, bet type as (\\d+)\\.(\\d+) from drop down, bet value as ten, balance and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Lotto_slot_game_bet_type_as_from_drop_down_bet_value_as_ten_balance_and_spin_button(int arg1, int arg2) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		MobileElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(20000);

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

	@When("^Open the Skinfiri Lotto slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ten from bet type drop down, click on spin button and check the balance$")
	public void open_the_Skinfiri_Lotto_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_ten_from_bet_type_drop_down_click_on_spin_button_and_check_the_balance() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 90);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		//Storing the value before spin
		String preSpin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Current balance of the account Before spin: " +preSpin);
		
		//Selecting the credit as 0.05 from the drop down
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		driver.findElement(By.id("hud_btnCredit")).click();
		Thread.sleep(2000);
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("0.05")){
				be.click();
				Thread.sleep(3000);
				break;
			}	
		}
		String actual = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.05";
		Assert.assertEquals(actual, expected);
		
		//Selecting bet amount as 10	
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("10")){
				be.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +actual1);
		String expected1 = "10";
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
	}

	@Then("^Balance should get deducted by ten if bet type is selected as (\\d+)\\.(\\d+) & bet value as ten in Skinfiri Lotto game$")
	public void balance_should_get_deducted_by_ten_if_bet_type_is_selected_as_bet_value_as_ten_in_Skinfiri_Lotto_game(int arg1, int arg2) throws Throwable {
		Thread.sleep(2000);
		driver.quit(); 
	}
}
