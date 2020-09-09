package stepDefinition_100SplendidHot;

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

public class HundredSplendidHot_PayOut_BetType_1_And_Denomination_4 {
	AppiumDriver<MobileElement> driver;

	public HundredSplendidHot_PayOut_BetType_1_And_Denomination_4() throws InterruptedException {
		this.driver = HundredSplendidHot_URL_Login.getDriver();
		//this.driver = HundredSplendidHot_URL_TryNow.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Splendid Hot slot game, icon to open payout table, all symbols, max amount on each symbol like orange, cherry & etc etc, back button, bet type (\\d+)\\.(\\d+) and denomination as FOUR on mobile$")
	public void chrome_browser_valid_URL_valid_login_details_Splendid_Hot_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_orange_cherry_etc_etc_back_button_bet_type_and_denomination_as_FOUR_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the (\\d+) Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like orange, cherry & etc etc, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination value as FOUR and check payout amount on mobile$")
	public void open_the_Splendid_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_orange_cherry_etc_etc_click_on_back_button_select_bet_type_as_denomination_value_as_FOUR_and_check_payout_amount_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
		//Getting the bet value 0.01 and Bet amount 4
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_CreditPopup10.01")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.id("hud_txtCredit")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.01";
		Assert.assertEquals(actual, expected);
		
		//Selecting the bet amount as 1 from the drop down
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup44")).click();
		Thread.sleep(2000);
		
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected1 = "4";
		System.out.println("Selected bet value is : " +"\n" +actual1);
		Assert.assertEquals(actual1, expected1);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
		
		
		String scatter="",Grapes="",Grapes1="",Grapes2="",Seven="",Seven1="",Seven2="",
				plum="",plum1="",plum2="",orange="",orange1="",orange2="";
		
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		for(MobileElement me:balance){
		//System.out.println(me.getId()+"  "+me.getText());
		
		//Check for Grapes symbol
		if(me.getId().equals("26")){
			Grapes = me.getText();
			String expected5 = Grapes;
			String actual5 = "20 SRD";
			System.out.println("Payout Value of 5 Grapes symbols for denomination 4 is: " +Grapes);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("27")){
			Grapes1 = me.getText();
			String expected6 = Grapes1;
			String actual6 = "3.2 SRD";
			System.out.println("Payout Value of 4 Grapes symbols for denomination 4 is: " +Grapes1);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("28")){
			Grapes2 = me.getText();
			String expected7 = Grapes2;
			String actual7 = "0.8 SRD";
			System.out.println("Payout Value of 3 Grapes symbols for denomination 4 is: " +Grapes2);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		
		//Check for Seven symbol
		if(me.getId().equals("29")){
			Seven = me.getText();
			String expected11 = Seven;
			String actual11 = "40 SRD";
			System.out.println("Payout Value of 5 Seven symbol for denomination 4 is: " +Seven);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("30")){
			Seven1 = me.getText();
			String expected12 = Seven1;
			String actual12 = "16 SRD";
			System.out.println("Payout Value of 4 Seven symbol for denomination 4 is: " +Seven1);
			Assert.assertEquals(actual12, expected12);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("31")){
			Seven2 = me.getText();
			String expected13 = Seven2;
			String actual13 = "1.6 SRD";
			System.out.println("Payout Value of 3 Seven symbol for denomination 4 is: " +Seven2);
			Assert.assertEquals(actual13, expected13);
			Thread.sleep(1000);
			}
		
		
		//Check for Scatter symbol
		//System.out.println(me.getId()+"  "+me.getText());
		if(me.getId().equals("32")){
			scatter = me.getText();
			String expected4 = scatter;
			String actual4 = "2000 SRD";
			System.out.println("Payout Value of 5 Scatter symbols for denomination 4 is : " +scatter);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("33")){
			scatter = me.getText();
			String expected4 = scatter;
			String actual4 = "80 SRD";
			System.out.println("Payout Value of 4 Scatter symbols for denomination 4 is : " +scatter);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("34")){
			scatter = me.getText();
			String expected4 = scatter;
			String actual4 = "20 SRD";
			System.out.println("Payout Value of 3 Scatter symbols for denomination 4 is : " +scatter);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		//Check for plum  or watermelon symbol
		if(me.getId().equals("35")){
			plum = me.getText();
			String expected8 = plum;
			String actual8 = "8 SRD";
			System.out.println("Payout Value of 5 plum  or watermelon symbol for denomination 4: " +plum);
			Assert.assertEquals(actual8, expected8);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("36")){
			plum1 = me.getText();
			String expected9 = plum1;
			String actual9 = "1.6 SRD";
			System.out.println("Payout Value of 4 plum  or watermelon symbol for denomination 4: " +plum1);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("37")){
			plum2 = me.getText();
			String expected10 = plum2;
			String actual10 = "0.8 SRD";
			System.out.println("Payout Value of 3 plum  or watermelon symbol for denomination 4: " +plum2);
			Assert.assertEquals(actual10, expected10);
			Thread.sleep(1000);
		}

		
		//Check for Orange or Lemon or Cherry symbol
		if(me.getId().equals("38")){
			orange = me.getText();
			String expected17 = orange;
			String actual17 = "4 SRD";
			System.out.println("Payout Value of 5 Orange or Lemon or Cherry symbol for denomination 4 is: " +orange);
			Assert.assertEquals(actual17, expected17);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("39")){
			orange1 = me.getText();
			String expected18 = orange1;
			String actual18 = "0.8 SRD";
			System.out.println("Payout Value of 4 Orange or Lemon or Cherry symbol for denomination 4 is: " +orange1);
			Assert.assertEquals(actual18, expected18);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("40")){
			orange2 = me.getText();
			String expected19 = orange2;
			String actual19 = "0.4 SRD";
			System.out.println("Payout Value of 3 Orange or Lemon or Cherry symbol for denomination 4 is: " +orange2);
			Assert.assertEquals(actual19, expected19);
			Thread.sleep(1000);
			}
		} 
	}

	@Then("^System should display the Payout max amount on each symbol like orange, cherry & etc etc and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination value to FOUR in (\\d+) Splendid Hot slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_orange_cherry_etc_etc_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_value_to_FOUR_in_Splendid_Hot_slot_game_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}