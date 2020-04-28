package stepDefinition_LadyFortune;

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

public class LadyFortune_TryNow_Spin_BalanceDeduction {
	AppiumDriver<MobileElement> driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Lady Fortune slot game, try now button, balance to play and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Lady_Fortune_slot_game_try_now_button_balance_to_play_and_spin_button() throws Throwable {
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
	    Thread.sleep(120000);
	    
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

	@When("^Open the Lady Fortune slot game by entering the valid URL in browser, click on try now button and click on spin button$")
	public void open_the_Lady_Fortune_slot_game_by_entering_the_valid_URL_in_browser_click_on_try_now_button_and_click_on_spin_button() throws Throwable {
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		//Selecting bet type as 0.5
		for(MobileElement me:balance)
		{
			if(me.getText().equals("1 Cr ="))
			{
				me.click();
			Thread.sleep(2000);
			}
			 if(me.getText().equals("0.5"))
			 {
				 me.click();
			 Thread.sleep(1000);
			 }
			 //System.out.println(me.getId()+"  "+me.getText());	 
		}
	
		String preSpn="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me.getId().equals("28")){
				preSpn = me.getText();
				 System.out.println("Balance before spin: " +preSpn);
			}
		}
		
		MobileElement start = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View[2]"));
		start.click();
		Thread.sleep(2000);
		
		String postSpn="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me.getId().equals("28")){
				postSpn = me.getText();
				 System.out.println("Balance after spin: " +postSpn);
			}
		}
		String actual = postSpn;
		System.out.println("Value: " +actual);
		String expected = "4,990.00";
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		
		start.click();
		Thread.sleep(2000);
		
		String Aspin="";
		for(MobileElement me1:balance){
			//System.out.println(me1.getId()+"  "+me1.getText());
			if(me1.getId().equals("28")){
				Aspin = me1.getText();
				System.out.println("Balance after second spin: " +Aspin);
			}
		}
		
		String actual1 = Aspin;
		String expected1 = "4,980.00";
		Assert.assertEquals(actual1, expected1);
	}

	@Then("^Amount should get deducted from balance on click on spin button in try now page of Lady Fortuneslot game$")
	public void amount_should_get_deducted_from_balance_on_click_on_spin_button_in_try_now_page_of_Lady_Fortuneslot_game() throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
