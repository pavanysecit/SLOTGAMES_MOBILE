package stepDefinition_SkinfiriMysterious;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class SkinfiriMysterious_Reload_Option {
	AppiumDriver<MobileElement> driver;

	public SkinfiriMysterious_Reload_Option() throws InterruptedException {
		this.driver = SkinfiriMysterious_URL_Login.getDriver();
		//this.driver = SkinfiriMysterious_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious slot game, balance, spin button, browser hamburger reload button valid session invalid error message\\.$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_slot_game_balance_spin_button_browser_hamburger_reload_button_valid_session_invalid_error_message() throws Throwable {
	    
	}

	@When("^Open the Skinfiri Mysterious slot game by entering the valid URL in browser, enter the valid login details, click on  hamburger menu and reload the game session\\.$")
	public void open_the_Skinfiri_Mysterious_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_hamburger_menu_and_reload_the_game_session() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The balance in first session"+" "+balance);
		MobileElement start = driver.findElement(By.id("hud_btnSpin"));
		start.click();

		// Click on Hamburger Menu
		MobileElement menu = driver.findElement(By.id("com.android.chrome:id/menu_button"));
		menu.click();
		Thread.sleep(2000);
		// Select the refresh button
		MobileElement refresh = driver. findElement(MobileBy. AccessibilityId("Refresh page"));
		refresh.click();
		Thread.sleep(2000);
		// Validation message on refreshing the game page
		MobileElement title = driver.findElement(By.id("com.android.chrome:id/title"));
		System.out.println("Title: "+title.getText());
		MobileElement ValidMessage = driver.findElement(By.id("com.android.chrome:id/message"));
		String validmsg = ValidMessage.getText();
		System.out.println("Valid error message with details:  "+validmsg);
		String message = "Authentication Failed or Session Invalid. Please try Again.";
		Assert.assertEquals(message, validmsg);
		System.out.println("Validation is successfull");

		// Click on OK button
		MobileElement ok = driver.findElement(By.id("com.android.chrome:id/positive_button"));
		ok.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		driver.context("CHROMIUM");
		Thread.sleep(4000);

		// Validating it has redirected to game selection screen
		MobileElement logo = driver.findElement(By.xpath("//img[@name='Suribet']"));
		Assert.assertTrue(logo.isDisplayed());
		System.out.println("User is redirected to gameselection screen");
	}

	@Then("^User should not able to resume to game and informed with valid error message for session invalid error message in Skinfiri Mysterious slot game$")
	public void user_should_not_able_to_resume_to_game_and_informed_with_valid_error_message_for_session_invalid_error_message_in_Skinfiri_Mysterious_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
