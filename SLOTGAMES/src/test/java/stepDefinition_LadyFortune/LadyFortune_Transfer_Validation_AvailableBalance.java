package stepDefinition_LadyFortune;

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
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;

public class LadyFortune_Transfer_Validation_AvailableBalance {
	AppiumDriver<MobileElement> driver;

	public LadyFortune_Transfer_Validation_AvailableBalance() throws InterruptedException {
		this.driver = LadyFortune_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Lady Fortune game, balance greater than available balance, text field to transfer balance, Ok button and validation message$")
	public void chrome_browser_valid_URL_valid_login_details_Lady_Fortune_game_balance_greater_than_available_balance_text_field_to_transfer_balance_Ok_button_and_validation_message() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		
		//Getting available balance and splitting into numbers n characters
		MobileElement TargetElement =driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/div[7]/div/div[1]/label[1]"));
		String getValue1 = TargetElement.getText();
		System.out.println("Available Balance in Account:" +getValue1);
		String[] br = getValue1.split("\\W");
		for(int i=0;i<br.length;i++){
		System.out.println("The value of char is"+" "+br[i]);
		}
		String unique="";
		for(int i=0;i<br.length;i++){
        if(i==0)
		unique=unique+br[i];
		System.out.println(unique+"unique");

		}
		System.out.println("The unique value is"+" "+unique);
		System.out.println("length"+br.length);
		double value1 = Integer.parseInt(unique);
		
		//Passing 100 to the balance field and storing in getvalue2 variable
		MobileElement transfer = driver.findElement(By.id("transferInput"));
		transfer.sendKeys("100");
		Thread.sleep(2000);
		TargetElement.click();
		String getValue2 = transfer.getAttribute("value");
		System.out.println("Balance to Transfer:" +getValue2);

		double value2 = Integer.parseInt(getValue2);
		
		//Adding main balance and getValue2(100 SRD)
        double total = value1 + value2;
        System.out.println("Total:" +total);
        String pk="";
        String totalf = pk+total;
        
        MobileElement fbal = driver.findElement(By.id("transferInput"));
        fbal.clear();
        fbal.sendKeys(totalf);
        System.out.println("Final Balance is:" +totalf);
        Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(2000);

		//As there is developer bug, closing the blank window manually using keyboard actions
		//driver.navigate().back();
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
	}

	@When("^Open the Lady Fortune slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok butotn$")
	public void open_the_Lady_Fortune_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_enter_the_amount_greater_than_available_balance_and_click_on_Ok_butotn() throws Throwable {
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		for(String windowHandle  : handles)
		{
		    if(!windowHandle.equals(parentWindow))
		   {
		     driver.switchTo().window(windowHandle);
				String expected = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ui-view/section/div[7]/div/span")).getText();
			    String actual = "Transfer Amount should be smaller than  balance";
			    Assert.assertEquals(expected, actual);
			    Thread.sleep(2000);
		   }
		driver.quit();
		}
	}

	@Then("^Player should be blocked from loading the Lady Fortune game when the amount entered in the transfer page is more than the available balance$")
	public void player_should_be_blocked_from_loading_the_Lady_Fortune_game_when_the_amount_entered_in_the_transfer_page_is_more_than_the_available_balance() throws Throwable {
	   
	}
}
