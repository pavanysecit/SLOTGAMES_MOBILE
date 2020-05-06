package stepDefinition_SeaPearl;

import java.util.List;
import java.util.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SeaPearl_PayOut_BetType_1_And_Denomination_2 {
	AppiumDriver<MobileElement> driver;

	public SeaPearl_PayOut_BetType_1_And_Denomination_2() throws InterruptedException {
		this.driver = SeaPearl_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Sea Pearl slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type (\\d+)\\.(\\d+) and  denomination value as (\\d+)\\.(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Sea_Pearl_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_back_button_bet_type_and_denomination_value_as(int arg1, int arg2, int arg3, int arg4) throws Throwable {
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

	@When("^Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination  values as (\\d+)\\.(\\d+) and check payout amount$")
	public void open_the_Sea_Pearl_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_click_on_back_button_select_bet_type_as_denomination_values_as_and_check_payout_amount(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		//Getting the bet value and Bet amount
		String creditValue = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is: " +creditValue);
		String actualC = creditValue;
		String expectedC = "0.02";
		Assert.assertEquals(expectedC, actualC);
		Thread.sleep(1000);
		
		//Selecting bet amount as 0.4
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("0.4")){
				be.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +actual);
		String expected = "0.4";
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
		
		
		String Fsymbol="", F1symbol="", F2symbol="", F3symbol="", pearl="",pearl1="",pearl2="",pearl3="", crab="",crab1="",crab2="",crab3="",sfish="",sfish1="",sfish2="",nfish="",nfish1="",
				nfish2="", sfish3="", Shorse="", Shorse1="", Shorse2="", Q="",Q1="",Q2="",A="",A1="",A2="",K="",K1="",K2="",J="",J1="",J2="",nine="",nine1="",nine2="",nine3="",Ten="",Ten1="",Ten2="";
		for(MobileElement me:balance){
		//System.out.println(me.getId()+"  "+me.getText());
		
		// Checking payout max amount for each symbol when bet type is 0.02 and denomination is 0.4
		//Check for Dolphin symbol
		if(me.getId().equals("26")){
			Fsymbol = me.getText();
			String expected11 = Fsymbol;
			String actual11 = "400 YSI";
			System.out.println("Max Payout Value of 5 Dolphin symbols for denomination 0.4 is : " +Fsymbol);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
		}
		if(me.getId().equals("27")){
			F1symbol = me.getText();
			String expected1 = F1symbol;
			String actual1 = "100 YSI";
			System.out.println("Max Payout Value of 4 Dolphin symbols for denomination 0.4 is : " +F1symbol);
			Assert.assertEquals(actual1, expected1);
			Thread.sleep(1000);
		}
		if(me.getId().equals("28")){
			F2symbol = me.getText();
			String expected2 = F2symbol;
			String actual2 = "10 YSI";
			System.out.println("Max Payout Value of 3 Dolphin symbols for denomination 0.4 is : " +F2symbol);
			Assert.assertEquals(actual2, expected2);
			Thread.sleep(1000);
		}
		if(me.getId().equals("29")){
			F3symbol = me.getText();
			String expected3 = F3symbol;
			String actual3 = "0.4 YSI";
			System.out.println("Max Payout Value of 2 Dolphin symbols for denomination 0.4 is : " +F3symbol);
			Assert.assertEquals(actual3, expected3);
			Thread.sleep(1000);
		}
		
		//Check for pearl(scatter) symbol
		//System.out.println(me.getId()+"  "+me.getText());
		if(me.getId().equals("30")){
			pearl = me.getText();
			String expected4 = pearl;
			String actual4 = "200 YSI";
			System.out.println("Payout Value of 5 pearl(scatter) symbols for denomination 0.4 is : " +pearl);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("31")){
			pearl1 = me.getText();
			String expected5 = pearl1;
			String actual5 = "8 YSI";
			System.out.println("Payout Value of 4 pearl(scatter) symbols for denomination 0.4 is: " +pearl1);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("32")){
			pearl2 = me.getText();
			String expected6 = pearl2;
			String actual6 = "2 YSI";
			System.out.println("Payout Value of 3 pearl(scatter) symbols for denomination 0.4 is: " +pearl2);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("32")){
			pearl3 = me.getText();
			String expected61 = pearl3;
			String actual61 = "0.8 YSI";
			System.out.println("Payout Value of 2 pearl(scatter) symbols for denomination 0.4 is: " +pearl3);
			Assert.assertEquals(actual61, expected61);
			Thread.sleep(1000);
		}
		
		//Check for Crab symbol
		if(me.getId().equals("33")){
			crab = me.getText();
			String expected7 = crab;
			String actual7 = "30 YSI";
			System.out.println("Payout Value of 5 Crabs symbols for denomination 0.4 is: " +crab);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("34")){
			crab1 = me.getText();
			String expected8 = crab1;
			String actual8 = "5 YSI";
			System.out.println("Payout Value of 4 Crabs symbols for denomination 0.4 is: " +crab1);
			Assert.assertEquals(actual8, expected8);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("35")){
			crab2 = me.getText();
			String expected9 = crab2;
			String actual9 = "1 YSI";
			System.out.println("Payout Value of 3 Crabs symbols for denomination 0.4 is: " +crab2);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		if(me.getId().equals("35")){
			crab3 = me.getText();
			String expected9 = crab3;
			String actual9 = "0.08 YSI";
			System.out.println("Payout Value of 2 Crabs symbols for denomination 0.4 is: " +crab3);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		
		//Check for Stake Fish symbol
		if(me.getId().equals("33")){
			sfish = me.getText();
			String expected71 = sfish;
			String actual71 = "30 YSI";
			System.out.println("Payout Value of 5 Stake fishes symbols for denomination 0.4 is: " +sfish);
			Assert.assertEquals(actual71, expected71);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("34")){
			sfish1 = me.getText();
			String expected81 = sfish1;
			String actual81 = "5 YSI";
			System.out.println("Payout Value of 4 Stake fishes symbols for denomination 0.4 is: " +sfish1);
			Assert.assertEquals(actual81, expected81);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("35")){
			sfish2 = me.getText();
			String expected91 = sfish2;
			String actual91 = "1 YSI";
			System.out.println("Payout Value of 3 Stake fishes symbols for denomination 0.4 is: " +sfish2);
			Assert.assertEquals(actual91, expected91);
			Thread.sleep(1000);
		}
		if(me.getId().equals("35")){
			sfish3 = me.getText();
			String expected92 = sfish3;
			String actual92 = "0.08 YSI";
			System.out.println("Payout Value of 2 Stake fishes symbols for denomination 0.4 is: " +sfish3);
			Assert.assertEquals(actual92, expected92);
			Thread.sleep(1000);
		}
		
		//Check for Sea Horse symbol
		if(me.getId().equals("36")){
			Shorse = me.getText();
			String expected101 = Shorse;
			String actual101 = "16 YSI";
			System.out.println("Payout Value of 5 Sea Horses symbols for denomination 0.4 is: " +Shorse);
			Assert.assertEquals(actual101, expected101);
			Thread.sleep(1000);
			} 
		if(me.getId().equals("37")){
			Shorse1 = me.getText();
			String expected111 = Shorse1;
			String actual111 = "4 YSI";
			System.out.println("Payout Value of 4 Sea Horses symbols for denomination 0.4 is: " +Shorse1);
			Assert.assertEquals(actual111, expected111);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("38")){
			Shorse2 = me.getText();
			String expected1211 = Shorse2;
			String actual1121 = "0.8 YSI";
			System.out.println("Payout Value of 3 Sea Horses symbols for denomination 0.4 is: " +Shorse2);
			Assert.assertEquals(actual1121, expected1211);
			Thread.sleep(1000);
			} 
		
		//Check for Normal Fish symbol
		if(me.getId().equals("39")){
			nfish = me.getText();
			String expected131 = nfish;
			String actual131 = "10 YSI";
			System.out.println("Payout Value of 5 Normal Fishes symbols for denomination 0.4 is: " +nfish);
			Assert.assertEquals(actual131, expected131);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("40")){
			nfish1 = me.getText();
			String expected141 = nfish1;
			String actual141 = "3 YSI";
			System.out.println("Payout Value of 4 Normal Fishes symbols for denomination 0.4 is: " +nfish1);
			Assert.assertEquals(actual141, expected141);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("41")){
			nfish2 = me.getText();
			String expected151 = nfish2;
			String actual151 = "0.6 YSI";
			System.out.println("Payout Value of 3 Normal Fishes symbols for denomination 0.4 is: " +nfish2);
			Assert.assertEquals(actual151, expected151);
			Thread.sleep(1000);
			} 
		
		//Check for Small Fish symbol
		if(me.getId().equals("39")){
			sfish = me.getText();
			String expected132 = sfish;
			String actual132 = "10 YSI";
			System.out.println("Payout Value of 5 Small Fishes symbols for denomination 0.4 is: " +sfish);
			Assert.assertEquals(actual132, expected132);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("40")){
			sfish1 = me.getText();
			String expected143 = sfish1;
			String actual143 = "3 YSI";
			System.out.println("Payout Value of 4 Small Fishes symbols for denomination 0.4 is: " +sfish1);
			Assert.assertEquals(actual143, expected143);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("41")){
			sfish2 = me.getText();
			String expected153 = sfish2;
			String actual153 = "0.6 YSI";
			System.out.println("Payout Value of 3 Small Fishes symbols for denomination 0.4 is: " +sfish2);
			Assert.assertEquals(actual153, expected153);
			Thread.sleep(1000);
			} 
			
			
		//Check for Nine symbol
		if(me.getId().equals("42")){
			nine = me.getText();
			String expected163 = nine;
			String actual163 = "4 YSI";
			System.out.println("Payout Value of 5 Nine symbols for denomination 0.4 is: " +nine);
			Assert.assertEquals(actual163, expected163);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("43")){
			nine1 = me.getText();
			String expected173 = nine1;
			String actual173 = "1 YSI";
			System.out.println("Payout Value of 4 Nine symbols for denomination 0.4 is: " +nine1);
			Assert.assertEquals(actual173, expected173);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("44")){
			nine2 = me.getText();
			String expected183 = nine2;
			String actual183 = "0.2 YSI";
			System.out.println("Payout Value of 3 Nine symbols for denomination 0.4 is: " +nine2);
			Assert.assertEquals(actual183, expected183);
			Thread.sleep(1000);
			}
			
		if(me.getId().equals("444")){
			nine3 = me.getText();
			String expected1813 = nine3;
			String actual1813 = "0.08 YSI";
			System.out.println("Payout Value of 2 Nine symbols for denomination 0.4 is: " +nine3);
			Assert.assertEquals(actual1813, expected1813);
			Thread.sleep(1000);
			}
		
		//Check for Q symbol
		if(me.getId().equals("45")){
			Q = me.getText();
			String expected193 = Q;
			String actual193 = "4 YSI";
			System.out.println("Payout Value of 5 Q symbols for denomination 0.4 is: " +Q);
			Assert.assertEquals(expected193, actual193);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("46")){
			Q1 = me.getText();
			String expected204 = Q1;
			String actual204 = "1 YSI";
			System.out.println("Payout Value of 4 Q symbols for denomination 0.4 is: " +Q1);
			Assert.assertEquals(actual204, expected204);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("47")){
			Q2 = me.getText();
			String expected214 = Q2;
			String actual214 = "0.2 YSI";
			System.out.println("Payout Value of 3 Q symbols for denomination 0.4 is: " +Q2);
			Assert.assertEquals(actual214, expected214);
			Thread.sleep(1000);
			}
		

		//Check for A symbol
		if(me.getId().equals("45")){
			A = me.getText();
			String expected195 = A;
			String actual195 = "6 YSI";
			System.out.println("Payout Value of 5 A symbols for denomination 0.4 is: " +A);
			Assert.assertEquals(expected195, actual195);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("46")){
			A1 = me.getText();
			String expected205 = A1;
			String actual205 = "2 YSI";
			System.out.println("Payout Value of 4 Q symbols for denomination 0.4 is: " +A1);
			Assert.assertEquals(actual205, expected205);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("47")){
			A2 = me.getText();
			String expected216 = A2;
			String actual216 = "0.6 YSI";
			System.out.println("Payout Value of 3 Q symbols for denomination 0.4 is: " +A2);
			Assert.assertEquals(actual216, expected216);
			Thread.sleep(1000);
			}
			
		//Check for K symbol
		if(me.getId().equals("45")){
			K = me.getText();
			String expected196 = K;
			String actual196 = "6 YSI";
			System.out.println("Payout Value of 5 K symbols for denomination 0.4 is: " +K);
			Assert.assertEquals(expected196, actual196);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("46")){
			K1 = me.getText();
			String expected206 = K1;
			String actual206 = "2 YSI";
			System.out.println("Payout Value of 4 Q symbols for denomination 0.4 is: " +K1);
			Assert.assertEquals(actual206, expected206);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("47")){
			K2 = me.getText();
			String expected216 = K2;
			String actual216 = "0.6 YSI";
			System.out.println("Payout Value of 3 Q symbols for denomination 0.4 is: " +K2);
			Assert.assertEquals(actual216, expected216);
			Thread.sleep(1000);
			}
			
		//Check for J symbol
		if(me.getId().equals("45")){
			J = me.getText();
			String expected197 = J;
			String actual197 = "4 YSI";
			System.out.println("Payout Value of 5 J symbols for denomination 0.4 is: " +J);
			Assert.assertEquals(expected197, actual197);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("46")){
			J1 = me.getText();
			String expected207 = J1;
			String actual207 = "1 YSI";
			System.out.println("Payout Value of 4 J symbols for denomination 0.4 is: " +J1);
			Assert.assertEquals(actual207, expected207);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("47")){
			J2 = me.getText();
			String expected218 = J2;
			String actual218 = "0.2 YSI";
			System.out.println("Payout Value of 3 J symbols for denomination 0.4 is: " +J2);
			Assert.assertEquals(actual218, expected218);
			Thread.sleep(1000);
			}
			
		//Check for Ten symbol
		if(me.getId().equals("45")){
			Ten = me.getText();
			String expected198 = Ten;
			String actual198 = "4 YSI";
			System.out.println("Payout Value of 5 Ten symbols for denomination 0.4 is: " +Ten);
			Assert.assertEquals(expected198, actual198);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("46")){
			Ten1 = me.getText();
			String expected2021 = Ten1;
			String actual2021 = "1 YSI";
			System.out.println("Payout Value of 4 Ten symbols for denomination 0.4 is: " +Ten1);
			Assert.assertEquals(actual2021, expected2021);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("47")){
			Ten2 = me.getText();
			String expected212 = Ten2;
			String actual212 = "0.2 YSI";
			System.out.println("Payout Value of 3 Ten symbols for denomination 0.4 is: " +Ten2);
			Assert.assertEquals(actual212, expected212);
			Thread.sleep(1000);
			}
		}
	}

	@Then("^System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination value as (\\d+)\\.(\\d+) in Sea Pearl slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_value_as_in_Sea_Pearl_slot_game_on_mobile(int arg1, int arg2, int arg3, int arg4) throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
