package stepDefinition_100GlowingHot;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HundredGlowingHot_PayOut_BetType_1_And_Denomination_5 {
	AppiumDriver<MobileElement> driver;

	public HundredGlowingHot_PayOut_BetType_1_And_Denomination_5() throws InterruptedException {
		this.driver = HundredGlowingHot_URL_Login.getDriver();
		//this.driver = HundredGlowingHot_URL_TryNow.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Glowing Hot slot game, icon to open payout table, all symbols, max amount on each symbol like orange, plum & etc, back button, bet type (\\d+)\\.(\\d+) and denomination as FIVE on mobile$")
	public void chrome_browser_valid_URL_valid_login_details_Glowing_Hot_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_orange_plum_etc_back_button_bet_type_and_denomination_as_FIVE_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the (\\d+) Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like orange, plum & etc, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination as FIVE and check payout amount on mobile$")
	public void open_the_Glowing_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_orange_plum_etc_click_on_back_button_select_bet_type_as_denomination_as_FIVE_and_check_payout_amount_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
		//Getting the bet value 0.01 and Bet amount 5
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_CreditPopup10.01")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.id("hud_txtCredit")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.01";
		Assert.assertEquals(actual, expected);
		
		//Selecting the bet amount as 5 from the drop down
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup55")).click();
		Thread.sleep(2000);
		
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected1 = "5";
		System.out.println("Selected bet value is : " +"\n" +actual1);
		Assert.assertEquals(actual1, expected1);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
		
		String scatter="",sscatter="",Seven="",Seven1="",Seven2="",Seven3="",wmelon="",wmelon1="",wmelon2="",
				Bar="",Bar1="",Bar2="",bell="",bell1="",bell2="",plum="",plum1="",plum2="",orange="",orange1="",orange2="";
		
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		for(MobileElement me:balance){
		//System.out.println(me.getId()+"  "+me.getText());
		
		//Check for Seven symbol
		if(me.getId().equals("26")){
			Seven = me.getText();
			String expected5 = Seven;
			String actual5 = "150 SRD";
			System.out.println("Payout Value of 5 Seven symbols for denomination 5 is: " +Seven);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("27")){
			Seven1 = me.getText();
			String expected6 = Seven1;
			String actual6 = "10 SRD";
			System.out.println("Payout Value of 4 Seven symbols for denomination 5 is: " +Seven1);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("28")){
			Seven2 = me.getText();
			String expected7 = Seven2;
			String actual7 = "2.5 SRD";
			System.out.println("Payout Value of 3 Seven symbols for denomination 5 is: " +Seven2);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		
		//Id for generating 2 seven symbol is displayed last
		if(me.getId().equals("41")){
			Seven3 = me.getText();
			String expected7 = Seven3;
			String actual7 = "0.5 SRD";
			System.out.println("Payout Value of 2 Seven symbols for denomination 5 is: " +Seven3);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
	
		
		//Check for Watermelon symbol
		if(me.getId().equals("29")){
			wmelon = me.getText();
			String expected11 = wmelon;
			String actual11 = "25 SRD";
			System.out.println("Payout Value of 5 Watermelon symbol for denomination 5 is: " +wmelon);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("30")){
			wmelon1 = me.getText();
			String expected12 = wmelon1;
			String actual12 = "5 SRD";
			System.out.println("Payout Value of 4 Watermelon symbol for denomination 4 is: " +wmelon1);
			Assert.assertEquals(actual12, expected12);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("31")){
			wmelon2 = me.getText();
			String expected13 = wmelon2;
			String actual13 = "2 SRD";
			System.out.println("Payout Value of 3 Watermelon symbol for denomination 5 is: " +wmelon2);
			Assert.assertEquals(actual13, expected13);
			Thread.sleep(1000);
			}
		
		
		//Check for Scatter symbol
		//System.out.println(me.getId()+"  "+me.getText());
		if(me.getId().equals("32")){
			scatter = me.getText();
			String expected4 = scatter;
			String actual4 = "500 SRD";
			System.out.println("Payout Value of 5 Scatter symbols for denomination 5 is : " +scatter);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("33")){
			scatter = me.getText();
			String expected4 = scatter;
			String actual4 = "100 SRD";
			System.out.println("Payout Value of 4 Scatter symbols for denomination 5 is : " +scatter);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("34")){
			scatter = me.getText();
			String expected4 = scatter;
			String actual4 = "20 SRD";
			System.out.println("Payout Value of 3 Scatter symbols for denomination 5 is : " +scatter);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("35")){
			sscatter = me.getText();
			String expected41 = sscatter;
			String actual41 = "100 SRD";
			System.out.println("Payout Value of Star Scatter symbols for denomination 5 is : " +scatter);
			Assert.assertEquals(actual41, expected41);
			Thread.sleep(1000);
		}


		//Check for plum symbol
		if(me.getId().equals("35")){
			plum = me.getText();
			String expected8 = plum;
			String actual8 = "25 SRD";
			System.out.println("Payout Value of 5 plum symbol for denomination 5: " +plum);
			Assert.assertEquals(actual8, expected8);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("36")){
			plum1 = me.getText();
			String expected9 = plum1;
			String actual9 = "5 SRD";
			System.out.println("Payout Value of 4 plum symbol for denomination 5: " +plum1);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("37")){
			plum2 = me.getText();
			String expected10 = plum2;
			String actual10 = "2 SRD";
			System.out.println("Payout Value of 3 plum symbol for denomination 5: " +plum2);
			Assert.assertEquals(actual10, expected10);
			Thread.sleep(1000);
		}

		//Check for bell symbol
		if(me.getId().equals("38")){
			bell = me.getText();
			String expected14 = bell;
			String actual14 = "10 SRD";
			System.out.println("Payout Value of 5 Bell symbol for denomination 5 is: " +bell);
			Assert.assertEquals(actual14, expected14);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("39")){
			bell1 = me.getText();
			String expected15 = bell1;
			String actual15 = "2.5 SRD";
			System.out.println("Payout Value of 4 Bell symbol for denomination 5 is: " +bell1);
			Assert.assertEquals(actual15, expected15);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("40")){
			bell2 = me.getText();
			String expected16 = bell2;
			String actual16 = "1 SRD";
			System.out.println("Payout Value of 3 Bell symbol for denomination 5 is: " +bell2);
			Assert.assertEquals(actual16, expected16);
			Thread.sleep(1000);
			}
		
		//Check for Orange symbol
		if(me.getId().equals("41")){
			orange = me.getText();
			String expected17 = orange;
			String actual17 = "5 SRD";
			System.out.println("Payout Value of 5 Orange symbol for denomination 5 is: " +orange);
			Assert.assertEquals(actual17, expected17);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("42")){
			orange1 = me.getText();
			String expected18 = orange1;
			String actual18 = "1.5 SRD";
			System.out.println("Payout Value of 4 Orange symbol for denomination 5 is: " +orange1);
			Assert.assertEquals(actual18, expected18);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("43")){
			orange2 = me.getText();
			String expected19 = orange2;
			String actual19 = "0.5 SRD";
			System.out.println("Payout Value of 3 Orange symbol for denomination 5 is: " +orange2);
			Assert.assertEquals(actual19, expected19);
			Thread.sleep(1000);
			}
		} 
	}

	@Then("^System should display the Payout max amount on each symbol like orange, plum & etc and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination to FIVE in (\\d+) Glowing Hot slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_orange_plum_etc_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_to_FIVE_in_Glowing_Hot_slot_game_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}