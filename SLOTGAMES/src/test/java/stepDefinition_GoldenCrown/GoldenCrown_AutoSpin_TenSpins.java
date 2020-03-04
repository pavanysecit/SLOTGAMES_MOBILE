package stepDefinition_GoldenCrown;

import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class GoldenCrown_AutoSpin_TenSpins {
AppiumDriver<MobileElement> driver;

	public GoldenCrown_AutoSpin_TenSpins() throws InterruptedException {
		this.driver = GoldenCrown_URL_Login.getDriver();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[19]/div[1]")).click();
		Thread.sleep(2000);
		}	

	@Given("^Chrome browser, valid URL, valid login details, Golden Crown  slot game, balance, spin button, auto spin button, ten spins option and number of spins left message$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Crown_slot_game_balance_spin_button_auto_spin_button_ten_spins_option_and_number_of_spins_left_message() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[19]/div[1]")).click();
		Thread.sleep(2000);
		
		MobileElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(15000);

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

	@When("^Open the Golden Crown  slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on ten spin option under auto spin drop down and check the number of spins left message$")
	public void open_the_Golden_Crown_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_ten_spin_option_under_auto_spin_drop_down_and_check_the_number_of_spins_left_message() throws Throwable {
//	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[6]/android.view.View[1]/android.view.View/android.view.View[2]")).click();	
//	    Thread.sleep(3000);
//	    
//	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[6]/android.view.View[1]/android.view.View[2]/android.view.View[2]")).click();
//	    Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 6);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[6]/android.view.View[1]/android.view.View/android.view.View[1]")).click();
		Thread.sleep(3000);
		
		while(true)
		 {
			driver.findElement(By.id("AutoSpinListItem_10")).click();
			Thread.sleep(0500);
			break;
		 }
		
//		MobileElement element = driver.findElement(By.id("AutoSpinListItem_10"));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSearch")));
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", element);
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("AutoSpinListItem_10")));
		
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hud_txtWinDetail"), "9 SPINS LEFT"));
	    String actual = driver.findElement(By.id("hud_txtWinDetail")).getText();
	    String expected = "9 SPINS LEFT";
	    System.out.println(actual);
	    Assert.assertEquals(actual, expected);
 
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hud_txtWinDetail"), "8 SPINS LEFT"));
	    String actual1 = driver.findElement(By.id("hud_txtWinDetail")).getText();
	    String expected1 = "8 SPINS LEFT";
	    System.out.println(actual1);
	    Assert.assertEquals(actual1, expected1);
	    
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hud_txtWinDetail"), "7 SPINS LEFT"));
	    String actual2 = driver.findElement(By.id("hud_txtWinDetail")).getText();
	    String expected2 = "7 SPINS LEFT";
	    System.out.println(actual2);
	    Assert.assertEquals(actual2, expected2);
	    
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hud_txtWinDetail"), "6 SPINS LEFT"));
	    String actual3 = driver.findElement(By.id("hud_txtWinDetail")).getText();
	    String expected3 = "6 SPINS LEFT";
	    System.out.println(actual3);
	    Assert.assertEquals(actual3, expected3);
	    
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hud_txtWinDetail"), "5 SPINS LEFT"));
	    String actual4 = driver.findElement(By.id("hud_txtWinDetail")).getText();
	    String expected4 = "5 SPINS LEFT";
	    System.out.println(actual4);
	    Assert.assertEquals(actual4, expected4);
	    
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hud_txtWinDetail"), "4 SPINS LEFT"));
	    String actual5 = driver.findElement(By.id("hud_txtWinDetail")).getText();
	    String expected5 = "4 SPINS LEFT";
	    System.out.println(actual5);
	    Assert.assertEquals(actual5, expected5);
	    
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hud_txtWinDetail"), "3 SPINS LEFT"));
	    String actual6 = driver.findElement(By.id("hud_txtWinDetail")).getText();
	    String expected6 = "3 SPINS LEFT";
	    System.out.println(actual6);
	    Assert.assertEquals(actual6, expected6);
	    
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hud_txtWinDetail"), "2 SPINS LEFT"));
	    String actual7 = driver.findElement(By.id("hud_txtWinDetail")).getText();
	    String expected7 = "2 SPINS LEFT";
	    System.out.println(actual7);
	    Assert.assertEquals(actual7, expected7);
	    
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hud_txtWinDetail"), "1 SPINS LEFT"));
	    String actual8 = driver.findElement(By.id("hud_txtWinDetail")).getText();
	    String expected8 = "1 SPINS LEFT";
	    System.out.println(actual8);
	    Assert.assertEquals(actual8, expected8);
	    
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hud_txtWinDetail"), "LAST SPIN"));
	    String actual9 = driver.findElement(By.id("hud_txtWinDetail")).getText();
	    String expected9 = "LAST SPINS";
	    System.out.println(actual9);
	    Assert.assertEquals(actual9, expected9);
	    
	}

	@Then("^Number of spin left should start from (\\d+) to (\\d+) after clicking ten spins option and should perform (\\d+) spins from (\\d+) to (\\d+) in Golden Crown slot game$")
	public void number_of_spin_left_should_start_from_to_after_clicking_ten_spins_option_and_should_perform_spins_from_to_in_Golden_Crown_slot_game(int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
	    Thread.sleep(3000);
	    driver.quit();
	}
}
