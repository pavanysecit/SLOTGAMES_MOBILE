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

public class GoldenHot_PayOut_BetType_1_And_Denomination_3 {
AppiumDriver<MobileElement> driver;
	
	public GoldenHot_PayOut_BetType_1_And_Denomination_3() throws InterruptedException {
		this.driver = GoldenHot_URL_Login.getDriver();
		
		}
	
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like stars n etc, back button, bet type (\\d+)\\.(\\d+) and denomination value (\\d+)\\.(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_stars_n_etc_back_button_bet_type_and_denomination_value(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		
		driver.findElement(By.id("transferInput")).sendKeys("22");
		Thread.sleep(1000);
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

	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like stars n etc, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination  value (\\d+)\\.(\\d+) and check payout amount$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_golden_hot_slot_game_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_stars_n_etc_click_on_back_button_select_bet_type_as_denomination_value_and_check_payout_amount(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		//Selecting denomination as 0.75 from denomination drop down by xpath
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[9]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[24]/android.view.View[3]/android.view.View[2]")).click();
		Thread.sleep(3000);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[11]")).click();
		Thread.sleep(2000);
		
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		
		String Tsymbol="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
		// Checking payout max amount for each symbol when bet type is 0.03 and denomination is 0.75
		if(me.getId().equals("20")){
			Tsymbol = me.getText();
			String expected = Tsymbol;
			String actual = "112.5 YSI";
			System.out.println("Max Payout Value of 777 for denomination 0.75 is : " +Tsymbol);
			Assert.assertEquals(actual, expected);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("21")){
			Tsymbol = me.getText();
			String expected = Tsymbol;
			String actual = "30 YSI";
			System.out.println("Max Payout Value of * for denomination 0.75 is : " +Tsymbol);
			Assert.assertEquals(actual, expected);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("22")){
			Tsymbol = me.getText();
			String expected = Tsymbol;
			String actual = "9 YSI";
			System.out.println("Max Payout Value of BAR for denomination 0.75 is: " +Tsymbol);
			Assert.assertEquals(actual, expected);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("23")){
			Tsymbol = me.getText();
			String expected = Tsymbol;
			String actual = "7.5 YSI";
			System.out.println("Max Payout Value of Plum for denomination 0.75 is: " +Tsymbol);
			Assert.assertEquals(actual, expected);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("24")){
			Tsymbol = me.getText();
			String expected = Tsymbol;
			String actual = "6 YSI";
			System.out.println("Max Payout Value of Lemon for denomination 0.75 is: " +Tsymbol);
			Assert.assertEquals(actual, expected);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("25")){
			Tsymbol = me.getText();
			String expected = Tsymbol;
			String actual = "4.5 YSI";
			System.out.println("Max Payout Value of Cherry for denomination 0.75 is: " +Tsymbol);
			Assert.assertEquals(actual, expected);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("26")){
			Tsymbol = me.getText();
			String expected = Tsymbol;
			String actual = "6 YSI";
			System.out.println("Max Payout Value of Orange for denomination 0.75 is: " +Tsymbol);
			Assert.assertEquals(actual, expected);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("27")){
			Tsymbol = me.getText();
			String expected = Tsymbol;
			String actual = "4.5 YSI";
			System.out.println("Max Payout Value of Bell for denomination 0.75 is: " +Tsymbol);
			Assert.assertEquals(actual, expected);
			Thread.sleep(1000);
			} 
		}
	}

	@Then("^System should display the Payout max amount on each symbol like stars n etc and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination value (\\d+)\\.(\\d+)$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_stars_n_etc_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_value(int arg1, int arg2, int arg3, int arg4) throws Throwable {
	    driver.quit();
	}
}
