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

public class FourtyGlowingHot_Check_BetType_BetValue_DropDown2 {
AppiumDriver<MobileElement> driver;
	
	public FourtyGlowingHot_Check_BetType_BetValue_DropDown2() throws InterruptedException {
		this.driver = SlotGames_URL_Login.getDriver();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[1]/div[1]/div/span")).click();
		Thread.sleep(2000);
		}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) glowing hot slot game, bet type as (\\d+)\\.(\\d+) from down (\\d+) and bet value as (\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+), (\\d+), (\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_glowing_hot_slot_game_bet_type_as_from_down_and_bet_value_as(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[1]/div[1]/div/span")).click();
		Thread.sleep(5000);
		
		MobileElement trs = driver.findElement(By.id("transferInput"));
		trs.sendKeys("110");
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

	@When("^Open the (\\d+) glowing hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+) from down  and check the bet value should be (\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+), (\\d+), (\\d+)$")
	public void open_the_glowing_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_from_down_and_check_the_bet_value_should_be(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) throws Throwable {
		List<MobileElement> BetValue = driver.findElementsByClassName("android.view.View");
		//Checking the bet text and thier value
		for(MobileElement me1:BetValue)
		{
			if(me1.getText().equals("1 Cr ="))
			{
			me1.click();
			Thread.sleep(3000);
			//System.out.println(me1.getId()+"  "+me1.getText());
			}
			 if(me1.getText().equals("0.03"))
			 {
				 me1.click();
			 Thread.sleep(1000);
			 }

		}
		for(MobileElement me1:BetValue)
		{
			//System.out.println(me1.getId()+"  "+me1.getText());
			if(me1.getId().equals("38"))
			{
			String actual1 = me1.getText();
			System.out.println("actual1:"+" "+me1.getText());
			Assert.assertTrue(actual1.contentEquals("0.03"));
			}
			
			if(me1.getId().equals("24"))
			{
				me1.click();
			}

		//Checking bet denomination should be 1.2, 2.4, 6, 12 and 24 if the bet value is selected as 0.03
		//Checking bet denomination drop down should have value 1.2 if the bet value is 0.03

		if(me1.getId().equals("33"))
			{
				String expected1 = me1.getText();
				String actual1 = "1.2";
				Assert.assertEquals(expected1, actual1);
				System.out.println("expected1"+" "+me1.getText());
				me1.click();
			}
		
		//Checking denomination drop down should have value 2.4 if the bet value is 0.03
		if(me1.getId().equals("45"))
			{
			//System.out.println(me1.getId()+"  "+me1.getText());
				String expected2 = me1.getText();
				String actual2 = "2.4";
				Assert.assertEquals(expected2, actual2);
				System.out.println("expected2"+" "+me1.getText());
			}
		
			//Checking denomination drop down should have value 6 if the bet value is 0.03

		if(me1.getId().equals("48"))
			{
			//System.out.println(me3.getId()+"  "+me3.getText());
				String expected3 = me1.getText();
				String actual3 = "6";
				Assert.assertEquals(expected3, actual3);	
				System.out.println("expected3"+" "+me1.getText());
			}
		
			//Checking denomination drop down should have value 12 if the bet value is 0.03

		if(me1.getId().equals("51"))
			{
			//System.out.println(me4.getId()+"  "+me4.getText());
				String expected4 = me1.getText();
				String actual4 = "12";
				Assert.assertEquals(expected4, actual4);	
				System.out.println("expected4"+" "+me1.getText());
			}
		
			//Checking denomination drop down should have value 24 if the bet value is 0.03
	
		if(me1.getId().equals("54"))
			{
			//System.out.println(me5.getId()+"  "+me5.getText());
				String expected5 = me1.getText();
				String actual5 = "24";
				Assert.assertEquals(expected5, actual5);	
				System.out.println("expected5"+" "+me1.getText());
	
			}
		}
	}

	@Then("^Bet value should get changed to (\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+), (\\d+), (\\d+) if the bet type selected as (\\d+)\\.(\\d+) from the drop down two in (\\d+) glowing hot slot game$")
	public void bet_value_should_get_changed_to_if_the_bet_type_selected_as_from_the_drop_down_two_in_glowing_hot_slot_game(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) throws Throwable {
		Thread.sleep(3000);
	    driver.quit();
	}
}
