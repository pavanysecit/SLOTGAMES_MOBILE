package stepDefinition_40GlowingHot;

import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FourtyGlowingHot_Check_UserInstruction_Messages {
AppiumDriver<MobileElement> driver;
	
	public FourtyGlowingHot_Check_UserInstruction_Messages() throws InterruptedException {
		this.driver = SlotGames_URL_Login.getDriver();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[1]/div[1]/div/span")).click();
		Thread.sleep(2000);
		}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) glowing hot slot game, balance, spin button and user instruction message$")
	public void chrome_browser_valid_URL_valid_login_details_glowing_hot_slot_game_balance_spin_button_and_user_instruction_message(int arg1) throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[1]/div[1]/div/span")).click();
		Thread.sleep(5000);
		
		MobileElement trs = driver.findElement(By.id("transferInput"));
		trs.sendKeys("6");
		Thread.sleep(1000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(20000);
		 
		 String parent1=driver.getWindowHandle();
		 Set<String>s1=driver.getWindowHandles();

		 System.out.println("Window for slot game is"+" "+s1);
		 
		 Set<String> contx = driver.getContextHandles();
		 String pk = driver.getContext();
		 System.out.println("The current contesx is"+" "+pk);
		 for(String cont:contx){
			 System.out.println(cont);
		 }
		driver.context("NATIVE_APP");
		Thread.sleep(4000);
	}

	@When("^Open the (\\d+) Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages$")
	public void open_the_Glowing_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_and_check_the_user_instruction_messages(int arg1) throws Throwable {
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		
		String premsg="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me.getId().equals("30")){
				premsg = me.getText();
				 System.out.println("Message before spin: " +me.getText());
			}
		}
		
		String expected = premsg;
		String actual = "Please Place Your Bet";
		Assert.assertEquals(expected, actual);
				
		MobileElement start = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[5]/android.view.View[2]"));
		start.click();
		
		String postmsg="";
		for(MobileElement me1:balance){
			//System.out.println(me1.getId()+"  "+me1.getText());
			if(me1.getId().equals("26")){
				postmsg = me1.getText();
				 System.out.println("Message after spin: " +me1.getText());
			}
		}
		
		String expected1 = postmsg;
		String actual1 = "GOOD LUCK!";
		Assert.assertEquals(expected1, actual1);
	}

	@Then("^User instruction message 'Please place your bet' should be displayed before spin button is clicked$")
	public void user_instruction_message_Please_place_your_bet_should_be_displayed_before_spin_button_is_clicked() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^User instruction message 'Good Luck' should be displayed after spin button is clicked$")
	public void user_instruction_message_Good_Luck_should_be_displayed_after_spin_button_is_clicked() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
