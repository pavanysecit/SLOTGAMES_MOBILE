package stepDefinition_GoldenHot1;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.StartsActivity;

public class TEST {
	AppiumDriver<MobileElement> driver;
	
	String chromeAppPackageName = "com.android.chrome";
    String chromeAppActivityName = "org.chromium.chrome.browser.ChromeTabbedActivity";
    String settingsAppPackageName = "com.android.settings";
    String settingsAppActivityName = "com.android.settings.Settings";
    
	public TEST() {
		this.driver = SlotGames_URL_Login.getDriver();
	}
	
	@Given("^Settngs application$")
	public void settngs_application() throws Throwable {
	    

	}

	@When("^Open the setting app$")
	public void open_the_setting_app() throws Throwable {
		//Clicking on Golden Hot slot game
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[6]/div[1]/div")).click();
		Thread.sleep(5000);
		
		//Transferring the balance
		driver.findElement(By.id("transferInput")).sendKeys("200");
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
		//Click on > icon and select auto play 20 option
		MobileElement parentElement1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[6]/android.view.View[1]/android.view.View/android.view.View[2]"));
		parentElement1.click();

		//MobileElement childElement1 = parentElement1.findElement(By.xpath("//android.view.View[@text='Auto']"));
		parentElement1.getAttribute("name").equals("Auto");

		parentElement1.click();
		Thread.sleep(5000);
		((AppiumDriver)driver).runAppInBackground(Duration.ofSeconds(180));
		
		
		driver.activateApp("settingsAppPackageName");
		
		MobileElement intr = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView[1]"));
		intr.getAttribute("name").equals("Network & internet");
		intr.click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.android.settings:id/switchWidget")).click();
		Thread.sleep(2000);
		
		((StartsActivity)driver).currentActivity();
	}

	@Then("^Do required things$")
	public void do_required_things() throws Throwable {
//		DesiredCapabilities cap=new DesiredCapabilities();
//		cap.setCapability("deviceName", "ASUS X00TD");
//		cap.setCapability("udid", "J9AAGF10J33379E");
//		cap.setCapability("platformName", "Android");
//		cap.setCapability("platformVersion", "9");
//		cap.setCapability("appPackage", "com.android.settings");
//		cap.setCapability("appActivity", "com.android.settings.Settings");
//		cap.setCapability("newCommandTimeout", "10000");
//		URL url=new URL("http://10.10.13.84:4723/wd/hub");
//		
//		driver=new AndroidDriver<MobileElement>(url,cap);
//		
//		System.out.println("Appium started sucessfully");
////		Thread.sleep(5000);
//		
//		MobileElement intr = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView[1]"));
//		intr.getAttribute("name").equals("Network & internet");
//		intr.click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.android.settings:id/switchWidget")).click();
//		Thread.sleep(2000);
//		
////		Activity activity = new Activity(chromeAppPackageName, chromeAppActivityName);
////		//driver.startActivity(chromeAppPackageName, chromeAppActivityName);
////        //activity.setStopApp(false);
////        ((AndroidDriver<MobileElement>) driver).startActivity(activity);
//		((StartsActivity)driver).currentActivity();
		
	}
}
