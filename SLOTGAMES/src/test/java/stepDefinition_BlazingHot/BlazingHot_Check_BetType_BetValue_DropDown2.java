package stepDefinition_BlazingHot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BlazingHot_Check_BetType_BetValue_DropDown2 {
	AppiumDriver<MobileElement> driver;

	public BlazingHot_Check_BetType_BetValue_DropDown2() throws InterruptedException {
		this.driver = BlazingHot_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Blazing Hot game, bet type as (\\d+)\\.(\\d+) and bet value as (\\d+)\\.(\\d+),(\\d+),(\\d+),(\\d+) & (\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Blazing_Hot_game_bet_type_as_and_bet_value_as(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		MobileElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();

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

	@When("^Open the Blazing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+) and check the bet value should be (\\d+)\\.(\\d+),(\\d+),(\\d+),(\\d+) & (\\d+)$")
	public void open_the_Blazing_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_and_check_the_bet_value_should_be(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		//Selecting the credit as 0.02 from the drop down
		driver.findElement(By.id("hud_btnCredit")).click();
		Thread.sleep(2000);
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("0.02")){
				be.click();
				Thread.sleep(3000);
				break;
			}	
		}
		String actual = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.02";
		Assert.assertEquals(actual, expected);
		
		//Selecting the bet amount as 0.8 from the drop down
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		for(MobileElement be1:balance)
		{
			
			if(be1.getText().equals("0.8")){
				be1.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected1 = "0.8";
		System.out.println("Available bet amounts under credit 0.02 are : " +"\n" +actual1);
		Assert.assertEquals(actual1, expected1);
		
		//Selecting bet amount as 2
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		for(MobileElement be2:balance)
		{
			
			if(be2.getText().equals("2")){
				be2.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual2 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected2 = "2";
		System.out.println("\n" +actual2);
		Assert.assertEquals(actual2, expected2);
		
		//Selecting bet amount as 4
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		for(MobileElement be3:balance)
		{
			
			if(be3.getText().equals("4")){
				be3.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual3 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected3 = "4";
		System.out.println("\n" +actual3);
		Assert.assertEquals(actual3, expected3);
		
		//Selecting bet amount as 8
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		for(MobileElement be4:balance)
		{
			
			if(be4.getText().equals("8")){
				be4.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual4 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected4 = "8";
		System.out.println("\n" +actual4);
		Assert.assertEquals(actual4, expected4);

		//Selecting bet amount as 16
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		for(MobileElement be5:balance)
		{
			
			if(be5.getText().equals("16")){
				be5.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual5 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected5 = "16";
		System.out.println("\n" +actual5);
		Assert.assertEquals(actual5, expected5);
		Thread.sleep(2000);
	}

	@Then("^Bet value should get changed to (\\d+)\\.(\\d+),(\\d+),(\\d+),(\\d+) & (\\d+) if the bet type selected as (\\d+)\\.(\\d+) from the drop down (\\d+) in Blazing Hot slot game$")
	public void bet_value_should_get_changed_to_if_the_bet_type_selected_as_from_the_drop_down_in_Blazing_Hot_slot_game(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
