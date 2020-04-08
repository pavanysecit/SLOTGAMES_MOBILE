package stepDefinition_TikiIsle;

import java.util.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TikiIsle_Check_UserInstruction_Messages {
	AppiumDriver<MobileElement> driver;

	public TikiIsle_Check_UserInstruction_Messages() throws InterruptedException {
		this.driver = TikiIsle_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Tiki Isle slot game, balance, spin button and user instruction message$")
	public void chrome_browser_valid_URL_valid_login_details_Tiki_Isle_slot_game_balance_spin_button_and_user_instruction_message() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		MobileElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(20000);

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

	@When("^Open the Tiki Isle hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages$")
	public void open_the_Tiki_Isle_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_and_check_the_user_instruction_messages() throws Throwable {
	    String preMsg = driver.findElement(By.id("hud_txtWinDetail")).getText();
	    Thread.sleep(3000);
	    String actual = preMsg;
	    String expected = "Please Place Your Bet";
	    System.out.println("Actual Message before Spin:" +actual);
	    Assert.assertEquals(expected, actual);
	    
		driver.findElement(By.id("hud_btnSpin")).click();
		Thread.sleep(1000);
		String postMsg = driver.findElement(By.id("hud_txtWinDetail")).getText();
		String actual1 = postMsg;
	    String expected1 = "GOOD LUCK!";
	    System.out.println("Actual Message After Spin:" +actual1);
	    Assert.assertEquals(expected1, actual1);
	    Thread.sleep(1000);
	}

	@Then("^User instruction message 'Please place your bet' should be displayed before spin button is clicked$")
	public void user_instruction_message_Please_place_your_bet_should_be_displayed_before_spin_button_is_clicked() throws Throwable {
		Thread.sleep(2000);
	}
	
	@Then("^User instruction message 'Good Luck' should be displayed after spin button is clicked in Tiki Isle slot game$")
	public void user_instruction_message_Good_Luck_should_be_displayed_after_spin_button_is_clicked_in_Tiki_Isle_slot_game() throws Throwable {
		driver.quit();
	}
}
