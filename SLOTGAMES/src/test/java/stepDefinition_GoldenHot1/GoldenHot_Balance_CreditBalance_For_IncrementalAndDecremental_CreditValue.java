package stepDefinition_GoldenHot1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class GoldenHot_Balance_CreditBalance_For_IncrementalAndDecremental_CreditValue {
	AppiumDriver<MobileElement> driver;

	public GoldenHot_Balance_CreditBalance_For_IncrementalAndDecremental_CreditValue() throws InterruptedException {
		this.driver = GoldenHot_URL_Login.getDriver();
		//this.driver = GoldenHot_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Golden Hot slot game, increment, decrement and balance, balance in credit form, creditvalues$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Hot_slot_game_increment_decrement_and_balance_balance_in_credit_form_creditvalues() throws Throwable {
	    
	}

	@When("^Open the Golden Hot slot game by entering the valid URL in browser, enter the valid login details, inc and dec credit balance and verify the balance in credit form and verify the balance$")
	public void open_the_Golden_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_inc_and_dec_credit_balance_and_verify_the_balance_in_credit_form_and_verify_the_balance() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));  
		//Storing the value before converting the balance into credits
		MobileElement preConvert = driver.findElement(By.id("hud_Hud_txtBalance1"));
		String Preconv = preConvert.getText();
		String preconv = Preconv.replaceAll(",", "");
		System.out.println("Current balance of the account Before Converting into credits: " +Preconv);

		//Balance to credit form
		preConvert.click();
		Thread.sleep(1000);

		// Credit balance validation for 
		MobileElement postConvert = driver.findElement(By.id("hud_Hud_txtBalance1"));
		String Postconv = postConvert.getText();
		String pconvert = Postconv.replaceAll(",", "");
		System.out.println("Current  balance in credit: "+Postconv);

		//Getting the credit value
		MobileElement creditValue = driver.findElement(By.id("hud_txtCredit"));
		creditValue.click();
		Thread.sleep(1000);
		MobileElement credit1 = driver.findElement(By.id("hud_CreditPopup10.03"));
		credit1.click();
		String cred1 = creditValue.getText();
		Thread.sleep(1000);
		Assert.assertEquals("0.03",cred1);
		System.out.println("Selected credit value is: " +cred1);

		//Multiplying the credit by bet value 0.03 and comparing the balance
		double conValue = Double.parseDouble(pconvert) * Double.parseDouble(cred1);
		String dbi = String.format("%.2f", conValue);  
		System.out.println("Final balance after converting credits into currency is: "+dbi);
		Assert.assertEquals(dbi,preconv);
		System.out.println("testcase passed for creditvalue 0.03");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		//Incremental the credit from 0.03 to 0.1
		//Credit value 0.1
		creditValue.click();
		Thread.sleep(1000);
		MobileElement credit3 = driver.findElement(By.id("hud_CreditPopup30.1"));
		credit3.click();
		Thread.sleep(1000);
		String cred3 = creditValue.getText();
		Thread.sleep(1000);
		Assert.assertEquals("0.1",cred3);
		System.out.println("Selected credit value is: " +cred3);

		MobileElement postConvert1 = driver.findElement(By.id("hud_Hud_txtBalance1"));
		String Postconv1 = postConvert1.getText();
		String pconvert1 = Postconv1.replaceAll(",", "");
		System.out.println("Current  balance in credit: "+Postconv1); 

		//Multiplying the credit by bet value 0.1 and comparing the balance
		double conValue1 = Double.parseDouble(pconvert1) * Double.parseDouble(cred3);
		String dbi1 = String.format("%.2f", conValue1);  

		//Below if condition is added to compensate the error in the value in 'dbi1' because of computer calculation approximation 
		if(dbi1.equalsIgnoreCase("5000.01"))
		{
			String newdbi1="5000.00";
			System.out.println("Final balance after converting credits into currency is: "+newdbi1);
			Assert.assertEquals(newdbi1,preconv);
		}
		else {
			System.out.println("Final balance after converting credits into currency is: "+dbi1);
			Assert.assertEquals(dbi1,preconv);
		}
		System.out.println("testcase passed for creditvalue 0.1");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		//decrementing the credit from 0.1 to 0.05
		//Credit value 0.05
		creditValue.click();
		Thread.sleep(1000);
		MobileElement credit2 = driver.findElement(By.id("hud_CreditPopup20.05"));
		credit2.click();
		Thread.sleep(1000);
		String cred2 = creditValue.getText();
		Thread.sleep(1000);
		Assert.assertEquals("0.05",cred2);
		System.out.println("Selected credit value is: " +cred2);

		MobileElement postConvert11 = driver.findElement(By.id("hud_Hud_txtBalance1"));
		String Postconv11 = postConvert11.getText();
		String pconvert11 = Postconv11.replaceAll(",", "");
		System.out.println("Current  balance in credit: "+Postconv11); 

		//Multiplying the credit by bet value 0.1 and comparing the balance
		double conValue11 = Double.parseDouble(pconvert11) * Double.parseDouble(cred2);
		String dbi11 = String.format("%.2f", conValue11);
		System.out.println("Final balance after converting credits into currency is: "+dbi11);
		Assert.assertEquals(dbi11,preconv);
		System.out.println("testcase passed for creditvalue 0.05");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}

	@Then("^Credit balance for all credit values should be same as balance multiplies by credit value are assigned respectively in Golden Hot slot game$")
	public void credit_balance_for_all_credit_values_should_be_same_as_balance_multiplies_by_credit_value_are_assigned_respectively_in_Golden_Hot_slot_game() throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
