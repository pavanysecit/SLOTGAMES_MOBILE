package stepDefinition_20FruityBrownie;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TwentyFruityBrownie_AutoSpin_TwentySpins {
	AppiumDriver<MobileElement> driver;

	public TwentyFruityBrownie_AutoSpin_TwentySpins() throws InterruptedException {
		this.driver = TwentyFruityBrownie_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Fruity Brownie slot game, balance, spin button, auto spin button, twenty spins option and number of spins left message$")
	public void chrome_browser_valid_URL_valid_login_details_Fruity_Brownie_slot_game_balance_spin_button_auto_spin_button_twenty_spins_option_and_number_of_spins_left_message(int arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		MobileElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();

		String parent1=driver.getWindowHandle();
		Set<String>s1=driver.getWindowHandles();

		System.out.println("Window for slot game is"+" "+s1);
		 
		Set<String> contx = driver.getContextHandles();
		String pk = driver.getContext();
		//System.out.println("The current contesx is"+" "+pk);
		for(String cont:contx){
			 System.out.println(cont);
		 }
		driver.context("NATIVE_APP");
		Thread.sleep(4000);
	}

	@When("^Open the (\\d+) Fruity Brownie slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on twenty spin option under auto spin drop down and check the number of spins left message$")
	public void open_the_Fruity_Brownie_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_twenty_spin_option_under_auto_spin_drop_down_and_check_the_number_of_spins_left_message(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Number of spin left should start from (\\d+) to (\\d+) after clicking twenty spins option and should perform (\\d+) spins from (\\d+) to (\\d+) in (\\d+) Fruity Brownie slot game$")
	public void number_of_spin_left_should_start_from_to_after_clicking_twenty_spins_option_and_should_perform_spins_from_to_in_Fruity_Brownie_slot_game(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
