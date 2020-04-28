package stepDefinition_LadyFortune;

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

public class LadyFortune_Balance_Credits_Calculations_Value2 {
	AppiumDriver<MobileElement> driver;

	public LadyFortune_Balance_Credits_Calculations_Value2() throws InterruptedException {
		this.driver = LadyFortune_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Lady Fortune slot game, balance, credits, denomination drop down and denomination as (\\d+)\\.(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Lady_Fortune_slot_game_balance_credits_denomination_drop_down_and_denomination_as(int arg1, int arg2) throws Throwable {
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

	@When("^Open the Lady Fortune slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by (\\d+)\\.(\\d+) and check the balance$")
	public void open_the_Lady_Fortune_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_balance_select_the_denomination_from_drop_down_multiply_credit_by_and_check_the_balance(int arg1, int arg2) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));      
		//Storing the value before converting the balance into credits
		String preConvert = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Current balance of the account Before Converting into credits: " +preConvert);
		
		//Selecting the credit as 0.02 from the drop down and bet amount
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		driver.findElement(By.id("hud_btnCredit")).click();
		Thread.sleep(2000);
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("0.05")){
				be.click();
				Thread.sleep(3000);
				break;
			}	
		}
		String actual = driver.findElement(By.id("hud_txtCreditValue")).getText();
		String creditValue = actual;
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.05";
		Assert.assertEquals(actual, expected);
		Thread.sleep(1000);
		
		String betValue = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +betValue);
		Thread.sleep(2000);
		
		//Clicking on balance to convert balance into credits
		driver.findElement(By.id("hud_Hud_txtBalance1")).click();
		Thread.sleep(2000);
		
		//Displaying the balance in credits
		String postConvert = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance of the account after Converting into credits: " +postConvert);
		Thread.sleep(2000);
		
		//Multiplying the credit by bet value 0.05 and comparing the balance
		double conValue = Double.parseDouble(postConvert) * Double.parseDouble(creditValue);
		//System.out.println("After deducting the bet value after spin: " +secSpin3);
		String dbi = String.format("%.2f", conValue);  
		System.out.println("Final balance after converting credits into currency is: "+dbi);
		
		Assert.assertEquals(dbi,preConvert);
	}

	@Then("^Balance amound should be same as denomination (\\d+)\\.(\\d+) multiplies by credit in Lady Fortune game$")
	public void balance_amound_should_be_same_as_denomination_multiplies_by_credit_in_Lady_Fortune_game(int arg1, int arg2) throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
