package stepDefinition_TreasureBonanza;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TreasureBonanza_TransferAmount_Verify {
	AppiumDriver<MobileElement> driver;

	public TreasureBonanza_TransferAmount_Verify() throws InterruptedException {
		this.driver = TreasureBonanza_Login_URL.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Treasure Bonanza game, balance, text field to transfer balance and Ok button$")
	public void chrome_browser_valid_URL_valid_login_details_Treasure_Bonanza_game_balance_text_field_to_transfer_balance_and_Ok_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		MobileElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(20000);

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

	@When("^Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok butotn$")
	public void open_the_Treasure_Bonanza_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_Play_button_enter_the_valid_amount_to_transfer_and_click_on_Ok_butotn() throws Throwable {
		String actual = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance of the Treasure Bonanza slot game is : "+actual);
	    String expected = "300.00";
	    Assert.assertEquals(actual, expected);
	    Thread.sleep(3000);
	}

	@Then("^The exact amount entered in the transfer page should transfer to Treasure Bonanza game and same amount should get displayed on the balance section$")
	public void the_exact_amount_entered_in_the_transfer_page_should_transfer_to_Treasure_Bonanza_game_and_same_amount_should_get_displayed_on_the_balance_section() throws Throwable {
		driver.quit();
	}
}
