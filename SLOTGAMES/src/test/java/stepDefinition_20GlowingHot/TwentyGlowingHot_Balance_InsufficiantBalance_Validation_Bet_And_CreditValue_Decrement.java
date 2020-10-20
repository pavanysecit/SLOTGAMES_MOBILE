package stepDefinition_20GlowingHot;

import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwentyGlowingHot_Balance_InsufficiantBalance_Validation_Bet_And_CreditValue_Decrement {
	AppiumDriver<MobileElement> driver;

	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Glowing Hot slot game, balance counter, Auto spin button, validation message, credit types and bet types$")
	public void chrome_browser_valid_URL_valid_login_details_Glowing_Hot_slot_game_balance_counter_Auto_spin_button_validation_message_credit_types_and_bet_types(int arg1) throws Throwable {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "ASUS X00TD");
		cap.setCapability("udid", "J9AAGF10J33379E");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("browserName", "Chrome");
		
		URL url=new URL("http://10.10.13.86:4723/wd/hub");
		
		driver=new AndroidDriver<MobileElement>(url,cap);
		
		System.out.println("Appium started sucessfully");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://demo.ysecit.in:82/SlotGames/slotsgame");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[39]/div[1]/div")).click();
		Thread.sleep(2000);
				 
		driver.findElement(By.name("email")).sendKeys("test8");
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
		balT.sendKeys("80");
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

	@When("^Open the (\\d+) Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Auto spin button till balance counter turns less than betvalues and check the insufficient validation message and reduce the bet and credit values to resume the play\\.$")
	public void open_the_Glowing_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_Auto_spin_button_till_balance_counter_turns_less_than_betvalues_and_check_the_insufficient_validation_message_and_reduce_the_bet_and_credit_values_to_resume_the_play(int arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		String Bal = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance amount:" +Bal);

		//Autoplay
		//Change the credit and bet values to max level to generate Insufficiant balance message
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(1000);
		MobileElement cr4 = driver.findElement(By.id("hud_CreditPopup40.5"));
		String credit4 =cr4.getText();
		System.out.println("Credit value is: " +credit4);
		cr4.click();
		Thread.sleep(1000);

		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(1000);
		MobileElement bet4_5= driver.findElement(By.id("hud_BetPopup5200"));
		String Betval4_5 =bet4_5.getText();
		System.out.println("Bet value is: " +Betval4_5);
		bet4_5.click();
		Thread.sleep(0500);

		driver.findElement(By.id("hud_btnAuto")).click();
		Thread.sleep(2000);

		for(;;){
			Boolean insuffient = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[3]/android.view.View")).isDisplayed();
			if(insuffient == true) {
				MobileElement insuffient1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[2]"));
				insuffient1.click();
				Thread.sleep(1000);
				break;
			}
		}

		MobileElement start=(MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_btnSpin")));
		Boolean strt =start.isDisplayed();
		if( strt)
		{
			System.out.println("start button is visible :"+strt);
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed as spin button is not visible");
		     }
		
		//Checking whether able to change the credit and bet values after getting insufficiant balance pop-up
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		MobileElement cr3 = driver.findElement(By.id("hud_CreditPopup30.05"));
		String credit3 =cr3.getText();
		System.out.println(credit3);
		cr3.click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("hud_btnAuto")).click();
		Thread.sleep(2000);
		start.click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(1000);
		MobileElement bet3_1= driver.findElement(By.id("hud_BetPopup11"));
		String Betval3_1 =bet3_1.getText();
		System.out.println(Betval3_1);
		bet3_1.click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("hud_btnAuto")).click();
		Thread.sleep(2000);
		start.click();
		Thread.sleep(4000);
		
		/* If the win is triggered during the cycle autolist will be not able to locate on the screen
		   hence script may fail abruptly
		   Hence if the win is triggered accept the win and verify the autolist from the screen
		 */
		if(driver.findElements(By.id("hud_btnGamble")).size() != 0){
			System.out.println("Win is triggered accept the win");
			driver.findElement(By.id("hud_btnGamble")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("gamble_btnCollect")).click();
			Thread.sleep(3000);
		}else{
			System.out.println("Gamble link not present on the screen");
		}
		
		//Checking whether auto spin is working after changing the credit and bet values
		if(driver.findElements(By.id("AutoSpinListItem_undefined")).size() != 0){
			System.out.println("Able to spin the reel after changing the credit and bet values. ");
			System.out.println("Testcase passed");
		}else{
			System.out.println("Not able to spin the reel after changing the credit and bet values.");
			System.out.println("Testcase failed");
		}
		Thread.sleep(2000);
		
		//Normal Play
		//Change the credit and bet values to max level to generate Insufficiant balance message
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(1000);
		MobileElement cr44 = driver.findElement(By.id("hud_CreditPopup40.5"));
		String credit44 =cr44.getText();
		System.out.println("Credit value is: " +credit44);
		cr44.click();
		Thread.sleep(1000);

		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(1000);
		MobileElement bet4_5_1= driver.findElement(By.id("hud_BetPopup5200"));
		String Betval4_5_1 =bet4_5_1.getText();
		System.out.println("Bet value is: " +Betval4_5_1);
		bet4_5.click();
		Thread.sleep(0500);

		driver.findElement(By.id("hud_btnAuto")).click();
		Thread.sleep(2000);

		for(;;){
			Boolean insuffient = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[3]/android.view.View")).isDisplayed();
			if(insuffient == true) {
				MobileElement insuffient1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[2]"));
				insuffient1.click();
				Thread.sleep(1000);
				break;
			}
		}	
	}

	@Then("^Player should be blocked from playing the game when there is less amount in balance counter and reducing the credit and bet types player is enable to continue slot game in (\\d+) Glowing Hot game$")
	public void player_should_be_blocked_from_playing_the_game_when_there_is_less_amount_in_balance_counter_and_reducing_the_credit_and_bet_types_player_is_enable_to_continue_slot_game_in_Glowing_Hot_game(int arg1) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}