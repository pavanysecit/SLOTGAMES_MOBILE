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

public class GoldenHot_Check_BetType_BetValue_DropDown3 {
AppiumDriver<MobileElement> driver;

	public GoldenHot_Check_BetType_BetValue_DropDown3() throws InterruptedException {
		this.driver = SlotGames_URL_Login.getDriver();
		driver.findElement(By.className("mb")).click();
		Thread.sleep(5000);
	}	
	
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as ONE from drop down and bet value as FIVE$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_bet_type_as_ONE_from_drop_down_and_bet_value_as_FIVE() throws Throwable {
		driver.findElement(By.id("transferInput")).sendKeys("40");
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
		Thread.sleep(8000);
	}

	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE from drop down and check the bet value should be FIVE$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_ONE_from_drop_down_and_check_the_bet_value_should_be_FIVE() throws Throwable {
		List<MobileElement> BetValue3 = driver.findElementsByClassName("android.view.View");
		
		//Select the bet type as 0.5 and check the bet value should be 0.1
		
		for(MobileElement me3:BetValue3)
		{
			if(me3.getText().equals("1 Cr ="))
			{
				me3.click();
			Thread.sleep(3000);
			//System.out.println(me1.getId()+"  "+me1.getText());
			}
			 if(me3.getText().equals("1"))
			 {
				 me3.click();
			 Thread.sleep(1000);
			 }

		}
		for(MobileElement me3:BetValue3)
		{
			//System.out.println(me1.getId()+"  "+me1.getText());
			if(me3.getId().equals("29"))
			{
			String actual1 = me3.getText();
			System.out.println("actual1:"+" "+me3.getText());
			Assert.assertTrue(actual1.contentEquals("1"));
			}
			
			if(me3.getId().equals("24"))
			{
				me3.click();
			}
			
		//Checking bet value should be 5, 10, 25, 50 and 100 if the denomination is selected as 1
		//Checking bet value drop down should have value 5 if the denomination is 1
			if(me3.getId().equals("42"))
			{
				String expected1 = me3.getText();
				System.out.println("expected1:"+" "+me3.getText());
				Assert.assertTrue(expected1.contentEquals("5"));	
			}
			
			//Checking bet value drop down should have value 10 if the denomination is 1		
			if(me3.getId().equals("45"))
			{
				String expected2 = me3.getText();
				System.out.println("expected2:"+" "+me3.getText());
				Assert.assertTrue(expected2.contentEquals("10"));	
			}
			
			//Checking bet value drop down should have value 25 if the denomination is 1		
			if(me3.getId().equals("48"))
			{
				String expected3 = me3.getText();
				System.out.println("expected3:"+" "+me3.getText());
				Assert.assertTrue(expected3.contentEquals("25"));	
			}
			
			//Checking bet value drop down should have value 50 if the denomination is 1		
			if(me3.getId().equals("51"))
			{
				String expected4 = me3.getText();
				System.out.println("expected4:"+" "+me3.getText());
				Assert.assertTrue(expected4.contentEquals("50"));	
			}
			
			//Checking bet value drop down should have value 100 if the denomination is 1		
			if(me3.getId().equals("54"))
			{
				String expected5 = me3.getText();
				System.out.println("expected5:"+" "+me3.getText());
				Assert.assertTrue(expected5.contentEquals("100"));	
			} 
		}
	}

	@Then("^Bet value should get changed to FIVE if the bet type selected as ONE from the drop down two in golden hot game$")
	public void bet_value_should_get_changed_to_FIVE_if_the_bet_type_selected_as_ONE_from_the_drop_down_two_in_golden_hot_game() throws Throwable {
		Thread.sleep(3000);
	    driver.quit();
	}
}