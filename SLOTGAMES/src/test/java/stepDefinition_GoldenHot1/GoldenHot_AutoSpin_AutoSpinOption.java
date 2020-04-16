package stepDefinition_GoldenHot1;

import java.util.List;
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

public class GoldenHot_AutoSpin_AutoSpinOption {
AppiumDriver<MobileElement> driver;
	
	public GoldenHot_AutoSpin_AutoSpinOption() throws InterruptedException {
		this.driver = SlotGames_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game, balance, spin button, auto spin button, auto spins option and number of spins left message$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_balance_spin_button_auto_spin_button_auto_spins_option_and_number_of_spins_left_message() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		
		//Transferring the balance
		driver.findElement(By.id("transferInput")).sendKeys("200");
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

	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on auto spin option under auto spin drop down and check the player instruction message$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_golden_hot_slot_game_click_on_auto_spin_option_under_auto_spin_drop_down_and_check_the_player_instruction_message() throws Throwable {
		//Click on > icon and select auto play 20 option
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[6]/android.view.View[1]/android.view.View/android.view.View[2]")).click();
		Thread.sleep(2000);
		
		List<MobileElement> items = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[6]/android.view.View[1]/android.view.View/android.view.View[2]"));
		items.get(0).click();
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[6]/android.view.View[1]/android.view.View[2]/android.view.View[1]")).click();
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");

		//Storing the balance before spin
		String prewin="";
		for(MobileElement me:balance){
		//System.out.println(me.getId()+"  "+me.getText());
		if(me.getId().equals("18")){
		//if(me.getText().equals("Auto")){
			me.click();
		}
		
		if(me.getId().equals("28")){
		prewin = me.getText();
		String expected = prewin;
		String actual = "GOOD LUCK!";
		System.out.println("Expected Value 1: " +prewin);
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		}

	
		if(me.getId().equals("28")){
		prewin = me.getText();
		String expected1 = prewin;
		String actual1 = "GOOD LUCK!";
		System.out.println("Expected Value 2: " +prewin);
		Assert.assertEquals(actual1, expected1);
		Thread.sleep(2000);
		}
		
		if(me.getId().equals("28")){
		prewin = me.getText();
		String expected2 = prewin;
		String actual2 = "GOOD LUCK!";
		System.out.println("Expected Value 3: " +prewin);
		Assert.assertEquals(actual2, expected2);
		Thread.sleep(2000);
		}

	
		if(me.getId().equals("28")){
		prewin = me.getText();
		String expected3 = prewin;
		String actual3 = "GOOD LUCK!";
		System.out.println("Expected Value 4: " +prewin);
		Assert.assertEquals(actual3, expected3);
		Thread.sleep(2000);
			}
		}
	}

	@Then("^System should keep performing the spins$")
	public void system_should_keep_performing_the_spins() throws Throwable {
		driver.quit();
	}

}
