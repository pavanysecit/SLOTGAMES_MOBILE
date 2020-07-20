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

public class TwentyFruityBrownie_Balance_Deduction_AccordingToBetType2_4 {
	AppiumDriver<MobileElement> driver;

	public TwentyFruityBrownie_Balance_Deduction_AccordingToBetType2_4() throws InterruptedException {
		this.driver = TwentyFruityBrownie_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Fruity Brownie game, bet type as (\\d+)\\.(\\d+), bet value as FOUR, balance and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Fruity_Brownie_game_bet_type_as_bet_value_as_FOUR_balance_and_spin_button(int arg1, int arg2, int arg3) throws Throwable {
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

	@When("^Open the (\\d+) Fruity Brownieslot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+), select the bet value as FOUR, click on spin button and check the balance$")
	public void open_the_Fruity_Brownieslot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_select_the_bet_value_as_FOUR_click_on_spin_button_and_check_the_balance(int arg1, int arg2, int arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Current Balance should get deducted by FOUR as bet type is selected as (\\d+)\\.(\\d+) & bet value as FOUR in (\\d+) Fruity Brownie game$")
	public void current_Balance_should_get_deducted_by_FOUR_as_bet_type_is_selected_as_bet_value_as_FOUR_in_Fruity_Brownie_game(int arg1, int arg2, int arg3) throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
