package stepDefinition_DeluxeFruits;

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

public class DeluxeFruits_TryNow_VerifyBalance {
	AppiumDriver<MobileElement> driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Deluxe Fruits slot game, try now button and balance to play$")
	public void chrome_browser_valid_URL_valid_login_details_Deluxe_Fruits_slot_game_try_now_button_and_balance_to_play() throws Throwable {
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

	@When("^Open the Deluxe Fruits slot game by entering the valid URL in browser, click on try now button$")
	public void open_the_Deluxe_Fruits_slot_game_by_entering_the_valid_URL_in_browser_click_on_try_now_button() throws Throwable {
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		String prewin="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me.getId().equals("28")){
				 prewin = me.getText();
			}
		}
		
		String actual = prewin;
		System.out.println("Balance is :" +actual);
		String expected = "5,000.00";
		Assert.assertEquals(actual, expected);
	}

	@Then("^System should provide five thousand as balance on click on try now button in Deluxe Fruits slot game$")
	public void system_should_provide_five_thousand_as_balance_on_click_on_try_now_button_in_Deluxe_Fruits_slot_game() throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
