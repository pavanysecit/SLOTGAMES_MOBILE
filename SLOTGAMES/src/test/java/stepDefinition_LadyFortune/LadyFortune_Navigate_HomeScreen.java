package stepDefinition_LadyFortune;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LadyFortune_Navigate_HomeScreen {
	AppiumDriver<MobileElement> driver;

	public LadyFortune_Navigate_HomeScreen() throws InterruptedException {
		this.driver = LadyFortune_URL_Login.getDriver();
		//this.driver = LadyFortune_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Lady Fortune slot game and home button$")
	public void chrome_browser_valid_URL_valid_login_details_Lady_Fortune_slot_game_and_home_button() throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 80);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the Lady Fortune slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button$")
	public void open_the_Lady_Fortune_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_and_click_on_home_button() throws Throwable {
		driver.findElement(By.id("hud_btnHome")).click();
		Thread.sleep(4000);
		
		String expected = driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/h3")).getText();
		String actual = "Slot Games";
		Assert.assertEquals(expected, actual);
	}

	@Then("^System should take the player to Home page after clicking on home button from Lady Fortune game$")
	public void system_should_take_the_player_to_Home_page_after_clicking_on_home_button_from_Lady_Fortune_game() throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
