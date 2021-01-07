package stepDefinition_CircusMania;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CircusMania_Check_BetType_BetValue_DropDown1 {
	AppiumDriver<MobileElement> driver;

	public CircusMania_Check_BetType_BetValue_DropDown1() throws InterruptedException {
		this.driver = CircusMania_URL_Login.getDriver();
		//this.driver = CircusMania_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Circus Mania slot game, bet type as (\\d+)\\.(\\d+) and bet value as (\\d+)\\.(\\d+),(\\d+)\\.(\\d+),(\\d+),(\\d+),(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Circus_Mania_slot_game_bet_type_as_and_bet_value_as(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the Circus Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+) and check the bet value should be (\\d+)\\.(\\d+),(\\d+)\\.(\\d+),(\\d+),(\\d+),(\\d+)$")
	public void open_the_Circus_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_and_check_the_bet_value_should_be(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) throws Throwable {
		//Storing the value before spin or win
		String preWin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Current balance of the account: " +preWin);
		
		//Selecting the credit as 0.01 from the drop down
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_CreditPopup10.01")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.id("hud_txtCredit")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.01";
		Assert.assertEquals(actual, expected);
		
		//Selecting the bet amount as 0.2 from the drop down
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
//		driver.findElement(By.id("hud_BetPopup10.2")).click();
//		Thread.sleep(2000);
		
		String actual1 = driver.findElement(By.id("hud_BetPopup10.2")).getText();
		String expected1 = "0.2";
		System.out.println("Available bet amounts under credit 0.01 are : " +"\n" +actual1);
		Assert.assertEquals(actual1, expected1);
		
		//Selecting bet amount as 0.4
//		driver.findElement(By.id("hud_txtBetAmount")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("hud_BetPopup20.4")).click();
//		Thread.sleep(2000);
		
		String actual2 = driver.findElement(By.id("hud_BetPopup20.4")).getText();
		String expected2 = "0.4";
		System.out.println("\n" +actual2);
		Assert.assertEquals(actual2, expected2);
		
		//Selecting bet amount as 1
//		driver.findElement(By.id("hud_txtBetAmount")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("hud_BetPopup31")).click();
//		Thread.sleep(2000);
		
		String actual3 = driver.findElement(By.id("hud_BetPopup31")).getText();
		String expected3 = "1";
		System.out.println("\n" +actual3);
		Assert.assertEquals(actual3, expected3);
		
		//Selecting bet amount as 2
//		driver.findElement(By.id("hud_txtBetAmount")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("hud_BetPopup42")).click();
//		Thread.sleep(2000);
		
		String actual4 = driver.findElement(By.id("hud_BetPopup42")).getText();
		String expected4 = "2";
		System.out.println("\n" +actual4);
		Assert.assertEquals(actual4, expected4);

		//Selecting bet amount as 4
//		driver.findElement(By.id("hud_txtBetAmount")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("hud_BetPopup54")).click();
//		Thread.sleep(2000);
		
		String actual5 = driver.findElement(By.id("hud_BetPopup54")).getText();
		String expected5 = "4";
		System.out.println("\n" +actual5);
		Assert.assertEquals(actual5, expected5);
	}

	@Then("^Bet value should get changed to (\\d+)\\.(\\d+),(\\d+)\\.(\\d+),(\\d+),(\\d+),(\\d+) if the bet type selected as (\\d+)\\.(\\d+) from the drop down in Circus Mania slot game$")
	public void bet_value_should_get_changed_to_if_the_bet_type_selected_as_from_the_drop_down_in_Circus_Mania_slot_game(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}