package stepDefinition_100SplendidHot;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HundredSplendidHot_Check_BetType_BetValue_DropDown2 {
	AppiumDriver<MobileElement> driver;

	public HundredSplendidHot_Check_BetType_BetValue_DropDown2() throws InterruptedException {
		this.driver = HundredSplendidHot_URL_Login.getDriver();
		//this.driver = HundredSplendidHot_URL_TryNow.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Splendid Hot game, bet type as (\\d+)\\.(\\d+) and bet value as (\\d+),(\\d+),(\\d+),(\\d+) & (\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Splendid_Hot_game_bet_type_as_and_bet_value_as(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the (\\d+) Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+) and check the bet value should be (\\d+),(\\d+),(\\d+),(\\d+) and (\\d+)$")
	public void open_the_Splendid_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_and_check_the_bet_value_should_be_and(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) throws Throwable {
		//Selecting the credit as 0.02 from the drop down
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_CreditPopup20.04")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.id("hud_txtCredit")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.04";
		Assert.assertEquals(actual, expected);
		
		//Selecting the bet amount as 4 from the drop down
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup14")).click();
		Thread.sleep(2000);
		
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected1 = "4";
		System.out.println("Available bet amounts under credit 0.04 are : " +"\n" +actual1);
		Assert.assertEquals(actual1, expected1);
		
		//Selecting bet amount as 8
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup28")).click();
		Thread.sleep(2000);
		
		String actual2 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected2 = "8";
		System.out.println("\n" +actual2);
		Assert.assertEquals(actual2, expected2);
		
		//Selecting bet amount as 12
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup312")).click();
		Thread.sleep(2000);
		
		String actual3 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected3 = "12";
		System.out.println("\n" +actual3);
		Assert.assertEquals(actual3, expected3);
		
		//Selecting bet amount as 16
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup416")).click();
		Thread.sleep(2000);
		
		String actual4 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected4 = "16";
		System.out.println("\n" +actual4);
		Assert.assertEquals(actual4, expected4);

		//Selecting bet amount as 20
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup520")).click();
		Thread.sleep(2000);
		
		String actual5 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected5 = "20";
		System.out.println("\n" +actual5);
		Assert.assertEquals(actual5, expected5);
	}

	@Then("^Bet value should get changed to (\\d+),(\\d+),(\\d+),(\\d+) & (\\d+) if the bet type selected as (\\d+)\\.(\\d+) from the drop down (\\d+) in (\\d+) Splendid Hot slot game$")
	public void bet_value_should_get_changed_to_if_the_bet_type_selected_as_from_the_drop_down_in_Splendid_Hot_slot_game(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}