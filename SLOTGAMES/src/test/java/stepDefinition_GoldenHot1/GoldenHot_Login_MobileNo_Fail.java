package stepDefinition_GoldenHot1;

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

public class GoldenHot_Login_MobileNo_Fail {
	AppiumDriver<MobileElement> driver;
	
	@Given("^Chrome browser, valid URL, Go button, Invalid mobile number, valid password and login button$")
	public void chrome_browser_valid_URL_Go_button_Invalid_mobile_number_valid_password_and_login_button() throws Throwable {
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

	@When("^Open the chrome browser, Enter the valid URL, click on Go button, click on golden hot game, enter invalid mobile number & password and click on Login butotn$")
	public void open_the_chrome_browser_Enter_the_valid_URL_click_on_Go_button_click_on_golden_hot_game_enter_invalid_mobile_number_password_and_click_on_Login_butotn() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[1]/div[1]/div")).click();
		Thread.sleep(2000);
		
		//Entering invalid online account id
		driver.findElement(By.name("email")).sendKeys("77777777777");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("/html/body/div[3]/header/section/div[9]/div/div[2]/form/div[2]/input")).sendKeys("mans@123");
		Thread.sleep(2000);
				
		MobileElement sub = driver.findElement(By.xpath("/html/body/div[3]/header/section/div[9]/div/div[2]/form/div[3]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(2000);
		
		String expected = driver.findElement(By.xpath("/html/body/div[3]/header/section/div[9]/div/div[2]/form/div[4]")).getText();
	    System.out.println("Message for Username: "+expected);
	    String actual = "Please verify your email and password!";
	    Assert.assertEquals(expected, actual);
	    Thread.sleep(2000);
	}

	@Then("^User should be failed to login to the website post entering invalid mobile number$")
	public void user_should_be_failed_to_login_to_the_website_post_entering_invalid_mobile_number() throws Throwable {
		//Entering invalid online account password
		driver.findElement(By.name("email")).sendKeys("99861064455");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("/html/body/div[3]/header/section/div[9]/div/div[2]/form/div[2]/input")).sendKeys("test@123");
		Thread.sleep(2000);
				
		MobileElement sub1 = driver.findElement(By.xpath("/html/body/div[3]/header/section/div[9]/div/div[2]/form/div[3]"));
		JavascriptExecutor jse1=(JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click();", sub1);
		Thread.sleep(2000);
		
		String expected1 = driver.findElement(By.xpath("/html/body/div[3]/header/section/div[9]/div/div[2]/form/div[4]")).getText();
	    System.out.println("Message for password: "+expected1);
	    String actual1 = "Please verify your email and password!";
	    Assert.assertEquals(expected1, actual1);
	    Thread.sleep(2000);	
	    
	    driver.quit();
	}
}