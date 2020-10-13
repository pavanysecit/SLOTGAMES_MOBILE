package stepDefinition_LoginScenarios;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GoldenHot_Login_MobileNo_Success {
AppiumDriver<MobileElement> driver;
	
	@Given("^Chrome browser, valid URL, Go button, valid mobile number, valid password and login button$")
	public void chrome_browser_valid_URL_Go_button_valid_mobile_number_valid_password_and_login_button() throws Throwable {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "ASUS X00TD");
		cap.setCapability("udid", "JAAAGF10Z743V8H");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("browserName", "Chrome");
		
		URL url=new URL("http://10.10.13.84:4723/wd/hub");
		
		driver=new AndroidDriver<MobileElement>(url,cap);
		
		System.out.println("Appium started sucessfully");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.ysecit.in:82/SlotGames/slotsgame");
	}

	@When("^Open the chrome browser, Enter the valid URL, click on Go button, click on golden hot game, enter valid mobile number & password and click on Login butotn$")
	public void open_the_chrome_browser_Enter_the_valid_URL_click_on_Go_button_click_on_golden_hot_game_enter_valid_mobile_number_password_and_click_on_Login_butotn() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[1]/div[1]/div")).click();
		Thread.sleep(2000);
		
		//Entering invalid online account id
		driver.findElement(By.name("email")).sendKeys("9986556677");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("/html/body/div[3]/header/section/div[9]/div/div[2]/form/div[2]/input")).sendKeys("mans@123");
		Thread.sleep(2000);
				
		MobileElement sub = driver.findElement(By.xpath("/html/body/div[3]/header/section/div[9]/div/div[2]/form/div[3]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(2000);
	}

	@Then("^User should be able to login to website successfully post entering valid mobile number and balance should be displayed$")
	public void user_should_be_able_to_login_to_website_successfully_post_entering_valid_mobile_number_and_balance_should_be_displayed() throws Throwable {
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
