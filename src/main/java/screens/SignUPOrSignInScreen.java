package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignUPOrSignInScreen extends ScreenBase{

	public SignUPOrSignInScreen(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	@AndroidFindBy(id="dunkineg.alamar.com:id/signup_btn")
	MobileElement signUpButton;
	@AndroidFindBy(xpath="//android.widget.Button[1][@text='SIGN IN']")
	MobileElement signInButton;
	public void clickOnSignUpButtton() {
		clickElement(signUpButton);
	}
	public void clickOnSignInButton() {
		clickElement(signInButton);
	}
	
}
