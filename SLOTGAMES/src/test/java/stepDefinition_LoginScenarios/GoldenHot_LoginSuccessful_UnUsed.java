package stepDefinition_LoginScenarios;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
/*
public class GoldenHot_LoginSuccessful_UnUsed {

	private AppiumDriver<MobileElement> driver;
	
	public GoldenHot_LoginSuccessful_UnUsed() {
		this.driver = SlotGames_URL_Login.getDriver();
	}
	
	@Given("^Golden hot game, balance, transfer button, start button and winning amount$")
	public void Golden_hot_game_balance_transfer_button_start_button_and_winning_amount() throws Throwable {
		 driver.findElement(By.id("transferInput")).sendKeys("30");
		 Thread.sleep(4000);
		 driver.findElement(By.className("Transfer_Ok_but")).click();
		 Thread.sleep(20000);
	}
*/
/*
	@When("^Click on Golden Hot game, transfer the balance, click on Start button and keep clicking on start button till the winning balance is displayed$")
	public void Click_on_Golden_Hot_game_transfer_the_balance_click_on_Start_button_and_keep_clicking_on_start_button_till_the_winning_balance_is_displayed() throws Throwable {
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
		Thread.sleep(40000);
		
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		
		String prewin="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me.getId().equals("35")){
				 prewin = me.getText();
			System.out.println("The current Balance of Account"+" "+me.getText());
			}
			if(me.getText().equals("Bet")){
				me.click();
				
			Thread.sleep(2000);
			}
			if(me.getText().equals("0.15")){
				me.click();		
			}
		}
	
		//MMethod to click on the play/start button
		MobileElement start = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View[2]"));
		start.click();
	
		MobileElement currentbal = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[22]/android.view.View[1]");
	
		MobileElement winE = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[21]/android.view.View[1]"));
		String winTex = winE.getText();
		System.out.println(winTex.isEmpty()+" "+winTex);
		Thread.sleep(2000);
		String currtbal="";
		while(winTex.isEmpty())
		{
			Thread.sleep(4500);
			start.click();
			Thread.sleep(1000);
			winTex=	winE.getText();
			currtbal=currentbal.getText();
			System.out.println(winTex.isEmpty());	
		}
		System.out.println("win is  "+" "+winTex);
		System.out.println("The current balance is"+currtbal);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[13]")).click();
		Thread.sleep(3000);
		String postwin = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[22]/android.view.View[1]").getText();
		System.out.println("The balance post win is"+" "+postwin);	
	}

	@Then("^Winning amount should get added to the balance and balance should get increased with winning amount$")
	public void Winning_amount_should_get_added_to_the_balance_and_balance_should_get_increased_with_winning_amount() throws Throwable {
		driver.quit();
	}
}
*/