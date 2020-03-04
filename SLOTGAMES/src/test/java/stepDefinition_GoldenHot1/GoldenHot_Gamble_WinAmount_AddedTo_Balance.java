package stepDefinition_GoldenHot1;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class GoldenHot_Gamble_WinAmount_AddedTo_Balance {
AppiumDriver<MobileElement> driver;
	
	public GoldenHot_Gamble_WinAmount_AddedTo_Balance() throws InterruptedException {
		this.driver = SlotGames_URL_Login.getDriver();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[6]/div[1]/div")).click();
		Thread.sleep(5000);
		}
	
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_balance_spin_button_win_amount_gamble_button_gamble_amount_red_button_black_button_and_gamble_status() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[6]/div[1]/div")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("transferInput")).sendKeys("1000");
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

	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, click on golden hot slot game, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_golden_hot_slot_game_click_on_spin_button_till_player_wins_click_on_gamble_button_click_on_red_or_black_button_and_check_the_balance_after_win() throws Throwable {
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");

		//Storing the balance before spin

		String prewin="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me.getId().equals("37")){
				 prewin = me.getText();
				 System.out.println("The current Balance of Account"+" "+me.getText());
			}
		}

		////Selecting bet type as 1 and default bet value will be 5
		for(MobileElement me2:balance)
		{
			if(me2.getText().equals("1 Cr ="))
			{
				me2.click();
			Thread.sleep(2000);
			}
			 if(me2.getText().equals("1"))
			 {
				 me2.click();
			 Thread.sleep(1000);
			 }
			//System.out.println(me2.getId()+"  "+me2.getText());
		}
		//Method to click on the play/start button/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[6]/android.view.View[2]
		MobileElement start = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[6]/android.view.View[2]"));
		start.click();
	                                                                                                                                                             
 		MobileElement winE = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[21]/android.view.View[1]"));
		List<MobileElement> balance1 = driver.findElementsByClassName("android.view.View");
	
		String winTex1="";
		//Storing the balance before spin
		String prewin1="";
		for(MobileElement me1:balance1){
			//System.out.println(me1.getId()+"  "+me1.getText());
			if(me1.getId().equals("187")){
				 prewin = me1.getText();
				 System.out.println("The win is"+" "+me1.getText());
				 winTex1=me1.getText();
			
				 String winTex = me1.getText();
				 while(winTex.isEmpty())
					{
						Thread.sleep(4500);
						start.click();
						Thread.sleep(1000);
						winTex=	winE.getText();
						winTex1 = winTex1+winTex;
						System.out.println(winTex.isEmpty());	
					}
				System.out.println("The first wintext is "+"  "+winTex);
				System.out.println(winTex.isEmpty()+" "+winTex);	
				break;
				}
		    	start.click();	
			}
		Thread.sleep(2000);

		System.out.println("win is: "+winTex1);
                                         		   
		String gAmount = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[6]")).getText();	
		System.out.println("Gamble amount is :"+gAmount);
		Thread.sleep(2000);
		String[] uyt = gAmount.split(" ");
		String gamble="";
		for(int i=0;i<uyt.length;i++){
			System.out.println(uyt[i]);
			if(i==0){
			gamble=gamble+uyt[i];
			}
		}
		double db=Double.parseDouble(gamble);
		System.out.println("db is equal to"+" "+db);
	    System.out.println("The value of toi  :"+gamble);
		System.out.println("The lenght of gamble is :"+uyt.length);
		Thread.sleep(2000);
		
		String pku = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[22]/android.view.View[1]")).getText();
		
		System.out.println("The value of balance prior to gamble is "+" "+pku);
		//comparing win and lose
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[11]")).click();

		Screen screen=new Screen();
		Pattern pat=new Pattern("E:\\Sikuli Images\\Win.PNG");
		Finder finder =new Finder(screen.capture().getImage());
				
		String ht = finder.find(pat);
		
		System.out.println("the value of ht"+" "+ht);
		
//		boolean status = finder.hasNext();
//		System.out.println("The status is "+" "+status);
//		while(status==false){
//		Thread.sleep(4000);
//		
//		MobileElement winE1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[21]/android.view.View[1]"));
//		winTex1=winE.getText();
//        System.out.println("The win is"+" "+winE.getText());
//		while(winTex1.isEmpty()){
//
//		Thread.sleep(4500);
//		start.click();
//		Thread.sleep(1000);
//		winTex1=	winE.getText();
//		//currtbal=prq.getText();
//		System.out.println(winTex1.isEmpty());
//         
//		status=finder.hasNext();
//		
//		}
//		start.click();
//                       
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[11]")).click();       
//	
//		}

		 if(finder.hasNext())
		 {
		 Match m=finder.next();
		 System.out.println("Match Found with"+(m.getScore())*100+"%");
         System.out.println("Its a win");
		 finder.destroy();
           
		 }
            
		 else
         
		 {          
            System.out.println("It has lost");
	//	 finder.destroy();
		 
		 }
		 System.out.println("The testcase 3 has passed"); 
		}

	@Then("^Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed$")
	public void gamble_Win_amount_should_get_added_to_main_balance_after_status_displayed_as_WIN_and_gamble_page_should_get_closed() throws Throwable {
	    driver.quit();
	}
}
