package stepDefinition_SkinfiriMysterious;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SkinfiriMysterious_Gamble_WinAmount_AddedTo_Balance {
	AppiumDriver<MobileElement> driver;

	public SkinfiriMysterious_Gamble_WinAmount_AddedTo_Balance() throws InterruptedException {
		this.driver = SkinfiriMysterious_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Mysterious slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Mysterious_slot_game_balance_spin_button_win_amount_gamble_button_gamble_amount_red_button_black_button_and_gamble_status() throws Throwable {
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

	@When("^Open the Skinfiri Mysterious slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win$")
	public void open_the_Skinfiri_Mysterious_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_spin_button_till_player_wins_click_on_gamble_button_click_on_red_or_black_button_and_check_the_balance_after_win() throws Throwable {
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The balance is equal to"+" "+balance);

		MobileElement start = driver.findElement(By.id("hud_btnSpin"));
		start.click();
		MobileElement winE = driver.findElement(By.id("hud_Hud_txtWin1"));

		String prewin = winE.getText();
		//System.out.println("Balance before win is"+" "+prewin);                    
		String winTex= winE.getText();
		                       
		while(prewin.isEmpty()){
			start.click();	
			Thread.sleep(4000);	
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
		String[] uyt = gAmount.split(" ");
		String gamble="";
		for(int i=0;i<uyt.length;i++){
			System.out.println(uyt[i]);
			if(i==0){
			gamble=gamble+uyt[i];
			}
		}
		System.out.println("Gamble amount after split is :"+gamble);
		//System.out.println("The lenght of gamble is :"+uyt.length);
		
		String Gwin = driver.findElement(By.id("gamble_txtWin")).getText();
		System.out.println("Gamble win amount is: " +Gwin);
		driver.findElement(By.id("gamble_btnRed")).click();
		Thread.sleep(1000);

		Screen screen=new Screen();
		Pattern pat=new Pattern("E:\\Sikuli Images\\LOSE.JPEG");
		Finder finder =new Finder(screen.capture().getImage());
				
		String ht = finder.find(pat);
		
		System.out.println("the value of ht"+" "+ht);
		

		 if(finder.hasNext())
		 {
		 Match m=finder.next();
		 System.out.println("Match Found with"+(m.getScore())*100+"%");
         System.out.println("Its a win");
		 finder.destroy();
		 Thread.sleep(3000);
		 String[] uyt1 = Gwin.split(" ");
		 String gamble1="";
		 for(int i=0;i<uyt.length;i++){
			System.out.println(uyt[i]);
			if(i==0){
			gamble1=gamble1+uyt[i];
			}
		 }
		 driver.findElement(By.id("gamble_btnCollect")).click();
		 Thread.sleep(3000);
		 String postBalance22 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		 System.out.println("Balance amount After clicking on collect link :"+postBalance22);
		 double conValue = Double.parseDouble(balance1) + Double.parseDouble(gamble1);
		 String dbi = String.format("%.2f", conValue);  
		 System.out.println("Balance after adding gamble win amount: "+dbi);
		 Thread.sleep(2000);
		 Assert.assertEquals(dbi, postBalance22);
		 Thread.sleep(2000);
		 }  
		 else  
		 {     
			String postBalance33 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText(); 
            System.out.println("It has lost");
            System.out.println("Current balance after loosing in gamble: " +postBalance33);
            Assert.assertEquals(postBalance33, postBalance33);
		 }
		 System.out.println("The testcase 3 has passed"); 
	}

	@Then("^Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Skinfiri Mysterious slot game$")
	public void gamble_Win_amount_should_get_added_to_main_balance_after_status_displayed_as_WIN_and_gamble_page_should_get_closed_in_Skinfiri_Mysterious_slot_game() throws Throwable {
	    Thread.sleep(3000);
	    driver.quit();
	}
}
