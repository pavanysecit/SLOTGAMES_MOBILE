package stepDefinition_TikiIsle;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TikiIsle_PayOut_BetType_1_And_Denomination_2 {
	AppiumDriver<MobileElement> driver;

	public TikiIsle_PayOut_BetType_1_And_Denomination_2() throws InterruptedException {
		this.driver = TikiIsle_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Tiki Isle slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type (\\d+)\\.(\\d+) and  denomination value as (\\d+)\\.(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Tiki_Isle_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_back_button_bet_type_and_denomination_value_as(int arg1, int arg2, int arg3, int arg4) throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[18]/div[1]")).click();
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

	@When("^Open the Tiki Isle slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination  values as (\\d+)\\.(\\d+) and check payout amount$")
	public void open_the_Tiki_Isle_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_click_on_back_button_select_bet_type_as_denomination_values_as_and_check_payout_amount(int arg1, int arg2, int arg3, int arg4) throws Throwable {
	    List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		//Getting the bet value and Bet amount
		String creditValue = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is: " +creditValue);
		String actualC = creditValue;
		String expectedC = "0.02";
		Assert.assertEquals(expectedC, actualC);
		Thread.sleep(1000);
		
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("0.8")){
				be.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String betValue = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +betValue);
		String actualB = betValue;
		String expectedB = "0.8";
		Assert.assertEquals(expectedB, actualB);
		Thread.sleep(2000);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
		
		String Scatter="", Scatter1="", Scatter2="", Wild="", Wild1="",Wild2="",guitar="",guitar1="", guitar2="",lady="",lady1="",lady2="",Q="",Q1="",Q2="",J="",J1="",J2="",
				AK="", AK1="", AK2="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			
		// Checking payout max amount for each symbol when bet type is 0.02 and denomination is 0.8
		//Check for Scatter symbol
		if(me.getId().equals("26")){
			Scatter = me.getText();
			String expected = Scatter;
			String actual = "400 YSI";
			System.out.println("Max Payout Value of Scatter symbols for denomination 0.8 is : " +Scatter);
			Assert.assertEquals(actual, expected);
			Thread.sleep(1000);
		}
		if(me.getId().equals("27")){
			Scatter1 = me.getText();
			String expected1 = Scatter1;
			String actual1 = "16 YSI";
			System.out.println("Max Payout Value of Scatter symbols for denomination 0.8 is : " +Scatter1);
			Assert.assertEquals(actual1, expected1);
			Thread.sleep(1000);
		}
		if(me.getId().equals("28")){
			Scatter2 = me.getText();
			String expected2 = Scatter2;
			String actual2 = "4 YSI";
			System.out.println("Max Payout Value of Scatter symbols for denomination 0.8 is : " +Scatter2);
			Assert.assertEquals(actual2, expected2);
			Thread.sleep(1000);
		}
		
		//Check for Wild symbol
		if(me.getId().equals("26")){
			Wild = me.getText();
			String expected = Wild;
			String actual = "360 YSI";
			System.out.println("Max Payout Value of Wild symbols for denomination 0.8 is : " +Wild);
			Assert.assertEquals(actual, expected);
			Thread.sleep(1000);
		}
		if(me.getId().equals("27")){
			Wild1 = me.getText();
			String expected1 = Wild1;
			String actual1 = "100 YSI";
			System.out.println("Max Payout Value of Wild symbols for denomination 0.8 is : " +Wild1);
			Assert.assertEquals(actual1, expected1);
			Thread.sleep(1000);
		}
		if(me.getId().equals("28")){
			Wild2 = me.getText();
			String expected2 = Wild2;
			String actual2 = "10 YSI";
			System.out.println("Max Payout Value of Wild symbols for denomination 0.8 is : " +Wild2);
			Assert.assertEquals(actual2, expected2);
			Thread.sleep(1000);
		}
		
		
		//Check for Lady symbol
		//System.out.println(me.getId()+"  "+me.getText());
		if(me.getId().equals("30")){
			lady = me.getText();
			String expected4 = lady;
			String actual4 = "30 YSI";
			System.out.println("Payout Value of 5 lady symbols for denomination 0.8 is : " +lady);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("31")){
			lady1 = me.getText();
			String expected5 = lady1;
			String actual5 = "5 YSI";
			System.out.println("Payout Value of 4 lady symbols for denomination 0.8 is: " +lady1);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("32")){
			lady2 = me.getText();
			String expected6 = lady2;
			String actual6 = "1 YSI";
			System.out.println("Payout Value of 3 lady symbols for denomination 0.8 is: " +lady2);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		//Check for Guitar symbol
		if(me.getId().equals("33")){
			guitar = me.getText();
			String expected7 = guitar;
			String actual7 = "16 YSI";
			System.out.println("Payout Value of 5 guitar symbols for denomination 0.8 is: " +guitar);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("34")){
			guitar1 = me.getText();
			String expected8 = guitar1;
			String actual8 = "4 YSI";
			System.out.println("Payout Value of 4 guitar symbols for denomination 0.8 is: " +guitar1);
			Assert.assertEquals(actual8, expected8);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("35")){
			guitar2 = me.getText();
			String expected9 = guitar2;
			String actual9 = "0.8 YSI";
			System.out.println("Payout Value of 3 guitar symbols for denomination 0.8 is: " +guitar2);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		
		//Check for A & K symbol
		if(me.getId().equals("36")){
			AK = me.getText();
			String expected10 = AK;
			String actual10 = "5 YSI";
			System.out.println("Payout Value of 5 A & K symbols for denomination 0.8 is: " +AK);
			Assert.assertEquals(actual10, expected10);
			Thread.sleep(1000);
			} 
		if(me.getId().equals("37")){
			AK1 = me.getText();
			String expected11 = AK1;
			String actual11 = "2 YSI";
			System.out.println("Payout Value of 4 A & K symbols for denomination 0.8 is: " +AK1);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("38")){
			AK2 = me.getText();
			String expected12 = AK2;
			String actual12 = "0.6 YSI";
			System.out.println("Payout Value of 3 A & K symbols for denomination 0.8 is: " +AK2);
			Assert.assertEquals(actual12, expected12);
			Thread.sleep(1000);
			} 
		
		//Check for J symbol
		if(me.getId().equals("39")){
			J = me.getText();
			String expected13 = J;
			String actual13 = "4 YSI";
			System.out.println("Payout Value of 5 J symbols for denomination 0.8 is: " +J);
			Assert.assertEquals(actual13, expected13);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("40")){
			J1 = me.getText();
			String expected14 = J1;
			String actual14 = "1.2 YSI";
			System.out.println("Payout Value of 4 J symbols for denomination 0.8 is: " +J1);
			Assert.assertEquals(actual14, expected14);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("41")){
			J2 = me.getText();
			String expected15 = J2;
			String actual15 = "0.6 YSI";
			System.out.println("Payout Value of 3 J symbols for denomination 0.8 is: " +J2);
			Assert.assertEquals(actual15, expected15);
			Thread.sleep(1000);
			} 
		
		//Check for Q symbol
		if(me.getId().equals("42")){
			Q = me.getText();
			String expected16 = Q;
			String actual16 = "4 YSI";
			System.out.println("Payout Value of 5 orQange symbols for denomination 0.8 is: " +Q);
			Assert.assertEquals(actual16, expected16);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("43")){
			Q1 = me.getText();
			String expected17 = Q1;
			String actual17 = "1.2 YSI";
			System.out.println("Payout Value of 4 Q symbols for denomination 0.8 is: " +Q1);
			Assert.assertEquals(actual17, expected17);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("44")){
			Q2 = me.getText();
			String expected18 = Q2;
			String actual18 = "0.6 YSI";
			System.out.println("Payout Value of 3 Q symbols for denomination 0.8 is: " +Q2);
			Assert.assertEquals(actual18, expected18);
			Thread.sleep(1000);
			}
		}
	}

	@Then("^System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination value as (\\d+)\\.(\\d+) in Tiki Isle slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_value_as_in_Tiki_Isle_slot_game_on_mobile(int arg1, int arg2, int arg3, int arg4) throws Throwable {
	    driver.quit();
	}
}
