package stepDefinition_SapphireHeart;

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

public class SapphireHeart_Navigate_HomeScreen {
	AppiumDriver<MobileElement> driver;

	public SapphireHeart_Navigate_HomeScreen() throws InterruptedException {
		this.driver = SapphireHeart_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Sapphire Heart slot game and home button$")
	public void chrome_browser_valid_URL_valid_login_details_Sapphire_Heart_slot_game_and_home_button() throws Throwable {
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

	@When("^Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button$")
	public void open_the_Sapphire_Heart_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_and_click_on_home_button() throws Throwable {
		driver.findElement(By.xpath("hud_btnHome")).click();
		Thread.sleep(4000);
		
		
		String expected = driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/h3")).getText();
		String actual = "Slot Games";
		Assert.assertEquals(expected, actual);
	}

	@Then("^System should take the player to Home page after clicking on home button from Sapphire Heart game$")
	public void system_should_take_the_player_to_Home_page_after_clicking_on_home_button_from_Sapphire_Heart_game() throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
