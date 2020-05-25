package stepDefinition_SoccerMania;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SoccerMania_PayOut_BetType_1_And_Denomination_4 {
	AppiumDriver<MobileElement> driver;

	public SoccerMania_PayOut_BetType_1_And_Denomination_4() throws InterruptedException {
		this.driver = SoccerMania_Login_URL.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Soccer Mania slot game, icon to open payout table, all symbols, max amount on each symbol like J, Wild n etc, back button, bet type (\\d+)\\.(\\d+) and denomination as Three on mobile$")
	public void chrome_browser_valid_URL_valid_login_details_Soccer_Mania_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_J_Wild_n_etc_back_button_bet_type_and_denomination_as_Three_on_mobile(int arg1, int arg2) throws Throwable {
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

	@When("^Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like J, Wild n etc, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination value as Three and check payout amount on mobile$")
	public void open_the_Soccer_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_J_Wild_n_etc_click_on_back_button_select_bet_type_as_denomination_value_as_Three_and_check_payout_amount_on_mobile(int arg1, int arg2) throws Throwable {
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		//Getting the bet value and Bet amount
		String creditValue = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is: " +creditValue);
		String actualC = creditValue;
		String expectedC = "0.01";
		Assert.assertEquals(expectedC, actualC);
		Thread.sleep(1000);
		
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("3")){
				be.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String betValue = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +betValue);
		String actualB = betValue;
		String expectedB = "3";
		Assert.assertEquals(expectedB, actualB);
		Thread.sleep(2000);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
		
		String wild="", leg="", leg1="", leg2="", leg3="",hand="",hand1="",hand2="", K="",K1="",K2="",Q="",Q1="",Q2="",whistle="",whistle1="",whistle2="",
				shoe="", shoe1="",shoe2="", shirt="", shirt1="", shirt2="", ten="",ten1="",ten2="",J="",J1="",J2="",A="",A1="",A2="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			
		// Checking payout max amount for each symbol when bet type is 0.01 and denomination is 3
		//Check for Wild symbol
		if(me.getId().equals("26")){
			wild = me.getText();
			String expected = wild;
			String actual = "9 YSI";
			System.out.println("Max Payout Value of wild symbols for denomination 3 is : " +wild);
			Assert.assertEquals(actual, expected);
			Thread.sleep(1000);
		}
		//Check for Leg symbol
		if(me.getId().equals("27")){
			leg = me.getText();
			String expected1 = leg;
			String actual1 = "50 YSI";
			System.out.println("Max Payout Value of 5 Leg symbols for denomination 3 is : " +leg);
			Assert.assertEquals(actual1, expected1);
			Thread.sleep(1000);
		}
		if(me.getId().equals("28")){
			leg1 = me.getText();
			String expected2 = leg1;
			String actual2 = "20 YSI";
			System.out.println("Max Payout Value of 4 Leg symbols for denomination 3 is : " +leg1);
			Assert.assertEquals(actual2, expected2);
			Thread.sleep(1000);
		}
		if(me.getId().equals("29")){
			leg2 = me.getText();
			String expected3 = leg2;
			String actual3 = "10 YSI";
			System.out.println("Max Payout Value of 3 Leg symbols for denomination 3 is : " +leg2);
			Assert.assertEquals(actual3, expected3);
			Thread.sleep(1000);
		}
		if(me.getId().equals("21")){
			leg3 = me.getText();
			String expected3 = leg3;
			String actual3 = "0.2 YSI";
			System.out.println("Max Payout Value of 2 Leg symbols for denomination 3 is : " +leg3);
			Assert.assertEquals(actual3, expected3);
			Thread.sleep(1000);
		}
		
		//Check for Hand symbol
		//System.out.println(me.getId()+"  "+me.getText());
		if(me.getId().equals("30")){
			hand = me.getText();
			String expected4 = hand;
			String actual4 = "50 YSI";
			System.out.println("Payout Value of 5 Hand symbols for denomination 3 is : " +hand);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("31")){
			hand1 = me.getText();
			String expected5 = hand1;
			String actual5 = "20 YSI";
			System.out.println("Payout Value of 4 Hand symbols for denomination 3 is: " +hand1);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("32")){
			hand2 = me.getText();
			String expected6 = hand2;
			String actual6 = "10 YSI";
			System.out.println("Payout Value of 3 Hand symbols for denomination 3 is: " +hand2);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		//Check for Whistle symbol
		if(me.getId().equals("33")){
			whistle = me.getText();
			String expected7 = whistle;
			String actual7 = "10 YSI";
			System.out.println("Payout Value of 5 Whistle symbols for denomination 3 is: " +whistle);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("34")){
			whistle1 = me.getText();
			String expected8 = whistle1;
			String actual8 = "6 YSI";
			System.out.println("Payout Value of 4 Whistle symbols for denomination 3 is: " +whistle1);
			Assert.assertEquals(actual8, expected8);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("35")){
			whistle2 = me.getText();
			String expected9 = whistle2;
			String actual9 = "3 YSI";
			System.out.println("Payout Value of 3 Whistle symbols for denomination 3 is: " +whistle2);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		
		//Check for K symbol
		if(me.getId().equals("36")){
			K = me.getText();
			String expected10 = K;
			String actual10 = "8 YSI";
			System.out.println("Payout Value of 5 K symbols for denomination 3 is: " +K);
			Assert.assertEquals(actual10, expected10);
			Thread.sleep(1000);
			} 
		if(me.getId().equals("37")){
			K1 = me.getText();
			String expected11 = K1;
			String actual11 = "5 YSI";
			System.out.println("Payout Value of 4 K symbols for denomination 3 is: " +K1);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("38")){
			K2 = me.getText();
			String expected12 = K2;
			String actual12 = "1 YSI";
			System.out.println("Payout Value of 3 K symbols for denomination 3 is: " +K2);
			Assert.assertEquals(actual12, expected12);
			Thread.sleep(1000);
			} 
		
		//Check for Q symbol
		if(me.getId().equals("39")){
			Q = me.getText();
			String expected13 = Q;
			String actual13 = "8 YSI";
			System.out.println("Payout Value of 5 Q symbols for denomination 3 is: " +Q);
			Assert.assertEquals(actual13, expected13);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("40")){
			Q1 = me.getText();
			String expected14 = Q1;
			String actual14 = "5 YSI";
			System.out.println("Payout Value of 4 Q symbols for denomination 3 is: " +Q1);
			Assert.assertEquals(actual14, expected14);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("41")){
			Q2 = me.getText();
			String expected15 = Q2;
			String actual15 = "1 YSI";
			System.out.println("Payout Value of 3 Q symbols for denomination 3 is: " +Q2);
			Assert.assertEquals(actual15, expected15);
			Thread.sleep(1000);
			} 
		
		//Check for Shoe symbol
		if(me.getId().equals("42")){
			shoe = me.getText();
			String expected16 = shoe;
			String actual16 = "20 YSI";
			System.out.println("Payout Value of 5 Shoe symbols for denomination 3 is: " +shoe);
			Assert.assertEquals(actual16, expected16);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("43")){
			shoe1 = me.getText();
			String expected17 = shoe1;
			String actual17 = "10 YSI";
			System.out.println("Payout Value of 4 Shoe symbols for denomination 3 is: " +shoe1);
			Assert.assertEquals(actual17, expected17);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("44")){
			shoe2 = me.getText();
			String expected18 = shoe2;
			String actual18 = "5 YSI";
			System.out.println("Payout Value of 3 Shoe symbols for denomination 3 is: " +shoe2);
			Assert.assertEquals(actual18, expected18);
			Thread.sleep(1000);
			}
		
		//Check for shirt symbol
		if(me.getId().equals("45")){
			shirt = me.getText();
			String expected19 = shirt;
			String actual19 = "20 YSI";
			System.out.println("Payout Value of 5 shirt symbols for denomination 3 is: " +shirt);
			Assert.assertEquals(expected19, actual19);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("46")){
			shirt1 = me.getText();
			String expected20 = shirt1;
			String actual20 = "10 YSI";
			System.out.println("Payout Value of 4 shirt symbols for denomination 3 is: " +shirt1);
			Assert.assertEquals(actual20, expected20);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("47")){
			shirt2 = me.getText();
			String expected21 = shirt2;
			String actual21 = "5 YSI";
			System.out.println("Payout Value of 3 shirt symbols for denomination 3 is: " +shirt2);
			Assert.assertEquals(actual21, expected21);
			Thread.sleep(1000);
			}
		
		//Check for ten symbol
		if(me.getId().equals("48")){
			ten = me.getText();
			String expected22 = ten;
			String actual22 = "8 YSI";
			System.out.println("Payout Value of 5 Ten symbol for denomination 3 is: " +ten);
			Assert.assertEquals(actual22, expected22);
			Thread.sleep(1000);
			}
		if(me.getId().equals("49")){
			ten1 = me.getText();
			String expected22 = ten1;
			String actual22 = "5 YSI";
			System.out.println("Payout Value of 4 Ten symbol for denomination 3 is: " +ten1);
			Assert.assertEquals(actual22, expected22);
			Thread.sleep(1000);
			}
		if(me.getId().equals("50")){
			ten2 = me.getText();
			String expected22 = ten2;
			String actual22 = "2 YSI";
			System.out.println("Payout Value of 3 Ten symbol for denomination 3 is: " +ten2);
			Assert.assertEquals(actual22, expected22);
			Thread.sleep(1000);
			}
		
		//Check for A symbol
		if(me.getId().equals("51")){
			A = me.getText();
			String expected22 = A;
			String actual22 = "10 YSI";
			System.out.println("Payout Value of 5 A symbol for denomination 3 is: " +A);
			Assert.assertEquals(actual22, expected22);
			Thread.sleep(1000);
			}
		if(me.getId().equals("52")){
			A1 = me.getText();
			String expected22 = A1;
			String actual22 = "6 YSI";
			System.out.println("Payout Value of 4 A symbol for denomination 3 is: " +A1);
			Assert.assertEquals(actual22, expected22);
			Thread.sleep(1000);
			}
		if(me.getId().equals("53")){
			A2 = me.getText();
			String expected22 = A2;
			String actual22 = "3 YSI";
			System.out.println("Payout Value of 3 A symbol for denomination 3 is: " +A2);
			Assert.assertEquals(actual22, expected22);
			Thread.sleep(1000);
			}
		
		//Check for J symbol
		if(me.getId().equals("54")){
			J = me.getText();
			String expected22 = J;
			String actual22 = "8 YSI";
			System.out.println("Payout Value of J symbol for denomination 3 is: " +J);
			Assert.assertEquals(actual22, expected22);
			Thread.sleep(1000);
			}
		if(me.getId().equals("55")){
			J1 = me.getText();
			String expected22 = J1;
			String actual22 = "5 YSI";
			System.out.println("Payout Value of J symbol for denomination 3 is: " +J1);
			Assert.assertEquals(actual22, expected22);
			Thread.sleep(1000);
			}
		if(me.getId().equals("56")){
			J2 = me.getText();
			String expected22 = J2;
			String actual22 = "1 YSI";
			System.out.println("Payout Value of J symbol for denomination 3 is: " +J2);
			Assert.assertEquals(actual22, expected22);
			Thread.sleep(1000);
			}
		}
	}

	@Then("^System should display the Payout max amount on each symbol like J, Wild n etc and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination value to Three in Soccer Mania slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_J_Wild_n_etc_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_value_to_Three_in_Soccer_Mania_slot_game_on_mobile(int arg1, int arg2) throws Throwable {
	    driver.quit();
	}
}
