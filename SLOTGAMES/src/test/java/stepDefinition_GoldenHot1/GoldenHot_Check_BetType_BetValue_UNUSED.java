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



public class GoldenHot_Check_BetType_BetValue_UNUSED {
AppiumDriver<MobileElement> driver;

	public GoldenHot_Check_BetType_BetValue_UNUSED() {
			this.driver = SlotGames_URL_Login.getDriver();
	}	
	
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game, bet type and bet value$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_bet_type_and_bet_value() throws Throwable {
		Thread.sleep(1000);
	}

	@SuppressWarnings("deprecation")
	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type and check the bet value$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_and_check_the_bet_value() throws Throwable {
		driver.findElement(By.className("mb")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("transferInput")).sendKeys("50");
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
		
		List<MobileElement> BetValue = driver.findElementsByClassName("android.view.View");
		//Checking the bet text and thier value
		for(MobileElement me:BetValue)
		{
			//System.out.println(me.getId()+"  "+me.getText());
			if(me.getId().equals("29"))
			{
			String actual = me.getText();
			System.out.println("actual"+" "+me.getText());
			Assert.assertTrue(actual.contentEquals("0.03"));
			}
			if(me.getId().equals("24"))
			{
				String expected = me.getText();
				System.out.println("expected"+" "+me.getText());
				Assert.assertTrue(expected.contentEquals("0.15"));	
			}
		}
		/*
	List<MobileElement> BetValue1 = driver.findElementsByClassName("android.view.View");
		//Checking the bet text and thier value
		for(MobileElement me1:BetValue1)
		{
			if(me1.getId().equals("186"))
			{
			me1.click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[24]/android.view.View[2]/android.view.View[1]")).click();
			//Thread.sleep(2000);
			System.out.println(me1.getId()+"  "+me1.getText());
				if(me1.getId().equals("29"))
				{
				String actual1 = me1.getText();
				System.out.println("actual1:"+" "+me1.getText());
				Assert.assertTrue(actual1.contentEquals("0.05"));
				}
				if(me1.getId().equals("24"))
				{
					String expected1 = me1.getText();
					System.out.println("expected1:"+" "+me1.getText());
					Assert.assertTrue(expected1.contentEquals("0.25"));	
				}
			}
		}
		
		
		List<MobileElement> BetValue2 = driver.findElementsByClassName("android.view.View");
		//Checking the bet text and thier value
		for(MobileElement me2:BetValue2)
		{
			if(me2.getText().equals("1 Cr =")){
				me2.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[24]/android.view.View[3]/android.view.View[2]")).click();
			Thread.sleep(2000);
			//System.out.println(me.getId()+"  "+me.getText());
				if(me2.getId().equals("29"))
				{
				String actual2 = me2.getText();
				System.out.println("actual2:"+" "+me2.getText());
				Assert.assertTrue(actual2.contentEquals("0.1"));
				}
				if(me2.getId().equals("24"))
				{
					String expected2 = me2.getText();
					System.out.println("expected2:"+" "+me2.getText());
					Assert.assertTrue(expected2.contentEquals("0.5"));	
				}
			}
		}
		
		
		List<MobileElement> BetValue3 = driver.findElementsByClassName("android.view.View");
		//Checking the bet text and thier value
		for(MobileElement me3:BetValue3)
		{
			if(me3.getText().equals("1 Cr ="))
			{
				me3.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[24]/android.view.View[4]/android.view.View[1]")).click();
			Thread.sleep(2000);
			//System.out.println(me.getId()+"  "+me.getText());
				if(me3.getId().equals("29"))
				{
				String actual3 = me3.getText();
				System.out.println("actual3:"+" "+me3.getText());
				Assert.assertTrue(actual3.contentEquals("1"));
				}
				if(me3.getId().equals("24"))
				{
					String expected3 = me3.getText();
					System.out.println("expected3:"+" "+me3.getText());
					Assert.assertTrue(expected3.contentEquals("5"));	
				}
			}
			*/
		
	}

		/*
		if(me.getText().equals("1 Cr")){
		String bet = me.getText();
		System.out.println("Bet Value : "+bet);	
		String actual = "0.1";
		Assert.assertEquals(bet, actual);
		}
		if(me.getText().equals("0.5")){
		String value = me.getText();
		System.out.println("Value Amount : "+value);
		String actual = "0.6";
		Assert.assertEquals(value, actual);
		}
		me.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[24]/android.view.View[1]/android.view.View[2]")).click();
		Thread.sleep(2000);
		String expected = bet.getText();
		String actual = value.getText();
		Assert.assertEquals(bet, actual);
		Thread.sleep(3000);
*/


	@Then("^Bet value should get changed based on the bet type selected from the drop down in golden hot game$")
	public void bet_value_should_get_changed_based_on_the_bet_type_selected_from_the_drop_down_in_golden_hot_game() throws Throwable {
	    driver.quit();
	}
}
