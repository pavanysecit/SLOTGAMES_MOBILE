package stepDefinition_GoldenCrown;

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

public class GoldenCrown_PayOut_BetType_1_And_Denomination_5 {
AppiumDriver<MobileElement> driver;

	public GoldenCrown_PayOut_BetType_1_And_Denomination_5() throws InterruptedException {
		this.driver = GoldenCrown_URL_Login.getDriver();
		//this.driver = GoldenCrown_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Golden Crown slot game, icon to open payout table, all symbols, max amount on each symbol like orange n etc, back button, bet type (\\d+)\\.(\\d+) and denomination value (\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Crown_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_orange_n_etc_back_button_bet_type_and_denomination_value(int arg1, int arg2, int arg3) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		
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
	@When("^Open the Golden Crown slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like orange n etc, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination  value (\\d+) and check payout amount$")
	public void open_the_Golden_Crown_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_orange_n_etc_click_on_back_button_select_bet_type_as_denomination_value_and_check_payout_amount(int arg1, int arg2, int arg3) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
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
			
			if(be.getText().equals("4")){
				be.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String betValue = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +betValue);
		String actualB = betValue;
		String expectedB = "4";
		Assert.assertEquals(expectedB, actualB);
		Thread.sleep(2000);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
		
		String Fsymbol="", F1symbol="", F2symbol="", F3symbol="", wmelon="",wmelon1="",wmelon2="",wmelon3="", grape="",grape1="",grape2="",bell="",bell1="",bell2="",cherry="",cherry1="",cherry2="",
				orange="", orange1="", orange2="", scatter="", scatter1="", scatter2="",scatter3="",pscatter="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			
		// Checking payout max amount for each symbol when bet type is 0.01 and denomination is 4
		//Check for 777 symbol
		if(me.getId().equals("23")){
			Fsymbol = me.getText();
			String expected = Fsymbol;
			String actual = "1000 YSI";
			System.out.println("Max Payout Value of 77777 symbols for denomination 4 is : " +Fsymbol);
			Assert.assertEquals(actual, expected);
			Thread.sleep(1000);
		}
		if(me.getId().equals("24")){
			F1symbol = me.getText();
			String expected1 = F1symbol;
			String actual1 = "50 YSI";
			System.out.println("Max Payout Value of 7777 symbols for denomination 4 is : " +F1symbol);
			Assert.assertEquals(actual1, expected1);
			Thread.sleep(1000);
		}
		if(me.getId().equals("25")){
			F2symbol = me.getText();
			String expected2 = F2symbol;
			String actual2 = "10 YSI";
			System.out.println("Max Payout Value of 777 symbols for denomination 4 is : " +F2symbol);
			Assert.assertEquals(actual2, expected2);
			Thread.sleep(1000);
		}
		if(me.getId().equals("26")){
			F3symbol = me.getText();
			String expected3 = F3symbol;
			String actual3 = "2 YSI";
			System.out.println("Max Payout Value of 77 symbols for denomination 4 is : " +F3symbol);
			Assert.assertEquals(actual3, expected3);
			Thread.sleep(1000);
		}
		
		//Check for watermelon symbol
		//System.out.println(me.getId()+"  "+me.getText());
		if(me.getId().equals("27")){
			wmelon = me.getText();
			String expected4 = wmelon;
			String actual4 = "140 YSI";
			System.out.println("Payout Value of 5 watermelon symbols for denomination 4 is : " +wmelon);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("28")){
			wmelon1 = me.getText();
			String expected5 = wmelon1;
			String actual5 = "24 YSI";
			System.out.println("Payout Value of 4 watermelon symbols for denomination 4 is: " +wmelon1);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("29")){
			wmelon2 = me.getText();
			String expected6 = wmelon2;
			String actual6 = "8 YSI";
			System.out.println("Payout Value of 3 watermelon symbols for denomination 4 is: " +wmelon2);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		//Check for Lemon symbol
		if(me.getId().equals("30")){
			grape = me.getText();
			String expected7 = grape;
			String actual7 = "30 YSI";
			System.out.println("Payout Value of 5 lemons symbols for denomination 4 is: " +grape);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("31")){
			grape1 = me.getText();
			String expected8 = grape1;
			String actual8 = "6 YSI";
			System.out.println("Payout Value of 4 lemons symbols for denomination 4 is: " +grape1);
			Assert.assertEquals(actual8, expected8);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("32")){
			grape2 = me.getText();
			String expected9 = grape2;
			String actual9 = "2 YSI";
			System.out.println("Payout Value of 3 lemons symbols for denomination 4 is: " +grape2);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		
		//Check for Grapes symbol
		if(me.getId().equals("33")){
			bell = me.getText();
			String expected10 = bell;
			String actual10 = "140 YSI";
			System.out.println("Payout Value of 5 Grapes symbols for denomination 4 is: " +bell);
			Assert.assertEquals(actual10, expected10);
			Thread.sleep(1000);
			} 
		if(me.getId().equals("34")){
			bell1 = me.getText();
			String expected11 = bell1;
			String actual11 = "24 YSI";
			System.out.println("Payout Value of 4 Grapes symbols for denomination 4 is: " +bell1);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("35")){
			bell2 = me.getText();
			String expected12 = bell2;
			String actual12 = "8 YSI";
			System.out.println("Payout Value of 3 Grapes symbols for denomination 4 is: " +bell2);
			Assert.assertEquals(actual12, expected12);
			Thread.sleep(1000);
			} 
		
		//Check for Bell symbol
		if(me.getId().equals("36")){
			cherry = me.getText();
			String expected13 = cherry;
			String actual13 = "40 YSI";
			System.out.println("Payout Value of 5 Bells symbols for denomination 4 is: " +cherry);
			Assert.assertEquals(actual13, expected13);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("37")){
			cherry1 = me.getText();
			String expected14 = cherry1;
			String actual14 = "8 YSI";
			System.out.println("Payout Value of 4 Bells symbols for denomination 4 is: " +cherry1);
			Assert.assertEquals(actual14, expected14);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("38")){
			cherry2 = me.getText();
			String expected15 = cherry2;
			String actual15 = "4 YSI";
			System.out.println("Payout Value of 3 Bells symbols for denomination 4 is: " +cherry2);
			Assert.assertEquals(actual15, expected15);
			Thread.sleep(1000);
			} 
		
		//Check for orange symbol
		if(me.getId().equals("39")){
			orange = me.getText();
			String expected16 = orange;
			String actual16 = "30 YSI";
			System.out.println("Payout Value of 5 orange symbols for denomination 4 is: " +orange);
			Assert.assertEquals(actual16, expected16);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("40")){
			orange1 = me.getText();
			String expected17 = orange1;
			String actual17 = "6 YSI";
			System.out.println("Payout Value of 4 orange symbols for denomination 4 is: " +orange1);
			Assert.assertEquals(actual17, expected17);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("41")){
			orange2 = me.getText();
			String expected18 = orange2;
			String actual18 = "2 YSI";
			System.out.println("Payout Value of 3 orange symbols for denomination 4 is: " +orange2);
			Assert.assertEquals(actual18, expected18);
			Thread.sleep(1000);
			}
		
		//Check for scatter symbol
		if(me.getId().equals("42")){
			scatter = me.getText();
			String expected19 = scatter;
			String actual19 = "2000 YSI";
			System.out.println("Payout Value of 5 scatter symbols for denomination 4 is: " +scatter);
			Assert.assertEquals(expected19, actual19);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("43")){
			scatter1 = me.getText();
			String expected20 = scatter1;
			String actual20 = "400 YSI";
			System.out.println("Payout Value of 4 scatter symbols for denomination 4 is: " +scatter1);
			Assert.assertEquals(actual20, expected20);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("44")){
			scatter2 = me.getText();
			String expected21 = scatter2;
			String actual21 = "100 YSI";
			System.out.println("Payout Value of 3 scatter symbols for denomination 4 is: " +scatter2);
			Assert.assertEquals(actual21, expected21);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("45")){
			pscatter = me.getText();
			String expected22 = pscatter;
			String actual22 = "400 YSI";
			System.out.println("Payout Value of Star scatter symbol for denomination 4 is: " +pscatter);
			Assert.assertEquals(actual22, expected22);
			Thread.sleep(1000);
			}
		}
	}

	@Then("^System should display the Payout max amount on each symbol like orange n etc and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination value (\\d+) in Golden Crown slot game$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_orange_n_etc_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_value_in_Golden_Crown_slot_game(int arg1, int arg2, int arg3) throws Throwable {
		driver.quit();
	}
}
