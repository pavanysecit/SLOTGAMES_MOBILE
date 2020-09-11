package stepDefinition_20FruityBrownie;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TwentyFruityBrownie_Balance_Credits_Calculations_Value1 {
	AppiumDriver<MobileElement> driver;

	public TwentyFruityBrownie_Balance_Credits_Calculations_Value1() throws InterruptedException {
		this.driver = TwentyFruityBrownie_URL_Login.getDriver();
		//this.driver = TwentyFruityBrownie_URL_TryNow.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Fruity Brownie slot game, balance, credits and denomination as (\\d+)\\.(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Fruity_Brownie_slot_game_balance_credits_and_denomination_as(int arg1, int arg2, int arg3) throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 80);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the (\\d+) Fruity Brownie slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by (\\d+)\\.(\\d+) and check the balance$")
	public void open_the_Fruity_Brownie_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_balance_multiply_credit_by_and_check_the_balance(int arg1, int arg2, int arg3) throws Throwable {
		//Storing the value before converting the balance into credits
		String preConvert = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String str = preConvert.replaceAll(",", "");
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
		
		//Clicking on balance to convert balance into credits
		driver.findElement(By.id("hud_Hud_txtBalance1")).click();
		Thread.sleep(3000);
		
		//Displaying the balance in credits
		String postConvert = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String str1 = postConvert.replaceAll(",", "");
		System.out.println("Balance of the account after Converting into credits: " +str1);
		Thread.sleep(2000);
		
		//Multiplying the credit by bet value 0.01 and comparing the balance
		double conValue = Double.parseDouble(str1) * Double.parseDouble(creditValue);
		//System.out.println("After deducting the bet value after spin: " +secSpin3);
		String dbi = String.format("%.2f", conValue);  
		System.out.println("Final balance after converting credits into currency is: "+dbi);
		
		Assert.assertEquals(dbi,str);
	}

	@Then("^Balance amound should be same as denomination (\\d+)\\.(\\d+) multiplies by credit in (\\d+) Fruity Brownie slot game$")
	public void balance_amound_should_be_same_as_denomination_multiplies_by_credit_in_Fruity_Brownie_slot_game(int arg1, int arg2, int arg3) throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
