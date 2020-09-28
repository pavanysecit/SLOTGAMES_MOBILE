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

public class CircusMania_Navigate_HomeScreen {
	AppiumDriver<MobileElement> driver;

	public CircusMania_Navigate_HomeScreen() throws InterruptedException {
		this.driver = CircusMania_URL_Login.getDriver();
		//this.driver = CircusMania_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Circus Mania slot game and home button$")
	public void chrome_browser_valid_URL_valid_login_details_Circus_Mania_slot_game_and_home_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the Circus Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button$")
	public void open_the_Circus_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_and_click_on_home_button() throws Throwable {
		driver.findElement(By.id("hud_btnHome")).click();
		Thread.sleep(4000);
		
		String expected = driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/h3")).getText();
		String actual = "Slot Games";
		Assert.assertEquals(expected, actual);
	}

	@Then("^System should take the player to Home page after clicking on home button from Circus Mania game$")
	public void system_should_take_the_player_to_Home_page_after_clicking_on_home_button_from_Circus_Mania_game() throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
