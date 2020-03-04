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

public class FourtyGlowingHot_Balance_Credits_Calculations_Value2 {
AppiumDriver<MobileElement> driver;
	
	public FourtyGlowingHot_Balance_Credits_Calculations_Value2() throws InterruptedException {
		this.driver = SlotGames_URL_Login.getDriver();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[1]/div[1]/div/span")).click();
		Thread.sleep(2000);
		}
	
	@Given("^Chrome browser, valid URL, valid login details, glowing hot slot game, balance, credits, denomination drop down and denomination as (\\d+)\\.(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_glowing_hot_slot_game_balance_credits_denomination_drop_down_and_denomination_as(int arg1, int arg2) throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[1]/div[1]/div/span")).click();
		Thread.sleep(5000);
		
		MobileElement trs = driver.findElement(By.id("transferInput"));
		trs.sendKeys("14");
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

	@When("^Open the Glowing hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by (\\d+)\\.(\\d+) and check the balance$")
	public void open_the_Glowing_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_balance_select_the_denomination_from_drop_down_multiply_credit_by_and_check_the_balance(int arg1, int arg2) throws Throwable {
	List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		
		//Storing the balance and converting balance in credits
		String prewin="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me.getId().equals("28")){
				 prewin = me.getText();
			System.out.println("The current Balance of Account: " +me.getText());
			Thread.sleep(2000);
			me.click();
			}
		}
		
		for(MobileElement me7:balance)
		{
			if(me7.getId().equals("38"))
			{
				me7.click();
			Thread.sleep(2000);
			}
			 if(me7.getId().equals("44"))
			 {
				 me7.click();
			 Thread.sleep(1000);
			 }
			 //System.out.println(me7.getId()+"  "+me7.getText());	 
		}
		
		
		//Storing the balance in credits
		String credit="";
		for(MobileElement cr:balance){
			//System.out.println(cr.getId()+"  "+cr.getText());
			if(cr.getId().equals("28")){
				 credit = cr.getText();
			System.out.println("Balance converted to credit & current balance in credits is: " +cr.getText());
			Thread.sleep(2000);
			}
		}
		
		//Storing the denomination as 0.01
		String betvalue="";
		for(MobileElement be:balance)
		{
			//System.out.println(be.getId()+"  "+be.getText());
			if(be.getId().equals("38")){
				 betvalue = be.getText();
				  
			System.out.println("The bet value is: " +be.getText());
			String expected = betvalue;
			String actual = "0.02";
			Assert.assertEquals(expected, actual);
			}
		}
		
		//Multiplying the credit by bet value 0.03 and comparing the balance
		double conValue = Double.parseDouble(credit) * Double.parseDouble(betvalue);
		//System.out.println("After deducting the bet value after spin: " +secSpin3);
		String dbi = String.format("%.2f", conValue);  
		System.out.println("Final balance after converting credits into SRD is: "+dbi);
		String bal = "";
		for(MobileElement bl:balance){
			if(bl.getId().equals("28")){
				bal = bl.getText();
			Thread.sleep(1000);
			bl.click();
			}
		}
		
		Assert.assertEquals(dbi,prewin);
	}
	
	@Then("^Balance amound should be same as denomination (\\d+)\\.(\\d+) multiplies by credit in glowing hot game$")
	public void balance_amound_should_be_same_as_denomination_multiplies_by_credit_in_glowing_hot_game(int arg1, int arg2) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
