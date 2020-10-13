package stepDefinition_LoginScenarios;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GoldenHot_Check_InValidURL {
AppiumDriver<MobileElement> driver;
		
	@Given("^Chrome browser, Invalid URL and Go button$")
	public void chrome_browser_Invalid_URL_and_Go_button() throws Throwable {
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
	}

	@When("^Open the chrome browser, Enter the Invalid URL and click on Go button$")
	public void open_the_chrome_browser_Enter_the_Invalid_URL_and_click_on_Go_button() throws Throwable {
		driver.get("http://demo.ysecit.in:82/SlotGamess/slotsgames");
		Thread.sleep(5000);
	}

	@Then("^User should not be able to login to the website$")
	public void user_should_not_be_able_to_login_to_the_website() throws Throwable {
	    String expected = driver.getTitle();
	    System.out.println("Title is: " +expected);
	    String actual = "The resource cannot be found";
	    Assert.assertEquals(expected, actual);
	    Thread.sleep(3000);
	    
	    driver.quit();
	}
}
