package stepDefinition_GoldenHot1;

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

public class GoldenHot_Check_BetType_BetValue_DropDown1 {
AppiumDriver<MobileElement> driver;

	public GoldenHot_Check_BetType_BetValue_DropDown1() throws InterruptedException {
		this.driver = SlotGames_URL_Login.getDriver();
		
	}	
	
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as (\\d+)\\.(\\d+) and bet value as (\\d+)\\.(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_bet_type_as_and_bet_value_as(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
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

	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+) and check the bet value should be (\\d+)\\.(\\d+)$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_and_check_the_bet_value_should_be(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
		List<MobileElement> BetValue1 = driver.findElementsByClassName("android.view.View");
		
		//Select the bet type as 0.05 and check the bet values
		
		for(MobileElement me1:BetValue1)
		{
			if(me1.getText().equals("1 Cr ="))
			{
			me1.click();
			Thread.sleep(3000);
			//System.out.println(me1.getId()+"  "+me1.getText());
			}
			 if(me1.getText().equals("0.05"))
			 {
				 me1.click();
			 Thread.sleep(1000);
			 }

		}
		for(MobileElement me1:BetValue1)
		{
			//System.out.println(me1.getId()+"  "+me1.getText());
			if(me1.getId().equals("29"))
			{
			String actual1 = me1.getText();
			System.out.println("actual1:"+" "+me1.getText());
			Assert.assertTrue(actual1.contentEquals("0.05"));
			}
			
			if(me1.getId().equals("24"))
			{
				me1.click();
			}
			
				
		//Checking bet value should be 0.25, 0.5, 1.25, 2.5 and 5 if the denomination is selected as 0.05
		//Checking bet value drop down should have value 0.25 if the denomination is 0.05		
			if(me1.getId().equals("42"))
			{
				String expected1 = me1.getText();
				System.out.println("expected1:"+" "+me1.getText());
				Assert.assertTrue(expected1.contentEquals("0.25"));	
			}
			
			//Checking bet value drop down should have value 0.5 if the denomination is 0.05		
			if(me1.getId().equals("45"))
			{
				String expected2 = me1.getText();
				System.out.println("expected2:"+" "+me1.getText());
				Assert.assertTrue(expected2.contentEquals("0.5"));	
			}
			
			//Checking bet value drop down should have value 1.25 if the denomination is 0.05		
			if(me1.getId().equals("48"))
			{
				String expected3 = me1.getText();
				System.out.println("expected3:"+" "+me1.getText());
				Assert.assertTrue(expected3.contentEquals("1.25"));	
			}
			
			//Checking bet value drop down should have value 2.5 if the denomination is 0.05		
			if(me1.getId().equals("51"))
			{
				String expected4 = me1.getText();
				System.out.println("expected4:"+" "+me1.getText());
				Assert.assertTrue(expected4.contentEquals("2.5"));	
			}
			
			//Checking bet value drop down should have value 5 if the denomination is 0.05		
			if(me1.getId().equals("54"))
			{
				String expected5 = me1.getText();
				System.out.println("expected5:"+" "+me1.getText());
				Assert.assertTrue(expected5.contentEquals("5"));	
			}
		}
	}	
	

	@Then("^Bet value should get changed to (\\d+)\\.(\\d+) if the bet type selected as (\\d+)\\.(\\d+) from the drop down (\\d+) in golden hot game$")
	public void bet_value_should_get_changed_to_if_the_bet_type_selected_as_from_the_drop_down_in_golden_hot_game(int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
	    Thread.sleep(3000);
	    driver.quit();
	}
}
