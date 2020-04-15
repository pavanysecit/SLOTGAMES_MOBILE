package stepDefinition_40GlowingHot;

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

public class FourtyGlowingHot_Balance_Deduction_AccordingToBetType4_2 {
AppiumDriver<MobileElement> driver;
	
	public FourtyGlowingHot_Balance_Deduction_AccordingToBetType4_2() throws InterruptedException {
		this.driver = SlotGames_URL_Login.getDriver();
		
		}
	
	@Given("^Chrome browser, valid URL, valid login details, glowing hot slot game, bet type as (\\d+)\\.(\\d+), bet value as (\\d+), balance and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_glowing_hot_slot_game_bet_type_as_bet_value_as_balance_and_spin_button(int arg1, int arg2, int arg3) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		
		MobileElement trs = driver.findElement(By.id("transferInput"));
		trs.sendKeys("110.88");
		Thread.sleep(1000);
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
		Thread.sleep(4000);
	}

	@When("^Open the Glowing hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+) & bet value as (\\d+), click on spin button and check the balance$")
	public void open_the_Glowing_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_bet_value_as_click_on_spin_button_and_check_the_balance(int arg1, int arg2, int arg3) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		
		//Storing the balance before spin
		String prewin="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me.getId().equals("28")){
				 prewin = me.getText();
			System.out.println("The current Balance of Account Before Spin: " +me.getText());
			}
		}
		
		for(MobileElement me7:balance)
		{
			if(me7.getText().equals("1 Cr ="))
			{
				me7.click();
			Thread.sleep(1000);
			}
			if(me7.getText().equals("0.2"))
			 {
				 me7.click();
			 Thread.sleep(1000);
			 }
			 //System.out.println(me1.getId()+"  "+me1.getText());	 
		}
			 
		// Storing the bet value 16
		for(MobileElement be:balance)
		{
			if(be.getId().equals("33")){
				be.click();
				Thread.sleep(1000);
			}
			if(be.getText().equals("16")){
				be.click();
				Thread.sleep(1000);
			}
		}
		// Storing the bet value 16
		String betvalue="";
		for(MobileElement be:balance)
		{
			if(be.getId().equals("33")){
				 betvalue = be.getText();
				  
			System.out.println("The bet value is: " +be.getText());
			String expected = be.getText();
			String actual = "16";
			Assert.assertEquals(expected, actual);
			}
		}
		
		//Clicking on start button
		MobileElement start = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[5]/android.view.View[2]"));
		start.click();
		//MobileElement pqr= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[22]/android.view.View[1]"));
		
		//Storing the balance after spin
		String postspin="";
		for(MobileElement me2:balance){
			//System.out.println(me2.getId()+"  "+me2.getText());
			if(me2.getId().equals("24")){
				 postspin = me2.getText();
				  //this.pqr=me2;
			System.out.println("The current Balance of Account After Spin: " +me2.getText());
			}
		}	
		
		//Deducting bet value from the prewin and formating string to double
		double fValue = Double.parseDouble(prewin) - Double.parseDouble(betvalue);
		System.out.println("final balance is equal to: "+fValue);
		String dbi = String.format("%.2f", fValue);  
		System.out.println("Final Balance amount after deducting bet value 16 is: "+dbi);
		
		Assert.assertEquals(dbi,postspin);
	}

	@Then("^Balance should get deducted by (\\d+) as bet type is selected as (\\d+)\\.(\\d+) in glowing hot game$")
	public void balance_should_get_deducted_by_as_bet_type_is_selected_as_in_glowing_hot_game(int arg1, int arg2, int arg3) throws Throwable {
		Thread.sleep(3000);
	    driver.quit();
	}
}
