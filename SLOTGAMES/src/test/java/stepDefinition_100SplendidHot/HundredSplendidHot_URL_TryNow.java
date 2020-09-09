package stepDefinition_100SplendidHot;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HundredSplendidHot_URL_TryNow {
private static AppiumDriver<MobileElement> driver;
	
	//@Before
	public static void  HundredSplendidHot_URL_TryNow() throws InterruptedException, MalformedURLException, FindFailed {
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("deviceName", "ASUS X00TD");
	cap.setCapability("udid", "JAAAGF10Z743V8H");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "9");
	cap.setCapability("browserName", "Chrome");
	
	URL url=new URL("http://10.10.13.84:4723/wd/hub");
	
	driver=new AndroidDriver<MobileElement>(url,cap);
	
	System.out.println("Appium started sucessfully");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.get("http://demo.ysecit.in:82/SlotGames/slotsgame");
	Thread.sleep(3000);

	driver.findElement(By.xpath("/html/body/div[2]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[31]/div[2]/div[2]")).click();
	Thread.sleep(5000);		 
	}
}