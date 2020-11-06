package stepDefinition_FruitBazaar;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class FruitBazaar_AutoSpin_Validations_NetworkInteruptions {
	AppiumDriver<MobileElement> driver;

	public FruitBazaar_AutoSpin_Validations_NetworkInteruptions() throws InterruptedException {
		this.driver = FruitBazaar_URL_Login.getDriver();
		//this.driver = FruitBazaar_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Fruit Bazaar slot game, balance, Autospin button, browser hamburger reload button valid session invalid error message\\.$")
	public void chrome_browser_valid_URL_valid_login_details_Fruit_Bazaar_slot_game_balance_Autospin_button_browser_hamburger_reload_button_valid_session_invalid_error_message() throws Throwable {
	    
	}

	@When("^Open the Fruit Bazaar slot game by entering the valid URL in browser, enter the valid login details, select autospin button, click on  hamburger menu and reload the game session\\.$")
	public void open_the_Fruit_Bazaar_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_autospin_button_click_on_hamburger_menu_and_reload_the_game_session() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The balance in first session"+" "+balance);
		MobileElement start = driver.findElement(By.id("hud_btnAuto"));
		start.click();

		//Open the notification bar
		((AndroidDriver<MobileElement>) driver).openNotifications();
		Thread.sleep(3000);
		//Turn OFF the wifi for network interruptions
		MobileElement wifiOFF = driver.findElement(By.xpath("//android.widget.Switch[@content-desc=\"Wi-Fi,Wifi signal full.,YsecIT\"]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView"));
		wifiOFF.click();
		Thread.sleep(1000);
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(5000);

		//No Internet valid message to the user
		MobileElement msg1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[4]/android.view.View[2]/android.view.View"));
		String actual1 = msg1.getText();
		System.out.println("No internet valid message to user:"+actual1);
		String expected1 = "No Internet.";
		Assert.assertEquals(actual1, expected1);
		System.out.println("Valid message is compared");

		//Open the notification bar
		((AndroidDriver<MobileElement>) driver).openNotifications();
		Thread.sleep(3000);
		//Turn ON the wifi for network interruptions
		MobileElement wifiON = driver.findElement(By.xpath("//android.widget.Switch[@content-desc=\"Wi-Fi,\"]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView"));
		wifiON.click();
		Thread.sleep(1000);
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);

		//Validation autospin is continued after network fluctuations
		MobileElement spin = driver.findElement(By.id("hud_btnSpin"));
		Assert.assertTrue(spin.isDisplayed());
		System.out.println("Spin button visible");
		System.out.println("After network OFF and ON Autospin is resumed and continued");

		//Validation on Disconnected from Server
		//Open the notification bar
		((AndroidDriver<MobileElement>) driver).openNotifications();
		Thread.sleep(3000);
		
		//Turn OFF the wifi for network interruptions
		wifiOFF.click();
		Thread.sleep(10000);
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(30000);
		
		//Disconnected from server valid message to the user
		MobileElement msg2 = driver.findElement(By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[6]/android.view.View[2]/android.view.View"));
		String actual11 = msg2.getText();
		System.out.println("Disconnected from Server valid message to user:"+actual11);
		String expected11 = "Disconnected from Server.";
		Assert.assertEquals(actual11, expected11);
		System.out.println("Valid message is compared");

		//Open the notification bar
		((AndroidDriver<MobileElement>) driver).openNotifications();
		Thread.sleep(3000);
		wifiON.click();
		Thread.sleep(1000);
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(5000);

		//Validation autospin is not continued after Longer duration network fluctuations
		System.out.println(msg2.isDisplayed());
		Assert.assertTrue(msg2.isDisplayed());
		Thread.sleep(5000);
		System.out.println("Disconnected from Server message still available on the screen");
		System.out.println("After network OFF and ON with longer duration Autospin is not resumed");
	}

	@Then("^User should not able to resume to game and autospin should be terminated and informed with valid error message for session invalid in Fruit Bazaar slot game$")
	public void user_should_not_able_to_resume_to_game_and_autospin_should_be_terminated_and_informed_with_valid_error_message_for_session_invalid_in_Fruit_Bazaar_slot_game() throws Throwable {
	    Thread.sleep(1000);
	    driver.quit();
	}
}
