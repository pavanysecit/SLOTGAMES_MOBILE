package stepDefinition_20BlazingHot;

import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TwentyBlazingHot_TryNow_Check_WinAmount_AddedToBalance {
	AppiumDriver<MobileElement> driver;
	private MobileElement prq;
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Blazing Hot slot game, try now button, balance to play, spin button and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Blazing_Hot_slot_game_try_now_button_balance_to_play_spin_button_and_win_amount(int arg1) throws Throwable {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "ASUS X00TD");
		cap.setCapability("udid", "J9AAGF10J33379E");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("browserName", "Chrome");
		
		URL url=new URL("http://10.10.13.84:4723/wd/hub");
		
		driver=new AndroidDriver<MobileElement>(url,cap);
		
		System.out.println("Appium started sucessfully");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.ysecit.in:82/SlotGames/slotsgame");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[18]/div[2]/div[2]")).click();
	    Thread.sleep(40000);
	    
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

	@When("^Open the (\\d+) Blazing Hot slot game by entering the valid URL in browser, click on try now button, click on spin button till player win and check the balance after win$")
	public void open_the_Blazing_Hot_slot_game_by_entering_the_valid_URL_in_browser_click_on_try_now_button_click_on_spin_button_till_player_win_and_check_the_balance_after_win(int arg1) throws Throwable {
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		
		
		////Selecting bet type as 0.5 and default bet value will be 10
		for(MobileElement me2:balance)
		{
			if(me2.getText().equals("1 Cr ="))
			{
				me2.click();
			Thread.sleep(2000);
			}
			 if(me2.getText().equals("0.5"))
			 {
				 me2.click();
			 Thread.sleep(1000);
			 }
			//System.out.println(me2.getId()+"  "+me2.getText());
		}
	
		String prewin="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me.getId().equals("28")){
				 prewin = me.getText();
			System.out.println("The current Balance of Account before Spin: "+me.getText());
			}
		//Method to click on the play/start button
		MobileElement start = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View[2]"));
		start.click();
		//copying current balance after every spin
		MobileElement prq= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[19]/android.view.View[1]"));                                                                                                                                                         

		for(MobileElement me5:balance){
			//System.out.println(me.getId()+"  "+me5.getText());
			if(me5.getId().equals("28")){
				 prewin = me5.getText();
				  this.prq=me5;
			System.out.println("The current Balance of Account2"+" "+me.getText());
			}
		}
		MobileElement winE = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[23]/android.view.View[1]"));
	
		//MobileElement winE = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[21]/android.view.View[1]"));
		String winTex = winE.getText();
		System.out.println(winTex.isEmpty()+" "+winTex);
		Thread.sleep(2000);
		String currtbal="";
		while(winTex.isEmpty())
		{
			Thread.sleep(4500);
			start.click();
			Thread.sleep(1000);
			winTex=	winE.getText();
			//currtbal= currentbal.getText();
			currtbal=prq.getText();
			System.out.println(winTex.isEmpty());	
		}
		Thread.sleep(5000);
		//Clicking on Collect button on gamble page
		driver.findElement(By.xpath("")).click();
		Thread.sleep(3000);
		
		String postwin = "";
		for(MobileElement me5:balance){
			System.out.println(me5.getId()+"  "+me5.getText());
			if(me5.getId().equals("29")){
				 postwin = me5.getText();
				  
			System.out.println("Balance after post win"+" "+me5.getText());
			}
		}
		System.out.println("win is: "+winTex);
		System.out.println("The current balance is: "+currtbal);
		System.out.println("The balance post win is: "+postwin);	
		
		double conValue = Double.parseDouble(winTex) + Double.parseDouble(postwin);
		String dbi = String.format("%.2f", conValue);  
		System.out.println("Balance after adding win amount: "+dbi);
		Thread.sleep(2000);
		Assert.assertEquals(dbi, postwin);
		}
	}

	@Then("^Win amount should get added to the balance when the player wins in try now page of (\\d+) Blazing Hot slot game$")
	public void win_amount_should_get_added_to_the_balance_when_the_player_wins_in_try_now_page_of_Blazing_Hot_slot_game(int arg1) throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
