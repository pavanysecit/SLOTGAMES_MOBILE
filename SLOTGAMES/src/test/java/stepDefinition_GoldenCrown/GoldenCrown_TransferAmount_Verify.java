package stepDefinition_GoldenCrown;


import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class GoldenCrown_TransferAmount_Verify {
AppiumDriver<MobileElement> driver;

		
	public GoldenCrown_TransferAmount_Verify() throws InterruptedException {
		this.driver = GoldenCrown_URL_Login.getDriver();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[18]/div[1]")).click();
		Thread.sleep(2000);
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Golden Crown game, balance, text field to transfer balance and Ok button$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Crown_game_balance_text_field_to_transfer_balance_and_Ok_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[18]/div[1]")).click();
		Thread.sleep(2000);
		
		MobileElement trs = driver.findElement(By.id("transferInput"));
		trs.sendKeys("110");
		Thread.sleep(1000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		

		 //String parent1=driver.getWindowHandle();
		 //Set<String>s1=driver.getWindowHandles();

		 String parent = driver.getWindowHandle();
		 Set<String> wh = driver.getWindowHandles();
		 for(String mq:wh){
		 System.out.println(mq);
		 if(!parent.equals(mq)){
			 driver.switchTo().window(mq);
			 System.out.println("Window for slot game is"+" "+mq);
		 }
		 }
		 Set<String> contx = driver.getContextHandles();
		 String pk = driver.getContext();
		 System.out.println("The current context is"+" "+pk);
		 for(String cont:contx){
			 System.out.println(cont);
		 }
		driver.context("NATIVE_APP");
		Thread.sleep(20000);
	}

	@When("^Open the Golden Crown slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok butotn$")
	public void open_the_Golden_Crown_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_Play_button_enter_the_valid_amount_to_transfer_and_click_on_Ok_butotn() throws Throwable {
		String actual = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Balance of the Golden Crown slot game is : "+actual);
	    String expected = "110.00";
	    Assert.assertEquals(expected, actual);
	    Thread.sleep(2000);	
	}

	@Then("^The exact amount entered in the transfer page should transfer to Golden Crown game and same amount should get displayed on the balance section$")
	public void the_exact_amount_entered_in_the_transfer_page_should_transfer_to_Golden_Crown_game_and_same_amount_should_get_displayed_on_the_balance_section() throws Throwable {
		driver.quit();
	}
}
