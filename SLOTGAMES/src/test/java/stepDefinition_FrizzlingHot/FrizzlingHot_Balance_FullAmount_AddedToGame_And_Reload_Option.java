package stepDefinition_FrizzlingHot;

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
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FrizzlingHot_Balance_FullAmount_AddedToGame_And_Reload_Option {
	AppiumDriver<MobileElement> driver;

	
	@Given("^Chrome browser, valid URL, valid login details, Frizzling Hot slot game, Full amount transfer from account to game\\.$")
	public void chrome_browser_valid_URL_valid_login_details_Frizzling_Hot_slot_game_Full_amount_transfer_from_account_to_game() throws Throwable {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "ASUS X00TD");
		cap.setCapability("udid", "J9AAGF10J33379E");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("browserName", "Chrome");
		
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		
		driver=new AndroidDriver<MobileElement>(url,cap);
		
		System.out.println("Appium started sucessfully");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://demo.ysecit.in:82/SlotGames/slotsgame");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[39]/div[1]/div")).click();
		Thread.sleep(2000);
				 
		driver.findElement(By.name("email")).sendKeys("test8");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("/html/body/div[2]/header/section/div[10]/div/div[2]/form/div[2]/input")).sendKeys("mans@123");
		Thread.sleep(2000);
		
		MobileElement sub = driver.findElement(By.xpath("/html/body/div[2]/header/section/div[10]/div/div[2]/form/button"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement  login_button=  driver.findElement(By.xpath("/html/body/div[2]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[39]/div[1]/div"));
        wait.until(ExpectedConditions.elementToBeClickable(login_button));
        login_button.click();
        
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		MobileElement mainbal = driver.findElement(By.xpath("//label[@class='amt-currency ng-binding']"));
		String mainbalance = mainbal.getText();
		System.out.println("mainbal before:"+ mainbalance);
		MobileElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		String fullamt =mainbal.getText();
		balT.sendKeys(fullamt);
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

	@When("^Open the Frizzling Hot slot game by entering the valid URL in browser, enter the valid login details, select game and transfer full amount same amount has to reflect in game balance, play and reload the game$")
	public void open_the_Frizzling_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_game_and_transfer_full_amount_same_amount_has_to_reflect_in_game_balance_play_and_reload_the_game() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The balance is equal to"+" "+balance);
		MobileElement start = driver.findElement(By.id("hud_btnSpin"));
		start.click();
		Thread.sleep(4000);
		String bal1 = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The balance after spin"+" "+bal1);
		
		// Click on Hamburger Menu
		MobileElement menu = driver.findElement(By.id("com.android.chrome:id/menu_button"));
		menu.click();
		Thread.sleep(2000);
		// Select the refresh button
		MobileElement refresh = driver. findElement(MobileBy. AccessibilityId("Refresh page"));
		refresh.click();
		Thread.sleep(2000);
		// Validation message on refreshing the game page
		MobileElement title = driver.findElement(By.id("com.android.chrome:id/title"));
		System.out.println("Title: "+title.getText());
		MobileElement ValidMessage = driver.findElement(By.id("com.android.chrome:id/message"));
		String validmsg = ValidMessage.getText();
		System.out.println("Valid error message with details:  "+validmsg);
		String message = "Authentication Failed or Session Invalid. Please try Again.";
		Assert.assertEquals(message, validmsg);
		System.out.println("Validation is successfull");

		// Click on OK button
		MobileElement ok = driver.findElement(By.id("com.android.chrome:id/positive_button"));
		ok.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		driver.context("CHROMIUM");
		Thread.sleep(4000);

		// Validating it has redirected to game selection screen
		MobileElement logo = driver.findElement(By.xpath("//img[@name='Suribet']"));
		Assert.assertTrue(logo.isDisplayed());
		System.out.println("User is redirected to game selection screen");

		// Again login to game to validate autospin is not continued
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[33]/div[1]/div[1]")).click();
		Thread.sleep(3000);

		// Validation on balance is transferred to main account balance and available for the user.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		MobileElement mainbal = driver.findElement(By.xpath("//label[@class='amt-currency ng-binding']"));
		String fullamt =mainbal.getText();
		System.out.println("main bal after redirected from game :"+fullamt);
		String bal = bal1.replace(",","");
		Assert.assertEquals(bal, fullamt);
		System.out.println("Left over game balance is same as Account balance");
		System.out.println("Test case passed");
	}

	@Then("^Remaining balance should be transfered to main account balance in Frizzling Hot slot game$")
	public void remaining_balance_should_be_transfered_to_main_account_balance_in_Frizzling_Hot_slot_game() throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
