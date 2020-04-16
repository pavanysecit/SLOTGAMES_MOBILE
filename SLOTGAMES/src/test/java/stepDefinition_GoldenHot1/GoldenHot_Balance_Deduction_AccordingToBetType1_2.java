package stepDefinition_GoldenHot1;


import java.text.DecimalFormat;
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


public class GoldenHot_Balance_Deduction_AccordingToBetType1_2 {
//private static final String DecimalUtils = null;
AppiumDriver<MobileElement> driver;
//private MobileElement pqr;

	public GoldenHot_Balance_Deduction_AccordingToBetType1_2() throws InterruptedException {
		this.driver = SlotGames_URL_Login.getDriver();
	}	
	
	@Given("^Chrome browser, valid URL, valid login details, golden hot slot game, bet type as (\\d+)\\.(\\d+), bet value as (\\d+)\\.(\\d+), balance and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_golden_hot_slot_game_bet_type_as_bet_value_as_balance_and_spin_button(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		
		driver.findElement(By.id("transferInput")).sendKeys("20.22");
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

	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+), select the bet value as (\\d+)\\.(\\d+), click on spin button and check the balance$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_select_the_bet_value_as_click_on_spin_button_and_check_the_balance(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		
		//Storing the balance before spin
		String prewin="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me.getId().equals("37")){
				 prewin = me.getText();
			System.out.println("The current Balance of Account Before Spin: " +me.getText());
			}
		}
		
				
		// Storing the bet value 0.3
		String betvalue="";
		for(MobileElement be:balance)
		{
			if(be.getText().equals("Bet")){
				be.click();
				Thread.sleep(1000);
			}
			if(be.getText().equals("0.3")){
				be.click();
				Thread.sleep(1000);
			}
		}
		for(MobileElement be1:balance)
		{
			if(be1.getId().equals("25")){
				betvalue = be1.getText();
				System.out.println("The bet value is: " +be1.getText());
				String expected = be1.getText();
				Assert.assertTrue(expected.contentEquals("0.3"));	
				System.out.println("expected bet value should be: "+be1.getText());
				}
		}	
		//Clicking on start button
		MobileElement start = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View[2]"));
		start.click();
		//MobileElement pqr= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[22]/android.view.View[1]"));
		
		//Storing the balance after spin
		String postspin="";
		for(MobileElement me2:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me2.getId().equals("33")){
				 postspin = me2.getText();
				  //this.pqr=me2;
			System.out.println("The current Balance of Account After Spin: " +me2.getText());
			}
		}	
		
		//Deducting bet value from the prewin and formating string to double
		double fValue = Double.parseDouble(prewin) - Double.parseDouble(betvalue);
		DecimalFormat df = new DecimalFormat("##.##");
		//df.setRoundingMode(RoundingMode.CEILING);
	    Double dbi =Double.parseDouble(df.format(fValue));
	    String pq="";
	    String paq=pq+dbi;
	    System.out.println("final balance is equal to1: "+paq);
		Assert.assertEquals(paq,postspin);
	}

	@Then("^Balance should get deducted by (\\d+)\\.(\\d+) as bet type is selected as (\\d+)\\.(\\d+) and bet value as (\\d+)\\.(\\d+) in golden hot game$")
	public void balance_should_get_deducted_by_as_bet_type_is_selected_as_and_bet_value_as_in_golden_hot_game(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
