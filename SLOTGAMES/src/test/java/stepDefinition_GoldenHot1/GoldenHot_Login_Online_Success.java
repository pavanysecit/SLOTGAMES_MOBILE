package stepDefinition_GoldenHot1;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class GoldenHot_Login_Online_Success {
	 AppiumDriver<MobileElement> driver;
	
	public GoldenHot_Login_Online_Success() {
		this.driver = SlotGames_URL_Login.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, Go button, valid account id, valid password and login button$")
	public void chrome_browser_valid_URL_Go_button_valid_account_id_valid_password_and_login_button() throws Throwable {
	    Thread.sleep(1000);
	}

	@When("^Open the chrome browser, Enter the valid URL, click on Go button, click on golden hot game, enter valid account id & password and click on Login butotn$")
	public void open_the_chrome_browser_Enter_the_valid_URL_click_on_Go_button_click_on_golden_hot_game_enter_valid_account_id_password_and_click_on_Login_butotn() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^User should be able to login website successfully post entering valid online account details and online account balance should be displayed$")
	public void user_should_be_able_to_login_website_successfully_post_entering_valid_online_account_details_and_online_account_balance_should_be_displayed() throws Throwable {
	    //After login, checking logoff button is visible or not
		String expected = driver.findElement(By.xpath("/html/body/div[3]/header/section/div[1]/span[2]")).getText();
	    System.out.println("Print Text: "+expected);
	    String actual = "LogOff";
	    Assert.assertEquals(expected, actual);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[3]/header/section/div[2]/span[2]")).click();
	    Thread.sleep(2000);
	    
	    //Checking whether system is displaying account type as Online
	    String expected1 = driver.findElement(By.id("sn_after_login_info_Amount")).getText();
	    System.out.println("Print Text: "+expected1);
	    Assert.assertTrue(expected1.contains("Online"));
	    
	    driver.quit();
	}
}