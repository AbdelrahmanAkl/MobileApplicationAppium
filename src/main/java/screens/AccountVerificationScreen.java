package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AccountVerificationScreen extends ScreenBase{

	public AccountVerificationScreen(AndroidDriver<MobileElement> driver) {
		super(driver);
		
	}
	@AndroidFindBy(id="dunkineg.alamar.com:id/verifybtn")
	public MobileElement  verifyButton;

	
	
	

}
