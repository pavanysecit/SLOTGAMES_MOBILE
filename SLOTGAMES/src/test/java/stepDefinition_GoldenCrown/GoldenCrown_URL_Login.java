package stepDefinition_GoldenCrown;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GoldenCrown_URL_Login {
	
private static AppiumDriver<MobileElement> driver;
	
	@Before
	public static void  GoldenCrown_URL_Login() throws InterruptedException, MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "ASUS X00TD");
		cap.setCapability("udid", "J9AAGF10J33379E");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("browserName", "Chrome");
//		cap.setCapability("appPackage", "com.android.chrome");
//		cap.setCapability("appActivity", "org.chromium.chrome.browser.ChromeTabbedActivity");
		
		URL url=new URL("http://10.10.13.84:4723/wd/hub");
		
		driver=new AndroidDriver<MobileElement>(url,cap);
		
		System.out.println("Appium started sucessfully");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.ysecit.in:82/SlotGames/slotsgame");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[19]/div[1]")).click();
		Thread.sleep(2000);
				 
		driver.findElement(By.name("email")).sendKeys("test9");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("/html/body/div[3]/header/section/div[9]/div/div[2]/form/div[2]/input")).sendKeys("mans@123");
		Thread.sleep(2000);
				
		MobileElement sub = driver.findElement(By.xpath("/html/body/div[3]/header/section/div[9]/div/div[2]/form/div[3]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(2000);
		/*
		 JavascriptExecutor jse1=(JavascriptExecutor)driver;
		 jse1.executeScript("window.scrollBy(0,50)", "");
	     MobileElement prt = driver.findElement(By.className("mb"));
		 jse1.executeScript("arguments[0].click();", prt);
		 Thread.sleep(4000); 
		 System.out.println("Test Working" +prt);
		 */
	}
	
	public static AppiumDriver<MobileElement> getDriver()
	{
		return driver;
	}
}