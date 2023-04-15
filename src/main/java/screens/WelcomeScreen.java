package screens;






import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WelcomeScreen  extends ScreenBase{

	public WelcomeScreen(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	boolean F= false;
	@AndroidFindBy(xpath="//android.widget.Button[@text='DONE']")
	MobileElement doneButton;
	
	public void clickOnDoneButton() {
		clickElement(doneButton);
	}
	
	

}
