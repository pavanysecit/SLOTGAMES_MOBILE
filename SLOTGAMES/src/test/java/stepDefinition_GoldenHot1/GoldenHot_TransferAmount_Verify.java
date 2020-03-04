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

public class GoldenHot_TransferAmount_Verify {
AppiumDriver<MobileElement> driver;

	public GoldenHot_TransferAmount_Verify() {
		this.driver = SlotGames_URL_Login.getDriver();
	}
	@Given("^Chrome browser, valid URL, valid login details, balance, text field to transfer balance and Ok button$")
	public void chrome_browser_valid_URL_valid_login_details_balance_text_field_to_transfer_balance_and_Ok_button() throws Throwable {
	    Thread.sleep(1000);
	}

	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok butotn$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_Play_button_enter_the_valid_amount_to_transfer_and_click_on_Ok_butotn() throws Throwable {
		driver.findElement(By.className("mb")).click();
		Thread.sleep(3000);
		
		MobileElement trs = driver.findElement(By.id("transferInput"));
		trs.sendKeys("110");
		Thread.sleep(1000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		

		 //String parent1=driver.getWindowHandle();
		 //Set<String>s1=driver.getWindowHandles();

		 String parent = driver.getWindowHandle();
		 Set<String> wh = driver.getWindowHandles();
		 for(String mq:wh){
		 System.out.println(mq);
		 if(!parent.equals(mq)){
			 driver.switchTo().window(mq);
			 System.out.println("Window for slot game is"+" "+mq);
		 }
		 }
		 Set<String> contx = driver.getContextHandles();
		 String pk = driver.getContext();
		 System.out.println("The current context is"+" "+pk);
		 for(String cont:contx){
			 System.out.println(cont);
		 }
		driver.context("NATIVE_APP");
		Thread.sleep(40000);

		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");

		String prewin="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me.getId().equals("36")){
				 prewin = me.getText();
			System.out.println("The Slot Game Balance is : "+" "+me.getText());
			}
		} 
		
		String expected = prewin;
	    System.out.println("Balance is slot games: "+expected);
	    String actual = "110.00";
	    Assert.assertEquals(expected, actual);
	    Thread.sleep(2000);
	}

	@Then("^The exact amount entered in the transfer page should transfer to game and same amount should get displayed on the balance section$")
	public void the_exact_amount_entered_in_the_transfer_page_should_transfer_to_game_and_same_amount_should_get_displayed_on_the_balance_section() throws Throwable {
		driver.quit();
	}
}