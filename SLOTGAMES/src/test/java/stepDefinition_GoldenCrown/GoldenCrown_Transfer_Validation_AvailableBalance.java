package stepDefinition_GoldenCrown;

import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;


public class GoldenCrown_Transfer_Validation_AvailableBalance {
AppiumDriver<MobileElement> driver;

	
	public GoldenCrown_Transfer_Validation_AvailableBalance() throws InterruptedException {
		this.driver = GoldenCrown_URL_Login.getDriver();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[18]/div[1]")).click();
		Thread.sleep(2000);
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Golden Crown game, balance greater than available balance, text field to transfer balance, Ok button and validation message$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Crown_game_balance_greater_than_available_balance_text_field_to_transfer_balance_Ok_button_and_validation_message() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[18]/div[1]")).click();
		Thread.sleep(2000);
		
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

	@When("^Open the Golden Crown slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok butotn$")
	public void open_the_Golden_Crown_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_enter_the_amount_greater_than_available_balance_and_click_on_Ok_butotn() throws Throwable {
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

	@Then("^Player should be blocked from loading the Golden Crown game when the amount entered in the transfer page is more than the available balance$")
	public void player_should_be_blocked_from_loading_the_Golden_Crown_game_when_the_amount_entered_in_the_transfer_page_is_more_than_the_available_balance() throws Throwable {
	}
}
