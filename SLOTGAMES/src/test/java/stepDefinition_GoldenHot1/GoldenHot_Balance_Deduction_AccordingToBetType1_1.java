package stepDefinition_GoldenHot1;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import junit.framework.Assert;

public class GoldenHot_Balance_Deduction_AccordingToBetType1_1 {
AppiumDriver<MobileElement> driver;
//private MobileElement pqr;

	public GoldenHot_Balance_Deduction_AccordingToBetType1_1() throws InterruptedException {
		this.driver = SlotGames_URL_Login.getDriver();
	}	
	
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as (\\d+)\\.(\\d+), bet value as (\\d+)\\.(\\d+), balance and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_bet_type_as_bet_value_as_balance_and_spin_button(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[6]/div[1]/div")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("transferInput")).sendKeys("20");
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

	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+), click on spin button and check the balance$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_click_on_spin_button_and_check_the_balance(int arg1, int arg2) throws Throwable {
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
		
		// Storing the bet value 0.15
		String betvalue="";
		for(MobileElement be:balance)
		{
			if(be.getId().equals("25")){
				 betvalue = be.getText();
				  
			System.out.println("The bet value is: " +be.getText());
			}
		}
		
		//Clicking on start button
		MobileElement start = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View[2]"));
		start.click();
		//MobileElement pqr= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[22]/android.view.View[1]"));
		
		//Storing the balance after spin
		String postspin="";
		for(MobileElement me2:balance){
			//System.out.println(me2.getId()+"  "+me2.getText());
			if(me2.getId().equals("33")){
				 postspin = me2.getText();
				  //this.pqr=me2;
			System.out.println("The current Balance of Account After Spin: " +me2.getText());
			}
		}	
		
		//Deducting bet value from the prewin and formating string to double
		double fValue = Double.parseDouble(prewin) - Double.parseDouble(betvalue);
		System.out.println("final balance is equal to: "+fValue);
		DecimalFormat df = new DecimalFormat("#.00");
	    //df.setRoundingMode(RoundingMode.DOWN);
	    Double dbi =Double.parseDouble(df.format(fValue));
	    String pq="";
	    String paq=pq+dbi;
	    //System.out.println("Value: "+paq);
	    //System.out.println(paq.equals(postspin));
		Assert.assertEquals(paq,postspin);
	}

	@Then("^Balance should get deducted by (\\d+)\\.(\\d+) as bet type is selected as (\\d+)\\.(\\d+) in golden hot game$")
	public void balance_should_get_deducted_by_as_bet_type_is_selected_as_in_golden_hot_game(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
