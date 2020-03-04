package stepDefinition_GoldenHot1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class GoldenHot_Balance_Credits_Calculations_Value1 {
AppiumDriver<MobileElement> driver;
	
	public GoldenHot_Balance_Credits_Calculations_Value1() throws InterruptedException {
		this.driver = SlotGames_URL_Login.getDriver();
		driver.findElement(By.className("mb")).click();
		Thread.sleep(5000);
		}
	
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game, balance, credits and denomination as (\\d+)\\.(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_balance_credits_and_denomination_as(int arg1, int arg2) throws Throwable {
		driver.findElement(By.className("mb")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("transferInput")).sendKeys("8");
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

	@SuppressWarnings("deprecation")
	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by (\\d+)\\.(\\d+) and check the balance$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_balance_multiply_credit_by_and_check_the_balance(int arg1, int arg2) throws Throwable {
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		
		//Storing the balance and converting balance in credits
		String prewin="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me.getId().equals("36")){
				 prewin = me.getText();
			System.out.println("The current Balance of Account Before Spin: " +me.getText());
			Thread.sleep(2000);
			me.click();
			}
		}
		
		
		//Storing the balance in credits
		String credit="";
		for(MobileElement cr:balance){
			//System.out.println(cr.getId()+"  "+cr.getText());
			if(cr.getId().equals("36")){
				 credit = cr.getText();
			System.out.println("Balance converted to credit & balance is: " +cr.getText());
			Thread.sleep(2000);
			}
		}
		
		//Storing the denomination as 0.03
		String betvalue="";
		for(MobileElement be:balance)
		{
			//System.out.println(be.getId()+"  "+be.getText());
			if(be.getId().equals("29")){
				 betvalue = be.getText();
				  
			System.out.println("The bet value is: " +be.getText());
			}
		}
		
		String expected = betvalue;
		String actual = "0.03";
		Assert.assertEquals(expected, actual);
		
		//Multiplying the credit by bet value 0.03 and comparing the balance
		double conValue = Double.parseDouble(credit) * Double.parseDouble(betvalue);
		//System.out.println("After deducting the bet value after spin: " +secSpin3);
		DecimalFormat df = new DecimalFormat("#");
	    df.setRoundingMode(RoundingMode.DOWN);
	    Double dbi =Double.parseDouble(df.format(conValue));
	    String pq="";
	    String paq=pq+dbi;
		String bal="";
		String yui = paq.concat("0");
		System.out.println("After credits calculation in amount is: " +yui);
		for(MobileElement bl:balance){
			if(bl.getId().equals("36")){
				bal = bl.getText();
			Thread.sleep(1000);
			bl.click();
			}
		}
		
		Assert.assertEquals(yui,prewin);
	}

	@Then("^Balance amound should be same as denomination (\\d+)\\.(\\d+) multiplies by credit in golden hot$")
	public void balance_amound_should_be_same_as_denomination_multiplies_by_credit_in_golden_hot(int arg1, int arg2) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
