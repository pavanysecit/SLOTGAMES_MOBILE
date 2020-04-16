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

public class GoldenHot_Balance_Check_WinAmount_AddedToBalance {
	AppiumDriver<MobileElement> driver;
	private MobileElement prq;

	public GoldenHot_Balance_Check_WinAmount_AddedToBalance() {
		this.driver = SlotGames_URL_Login.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game, balance, transfer button, spin button and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_balance_transfer_button_spin_button_and_win_amount() throws Throwable {
		Thread.sleep(1000);
	}

	@SuppressWarnings("deprecation")
	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_amount_click_on_spin_button_till_user_win_and_check_the_balance_after_win() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		
		driver.findElement(By.id("transferInput")).sendKeys("500");
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
	
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
		//String balance = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[22]/android.view.View[1]")).getText();
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
	
		String prewin="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me.getId().equals("37")){
				 prewin = me.getText();
			System.out.println("The current Balance of Account after Spin: "+me.getText());
			}			
		}
	
		//Selecting bet type as 1 and default bet value will be 5
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
		
		//Method to click on the play/start button
		MobileElement start = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View[2]"));
		start.click();
		
		//copying current balance after every spin
		MobileElement prq= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[22]/android.view.View[1]"));
		//String curntbal="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me.getId().equals("37")){
				 prewin = me.getText();
				  this.prq=me;
			//System.out.println("The current Balance of Account"+" "+me.getText());
			}
		}
		//WinE is the locator of winning amount place	
		MobileElement winE = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[21]/android.view.View[1]"));
		String winTex = winE.getText();
		System.out.println(winTex.isEmpty()+" "+winTex);
		Thread.sleep(2000);
		
		String currtbal="";
		while(winTex.isEmpty())
		{
			Thread.sleep(3500);
			start.click();
			Thread.sleep(1000);
			winTex=	winE.getText();
			//currtbal= currentbal.getText();
			//copying current balance after every spin
			currtbal=prq.getText();
			System.out.println(winTex.isEmpty());	
		}
		
		Thread.sleep(3000);

		//Clicking on Collect button on gamble page
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[13]")).click();
		Thread.sleep(3000);
		String postwin = "";
		for(MobileElement me5:balance){
			System.out.println(me5.getId()+"  "+me5.getText());
			if(me5.getId().equals("37")){
				 postwin = me5.getText();
				  
			System.out.println("Balance after post win"+" "+me5.getText());
			}
		}
		//String postwin = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[21]/android.view.View[1]").getText();
		Thread.sleep(1000);
		System.out.println("win is: "+winTex);
		System.out.println("The current balance is: "+currtbal);
		System.out.println("The balance post win is: "+postwin);	
		
		//Adding current balance before win and winning amount and converting to string
		double fValue = Double.parseDouble(winTex)+Double.parseDouble(currtbal);
		System.out.println("finalvalue is equal to: "+fValue);

		String dbi = String.format("%.2f", fValue);  
		System.out.println("Final Win amount is: "+dbi);
	
	    System.out.println(dbi.equals(postwin));
		Assert.assertEquals(dbi, postwin);
		
	}	

	@Then("^Win amount should get added to the balance after win and balance should get increased with win amount$")
	public void win_amount_should_get_added_to_the_balance_after_win_and_balance_should_get_increased_with_win_amount() throws Throwable {
		driver.quit();
	}
}
