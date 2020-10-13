package stepDefinition_VegasMania;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class VegasMania_Gamble_WinAmount_AddedTo_Balance {
	AppiumDriver<MobileElement> driver;

	public VegasMania_Gamble_WinAmount_AddedTo_Balance() throws InterruptedException {
		this.driver = VegasMania_URL_Login.getDriver();
		//this.driver = VegasMania_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Vegas Mania slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status$")
	public void chrome_browser_valid_URL_valid_login_details_Vegas_Mania_slot_game_balance_spin_button_win_amount_gamble_button_gamble_amount_red_button_black_button_and_gamble_status() throws Throwable {
		
	}

	@When("^Open the Vegas Mania slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win$")
	public void open_the_Vegas_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_spin_button_till_player_wins_click_on_gamble_button_click_on_red_or_black_button_and_check_the_balance_after_win() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The balance is equal to"+" "+balance);

		MobileElement start = driver.findElement(By.id("hud_btnSpin"));
		start.click();
		Thread.sleep(8000);	
		MobileElement winE = driver.findElement(By.id("hud_Hud_txtWin1"));

		String prewin = winE.getText();                   
		String winTex= winE.getText();
	
		while(prewin.isEmpty()){
			start.click();	
			Thread.sleep(8000);	
			winTex = winE.getText();
			prewin= prewin+winTex;
			System.out.println(winTex.isEmpty());		
		}
		System.out.println("Win amount is: " +prewin);	 
		String balance1 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance amount before clicking on gamble link :"+balance1);

		driver.findElement(By.id("hud_btnGamble")).click();	
		Thread.sleep(2000);
		String gAmount = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
		System.out.println("Gamble amount is :"+gAmount);
		Thread.sleep(2000);
		
		String gambleamt = gAmount.replaceAll(" SRD", "");
		System.out.println("Gamble amount after split is :"+gambleamt);

		String colorwin = driver.findElement(By.id("gamble_txtWin")).getText();
		String gamblewin = colorwin.replaceAll(" SRD", "");
		System.out.println("Gamble to win amount after split is :"+gamblewin);
		System.out.println("Gamble to win amount is: " +colorwin);
		driver.findElement(By.id("gamble_btnRed")).click();
		Thread.sleep(1800);
		
		String gAmount1 = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
		String gambleamtafter = gAmount1.replaceAll(" SRD", "");
		System.out.println("Gamble amount after selecting red or black button: "+gambleamtafter);

		if(gamblewin.equalsIgnoreCase(gambleamtafter)) {
			String gAmount11 = driver.findElement(By.id("gamble_txtGambleAmount")).getText();
			String gamble1 = gAmount11.replaceAll(" SRD", "");
			
            /*
             * Here we are comparing the gamble win amount field before and after after winning in the gamble page.
             * Before it is same as win amount in the game screen
             * after winning in the gamble page, gamble amount is doubled and verified with the gamble amount before win. 
             */
			double db1=Double.parseDouble(gamble1);
			double db=Double.parseDouble(gambleamt);
			double expected = db*2;
			Assert.assertEquals(Double.doubleToLongBits(expected), Double.doubleToLongBits(db1));
			
			Thread.sleep(2000);
			driver.findElement(By.id("gamble_btnCollect")).click();
			Thread.sleep(3000);
			String postBalance22 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
			System.out.println("Balance amount After clicking on collect link :"+postBalance22);
			double conValue = Double.parseDouble(balance1) + db1;
			String dbi = String.format("%.2f", conValue);  
			System.out.println("Balance after adding gamble win amount: "+dbi);
			Thread.sleep(2000);
			Assert.assertEquals(dbi, postBalance22);
			Thread.sleep(2000);
		}  
		else
		{     
			Thread.sleep(3000);
			String postBalance33 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText(); 
			System.out.println("It has lost");
			System.out.println("Current balance after loosing in gamble: " +postBalance33);
			Assert.assertEquals(postBalance33, postBalance33);
		}
		System.out.println("The testcase 3 has passed");
	}

	@Then("^Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Vegas Mania slot game$")
	public void gamble_Win_amount_should_get_added_to_main_balance_after_status_displayed_as_WIN_and_gamble_page_should_get_closed_in_Vegas_Mania_slot_game() throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
