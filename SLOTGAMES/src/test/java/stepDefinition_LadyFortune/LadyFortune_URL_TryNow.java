package stepDefinition_LadyFortune;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LadyFortune_URL_TryNow {
private static AppiumDriver<MobileElement> driver;
	
	//@Before
	public static void  LadyFortune_URL_TryNow() throws InterruptedException, MalformedURLException, FindFailed {
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("deviceName", "ASUS X00TD");
	cap.setCapability("udid", "JAAAGF10Z743V8H");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "9");
	cap.setCapability("browserName", "Chrome");
	
	URL url=new URL("http://0.0.0.0:4723/wd/hub");
	
	driver=new AndroidDriver<MobileElement>(url,cap);
	
	System.out.println("Appium started sucessfully");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.get("http://demo.ysecit.in:82/SlotGames/slotsgame");
	Thread.sleep(3000);

	driver.findElement(By.xpath("/html/body/div[2]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[33]/div[2]/div[2]")).click();
	Thread.sleep(5000);	
	
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
	Thread.sleep(2000);
	}
	
	public static AppiumDriver<MobileElement> getDriver()
	{
		return driver;
	}
}