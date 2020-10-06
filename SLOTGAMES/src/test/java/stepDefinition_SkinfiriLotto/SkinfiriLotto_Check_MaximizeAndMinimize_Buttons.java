package stepDefinition_SkinfiriLotto;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SkinfiriLotto_Check_MaximizeAndMinimize_Buttons {
	AppiumDriver<MobileElement> driver;

	public SkinfiriLotto_Check_MaximizeAndMinimize_Buttons() throws InterruptedException {
		this.driver = SkinfiriLotto_URL_Login.getDriver();
		//this.driver = SkinfiriLotto_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Lotto slot game, maximize button and minimize button$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Lotto_slot_game_maximize_button_and_minimize_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the Skinfiri Lotto slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button$")
	public void open_the_Skinfiri_Lotto_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_maximize_button_and_click_on_minimize_button() throws Throwable {
		MobileElement sub = driver.findElement(By.id("hud_btnFullScreen"));
		sub.click();
		Thread.sleep(3000);
		
		//Checking when window is maximized, URL tool bar should not visible
	    Assert.assertTrue(driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.EditText")).size() == 0);
	    
	    driver.findElement(By.id("hud_btnFullScreen")).click();
		Thread.sleep(3000);

    	 //Checking when window is minimized, URL tool bar should be visible
	    Assert.assertTrue(driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.EditText")).size() == 1);
	}

	@Then("^Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in Skinfiri Lotto slot game$")
	public void full_screen_should_be_displayed_after_clicking_on_maximize_button_and_minimized_screen_should_be_displayed_after_clicking_on_minimize_button_in_Skinfiri_Lotto_slot_game() throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
