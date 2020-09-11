package stepDefinition_20GlowingHot;

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

public class TwentyGlowingHot_PayOut_BetType_1_And_Denomination_4 {
	AppiumDriver<MobileElement> driver;

	public TwentyGlowingHot_PayOut_BetType_1_And_Denomination_4() throws InterruptedException {
		this.driver = TwentyGlowingHot_URL_Login.getDriver();
		//this.driver = TwentyGlowingHot_URL_TryNow.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Glowing Hot slot game, icon to open payout table, all symbols, max amount on each symbol like orange, cherry & etc etc, back button, bet type (\\d+)\\.(\\d+) and denomination as TWO on mobile$")
	public void chrome_browser_valid_URL_valid_login_details_Glowing_Hot_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_orange_cherry_etc_etc_back_button_bet_type_and_denomination_as_TWO_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
	}

	@When("^Open the (\\d+) Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like orange, cherry & etc etc, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination value as TWO and check payout amount on mobile$")
	public void open_the_Glowing_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_orange_cherry_etc_etc_click_on_back_button_select_bet_type_as_denomination_value_as_TWO_and_check_payout_amount_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
		//Getting the bet value 0.01 and Bet amount 2
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_CreditPopup10.01")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.id("hud_txtCredit")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.01";
		Assert.assertEquals(actual, expected);
		
		//Selecting the bet amount as 2 from the drop down
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup42")).click();
		Thread.sleep(2000);
		
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected1 = "2";
		System.out.println("Selected bet value is : " +actual1);
		Assert.assertEquals(actual1, expected1);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
		
