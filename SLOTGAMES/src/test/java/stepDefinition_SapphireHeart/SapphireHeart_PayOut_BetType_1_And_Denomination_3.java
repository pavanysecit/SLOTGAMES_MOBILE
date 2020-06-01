package stepDefinition_SapphireHeart;

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

public class SapphireHeart_PayOut_BetType_1_And_Denomination_3 {
	AppiumDriver<MobileElement> driver;

	public SapphireHeart_PayOut_BetType_1_And_Denomination_3() throws InterruptedException {
		this.driver = SapphireHeart_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Sapphire Heart slot game, icon to open payout table, all symbols, max amount on each symbol like diamond n etc, back button, bet type (\\d+)\\.(\\d+) and denomination as (\\d+) on mobile$")
	public void chrome_browser_valid_URL_valid_login_details_Sapphire_Heart_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_diamond_n_etc_back_button_bet_type_and_denomination_as_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
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

	@When("^Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like diamond n etc, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination as (\\d+) and check payout amount on mobile$")
	public void open_the_Sapphire_Heart_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_diamond_n_etc_click_on_back_button_select_bet_type_as_denomination_as_and_check_payout_amount_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
		//Getting the bet value and Bet amount
		String creditValue = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is: " +creditValue);
		String actualC = creditValue;
		String expectedC = "0.01";
		Assert.assertEquals(expectedC, actualC);
		Thread.sleep(1000);
		
		//Selecting bet amount as 3
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("3")){
				be.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +actual);
		String expected = "3";
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
		
		
		String Swild="", Swild1="",Swild2="", scatter="",GWsymbol="",GWsymbol1="",GWsymbol2="",
				PYcolor="",PYcolor1="",PYcolor2="",Green="",Green1="",Green2="",Red="",Red1="",Red2="",KA="",KA1="",KA2="",QJ="",QJ1="",QJ2="";
		for(MobileElement me:balance){
		//System.out.println(me.getId()+"  "+me.getText());
		
		// Checking payout max amount for each symbol when bet type is 0.01 and denomination is 2
		//Check for Stacked Wild symbol
		if(me.getId().equals("26")){
			Swild = me.getText();
			String expected1 = Swild;
			String actual1 = "30 YSI";
			System.out.println("Max Payout Value of 5 Stacked Wild symbols for denomination 3 is : " +Swild);
			Assert.assertEquals(actual1, expected1);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("27")){
			Swild1 = me.getText();
			String expected2 = Swild1;
			String actual2 = "6.75 YSI";
			System.out.println("Max Payout Value of 4 Stacked Wild symbols for denomination 3 is : " +Swild1);
			Assert.assertEquals(actual2, expected2);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("28")){
			Swild2 = me.getText();
			String expected3 = Swild2;
			String actual3 = "3 YSI";
			System.out.println("Max Payout Value of 3 Stacked Wild symbols for denomination 3 is : " +Swild2);
			Assert.assertEquals(actual3, expected3);
			Thread.sleep(1000);
		}
		
		//Check for Scatter symbol
		//System.out.println(me.getId()+"  "+me.getText());
		if(me.getId().equals("29")){
			scatter = me.getText();
			String expected4 = scatter;
			String actual4 = "6 YSI";
			System.out.println("Payout Value of 3 Scatter symbols for denomination 3 is : " +scatter);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		

		//Check for Men or Woman symbol
		if(me.getId().equals("30")){
			GWsymbol = me.getText();
			String expected5 = GWsymbol;
			String actual5 = "18 YSI";
			System.out.println("Payout Value of 5 Men or Woman symbols for denomination 3 is: " +GWsymbol);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("31")){
			GWsymbol1 = me.getText();
			String expected6 = GWsymbol1;
			String actual6 = "9 YSI";
			System.out.println("Payout Value of 4 Men or Woman symbols for denomination 3 is: " +GWsymbol1);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("32")){
			GWsymbol2 = me.getText();
			String expected7 = GWsymbol2;
			String actual7 = "1.5 YSI";
			System.out.println("Payout Value of 3 Men or Woman symbols for denomination 3 is: " +GWsymbol2);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		

		//Check for Stake Purple or Yellow symbol
		if(me.getId().equals("33")){
			PYcolor = me.getText();
			String expected8 = PYcolor;
			String actual8 = "6 YSI";
			System.out.println("Payout Value of 5 Purple or Yellow symbol for denomination 3 is: " +PYcolor);
			Assert.assertEquals(actual8, expected8);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("34")){
			PYcolor1 = me.getText();
			String expected9 = PYcolor1;
			String actual9 = "3 YSI";
			System.out.println("Payout Value of 4 Purple or Yellow symbol for denomination 3 is: " +PYcolor1);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("35")){
			PYcolor1 = me.getText();
			String expected10 = PYcolor1;
			String actual10 = "0.3 YSI";
			System.out.println("Payout Value of 3 Purple or Yellow symbol for denomination 3 is: " +PYcolor2);
			Assert.assertEquals(actual10, expected10);
			Thread.sleep(1000);
		}
		
		//Check for Green symbol
		if(me.getId().equals("36")){
			Green = me.getText();
			String expected11 = Green;
			String actual11 = "10.5 YSI";
			System.out.println("Payout Value of 5 Green symbol for denomination 3 is: " +Green);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("37")){
			Green1 = me.getText();
			String expected12 = Green1;
			String actual12 = "4.5 YSI";
			System.out.println("Payout Value of 4 Green symbol for denomination 3 is: " +Green1);
			Assert.assertEquals(actual12, expected12);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("38")){
			Green2 = me.getText();
			String expected13 = Green2;
			String actual13 = "0.75 YSI";
			System.out.println("Payout Value of 3 Green symbol for denomination 3 is: " +Green2);
			Assert.assertEquals(actual13, expected13);
			Thread.sleep(1000);
			}
		
		//Check for Red symbol
		if(me.getId().equals("39")){
			Red = me.getText();
			String expected14 = Red;
			String actual14 = "12 YSI";
			System.out.println("Payout Value of 5 Red symbol for denomination 3 is: " +Red);
			Assert.assertEquals(actual14, expected14);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("40")){
			Red1 = me.getText();
			String expected15 = Red1;
			String actual15 = "4.5 YSI";
			System.out.println("Payout Value of 4 Red symbol for denomination 3 is: " +Red1);
			Assert.assertEquals(actual15, expected15);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("41")){
			Red2 = me.getText();
			String expected16 = Red2;
			String actual16 = "0.9 YSI";
			System.out.println("Payout Value of 3 Red symbol for denomination 3 is: " +Red2);
			Assert.assertEquals(actual16, expected16);
			Thread.sleep(1000);
			}
		

		//Check for K or A symbol
		if(me.getId().equals("42")){
			KA = me.getText();
			String expected17 = KA;
			String actual17 = "3.75 YSI";
			System.out.println("Payout Value of 5 K or A symbol for denomination 3 is: " +KA);
			Assert.assertEquals(actual17, expected17);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("43")){
			KA1 = me.getText();
			String expected18 = KA1;
			String actual18 = "1.5 YSI";
			System.out.println("Payout Value of 4 K or A symbol for denomination 3 is: " +KA1);
			Assert.assertEquals(actual18, expected18);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("44")){
			KA2 = me.getText();
			String expected19 = KA2;
			String actual19 = "0.15 YSI";
			System.out.println("Payout Value of 3 K or A symbol for denomination 3 is: " +KA2);
			Assert.assertEquals(actual19, expected19);
			Thread.sleep(1000);
			}
		
		//Check for Q or J symbol
		if(me.getId().equals("45")){
			QJ = me.getText();
			String expected20 = QJ;
			String actual20 = "3 YSI";
			System.out.println("Payout Value of 5 Q or J symbol for denomination 3 is: " +QJ);
			Assert.assertEquals(actual20, expected20);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("46")){
			QJ1 = me.getText();
			String expected21 = QJ1;
			String actual21 = "0.75 YSI";
			System.out.println("Payout Value of 4 Q or J symbol for denomination 3 is: " +QJ1);
			Assert.assertEquals(actual21, expected21);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("47")){
			QJ2 = me.getText();
			String expected22 = QJ2;
			String actual22 = "0.15 YSI";
			System.out.println("Payout Value of 3 Q or J symbol for denomination 3 is: " +QJ2);
			Assert.assertEquals(actual22, expected22);
			Thread.sleep(1000);
			}
		}
	}

	@Then("^System should display the Payout max amount on each symbol like diamond n etc and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination to (\\d+) in Sapphire Heart slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_diamond_n_etc_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_to_in_Sapphire_Heart_slot_game_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
