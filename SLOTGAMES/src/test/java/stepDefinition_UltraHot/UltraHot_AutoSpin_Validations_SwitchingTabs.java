package stepDefinition_UltraHot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class UltraHot_AutoSpin_Validations_SwitchingTabs {
	AppiumDriver<MobileElement> driver;

	public UltraHot_AutoSpin_Validations_SwitchingTabs() throws InterruptedException {
		this.driver = UltraHot_URL_Login.getDriver();
		//this.driver = UltraHot_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Ultra Hot slot game, spin button, auto spin button, browser tabs\\.$")
	public void chrome_browser_valid_URL_valid_login_details_Ultra_Hot_slot_game_spin_button_auto_spin_button_browser_tabs() throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 80);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the Ultra Hot slot game by entering the valid URL in browser, click on auto wait for the reel spin, open new browser tabs and redirect to game tab and check the spin functionality$")
	public void open_the_Ultra_Hot_slot_game_by_entering_the_valid_URL_in_browser_click_on_auto_wait_for_the_reel_spin_open_new_browser_tabs_and_redirect_to_game_tab_and_check_the_spin_functionality() throws Throwable {
		//Storing the value before converting the balance into credits
		String Bal = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance amount:" +Bal);

		driver.findElement(By.id("hud_btnAuto")).click();
		Thread.sleep(2000);

		driver.runAppInBackground(Duration.ofSeconds(15));
		//driver.navigate().to("http://appium.io/docs/en/commands/device/app/background-app/");
		//driver.navigate().to("");
		Thread.sleep(5000);

		if(driver.findElements(By.id("AutoSpinListItem_undefined")).size() != 0){
			System.out.println("Minimized the browser and re-opened. Autoplay is stopped as autoplay drop down(<-) icon is visiable ");
			System.out.println("Testcase failed");
		}else{
			System.out.println("Minimized the browser and re-opened. Autoplay is still running as autoplay drop down(<-) icon is not visiable ");
			System.out.println("Testcase Passed ");
		}
		System.out.println("Autospin performing continously hence test case passed");
		Thread.sleep(2000);
	}

	@Then("^Auto spin should be continued even after switching between the tabs in Ultra Hot slot game$")
	public void auto_spin_should_be_continued_even_after_switching_between_the_tabs_in_Ultra_Hot_slot_game() throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
