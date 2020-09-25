package stepDefinition_BrownieHot;

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

public class BrownieHot_PayOut_BetType_1_And_Denomination_2 {
	AppiumDriver<MobileElement> driver;

	public BrownieHot_PayOut_BetType_1_And_Denomination_2() throws InterruptedException {
		this.driver = BrownieHot_URL_Login.getDriver();
		//this.driver = BrownieHot_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Brownie Hot slot game, icon to open payout table, all symbols, max amount on each symbol like bell, grapes, back button, bet type (\\d+)\\.(\\d+) and  denomination value as (\\d+)\\.(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Brownie_Hot_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_bell_grapes_back_button_bet_type_and_denomination_value_as(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like bell, grapes, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination  values as (\\d+)\\.(\\d+) and check payout amount$")
	public void open_the_Brownie_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_bell_grapes_click_on_back_button_select_bet_type_as_denomination_values_as_and_check_payout_amount(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		//Getting the bet value and Bet amount
		String creditValue = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is: " +creditValue);
		String actualC = creditValue;
		String expectedC = "0.01";
		Assert.assertEquals(expectedC, actualC);
		Thread.sleep(1000);
		
		//Selecting bet amount as 0.6
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("0.6")){
				be.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +actual);
		String expected = "0.6";
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
		
		
		String Fsymbol="", F1symbol="", F2symbol="", F3symbol="", lemon="",lemon1="",lemon2="",orange="", orange1="",orange2="",wmelon="",wmelon1="",wmelon2="",grapes="",grapes1="",grapes2="",bell="",
				bell1="", bell2="", bell3="",banana="", banana1="", banana2="", scatter="",scatter1="",scatter2="",apple="",apple1="",apple2="",apple3="";
		for(MobileElement me:balance){
		//System.out.println(me.getId()+"  "+me.getText());
		
		// Checking payout max amount for each symbol when bet type is 0.01 and denomination is 0.6
		//Check for Seven symbol
		if(me.getId().equals("26")){
			Fsymbol = me.getText();
			String expected11 = Fsymbol;
			String actual11 = "20 YSI";
			System.out.println("Max Payout Value of Seven symbols for denomination 0.6 is : " +Fsymbol);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
		}
		if(me.getId().equals("27")){
			F1symbol = me.getText();
			String expected1 = F1symbol;
			String actual1 = "5 YSI";
			System.out.println("Max Payout Value of 5 Seven symbols for denomination 0.6 is : " +F1symbol);
			Assert.assertEquals(actual1, expected1);
			Thread.sleep(1000);
		}
		if(me.getId().equals("28")){
			F2symbol = me.getText();
			String expected2 = F2symbol;
			String actual2 = "0.5 YSI";
			System.out.println("Max Payout Value of 4 Seven symbols for denomination 0.6 is : " +F2symbol);
			Assert.assertEquals(actual2, expected2);
			Thread.sleep(1000);
		}
		if(me.getId().equals("29")){
			F3symbol = me.getText();
			String expected3 = F3symbol;
			String actual3 = "0.2 YSI";
			System.out.println("Max Payout Value of 3 Seven symbols for denomination 0.6 is : " +F3symbol);
			Assert.assertEquals(actual3, expected3);
			Thread.sleep(1000);
		}

		
		//Check for scatter symbol
		//System.out.println(me.getId()+"  "+me.getText());
		if(me.getId().equals("30")){
			scatter = me.getText();
			String expected4 = scatter;
			String actual4 = "120 YSI";
			System.out.println("Payout Value of 5 scatter symbols for denomination 0.6 is : " +scatter);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("31")){
			scatter1 = me.getText();
			String expected5 = scatter1;
			String actual5 = "10 YSI";
			System.out.println("Payout Value of 4 scatter symbols for denomination 0.6 is: " +scatter1);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("32")){
			scatter2 = me.getText();
			String expected6 = scatter2;
			String actual6 = "1 YSI";
			System.out.println("Payout Value of 3 scatter symbols for denomination 0.6 is: " +scatter2);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		
		//Check for Bell symbol
		if(me.getId().equals("33")){
			bell = me.getText();
			String expected7 = bell;
			String actual7 = "2 YSI";
			System.out.println("Payout Value of 5 bells symbols for denomination 0.6 is: " +bell);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("34")){
			bell1 = me.getText();
			String expected8 = bell1;
			String actual8 = "1 YSI";
			System.out.println("Payout Value of 4 bells symbols for denomination 0.6 is: " +bell1);
			Assert.assertEquals(actual8, expected8);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("35")){
			bell2 = me.getText();
			String expected9 = bell2;
			String actual9 = "0.5 YSI";
			System.out.println("Payout Value of 3 bells symbols for denomination 0.6 is: " +bell2);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		if(me.getId().equals("35")){
			bell3 = me.getText();
			String expected9 = bell3;
			String actual9 = "0.1 YSI";
			System.out.println("Payout Value of 2 bells symbols for denomination 0.6 is: " +bell3);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		
		//Check for Stake Apple symbol
		if(me.getId().equals("33")){
			apple = me.getText();
			String expected71 = apple;
			String actual71 = "2 YSI";
			System.out.println("Payout Value of 5 Apple symbols for denomination 0.6 is: " +apple);
			Assert.assertEquals(actual71, expected71);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("34")){
			apple1 = me.getText();
			String expected81 = apple1;
			String actual81 = "1 YSI";
			System.out.println("Payout Value of 4 Apple symbols for denomination 0.6 is: " +apple1);
			Assert.assertEquals(actual81, expected81);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("35")){
			apple2 = me.getText();
			String expected91 = apple2;
			String actual91 = "0.5 YSI";
			System.out.println("Payout Value of 3 Apple symbols for denomination 0.6 is: " +apple2);
			Assert.assertEquals(actual91, expected91);
			Thread.sleep(1000);
		}
		if(me.getId().equals("35")){
			apple3 = me.getText();
			String expected92 = apple3;
			String actual92 = "0.1 YSI";
			System.out.println("Payout Value of 2 Apple symbols for denomination 0.6 is: " +apple3);
			Assert.assertEquals(actual92, expected92);
			Thread.sleep(1000);
		}
		
		//Check for Watermelon symbol
		if(me.getId().equals("36")){
			wmelon = me.getText();
			String expected101 = wmelon;
			String actual101 = "1.2 YSI";
			System.out.println("Payout Value of 5 Watermelon symbols for denomination 0.6 is: " +wmelon);
			Assert.assertEquals(actual101, expected101);
			Thread.sleep(1000);
			} 
		if(me.getId().equals("37")){
			wmelon1 = me.getText();
			String expected111 = wmelon1;
			String actual111 = "0.6 YSI";
			System.out.println("Payout Value of 4 Watermelon symbols for denomination 0.6 is: " +wmelon1);
			Assert.assertEquals(actual111, expected111);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("38")){
			wmelon2 = me.getText();
			String expected1211 = wmelon2;
			String actual1121 = "0.2 YSI";
			System.out.println("Payout Value of 3 Watermelon symbols for denomination 0.6 is: " +wmelon2);
			Assert.assertEquals(actual1121, expected1211);
			Thread.sleep(1000);
			} 
		
		//Check for Banana symbol
		if(me.getId().equals("39")){
			banana = me.getText();
			String expected131 = banana;
			String actual131 = "1.6 YSI";
			System.out.println("Payout Value of 5 Banana symbols for denomination 0.6 is: " +banana);
			Assert.assertEquals(actual131, expected131);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("40")){
			banana1 = me.getText();
			String expected141 = banana1;
			String actual141 = "0.8 YSI";
			System.out.println("Payout Value of 4 Banana symbols for denomination 0.6 is: " +banana1);
			Assert.assertEquals(actual141, expected141);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("41")){
			banana2 = me.getText();
			String expected151 = banana2;
			String actual151 = "0.4 YSI";
			System.out.println("Payout Value of 3 Banana symbols for denomination 0.6 is: " +banana2);
			Assert.assertEquals(actual151, expected151);
			Thread.sleep(1000);
			} 
		
		//Check for Grapes symbol
		if(me.getId().equals("39")){
			grapes = me.getText();
			String expected132 = grapes;
			String actual132 = "1.6 YSI";
			System.out.println("Payout Value of 5 Grapes symbols for denomination 0.6 is: " +grapes);
			Assert.assertEquals(actual132, expected132);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("40")){
			grapes1 = me.getText();
			String expected143 = grapes1;
			String actual143 = "0.8 YSI";
			System.out.println("Payout Value of 4 Grapes symbols for denomination 0.6 is: " +grapes1);
			Assert.assertEquals(actual143, expected143);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("41")){
			grapes2 = me.getText();
			String expected153 = grapes2;
			String actual153 = "0.4 YSI";
			System.out.println("Payout Value of 3 Grapes symbols for denomination 0.6 is: " +grapes2);
			Assert.assertEquals(actual153, expected153);
			Thread.sleep(1000);
			} 
			
			
		//Check for Orange symbol
		if(me.getId().equals("42")){
			orange = me.getText();
			String expected163 = orange;
			String actual163 = "1 YSI";
			System.out.println("Payout Value of 5 Orange symbols for denomination 0.6 is: " +orange);
			Assert.assertEquals(actual163, expected163);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("43")){
			orange1 = me.getText();
			String expected173 = orange1;
			String actual173 = "0.6 YSI";
			System.out.println("Payout Value of 4 Orange symbols for denomination 0.6 is: " +orange1);
			Assert.assertEquals(actual173, expected173);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("44")){
			orange2 = me.getText();
			String expected183 = orange2;
			String actual183 = "0.2 YSI";
			System.out.println("Payout Value of 3 Orange symbols for denomination 0.6 is: " +orange2);
			Assert.assertEquals(actual183, expected183);
			Thread.sleep(1000);
			}

		
		//Check for Lemon symbol
		if(me.getId().equals("45")){
			lemon = me.getText();
			String expected193 = lemon;
			String actual193 = "0.6 YSI";
			System.out.println("Payout Value of 5 Lemon symbols for denomination 0.6 is: " +lemon);
			Assert.assertEquals(expected193, actual193);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("46")){
			lemon1 = me.getText();
			String expected204 = lemon1;
			String actual204 = "0.4 YSI";
			System.out.println("Payout Value of 4 Lemon symbols for denomination 0.6 is: " +lemon1);
			Assert.assertEquals(actual204, expected204);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("47")){
			lemon2 = me.getText();
			String expected214 = lemon2;
			String actual214 = "0.2 YSI";
			System.out.println("Payout Value of 3 Lemon symbols for denomination 0.6 is: " +lemon2);
			Assert.assertEquals(actual214, expected214);
			Thread.sleep(1000);
			}
		}
	}

	@Then("^System should display the Payout max amount on each symbol like bell, grapes and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination value as (\\d+)\\.(\\d+) in Brownie Hot slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_bell_grapes_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_value_as_in_Brownie_Hot_slot_game_on_mobile(int arg1, int arg2, int arg3, int arg4) throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
