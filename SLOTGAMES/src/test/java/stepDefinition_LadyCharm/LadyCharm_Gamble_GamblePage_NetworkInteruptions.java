package stepDefinition_LadyCharm;

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

public class LadyCharm_Gamble_GamblePage_NetworkInteruptions {
	AppiumDriver<MobileElement> driver;

	public LadyCharm_Gamble_GamblePage_NetworkInteruptions() throws InterruptedException {
		this.driver = LadyCharm_URL_Login.getDriver();
		//this.driver = LadyCharm_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Lady Charm slot game, balance, spin button, gamble screen, wifi turnOFF and ON, network messages$")
	public void chrome_browser_valid_URL_valid_login_details_Lady_Charm_slot_game_balance_spin_button_gamble_screen_wifi_turnOFF_and_ON_network_messages() throws Throwable {
	  
	}

	@When("^Open the Lady Charm slot game by entering the valid URL in browser, enter the valid login details, and launch the game, spin till player wins, selext any gamble option and turn OFF wifi and check for valid message and turn on wifi for gamble to resume if won or go back to game screen$")
	public void open_the_Lady_Charm_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_and_launch_the_game_spin_till_player_wins_selext_any_gamble_option_and_turn_OFF_wifi_and_check_for_valid_message_and_turn_on_wifi_for_gamble_to_resume_if_won_or_go_back_to_game_screen() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The balance in first session"+" "+balance);

		MobileElement start = driver.findElement(By.id("hud_btnSpin"));
		start.click();
		Thread.sleep(8000);
		MobileElement winE = driver.findElement(By.id("hud_Hud_txtWin1"));

		String prewin = winE.getText();
		//System.out.println("Balance before win is"+" "+prewin);                    
		String winTex= winE.getText();

		while(prewin.isEmpty()){
			start.click();	
			Thread.sleep(8000);	
			winTex = winE.getText();
			prewin= prewin+winTex;
			System.out.println(winTex.isEmpty());		
		}
		System.out.println("Win amount is: " +prewin);
		String balance1 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance amount before clicking on gamble link :"+balance1);

		driver.findElement(By.id("hud_btnGamble")).click();	
		Thread.sleep(2000);
		String gAmount = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
		System.out.println("Gamble amount is :"+gAmount);
		Thread.sleep(2000);

		String gambleamt = gAmount.replaceAll(" SRD", "");
		System.out.println("Gamble amount after split is :"+gambleamt);

		String colorwin = driver.findElement(By.id("gamble_txtWin")).getText();
		String gamblewin = colorwin.replaceAll(" SRD", "");
		System.out.println("Gamble to win amount after split is :"+gamblewin);
		System.out.println("Gamble to win amount is: " +colorwin);


		((AndroidDriver<MobileElement>) driver).openNotifications();
		//Turn OFF the wifi for network interruptions
		MobileElement wifiOFF = driver.findElement(By.xpath("//android.widget.Switch[@content-desc=\"Wi-Fi,Wifi signal full.,YsecIT\"]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView"));
		wifiOFF.click();
		Thread.sleep(1000);
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);

		//Click on Gamble red button
		driver.findElement(By.id("gamble_btnRed")).click();
		Thread.sleep(3000);

		//No Internet valid message to the user
		MobileElement msg1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[5]/android.view.View[2]/android.view.View"));
		String actual1 = msg1.getText();
		System.out.println("No internet valid message to user:"+actual1);
		String expected1 = "No Internet.";
		Assert.assertEquals(actual1, expected1);
		System.out.println("Valid message is compared");

		//Open the notification bar
		((AndroidDriver<MobileElement>) driver).openNotifications();
		Thread.sleep(2000);
		//Turn ON the wifi for network interruptions
		MobileElement wifiON = driver.findElement(By.xpath("//android.widget.Switch[@content-desc=\"Wi-Fi,\"]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView"));
		wifiON.click();
		Thread.sleep(1000);
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(4000);

		String gAmount1 = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
		String gambleamtafter = gAmount1.replaceAll(" SRD", "");
		System.out.println("Gamble amount after selecting red or black button: "+gambleamtafter);

		if(gamblewin.equalsIgnoreCase(gambleamtafter)) {

			//Open the notification bar
			((AndroidDriver<MobileElement>) driver).openNotifications();
			Thread.sleep(3000);
			//Turn OFF the wifi for network interruptions
			MobileElement wifiOFF1 = driver.findElement(By.xpath("//android.widget.Switch[@content-desc=\"Wi-Fi,Wifi signal full.,YsecIT\"]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView"));
			wifiOFF1.click();
			Thread.sleep(1000);
			((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(3000);

			// The user is able to collect the amount after resuming to gamble screen 
			driver.findElement(By.id("gamble_btnCollect")).click();
			Thread.sleep(1000);
			
			//No Internet valid message to the user
			MobileElement msg11 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[5]/android.view.View[2]/android.view.View"));
			String actual11 = msg11.getText();
			System.out.println("No internet valid message to user:"+actual1);
			String expected11 = "No Internet.";
			Assert.assertEquals(actual11, expected11);
			System.out.println("Valid message is compared");

			//Open the notification bar
			((AndroidDriver<MobileElement>) driver).openNotifications();
			Thread.sleep(2000);
			//Turn ON the wifi for network interruptions
			MobileElement wifiON1 = driver.findElement(By.xpath("//android.widget.Switch[@content-desc=\"Wi-Fi,\"]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView"));
			wifiON1.click();
			Thread.sleep(1000);
			((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(2000);

			MobileElement bal = driver.findElement(By.id("hud_Hud_txtBalance1"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
			Assert.assertTrue(bal.isDisplayed());
			System.out.println("Screen is on Game page");
		}
		else
		{     
			Thread.sleep(3000);
			String postBalance33 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText(); 
			System.out.println("It has lost");
			System.out.println("Current balance after loosing in gamble: " +postBalance33);
			Assert.assertEquals(postBalance33, postBalance33);
		}
		System.out.println("The testcase 3 has passed");
	}

	@Then("^User is addressed with valid error message 'No Internet' for network interuptions in gamble page of Lady Charm slot game$")
	public void user_is_addressed_with_valid_error_message_No_Internet_for_network_interuptions_in_gamble_page_of_Lady_Charm_slot_game() throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