		String Fsymbol="", F1symbol="", F2symbol="", F3symbol="", wmelon="",wmelon1="",wmelon2="", grape="",grape1="",grape2="",bell="",bell1="",bell2="",cherry="",cherry1="",cherry2="",
				orange="", orange1="", orange2="", scatter="", scatter1="", scatter2="",pscatter="";
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		for(MobileElement me:balance){
			
		// Checking payout max amount for each symbol when bet type is 0.01 and denomination is 2
		//Check for 777 symbol
		if(me.getId().equals("16")){
			Fsymbol = me.getText();
			String expected33 = Fsymbol;
			String actual33 = "300 YSI";
			System.out.println("Max Payout Value of 5 77777 symbols for denomination 2 is : " +Fsymbol);
			Assert.assertEquals(actual33, expected33);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("17")){
			F1symbol = me.getText();
			String expected11 = F1symbol;
			String actual11 = "20 YSI";
			System.out.println("Max Payout Value of 5 7777 symbols for denomination 2 is : " +F1symbol);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("18")){
			F2symbol = me.getText();
			String expected2 = F2symbol;
			String actual2 = "5 YSI";
			System.out.println("Max Payout Value of 5 777 symbols for denomination 2 is : " +F2symbol);
			Assert.assertEquals(actual2, expected2);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("19")){
			F3symbol = me.getText();
			String expected3 = F3symbol;
			String actual3 = "1 YSI";
			System.out.println("Max Payout Value of 5 77 symbols for denomination 2 is : " +F3symbol);
			Assert.assertEquals(actual3, expected3);
			Thread.sleep(1000);
		}
		
		//Check for watermelon symbol
		//System.out.println(me.getId()+"  "+me.getText());
		if(me.getId().equals("20")){
			wmelon = me.getText();
			String expected4 = wmelon;
			String actual4 = "50 YSI";
			System.out.println("Payout Value of 5 watermelon symbols for denomination 2 is : " +wmelon);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("21")){
			wmelon1 = me.getText();
			String expected5 = wmelon1;
			String actual5 = "10 YSI";
			System.out.println("Payout Value of 4 watermelon symbols for denomination 2 is: " +wmelon1);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("22")){
			wmelon2 = me.getText();
			String expected6 = wmelon2;
			String actual6 = "5 YSI";
			System.out.println("Payout Value of 3 watermelon symbols for denomination 2 is: " +wmelon2);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		//Check for Grape symbol
		if(me.getId().equals("23")){
			grape = me.getText();
			String expected7 = grape;
			String actual7 = "50 YSI";
			System.out.println("Payout Value of 5 grapes symbols for denomination 2 is: " +grape);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("24")){
			grape1 = me.getText();
			String expected8 = grape1;
			String actual8 = "10 YSI";
			System.out.println("Payout Value of 4 grapes symbols for denomination 2 is: " +grape1);
			Assert.assertEquals(actual8, expected8);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("25")){
			grape2 = me.getText();
			String expected9 = grape2;
			String actual9 = "5 YSI";
			System.out.println("Payout Value of 3 grapes symbols for denomination 2 is: " +grape2);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		
		//Check for bell symbol
		if(me.getId().equals("26")){
			bell = me.getText();
			String expected10 = bell;
			String actual10 = "20 YSI";
			System.out.println("Payout Value of 5 Bell symbols for denomination 2 is: " +bell);
			Assert.assertEquals(actual10, expected10);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("27")){
			bell1 = me.getText();
			String expected11 = bell1;
			String actual11 = "5 YSI";
			System.out.println("Payout Value of 4 Bell symbols for denomination 2 is: " +bell1);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("28")){
			bell2 = me.getText();
			String expected12 = bell2;
			String actual12 = "3 YSI";
			System.out.println("Payout Value of 3 Bell symbols for denomination 2 is: " +bell2);
			Assert.assertEquals(actual12, expected12);
			Thread.sleep(1000);
			} 
		
		//Check for cherry symbol
		if(me.getId().equals("29")){
			cherry = me.getText();
			String expected13 = cherry;
			String actual13 = "10 YSI";
			System.out.println("Payout Value of 5 cherry symbols for denomination 2 is: " +cherry);
			Assert.assertEquals(actual13, expected13);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("30")){
			cherry1 = me.getText();
			String expected14 = cherry1;
			String actual14 = "3 YSI";
			System.out.println("Payout Value of 4 cherry symbols for denomination 2 is: " +cherry1);
			Assert.assertEquals(actual14, expected14);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("31")){
			cherry2 = me.getText();
			String expected15 = cherry2;
			String actual15 = "1 YSI";
			System.out.println("Payout Value of 3 cherry symbols for denomination 2 is: " +cherry2);
			Assert.assertEquals(actual15, expected15);
			Thread.sleep(1000);
			} 
		
		//Check for orange symbol
		if(me.getId().equals("32")){
			orange = me.getText();
			String expected16 = orange;
			String actual16 = "10 YSI";
			System.out.println("Payout Value of 5 orange symbols for denomination 2 is: " +orange);
			Assert.assertEquals(actual16, expected16);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("33")){
			orange1 = me.getText();
			String expected17 = orange1;
			String actual17 = "3 YSI";
			System.out.println("Payout Value of 4 orange symbols for denomination 2 is: " +orange1);
			Assert.assertEquals(actual17, expected17);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("34")){
			orange2 = me.getText();
			String expected18 = orange2;
			String actual18 = "1 YSI";
			System.out.println("Payout Value of 3 orange symbols for denomination 2 is: " +orange2);
			Assert.assertEquals(actual18, expected18);
			Thread.sleep(1000);
			}
		
		//Check for scatter symbol
		if(me.getId().equals("35")){
			scatter = me.getText();
			String expected19 = scatter;
			String actual19 = "200 YSI";
			System.out.println("Payout Value of 5 scatter symbols for denomination 2 is: " +scatter);
			Assert.assertEquals(expected19, actual19);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("36")){
			scatter1 = me.getText();
			String expected20 = scatter1;
			String actual20 = "40 YSI";
			System.out.println("Payout Value of 4 scatter symbols for denomination 2 is: " +scatter1);
			Assert.assertEquals(actual20, expected20);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("37")){
			scatter2 = me.getText();
			String expected21 = scatter2;
			String actual21 = "8 YSI";
			System.out.println("Payout Value of 3 scatter symbols for denomination 2 is: " +scatter2);
			Assert.assertEquals(actual21, expected21);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("38")){
			pscatter = me.getText();
			String expected22 = pscatter;
			String actual22 = "40 YSI";
			System.out.println("Payout Value of 3 purple scatter symbol for denomination 2 is: " +pscatter);
			Assert.assertEquals(actual22, expected22);
			Thread.sleep(1000);
			}
		}
	}

	@Then("^System should display the Payout max amount on each symbol like orange, cherry & etc etc and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination value to TWO in (\\d+) Glowing Hot slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_orange_cherry_etc_etc_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_value_to_TWO_in_Glowing_Hot_slot_game_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
