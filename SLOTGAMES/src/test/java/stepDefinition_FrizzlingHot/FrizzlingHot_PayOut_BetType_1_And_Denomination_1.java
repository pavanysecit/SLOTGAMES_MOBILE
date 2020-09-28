package stepDefinition_FrizzlingHot;

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

public class FrizzlingHot_PayOut_BetType_1_And_Denomination_1 {
	AppiumDriver<MobileElement> driver;

	public FrizzlingHot_PayOut_BetType_1_And_Denomination_1() throws InterruptedException {
		this.driver = FrizzlingHot_URL_Login.getDriver();
		//this.driver = FrizzlingHot_URL_TryNow.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Frizzling Hot slot game, icon to open payout table, all symbols, max amount on each symbol like seven & scatter, back button, bet type (\\d+)\\.(\\d+) and denomination as (\\d+)\\.(\\d+) on mobile$")
	public void chrome_browser_valid_URL_valid_login_details_Frizzling_Hot_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_seven_scatter_back_button_bet_type_and_denomination_as_on_mobile(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		MobileElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();

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

	@When("^Open the Frizzling Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like seven & scatter, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination value as (\\d+)\\.(\\d+) and check payout amount on mobile$")
	public void open_the_Frizzling_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_seven_scatter_click_on_back_button_select_bet_type_as_denomination_value_as_and_check_payout_amount_on_mobile(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		//Getting the bet value and Bet amount
		String creditValue = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is: " +creditValue);
		String actualC = creditValue;
		String expectedC = "0.02";
		Assert.assertEquals(expectedC, actualC);
		Thread.sleep(1000);
		
		//Selecting bet amount as 0.1
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("0.1")){
				be.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +actual);
		String expected = "0.1";
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
		
		
		String Scatter="",Scatter1="",Scatter2="",Seven="",Seven1="",Seven2="",Seven3="",Mango="",Mango1="",Mango2="",Cherry="",Cherry1="",Cherry2="",Cherry3="",
				Wmelon="",Wmelon1="",Wmelon2="",Grapes="",Grapes1="",Grapes2="",Plum="",Plum1="",Plum2="",Orange="",Orange1="",Orange2="";
		for(MobileElement me:balance){
		//System.out.println(me.getId()+"  "+me.getText());
		

		//Check for Seven symbol
		if(me.getId().equals("26")){
			Seven = me.getText();
			String expected5 = Seven;
			String actual5 = "100 YSI";
			System.out.println("Payout Value of 5 Seven symbols for denomination 0.1 is: " +Seven);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("27")){
			Seven1 = me.getText();
			String expected6 = Seven1;
			String actual6 = "20 YSI";
			System.out.println("Payout Value of 4 Seven symbols for denomination 0.1 is: " +Seven1);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("28")){
			Seven2 = me.getText();
			String expected7 = Seven2;
			String actual7 = "2 YSI";
			System.out.println("Payout Value of 3 Seven symbols for denomination 0.1 is: " +Seven2);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		
		//Check for Scatter symbol
		if(me.getId().equals("29")){
			Scatter = me.getText();
			String expected2 = Scatter;
			String actual2 = "5 YSI";
			System.out.println("Payout Value of 5 Scatter symbols for denomination 0.1 is : " +Scatter);
			Assert.assertEquals(actual2, expected2);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("30")){
			Scatter1 = me.getText();
			String expected3 = Scatter1;
			String actual3 = "1 YSI";
			System.out.println("Payout Value of 4 Scatter symbols for denomination 0.1 is : " +Scatter1);
			Assert.assertEquals(actual3, expected3);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("31")){
			Scatter2 = me.getText();
			String expected4 = Scatter2;
			String actual4 = "0.2 YSI";
			System.out.println("Payout Value of 3 Scatter symbols for denomination 0.1 is : " +Scatter2);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		

		//Check for Watermelon symbol
		if(me.getId().equals("33")){
			Wmelon = me.getText();
			String expected8 = Wmelon;
			String actual8 = "12 YSI";
			System.out.println("Payout Value of 5 Watermelon symbol for denomination 0.1: " +Wmelon);
			Assert.assertEquals(actual8, expected8);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("34")){
			Wmelon1 = me.getText();
			String expected9 = Wmelon1;
			String actual9 = "6 YSI";
			System.out.println("Payout Value of 4 Watermelon symbol for denomination 0.1: " +Wmelon1);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("35")){
			Wmelon2 = me.getText();
			String expected10 = Wmelon2;
			String actual10 = "1 YSI";
			System.out.println("Payout Value of 3 Watermelon symbol for denomination 0.1: " +Wmelon2);
			Assert.assertEquals(actual10, expected10);
			Thread.sleep(1000);
		}
		
		//Check for Banana or Grapes symbol
		if(me.getId().equals("36")){
			Grapes = me.getText();
			String expected11 = Grapes;
			String actual11 = "12 YSI";
			System.out.println("Payout Value of 5 Grapes symbol for denomination 0.1 is: " +Grapes);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("37")){
			Grapes1 = me.getText();
			String expected12 = Grapes1;
			String actual12 = "6 YSI";
			System.out.println("Payout Value of 4 Grapes symbol for denomination 0.1 is: " +Grapes1);
			Assert.assertEquals(actual12, expected12);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("38")){
			Grapes2 = me.getText();
			String expected13 = Grapes2;
			String actual13 = "1 YSI";
			System.out.println("Payout Value of 3 Grapes symbol for denomination 0.1 is: " +Grapes2);
			Assert.assertEquals(actual13, expected13);
			Thread.sleep(1000);
			}
		
		//Check for Plum symbol
		if(me.getId().equals("39")){
			Plum = me.getText();
			String expected14 = Plum;
			String actual14 = "4 YSI";
			System.out.println("Payout Value of 5 Plum symbol for denomination 0.1 is: " +Plum);
			Assert.assertEquals(actual14, expected14);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("40")){
			Plum1 = me.getText();
			String expected15 = Plum1;
			String actual15 = "1.2 YSI";
			System.out.println("Payout Value of 4 Plum symbol for denomination 0.1 is: " +Plum1);
			Assert.assertEquals(actual15, expected15);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("41")){
			Plum2 = me.getText();
			String expected16 = Plum2;
			String actual16 = "0.4 YSI";
			System.out.println("Payout Value of 3 Plum symbol for denomination 0.1 is: " +Plum2);
			Assert.assertEquals(actual16, expected16);
			Thread.sleep(1000);
			}
		
		//Check for Orange symbol
		if(me.getId().equals("42")){
			Orange = me.getText();
			String expected17 = Orange;
			String actual17 = "4 YSI";
			System.out.println("Payout Value of 5 Orange symbol for denomination 0.1 is: " +Orange);
			Assert.assertEquals(actual17, expected17);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("43")){
			Orange1 = me.getText();
			String expected18 = Orange1;
			String actual18 = "1.2 YSI";
			System.out.println("Payout Value of 4 Orange symbol for denomination 0.1 is: " +Orange1);
			Assert.assertEquals(actual18, expected18);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("44")){
			Orange2 = me.getText();
			String expected19 = Orange2;
			String actual19 = "0.4 YSI";
			System.out.println("Payout Value of 3 Orange symbol for denomination 0.1 is: " +Orange2);
			Assert.assertEquals(actual19, expected19);
			Thread.sleep(1000);
			}
		
		//Check for Mango symbol
		if(me.getId().equals("45")){
			Mango = me.getText();
			String expected20 = Mango;
			String actual20 = "4 YSI";
			System.out.println("Payout Value of 5 Mango symbol for denomination 0.1 is: " +Mango);
			Assert.assertEquals(actual20, expected20);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("46")){
			Mango1 = me.getText();
			String expected21 = Mango1;
			String actual21 = "1.2 YSI";
			System.out.println("Payout Value of 4 Mango symbol for denomination 0.1 is: " +Mango1);
			Assert.assertEquals(actual21, expected21);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("47")){
			Mango2 = me.getText();
			String expected22 = Mango2;
			String actual22 = "0.4 YSI";
			System.out.println("Payout Value of 3 Mango symbol for denomination 0.1 is: " +Mango2);
			Assert.assertEquals(actual22, expected22);
			Thread.sleep(1000);
			}
		
		//Check for Cherry symbol
		if(me.getId().equals("48")){
			Cherry = me.getText();
			String expected23 = Cherry;
			String actual23 = "4 YSI";
			System.out.println("Payout Value of 5 Cherry symbol for denomination 0.1 is: " +Cherry);
			Assert.assertEquals(actual23, expected23);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("49")){
			Cherry1 = me.getText();
			String expected24 = Cherry1;
			String actual24 = "1.2 YSI";
			System.out.println("Payout Value of 4 Cherry symbol for denomination 0.1 is: " +Cherry1);
			Assert.assertEquals(actual24, expected24);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("50")){
			Cherry2 = me.getText();
			String expected25 = Cherry2;
			String actual25 = "0.4 YSI";
			System.out.println("Payout Value of 3 Cherry symbol for denomination 0.1 is: " +Cherry2);
			Assert.assertEquals(actual25, expected25);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("51")){
			Cherry3 = me.getText();
			String expected26 = Cherry3;
			String actual26 = "0.1 YSI";
			System.out.println("Payout Value of 2 Cherry symbol for denomination 0.1 is: " +Cherry3);
			Assert.assertEquals(actual26, expected26);
			Thread.sleep(1000);
			}
		}
	}

	@Then("^System should display the Payout max amount on each symbol like seven & scatter and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination value to (\\d+)\\.(\\d+) in Frizzling Hot slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_seven_scatter_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_value_to_in_Frizzling_Hot_slot_game_on_mobile(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
