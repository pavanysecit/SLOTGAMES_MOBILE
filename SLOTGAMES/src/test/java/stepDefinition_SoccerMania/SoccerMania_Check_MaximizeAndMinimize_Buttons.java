package stepDefinition_SoccerMania;

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

public class SoccerMania_Check_MaximizeAndMinimize_Buttons {
	AppiumDriver<MobileElement> driver;

	public SoccerMania_Check_MaximizeAndMinimize_Buttons() throws InterruptedException {
		this.driver = SoccerMania_Login_URL.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Soccer Mania slot game, maximize button and minimize button$")
	public void chrome_browser_valid_URL_valid_login_details_Soccer_Mania_slot_game_maximize_button_and_minimize_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		
		MobileElement bal = driver.findElement(By.id("transferInput"));
		bal.clear();
		Thread.sleep(1000);
		bal.sendKeys("10");
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

	@When("^Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button$")
	public void open_the_Soccer_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_maximize_button_and_click_on_minimize_button() throws Throwable {
		MobileElement sub = driver.findElement(By.id("hud_btnFullScreen"));
		sub.click();
		Thread.sleep(3000);
		
		//Checking when window is maximized, URL tool bar should not visible
	    Assert.assertTrue(driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.EditText")).size() == 0);
	    
	    driver.findElement(By.id("hud_btnFullScreen")).click();
		Thread.sleep(3000);

    	 //Checking when window is minimized, URL tool bar should be visible
	    Assert.assertTrue(driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.EditText")).size() == 1);
	}

	@Then("^Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in Soccer Mania slot game$")
	public void full_screen_should_be_displayed_after_clicking_on_maximize_button_and_minimized_screen_should_be_displayed_after_clicking_on_minimize_button_in_Soccer_Mania_slot_game() throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
