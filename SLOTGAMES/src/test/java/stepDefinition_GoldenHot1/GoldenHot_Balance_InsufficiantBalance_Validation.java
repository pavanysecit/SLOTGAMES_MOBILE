package stepDefinition_GoldenHot1;

import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class GoldenHot_Balance_InsufficiantBalance_Validation {
AppiumDriver<MobileElement> driver;
private MobileElement prq;
	
	public GoldenHot_Balance_InsufficiantBalance_Validation() throws InterruptedException {
		this.driver = SlotGames_URL_Login.getDriver();
		driver.findElement(By.className("mb")).click();
		Thread.sleep(5000);
		}
	
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game, balance, spin button and validation message$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_balance_spin_button_and_validation_message() throws Throwable {
		driver.findElement(By.className("mb")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("transferInput")).sendKeys("5");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
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

	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_till_balance_turns_to_zero_and_check_the_validation_message() throws Throwable {
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		//Method to click on the play/start button
		MobileElement prq= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[22]/android.view.View[1]"));
		
		String prewin="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me.getId().equals("36")){
				 prewin = me.getText();
				  this.prq=me;
			System.out.println("The current Balance of Account before spin: " +me.getText());
			}
		}
		
		//Changing the denomination to 1 by selecting value from drop down
		for(MobileElement me3:balance)
		{
			if(me3.getId().equals("29"))
			{
				me3.click();
			Thread.sleep(2000);
			}
			//System.out.println(me3.getId()+"  "+me3.getText());
			 if(me3.getId().equals("51"))
			 {
				 me3.click();
			 Thread.sleep(2000);
			 } 
		}
		
		MobileElement start = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View[2]"));
		start.click();
		Thread.sleep(2000);
		String postspin="";
		for(MobileElement me1:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me1.getId().equals("36")){
				postspin = me1.getText();
				  this.prq=me1;
			System.out.println("The current Balance of Account after spin: " +me1.getText());
			}
		}
		
		MobileElement spin = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View[2]"));
		spin.click();
		Thread.sleep(3000);
	
	}

	@Then("^Player should be blocked from playing the game when there is no balance in the account in golden hot game$")
	public void player_should_be_blocked_from_playing_the_game_when_there_is_no_balance_in_the_account_in_golden_hot_game() throws Throwable {
		String expected = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.view.View[3]/android.view.View")).getText();
		String actual = "Insufficient Balance.";
		Assert.assertEquals(expected, actual);
		Thread.sleep(3000);
		driver.quit();
	}
}
