package stepDefinition_20FruityBrownie;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwentyFruityBrownie_ResumeFeature_DisabledOption_WithoutWin {
	AppiumDriver<MobileElement> driver;

	public TwentyFruityBrownie_ResumeFeature_DisabledOption_WithoutWin() throws InterruptedException {
		this.driver = TwentyFruityBrownie_URL_Login.getDriver();
		//this.driver = TwentyFruityBrownie_URL_TryNow.getDriver();
	}
	
	@Given("^chrome browser, valid URL, valid login details, (\\d+) Fruity Brownie slot slot game, bet type, denomination, balance, spin button, Gamble screen, Gamble collect$")
	public void chrome_browser_valid_URL_valid_login_details_Fruity_Brownie_slot_slot_game_bet_type_denomination_balance_spin_button_Gamble_screen_Gamble_collect(int arg1) throws Throwable {
		
	}

	@When("^Open the (\\d+) Fruity Brownie slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on collect and close the browser and again load to the game$")
	public void open_the_Fruity_Brownie_slot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_win_appears_and_gamble_screen_in_switched_and_click_on_collect_and_close_the_browser_and_again_load_to_the_game(int arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The balance is equal to"+" "+balance);

		MobileElement start = driver.findElement(By.id("hud_btnSpin"));
		start.click();
		Thread.sleep(7000);	
		MobileElement winE = driver.findElement(By.id("hud_Hud_txtWin1"));

		String prewin = winE.getText();                    
		String winTex= winE.getText();

		while(prewin.isEmpty()){
			start.click();	
			Thread.sleep(7000);	
			winTex = winE.getText();
			prewin= prewin+winTex;
			System.out.println(winTex.isEmpty());		
		}
		System.out.println("Win amount is: " +prewin);	 
		String balance1 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance amount before clicking on gamble link :"+balance1);

		driver.findElement(By.id("hud_btnGamble")).click();	
		Thread.sleep(2000);

		// Navigating back to game selection screen
		driver.navigate().back();
		Thread.sleep(5000);
		// Switching context to Web-view
		driver.context("CHROMIUM");
		Thread.sleep(4000);

		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[33]/div[1]/div[1]")).click();
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		MobileElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(5000);
		System.out.println("driver context during resuming to game screen  "+driver.getContext());
		// Switching context to Native view
		Thread.sleep(10000);
		driver.context("NATIVE_APP");
		System.out.println("driver context after resuming to the game screen "+driver.getContext());

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		String ResumeBal = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The balance is equal to"+" "+ResumeBal);
		System.out.println("Main balance is available on the screen for the user and new game session has been generated");
		System.out.println("Resuming to gamble screen is disable for the user: Test case passed");

		MobileElement gcollect = driver.findElement(By.id("gamble_btnCollect"));
		Assert.assertFalse(gcollect.isDisplayed());
		System.out.println("Gamble collect button is not on the screen");
		System.out.println("Testcase passed");
	}

	@Then("^Resume feature should not be enabled and land on the game screen of (\\d+) Fruity Brownie slot game$")
	public void resume_feature_should_not_be_enabled_and_land_on_the_game_screen_of_Fruity_Brownie_slot_game(int arg1) throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}

}
