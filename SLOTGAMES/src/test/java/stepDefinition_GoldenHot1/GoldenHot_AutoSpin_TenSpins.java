package stepDefinition_GoldenHot1;

import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class GoldenHot_AutoSpin_TenSpins {
AppiumDriver<MobileElement> driver;
	
	public GoldenHot_AutoSpin_TenSpins() throws InterruptedException {
		this.driver = SlotGames_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game, balance, spin button, auto spin button, ten spins option and number of spins left message$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_balance_spin_button_auto_spin_button_ten_spins_option_and_number_of_spins_left_message() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[6]/div[1]/div")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("transferInput")).sendKeys("200");
		//Thread.sleep(2000);
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
	
	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on ten spin option under auto spin drop down and check the number of spins left message$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_golden_hot_slot_game_click_on_ten_spin_option_under_auto_spin_drop_down_and_check_the_number_of_spins_left_message() throws Throwable {
		//Click on > icon and select auto play 10 option
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[6]/android.view.View[1]/android.view.View/android.view.View[2]")).click();
		Thread.sleep(2000);
			
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");

		
		//Storing the balance before spin
		String prewin="";
		for(MobileElement me:balance){
			driver.findElement(By.xpath("//android.view.View[3]/android.view.View[1]/android.view.View[6]/android.view.View[1]/android.view.View[2]/android.view.View[1]")).click();
			
			
			//Checking whether system displaying 9 spins left after choosing 10 spins option 
			if(me.getId().equals("28")){
			prewin = me.getText();
			String expected = prewin;
			String actual = "9 SPINS LEFT";
			System.out.println("Expected Value 1: " +prewin);
			Assert.assertEquals(actual, expected);
			Thread.sleep(2000);
			}
	
			//Checking whether system displaying 8 spins left after choosing 10 spins option and 1 spins get over
			if(me.getId().equals("28")){
			prewin = me.getText();
			String expected1 = prewin;
			String actual1 = "8 SPINS LEFT";
			System.out.println("Expected Value 2: " +prewin);
			Assert.assertEquals(actual1, expected1);
			Thread.sleep(18000);
			}
			
			/*
			if(me.getId().equals("28")){
			String expected2 = prewin;
			String actual2 = "7 SPINS LEFT";
			System.out.println("Expected Value 3: " +prewin);
			Assert.assertEquals(actual2, expected2);
			Thread.sleep(1500);
			}
			
			
			if(me.getId().equals("28")){
			prewin = me.getText();
			String expected3 = prewin;
			String actual3 = "6 SPINS LEFT";
			System.out.println("Expected Value 4: " +prewin);
			Assert.assertEquals(actual3, expected3);
			Thread.sleep(1000);
			}
			
			
			if(me.getId().equals("28")){
			prewin = me.getText();
			String expected4 = prewin;
			String actual4 = "5 SPINS LEFT";
			System.out.println("Expected Value 5: " +prewin);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
			}
			
			if(me.getId().equals("28")){
			prewin = me.getText();
			String expected5 = prewin;
			String actual5 = "4 SPINS LEFT";
			System.out.println("Expected Value 6: " +prewin);
			Assert.assertEquals(expected5, actual5);
			Thread.sleep(1000);
			}
			
			if(me.getId().equals("28")){
			prewin = me.getText();
			String expected6 = prewin;
			String actual6 = "3 SPINS LEFT";
			System.out.println("Expected Value 7: " +prewin);
			Assert.assertEquals(expected6, actual6);
			Thread.sleep(1500);
			}
			
			if(me.getId().equals("28")){
			prewin = me.getText();
			String expected7 = prewin;
			String actual7 = "2 SPINS LEFT";
			System.out.println("Expected Value 8: " +prewin);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
			}
			*/
			if(me.getId().equals("28")){
			prewin = me.getText();
			String expected8 = prewin;
			String actual8 = "LAST SPIN";
			System.out.println("Expected Value 9: " +prewin);
			Assert.assertEquals(expected8, actual8);
			Thread.sleep(2000);
			} 
			
		} 
	}	
	
	@Then("^Number of spin left should start from (\\d+) to (\\d+) after clicking ten spins option and should perform (\\d+) spins from (\\d+) to (\\d+)$")
	public void number_of_spin_left_should_start_from_to_after_clicking_ten_spins_option_and_should_perform_spins_from_to(int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
		driver.quit();
	}
}
