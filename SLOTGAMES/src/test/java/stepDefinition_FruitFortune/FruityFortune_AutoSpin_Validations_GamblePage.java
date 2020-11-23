package stepDefinition_FruitFortune;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FruityFortune_AutoSpin_Validations_GamblePage {
	AppiumDriver<MobileElement> driver;

	public FruityFortune_AutoSpin_Validations_GamblePage() throws InterruptedException {
		this.driver = FruityFortune_URL_Login.getDriver();
		//this.driver = FruityFortune_URL_TryNow.getDriver();
		}
}
