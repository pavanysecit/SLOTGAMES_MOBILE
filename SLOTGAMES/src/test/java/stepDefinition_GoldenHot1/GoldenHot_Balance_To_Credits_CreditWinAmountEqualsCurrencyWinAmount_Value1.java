package stepDefinition_GoldenHot1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class GoldenHot_Balance_To_Credits_CreditWinAmountEqualsCurrencyWinAmount_Value1 {
AppiumDriver<MobileElement> driver;
	
	public GoldenHot_Balance_To_Credits_CreditWinAmountEqualsCurrencyWinAmount_Value1() throws InterruptedException {
		this.driver = SlotGames_URL_Login.getDriver();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[6]/div[1]/div")).click();
		Thread.sleep(5000);
		}
	
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game, balance, spin button, win amount in currency, credits and win amount in credits$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_balance_spin_button_win_amount_in_currency_credits_and_win_amount_in_credits() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[6]/div[1]/div")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("transferInput")).sendKeys("200");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(20000);
		
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

	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on spin button till player wins, click on balance, check the win amount and click on balance$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_golden_hot_slot_game_click_on_spin_button_till_player_wins_click_on_balance_check_the_win_amount_and_click_on_balance() throws Throwable {
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");

		//Storing the balance before spin
		String prewin="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me.getId().equals("37")){
				 prewin = me.getText();
				 System.out.println("The current Balance of Account"+" "+me.getText());
			}
		}
		
		MobileElement start = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[6]/android.view.View[2]"));
		start.click();
		
		MobileElement winE = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[21]/android.view.View[1]"));
		List<MobileElement> balance1 = driver.findElementsByClassName("android.view.View");
		String winTex1="";
		//Storing the balance before spin
		String prewin1="";
		for(MobileElement me1:balance1)
			{
			//System.out.println(me1.getId()+"  "+me1.getText());
			if(me1.getId().equals("187")){
			prewin = me1.getText();
			System.out.println("The win is"+" "+me1.getText());
			winTex1=me1.getText();
			String winTex = me1.getText();
			while(winTex.isEmpty())
				{
				Thread.sleep(4500);
				start.click();
				Thread.sleep(1000);
				winTex=	winE.getText();
				winTex1 = winTex1+winTex;
				//currtbal=prq.getText();
				System.out.println(winTex.isEmpty());
				}
			//System.out.println(me1.getId()+"  "+me1.getText());
			System.out.println("The first winText is "+"  "+winTex);
			System.out.println(winTex.isEmpty()+" "+winTex);	
			break;
			}	
			start.click();
		}
		Thread.sleep(2000);
		System.out.println("win is: "+winTex1);
		
		//Clicking on Collect button
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[13]")).click();
		Thread.sleep(2000);

		String winCredit="";
		for(MobileElement me2:balance){
			//System.out.println(me2.getId()+"  "+me2.getText());
			if(me2.getId().equals("37")){
				me2.click();
				Thread.sleep(1000);
				winCredit = me2.getText();
			System.out.println("Balance in credits: " +me2.getText());
			Thread.sleep(2000);
			
			}			
		}
		
		String winAmt="";
		for(MobileElement me3:balance){
			//System.out.println(me3.getId()+"  "+me3.getText());
			if(me3.getId().equals("34")){
				winAmt = me3.getText();
			System.out.println("Win Amount in credits: " +me3.getText());
			Thread.sleep(2000);
			}			
		}
		
		String betvalue="";
		for(MobileElement be:balance)
		{
			//System.out.println(be.getId()+"  "+be.getText());
			if(be.getId().equals("30")){
				 betvalue = be.getText();
				  
			System.out.println("The bet value is: " +be.getText());
			}
		}
		//System.out.println("BET: " +betvalue);
		//System.out.println("WIN AMT: " +winAmt);
		
		double conValue = Double.parseDouble(betvalue) * Double.parseDouble(winAmt);
		//System.out.println("After deducting the bet value after spin: " +conValue);
		DecimalFormat df = new DecimalFormat("##.00");
	    df.setRoundingMode(RoundingMode.HALF_EVEN);
	    Double dbi =Double.parseDouble(df.format(conValue));
		System.out.println("Win amount after multiplications: " +dbi);
		
		for(MobileElement me4:balance){
			//System.out.println(me2.getId()+"  "+me2.getText());
			if(me4.getId().equals("37")){
				me4.click();
				Thread.sleep(1000);
			//System.out.println("Final Win Amount in currency: " +me4.getText());
			Thread.sleep(2000);
			
			}			
		}
		
		double ww = dbi;
		if(winTex1.endsWith("0"))
		{
		String pq="";
	    String paq=pq+ww;
		String bal="";
		String yui = paq.concat("0");
		System.out.println("After concat: " +yui);
		Assert.assertEquals(winTex1, yui);
		}
		else
		{
	
		Assert.assertEquals(winTex1, dbi);
		}
	}

	@Then("^Win amount in credit multiplied by denomination is equal to win amount in currency$")
	public void win_amount_in_credit_multiplied_by_denomination_is_equal_to_win_amount_in_currency() throws Throwable {
	   Thread.sleep(2000);
	   driver.quit();
	}
}
