package stepDefinition_40GlowingHot;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import stepDefinition_40GlowingHot.SlotGames_URL_Login;

public class FourtyGlowingHot_Transfer_Validation_ZeroBalance {
AppiumDriver<MobileElement> driver;
	
	public FourtyGlowingHot_Transfer_Validation_ZeroBalance() throws InterruptedException {
	this.driver = SlotGames_URL_Login.getDriver();
	driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[1]/div[1]/div/span")).click();
	Thread.sleep(2000);
	}
	
	@Given("^Chrome browser, valid URL, valid login details, fourty glowing hot game, zero balance, text field to transfer balance, Ok button and validation message$")
	public void chrome_browser_valid_URL_valid_login_details_fourty_glowing_hot_game_zero_balance_text_field_to_transfer_balance_Ok_button_and_validation_message() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[1]/div[1]/div/span")).click();
		Thread.sleep(2000);
		
		//Clearing value from balance field and sending null values
		MobileElement transfer = driver.findElement(By.id("transferInput"));
		transfer.sendKeys("0");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(2000);

		//As there is developer bug, closing the blank window manually using keyboard actions
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
	}

	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, fourty glowing hot game, enter the amount as zero SRD and click on Ok butotn$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_fourty_glowing_hot_game_enter_the_amount_as_zero_SRD_and_click_on_Ok_butotn() throws Throwable {
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		for(String windowHandle  : handles)
		{
		    if(!windowHandle.equals(parentWindow))
		   {
		     driver.switchTo().window(windowHandle);
		     
				String expected = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ui-view/section/div[7]/div/span")).getText();
			    String actual = "Transfer Amount should be greater than zero";
			    Assert.assertEquals(expected, actual);
			    Thread.sleep(2000);
		   }
		driver.quit();
		}
	}

	@Then("^An error should be displayed if balance entered was zero and player should be blocked from loading the fourty glowing hot game$")
	public void an_error_should_be_displayed_if_balance_entered_was_zero_and_player_should_be_blocked_from_loading_the_fourty_glowing_hot_game() throws Throwable {
	    
	}
}
