package stepDefinition_DeluxeFruits;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeluxeFruits_PayOut_BetType_1_And_Denomination_5 {
	AppiumDriver<MobileElement> driver;

	public DeluxeFruits_PayOut_BetType_1_And_Denomination_5() throws InterruptedException {
		this.driver = DeluxeFruits_URL_Login.getDriver();
		//this.driver = DeluxeFruits_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Deluxe Fruits slot game, icon to open payout table, all symbols, max amount on each symbol like watermelon & orange, back button, bet type (\\d+)\\.(\\d+) and denomination as (\\d+) on mobile$")
	public void chrome_browser_valid_URL_valid_login_details_Deluxe_Fruits_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_watermelon_orange_back_button_bet_type_and_denomination_as_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 80);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the Deluxe Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like watermelon & orange, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination value as (\\d+) and check payout amount on mobile$")
	public void open_the_Deluxe_Fruits_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_watermelon_orange_click_on_back_button_select_bet_type_as_denomination_value_as_and_check_payout_amount_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
		//Getting the bet value and Bet amount
		String creditValue = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is: " +creditValue);
		String actualC = creditValue;
		String expectedC = "0.01";
		Assert.assertEquals(expectedC, actualC);
		Thread.sleep(1000);
		
		//Selecting bet amount as 4
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("4")){
				be.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +actual);
		String expected = "4";
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
		String diamond="",diamond1="",diamond2="",seven="",seven1="",seven2="",orange="",orange1="",orange2="",grapes="",grapes1="",grapes2="",bell="",bell1="",bell2="",
				Plum="",Plum1="",Plum2="",Dbar="",Dbar1="",Dbar2="",cherry="",cherry1="",cherry2="";
		for(MobileElement me:balance){
		//System.out.println(me.getId()+"  "+me.getText());
		
		
		//Check for Seven symbol
		//System.out.println(me.getId()+"  "+me.getText());
		if(me.getId().equals("26")){
			seven = me.getText();
			String expected4 = seven;
			String actual4 = "150 YSI";
			System.out.println("Payout Value of 5 Seven symbols for denomination 4 is : " +seven);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("27")){
			seven1 = me.getText();
			String expected4 = seven1;
			String actual4 = "20 YSI";
			System.out.println("Payout Value of 4 Seven symbols for denomination 4 is : " +seven1);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("28")){
			seven2 = me.getText();
			String expected4 = seven2;
			String actual4 = "8 YSI";
			System.out.println("Payout Value of 3 Seven symbols for denomination 4 is : " +seven1);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}

		//Check for Diamond symbol
		if(me.getId().equals("30")){
			diamond = me.getText();
			String expected5 = diamond;
			String actual5 = "400 YSI";
			System.out.println("Payout Value of 5 Diamond symbols for denomination 4 is: " +diamond);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("31")){
			diamond1 = me.getText();
			String expected6 = diamond1;
			String actual6 = "40 YSI";
			System.out.println("Payout Value of 4 Diamond symbols for denomination 4 is: " +diamond1);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("32")){
			diamond2 = me.getText();
			String expected7 = diamond2;
			String actual7 = "8 YSI";
			System.out.println("Payout Value of 3 Diamond symbols for denomination 4 is: " +diamond2);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		

		//Check for Plum symbol
		if(me.getId().equals("33")){
			Plum = me.getText();
			String expected8 = Plum;
			String actual8 = "10 YSI";
			System.out.println("Payout Value of 5 Plum symbol for denomination 4: " +Plum);
			Assert.assertEquals(actual8, expected8);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("34")){
			Plum1 = me.getText();
			String expected9 = Plum1;
			String actual9 = "4 YSI";
			System.out.println("Payout Value of 4 Plum symbol for denomination 4: " +Plum1);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("35")){
			Plum2 = me.getText();
			String expected10 = Plum2;
			String actual10 = "1 YSI";
			System.out.println("Payout Value of 3 Plum symbol for denomination 4: " +Plum2);
			Assert.assertEquals(actual10, expected10);
			Thread.sleep(1000);
		}
		
		//Check for Double Bar symbol
		if(me.getId().equals("36")){
			Dbar = me.getText();
			String expected11 = Dbar;
			String actual11 = "40 YSI";
			System.out.println("Payout Value of 5 Double Bar symbol for denomination 4 is: " +Dbar);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("37")){
			Dbar1 = me.getText();
			String expected12 = Dbar;
			String actual12 = "8 YSI";
			System.out.println("Payout Value of 4 Double Bar symbol for denomination 4 is: " +Dbar1);
			Assert.assertEquals(actual12, expected12);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("38")){
			Dbar2 = me.getText();
			String expected13 = Dbar2;
			String actual13 = "4 YSI";
			System.out.println("Payout Value of 3 Double Bar symbol for denomination 4 is: " +Dbar2);
			Assert.assertEquals(actual13, expected13);
			Thread.sleep(1000);
			}
		
		//Check for Cherry symbol
		if(me.getId().equals("39")){
			cherry = me.getText();
			String expected14 = cherry;
			String actual14 = "40 YSI";
			System.out.println("Payout Value of 5 Cherry symbol for denomination 4 is: " +cherry);
			Assert.assertEquals(actual14, expected14);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("40")){
			cherry1 = me.getText();
			String expected15 = cherry1;
			String actual15 = "8 YSI";
			System.out.println("Payout Value of 4 Cherry symbol for denomination 4 is: " +cherry1);
			Assert.assertEquals(actual15, expected15);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("41")){
			cherry2 = me.getText();
			String expected16 = cherry2;
			String actual16 = "4 YSI";
			System.out.println("Payout Value of 3 Cherry symbol for denomination 4 is: " +cherry2);
			Assert.assertEquals(actual16, expected16);
			Thread.sleep(1000);
			}
		
		//Check for Orange symbol
		if(me.getId().equals("42")){
			orange = me.getText();
			String expected17 = orange;
			String actual17 = "10 YSI";
			System.out.println("Payout Value of 5 Orange symbol for denomination 4 is: " +orange);
			Assert.assertEquals(actual17, expected17);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("43")){
			orange1 = me.getText();
			String expected18 = orange1;
			String actual18 = "4 YSI";
			System.out.println("Payout Value of 4 Orange symbol for denomination 4 is: " +orange1);
			Assert.assertEquals(actual18, expected18);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("44")){
			orange2 = me.getText();
			String expected19 = orange2;
			String actual19 = "1 YSI";
			System.out.println("Payout Value of 3 Orange symbol for denomination 4 is: " +orange2);
			Assert.assertEquals(actual19, expected19);
			Thread.sleep(1000);
			}
		
		//Check for Grapes symbol
		if(me.getId().equals("45")){
			grapes = me.getText();
			String expected20 = grapes;
			String actual20 = "10 YSI";
			System.out.println("Payout Value of 5 Grapes symbol for denomination 4 is: " +grapes);
			Assert.assertEquals(actual20, expected20);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("46")){
			grapes1 = me.getText();
			String expected21 = grapes1;
			String actual21 = "4 YSI";
			System.out.println("Payout Value of 4 Grapes symbol for denomination 4 is: " +grapes1);
			Assert.assertEquals(actual21, expected21);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("47")){
			grapes2 = me.getText();
			String expected22 = grapes2;
			String actual22 = "1 YSI";
			System.out.println("Payout Value of 3 Grapes symbol for denomination 4 is: " +grapes2);
			Assert.assertEquals(actual22, expected22);
			Thread.sleep(1000);
			}
		
		//Check for Bell symbol
		if(me.getId().equals("48")){
			bell = me.getText();
			String expected23 = bell;
			String actual23 = "20 YSI";
			System.out.println("Payout Value of 5 Bell symbol for denomination 4 is: " +bell);
			Assert.assertEquals(actual23, expected23);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("49")){
			bell1 = me.getText();
			String expected24 = bell1;
			String actual24 = "6 YSI";
			System.out.println("Payout Value of 4 Bell symbol for denomination 4 is: " +bell1);
			Assert.assertEquals(actual24, expected24);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("50")){
			bell2 = me.getText();
			String expected25 = bell2;
			String actual25 = "3 YSI";
			System.out.println("Payout Value of 3 Bell symbol for denomination 4 is: " +bell2);
			Assert.assertEquals(actual25, expected25);
			Thread.sleep(1000);
			}
		}
	}

	@Then("^System should display the Payout max amount on each symbol like watermelon & orange and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination value to (\\d+) in Deluxe Fruits slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_watermelon_orange_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_value_to_in_Deluxe_Fruits_slot_game_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
