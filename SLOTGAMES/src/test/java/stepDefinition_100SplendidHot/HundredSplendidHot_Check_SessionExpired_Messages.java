package stepDefinition_100SplendidHot;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HundredSplendidHot_Check_SessionExpired_Messages {
	AppiumDriver<MobileElement> driver;

	public HundredSplendidHot_Check_SessionExpired_Messages() throws InterruptedException {
		this.driver = HundredSplendidHot_URL_Login.getDriver();
		//this.driver = HundredSplendidHot_URL_TryNow.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Hundred Splendid Hot slot game, balance, spin button, full screen, landscape mode ,session terminated messages$")
	public void chrome_browser_valid_URL_valid_login_details_Hundred_Splendid_Hot_slot_game_balance_spin_button_full_screen_landscape_mode_session_terminated_messages() throws Throwable {
	   
	}

	@When("^Open the Hundred Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, and full screen and change orientation of the screen, idle for more (\\d+)mins$")
	public void open_the_Hundred_Splendid_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_and_full_screen_and_change_orientation_of_the_screen_idle_for_more_mins(int arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));

		//Storing the value before spin or win
		String preWin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Current balance of the account: " +preWin);

		// Verify the maximizing and minimizing the screen 
		MobileElement sub = driver.findElement(By.id("hud_btnFullScreen"));
		sub.click();
		Thread.sleep(3000);

		//Change the orientation of the screen in full screen 
		// Get the current orientation 
		String PORTRAIT = driver.getOrientation().name();
		Assert.assertEquals("PORTRAIT", PORTRAIT);
		System.out.println(" Current screen orientation Is : " + PORTRAIT);
		Thread.sleep(2000);

		// change the orientation of the screen
		driver.rotate(ScreenOrientation.LANDSCAPE);

		// Get the orientation of the screen
		String LANDSCAPE = driver.getOrientation().name();
		Assert.assertEquals("LANDSCAPE", LANDSCAPE);
		Thread.sleep(2000);
		System.out.println(" Current screen orientation Is : " + LANDSCAPE);

		// execute some command to keep the session alive
		Thread.sleep(10*60*1000); // 10 minutes sleep time
		System.out.println(driver.getOrientation()); 
		Thread.sleep(11*60*1000); // 11 minutes sleep time
		System.out.println(driver.getOrientation());

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View")));
		String validmsg = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View")).getText();
		String expected = "Session Expired.";
		Assert.assertEquals(expected, validmsg);
		System.out.println("Valid error message is:  "+validmsg);
		Thread.sleep(2000);

		//Again re-launch the game
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		// change the orientation of the screen
		driver.rotate(ScreenOrientation.PORTRAIT);
		// Get the orientation of the screen
		String Portrait = driver.getOrientation().name();
		Assert.assertEquals("PORTRAIT", Portrait);
		Thread.sleep(2000);
		System.out.println(" Current screen orientation Is : " + Portrait);
		driver.context("CHROMIUM");
		Thread.sleep(4000);

		// Again re-launch different the game
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[15]/div[1]/div[1]")).click();
		Thread.sleep(5000);  

		MobileElement sub1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/section[1]/div[10]/div[1]/div[2]/form[1]/button[1]"));
		JavascriptExecutor jse1=(JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click();", sub1);
		Thread.sleep(5000);	

		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[15]/div[1]/div[1]")).click();
		Thread.sleep(3000);

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

		// Skinfiri Mysterious game
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
		String Skinfiri_Bal = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("SkinFiri game Balance: " +Skinfiri_Bal);
		System.out.println("Test case Pass");
	}

	@Then("^User is addressed with valid error message on the screen 'Session Expired' in Hundred Splendid Hot slot game$")
	public void user_is_addressed_with_valid_error_message_on_the_screen_Session_Expired_in_Hundred_Splendid_Hot_slot_game() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Again relauch other slot game and verify user is able to continue gameplay$")
	public void again_relauch_other_slot_game_and_verify_user_is_able_to_continue_gameplay() throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
