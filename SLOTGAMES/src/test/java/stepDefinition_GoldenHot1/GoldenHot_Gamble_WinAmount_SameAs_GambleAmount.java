package stepDefinition_GoldenHot1;

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

public class GoldenHot_Gamble_WinAmount_SameAs_GambleAmount {
AppiumDriver<MobileElement> driver;
		
	public GoldenHot_Gamble_WinAmount_SameAs_GambleAmount() throws InterruptedException {
		this.driver = SlotGames_URL_Login.getDriver();

		}
		
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game, balance, spin button, win amount, gamble button and gamble amount$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_balance_spin_button_win_amount_gamble_button_and_gamble_amount() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		
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

	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on spin button till player wins, click on gamble button and check the gamble amount$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_golden_hot_slot_game_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_amount() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
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

		////Selecting bet type as 1 and default bet value will be 5
		for(MobileElement me2:balance)
		{
			if(me2.getText().equals("1 Cr ="))
			{
				me2.click();
			Thread.sleep(2000);
			}
			 if(me2.getText().equals("1"))
			 {
				 me2.click();
			 Thread.sleep(1000);
			 }
			//System.out.println(me2.getId()+"  "+me2.getText());
		}
		//Method to click on the play/start button/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[6]/android.view.View[2]
		MobileElement start = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[6]/android.view.View[2]"));
	    start.click();                                                                                                                                                                                                   
		MobileElement winE = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[21]/android.view.View[1]"));
		List<MobileElement> balance1 = driver.findElementsByClassName("android.view.View");
		String winTex1="";
		//Storing the balance before spin
		String prewin1="";
		for(MobileElement me1:balance1){
			//System.out.println(me1.getId()+"  "+me1.getText());
			if(me1.getId().equals("191")){
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
					System.out.println("The Win amount is "+"  "+winTex);
		     		
		            
					System.out.println(winTex.isEmpty()+" "+winTex);	
				break; 
			}
			start.click();			
		    }
			Thread.sleep(3000);
			System.out.println("win is: "+winTex1);
			Thread.sleep(2000); 
			String gAmount = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[6]")).getText();
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
			System.out.println("The value of toi  :"+gamble);
			System.out.println("The gamble count is :"+uyt.length);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[13]")).click();
			Assert.assertEquals(gamble, winTex1);
			System.out.println("The testcase has passed");
	}

	@Then("^Win amount should be displayed as Gamble amount in the gamble page$")
	public void win_amount_should_be_displayed_as_Gamble_amount_in_the_gamble_page() throws Throwable {
		driver.quit();
	}
}