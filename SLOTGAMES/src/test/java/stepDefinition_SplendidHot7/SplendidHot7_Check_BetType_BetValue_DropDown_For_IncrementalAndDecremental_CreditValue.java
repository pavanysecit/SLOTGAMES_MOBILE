package stepDefinition_SplendidHot7;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SplendidHot7_Check_BetType_BetValue_DropDown_For_IncrementalAndDecremental_CreditValue {
	AppiumDriver<MobileElement> driver;

	public SplendidHot7_Check_BetType_BetValue_DropDown_For_IncrementalAndDecremental_CreditValue() throws InterruptedException {
		this.driver = SplendidHot7_URL_Login.getDriver();
		//this.driver = SplendidHot7_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Splendid Hot Seven slot game, increment, decrement and betvalue amount$")
	public void chrome_browser_valid_URL_valid_login_details_Splendid_Hot_Seven_slot_game_increment_decrement_and_betvalue_amount() throws Throwable {
	    
	}

	@When("^Open the Splendid Hot Seven slot game by entering the valid URL in browser, enter the valid login details, inc and dec credit and verify the betvalue assigned respectively$")
	public void open_the_Splendid_Hot_Seven_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_inc_and_dec_credit_and_verify_the_betvalue_assigned_respectively() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
		//Storing the value before converting the balance into credits
		MobileElement preConvert = driver.findElement(By.id("hud_Hud_txtBalance1"));
		String Preconv = preConvert.getText();
		System.out.println("Current balance of the account Before Converting into credits: " +Preconv);

		//Getting the credit value
		MobileElement creditValue = driver.findElement(By.id("hud_txtCredit"));
		creditValue.click();
		Thread.sleep(1000);
		MobileElement credit1 = driver.findElement(By.id("hud_CreditPopup10.01"));
		credit1.click();
		String cred1 = creditValue.getText();
		Thread.sleep(1000);
		Assert.assertEquals("0.01",cred1);
		System.out.println("Selected credit value is: " +cred1);

		//Compare the bet values for selected credit1
		MobileElement betval = driver.findElement(By.id("hud_txtBetAmount"));
		betval.click();
		String bet1_1 = driver.findElement(By.id("hud_BetPopup10.4")).getText();
		Assert.assertEquals("0.4",bet1_1);
		String bet1_2 = driver.findElement(By.id("hud_BetPopup20.8")).getText();
		Assert.assertEquals("0.8",bet1_2);
		String bet1_3 = driver.findElement(By.id("hud_BetPopup32")).getText();
		Assert.assertEquals("2",bet1_3);
		String bet1_4 = driver.findElement(By.id("hud_BetPopup44")).getText();
		Assert.assertEquals("4",bet1_4);
		String bet1_5 = driver.findElement(By.id("hud_BetPopup58")).getText();
		Assert.assertEquals("8",bet1_5);
		System.out.println("Betvalues for the credit1 are assigned and in ascending order");

		// increment the credit value
		//Getting the credit value
		creditValue.click();
		Thread.sleep(1000);
		MobileElement credit4 = driver.findElement(By.id("hud_CreditPopup40.2"));
		credit4.click();
		String cred4 = creditValue.getText();
		Thread.sleep(1000);
		Assert.assertEquals("0.2",cred4);
		System.out.println("Selected credit value is: " +cred4);

		//Compare the bet values for selected credit4
		betval.click();
		String bet4_1 = driver.findElement(By.id("hud_BetPopup18")).getText();
		Assert.assertEquals("8",bet4_1);
		String bet4_2 = driver.findElement(By.id("hud_BetPopup216")).getText();
		Assert.assertEquals("16",bet4_2);
		String bet4_3 = driver.findElement(By.id("hud_BetPopup340")).getText();
		Assert.assertEquals("40",bet4_3);
		String bet4_4 = driver.findElement(By.id("hud_BetPopup480")).getText();
		Assert.assertEquals("80",bet4_4);
		String bet4_5 = driver.findElement(By.id("hud_BetPopup5160")).getText();
		Assert.assertEquals("160",bet4_5);
		System.out.println("Betvalues for the credit4 are assigned and in ascending order");


		// increment the credit value
		//Getting the credit value
		creditValue.click();
		Thread.sleep(1000);
		MobileElement credit3 = driver.findElement(By.id("hud_CreditPopup30.03"));
		credit3.click();
		String cred3 = creditValue.getText();
		Thread.sleep(1000);
		Assert.assertEquals("0.03",cred3);
		System.out.println("Selected credit value is: " +cred3);

		//Compare the bet values for selected credit4
		betval.click();
		String bet3_1 = driver.findElement(By.id("hud_BetPopup11.2")).getText();
		Assert.assertEquals("1.2",bet3_1);
		String bet3_2 = driver.findElement(By.id("hud_BetPopup22.4")).getText();
		Assert.assertEquals("2.4",bet3_2);
		String bet3_3 = driver.findElement(By.id("hud_BetPopup36")).getText();
		Assert.assertEquals("6",bet3_3);
		String bet3_4 = driver.findElement(By.id("hud_BetPopup412")).getText();
		Assert.assertEquals("12",bet3_4);
		String bet3_5 = driver.findElement(By.id("hud_BetPopup524")).getText();
		Assert.assertEquals("24",bet3_5);
		System.out.println("Betvalues for the credit4 are assigned and in ascending order");
	}

	@Then("^Bet amount for all credit values should be assigned respectively in Splendid Hot Seven slot game$")
	public void bet_amount_for_all_credit_values_should_be_assigned_respectively_in_Splendid_Hot_Seven_slot_game() throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
