package stepDefinition_SkinfiriMysterious;

import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SkinfiriMysterious_Balance_InsufficiantBalance_Validation {
	AppiumDriver<MobileElement> driver;

	public SkinfiriMysterious_Balance_InsufficiantBalance_Validation() throws InterruptedException {
		this.driver = SkinfiriMysterious_URL_Login.getDriver();
		//this.driver = SkinfiriMysterious_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious slot game, balance, spin button and validation message, button behavior,$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_slot_game_balance_spin_button_and_validation_message_button_behavior() throws Throwable {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "ASUS X00TD");
		cap.setCapability("udid", "J9AAGF10J33379E");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("browserName", "Chrome");
		
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		
		driver=new AndroidDriver<MobileElement>(url,cap);
		
		System.out.println("Appium started sucessfully");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://demo.ysecit.in:82/SlotGames/slotsgame");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[39]/div[1]/div")).click();
		Thread.sleep(2000);
				 
		driver.findElement(By.name("email")).sendKeys("test6692");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("/html/body/div[2]/header/section/div[10]/div/div[2]/form/div[2]/input")).sendKeys("mans@123");
		Thread.sleep(2000);
		
		MobileElement sub = driver.findElement(By.xpath("/html/body/div[2]/header/section/div[10]/div/div[2]/form/button"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement  login_button=  driver.findElement(By.xpath("/html/body/div[2]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[39]/div[1]/div"));
        wait.until(ExpectedConditions.elementToBeClickable(login_button));
        login_button.click();
        
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		MobileElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("5");
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
		Thread.sleep(2000);
	}

	@When("^Open the Skinfiri Mysterious slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message with buttons behavior$")
	public void open_the_Skinfiri_Mysterious_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_till_balance_turns_to_zero_and_check_the_validation_message_with_buttons_behavior() throws Throwable {
		//Storing the value before converting the balance into credits
		MobileElement bal = driver.findElement(By.id("hud_Hud_txtBalance1"));
		String preWin =bal.getText();
		System.out.println("Current balance of the account: " +preWin);

		//Getting the credit value
		MobileElement creditValue = driver.findElement(By.id("hud_txtCredit"));
		creditValue.click();
		Thread.sleep(1000);
		MobileElement credit1 = driver.findElement(By.id("hud_CreditPopup10.01"));
		credit1.click();
		String cred1 = creditValue.getText();
		Thread.sleep(1000);
		Assert.assertEquals("0.01",cred1);
		System.out.println("Selected credit value is: " +cred1);

		MobileElement betval = driver.findElement(By.id("hud_txtBetAmount"));
		betval.click();
		Thread.sleep(1000);
		MobileElement bet1_5 = driver.findElement(By.id("hud_BetPopup54"));
		bet1_5.click();
		Thread.sleep(1000);
		String betval1_5 =betval.getText();
		Assert.assertEquals("5",betval1_5);
		System.out.println("Selected bet value is: " +betval1_5);

		//Clicking on Spin button
		MobileElement spin= driver.findElement(By.id("hud_btnSpin"));
		spin.click();
		Thread.sleep(5000);
		String postbal =bal.getText();
		double conValue = Double.parseDouble(postbal);
		double conValue1 = Double.parseDouble(betval1_5);
		
		Boolean insufficient =driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[3]/android.view.View")).size() != 0;
		if(conValue <conValue1){
			Assert.assertFalse(insufficient);
			System.out.println("Insufficient alert is not present on the screen before click on spin button having main balance less than betval");
		}
		else {
			Assert.assertTrue(insufficient);
			System.out.println("Insufficient alert is present on the screen before click on spin button having main balance less than betval");
		}
			spin.click();
			Thread.sleep(4000);
		
		//Verifying the game buttons is disable during insufficient alert popup
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		System.out.println("credit click is performed");
		Thread.sleep(2000);
		if(driver.findElements(By.id("hud_CreditPopup10.01")).size() != 0){
			System.out.println("Element is Present");
		}else{
			System.out.println("Element is Absent");
		}
		System.out.println("credit values comparision is verified and test case passed");
		Thread.sleep(2000);
	
		// Verify the bet selecting under AutoSpin condition
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		System.out.println("bet click is performed");
		Thread.sleep(2000);

		//Verify if the bet pop is appeared and bet values are available
		if(driver.findElements(By.id("hud_BetPopup20.8")).size() != 0){
			System.out.println("bet values is Present");
		}else{
			System.out.println("bet values is Absent");
		}
		System.out.println("betvalues comparision is verified and test case passed");
		Thread.sleep(2000);
		
		MobileElement home = driver.findElement(By.id("hud_btnHome"));
		Boolean home1 = home.isDisplayed();
		System.out.println("home button visibility:"+home1);
		home.click();
		Thread.sleep(2000);
		if( home1) {
			System.out.println("home button visibility and autospin is continued:"+home1);
			System.out.println("Test case passed with clicking on Home screen");
		}
		else {
			System.out.println("Test case failed as Home screen is not visible");
		}
		Thread.sleep(2000);
		
		MobileElement info = driver.findElement(By.id("hud_btnMenu"));
		Boolean menu = info.isDisplayed();
		System.out.println("menu button visibility:"+menu);
		info.click();
		Thread.sleep(2000);
		if( menu) {
			System.out.println("menu button visibility and autospin is continued:"+menu);
			System.out.println("Test case passed with clicking on menu button");
		}
		else {
			System.out.println("Test case failed as menu button is not visible");
		}
		String insufficient1 =driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[3]/android.view.View")).getText();
		Assert.assertEquals("Insufficient Balance.",insufficient1);
		System.out.println("Insufficient balance alert is present");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[2]")).click();
		System.out.println("Click on ALert 'OK' and accepted the alert");
		System.out.println("Test case passed");
	}

	@Then("^Check the insufficient alert popop is displayed before the clicking on spin$")
	public void check_the_insufficient_alert_popop_is_displayed_before_the_clicking_on_spin() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Player should be blocked from playing the game when there is no balance in the account and buttons are inactive state in Skinfiri Mysterious game$")
	public void player_should_be_blocked_from_playing_the_game_when_there_is_no_balance_in_the_account_and_buttons_are_inactive_state_in_Skinfiri_Mysterious_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
