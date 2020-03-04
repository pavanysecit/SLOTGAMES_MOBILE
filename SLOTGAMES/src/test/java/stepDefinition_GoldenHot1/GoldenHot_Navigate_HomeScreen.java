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


public class GoldenHot_Navigate_HomeScreen {
AppiumDriver<MobileElement> driver;
	
	public GoldenHot_Navigate_HomeScreen() {
			this.driver = SlotGames_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game and home button$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_and_home_button() throws Throwable {
		driver.findElement(By.className("mb")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("transferInput")).sendKeys("50");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(30000);
		 
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
		Thread.sleep(8000);
	}

	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game and click on home button$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_golden_hot_slot_game_and_click_on_home_button() throws Throwable {
	List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[7]")).click();
		Thread.sleep(4000);
		
		
		String expected = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]")).getText();
		String actual = "Slot Games";
		Assert.assertEquals(expected, actual);
		
	}

	@Then("^System should take the player to Home page after clicking on home button$")
	public void system_should_take_the_player_to_Home_page_after_clicking_on_home_button() throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
