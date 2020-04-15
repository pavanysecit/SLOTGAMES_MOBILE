package stepDefinition_40GlowingHot;

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
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import stepDefinition_40GlowingHot.SlotGames_URL_Login;

public class FourtyGlowingHot_Transfer_Validation_EmptyBalance {
AppiumDriver<MobileElement> driver;
	
	public FourtyGlowingHot_Transfer_Validation_EmptyBalance() throws InterruptedException {
	this.driver = SlotGames_URL_Login.getDriver();
	
	}
	
	@Given("^Chrome browser, valid URL, valid login details, fourty glowing hot game, empty balance, text field to transfer balance, Ok button and validation message$")
	public void chrome_browser_valid_URL_valid_login_details_fourty_glowing_hot_game_empty_balance_text_field_to_transfer_balance_Ok_button_and_validation_message() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		//Clearing value from balance field and sending null values
		MobileElement transfer = driver.findElement(By.id("transferInput"));
		transfer.clear();
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(2000);

		//As there is developer bug, closing the blank window manually using keyboard actions
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
	}

	@When("^Open the fourty glowing slot game by entering the valid URL in browser, enter the valid login details,  do not enter the amount in the balance field and click on Ok butotn$")
	public void open_the_fourty_glowing_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_do_not_enter_the_amount_in_the_balance_field_and_click_on_Ok_butotn() throws Throwable {
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		for(String windowHandle  : handles)
		{
		    if(!windowHandle.equals(parentWindow))
		   {
		     driver.switchTo().window(windowHandle);
		     
				String expected = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ui-view/section/div[7]/div/span")).getText();
			    String actual = "Please Enter Amount To Transfer";
			    Assert.assertEquals(expected, actual);
			    Thread.sleep(2000);
		   }
		driver.quit();
		}
	}

	@Then("^An error should be displayed if the balance field is empty and player should be blocked from loading the fourty glowing hot game$")
	public void an_error_should_be_displayed_if_the_balance_field_is_empty_and_player_should_be_blocked_from_loading_the_fourty_glowing_hot_game() throws Throwable {
	    
	}
}
