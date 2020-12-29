package stepDefinition_GreatEgypt;

import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GreatEgypt_Balance_Deduction_AccordingTo_DecimalValue {
	AppiumDriver<MobileElement> driver;

	
	@Given("^Chrome browser, valid URL, valid login details, Great Egypt slot game, bet type as (\\d+)\\.(\\d+), mimimum bet value, balance in decimal value and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Great_Egypt_slot_game_bet_type_as_mimimum_bet_value_balance_in_decimal_value_and_spin_button(int arg1, int arg2) throws Throwable {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "ASUS X00TD");
		cap.setCapability("udid", "JAAAGF10Z743V8H");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("browserName", "Chrome");
		cap.setCapability("ignoreUnimportantViews", true);
		
		URL url=new URL("http://10.10.13.84:4724/wd/hub");
		
		driver=new AndroidDriver<MobileElement>(url,cap);
		
		System.out.println("Appium started sucessfully");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://demo.ysecit.in:82/SlotGames/slotsgame");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[3]/div[1]/div")).click();
		Thread.sleep(2000);
				 
		driver.findElement(By.name("email")).sendKeys("test6692");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("/html/body/div[2]/header/section/div[10]/div/div[2]/form/div[2]/input")).sendKeys("mans@123");
		Thread.sleep(2000);
		
		MobileElement sub = driver.findElement(By.xpath("/html/body/div[2]/header/section/div[10]/div/div[2]/form/button"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement  login_button=  driver.findElement(By.xpath("/html/body/div[2]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[3]/div[1]/div"));
        wait.until(ExpectedConditions.elementToBeClickable(login_button));
        login_button.click();
        
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		MobileElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("555.55");
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
		Thread.sleep(2000);
	}

	@When("^Open the Great Egypt slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+), select the bet value as (\\d+)\\.(\\d+), click on spin button and check the balance in decimal$")
	public void open_the_Great_Egypt_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_select_the_bet_value_as_click_on_spin_button_and_check_the_balance_in_decimal(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		//Storing the value before spin
		String preSpin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String str = preSpin.replaceAll(",", "");
		System.out.println("Current balance of the account Before spin: " +str);
		
		//Selecting the credit as 0.01 from the drop down
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_CreditPopup10.01")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.id("hud_txtCredit")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.01";
		Assert.assertEquals(actual, expected);
		
		//Selecting the bet amount as 0.4 from the drop down
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup20.4")).click();
		Thread.sleep(2000);
		
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected1 = "0.4";
		String betValue =actual1;
		System.out.println("Selected bet value is : " +actual1);
		Assert.assertEquals(actual1, expected1);
			
		//Clicking on Spin button
		driver.findElement(By.id("hud_btnSpin")).click();
		Thread.sleep(5000);
		
		//Storing the value after spin
		String postSpin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String str1 = postSpin.replaceAll(",", "");
		System.out.println("Current balance of the account After spin: " +str1);
		
		//Deducting bet value from the preSpin and formating string to double
		double fValue = Double.parseDouble(str) - Double.parseDouble(actual1);
		String dbi = String.format("%.2f", fValue);  
		System.out.println("Final balance after deducting bet amount from the balance : "+dbi);
		
		Assert.assertEquals(dbi,str1);

		
		//Storing the value before spin
		MobileElement preSpin11 = driver.findElement(By.id("hud_Hud_txtBalance1"));
		preSpin11.click();
		String prespin11 =preSpin11.getText();
		String str11 = prespin11.replaceAll(",", "");
        System.out.println(str11);
		System.out.println("Current balance of the account in credits before spin: " +prespin11);
		System.out.println("Balance in credits before adding win amount is: "+"  "+str11);
					
		//Clicking on Spin button
		driver.findElement(By.id("hud_btnSpin")).click();
		Thread.sleep(3000);

		//Storing the value after spin
		String postSpin11 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Current balance of the account After spin: " +postSpin11);
		String str21 = postSpin11.replaceAll(",", "");
        System.out.println(str21);
        String str23 = ".00";
        String pt = str21 + str23;
        System.out.println("Balance before adding win amount is: "+"  "+pt);

        String betValue1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		//Deducting bet value from the preSpin and formating string to double
		double fValue1 = Double.parseDouble(str11) - Double.parseDouble(betValue1);
		String dbi1 = String.format("%.2f", fValue1);  
		System.out.println("Final balance after deducting bet amount from the balance : "+dbi1);
		Assert.assertEquals(dbi1,pt);
	}

	@Then("^Balance should get deducted by decimal value, as bet type is selected as (\\d+)\\.(\\d+) and bet value as (\\d+)\\.(\\d+) in Great Egypt game$")
	public void balance_should_get_deducted_by_decimal_value_as_bet_type_is_selected_as_and_bet_value_as_in_Great_Egypt_game(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		 Thread.sleep(1000);
	}

	@Then("^After deducting balance, switch to credit mode and spin and check balance is deducting according to credit value in Great Egypt game$")
	public void after_deducting_balance_switch_to_credit_mode_and_spin_and_check_balance_is_deducting_according_to_credit_value_in_Great_Egypt_game() throws Throwable {
	   Thread.sleep(1000);
	   driver.quit();
	}
}