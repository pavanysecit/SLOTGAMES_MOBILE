package stepDefinition_PerfectGems;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PerfectGems_Check_BetType_BetValue_DropDown4 {
	AppiumDriver<MobileElement> driver;

	public PerfectGems_Check_BetType_BetValue_DropDown4() throws InterruptedException {
		this.driver = PerfectGems_URL_Login.getDriver();
		//this.driver = PerfectGems_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type as (\\d+)\\.(\\d+) from drop down and bet value as (\\d+),(\\d+),(\\d+),(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Perfect_Gems_slot_game_bet_type_as_from_drop_down_and_bet_value_as(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Throwable {
	   
	}

	@When("^Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+) from drop down and check the bet value should be (\\d+),(\\d+),(\\d+),(\\d+)$")
	public void open_the_Perfect_Gems_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_from_drop_down_and_check_the_bet_value_should_be(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 80);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		//Selecting the credit as 0.4 from the drop down
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_CreditPopup40.4")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.id("hud_txtCredit")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.4";
		Assert.assertEquals(actual, expected);
		
		//Selecting the bet amount as 10 from the drop down
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup110")).click();
		Thread.sleep(2000);
		
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected1 = "10";
		System.out.println("Available bet amounts under credit 0.4 are : " +"\n" +actual1);
		Assert.assertEquals(actual1, expected1);
		
		//Selecting bet amount as 20
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup220")).click();
		Thread.sleep(2000);
		
		String actual2 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected2 = "20";
		System.out.println("\n" +actual2);
		Assert.assertEquals(actual2, expected2);
		
		//Selecting bet amount as 30
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup330")).click();
		Thread.sleep(2000);
		
		String actual3 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected3 = "30";
		System.out.println("\n" +actual3);
		Assert.assertEquals(actual3, expected3);
		
		//Selecting bet amount as 40
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup440")).click();
		Thread.sleep(2000);
		
		String actual4 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected4 = "40";
		System.out.println("\n" +actual4);
		Assert.assertEquals(actual4, expected4);
	}

	@Then("^Bet value should get changed to (\\d+),(\\d+),(\\d+),(\\d+) if the bet type selected as (\\d+)\\.(\\d+) from the drop down three in Perfect Gems slot game$")
	public void bet_value_should_get_changed_to_if_the_bet_type_selected_as_from_the_drop_down_three_in_Perfect_Gems_slot_game(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Throwable {
		Thread.sleep(1000);
	    driver.quit();
	}
}
