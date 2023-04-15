package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignInScreen extends ScreenBase{

	public SignInScreen(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
   @AndroidFindBy(id="dunkineg.alamar.com:id/useremail")
   MobileElement MobileText;
   @AndroidFindBy(id="dunkineg.alamar.com:id/password")
   MobileElement PasswordText;
   @AndroidFindBy(id="dunkineg.alamar.com:id/signin")
   MobileElement signInToAccount;
   @AndroidFindBy(id="com.android.packageinstaller:id/permission_message")
   public MobileElement  AssertionOnPermissionMessage;
   @AndroidFindBy(id="dunkineg.alamar.com:id/signup")
   public MobileElement  AssertionOnSignUpLink;
   @AndroidFindBy(id="dunkineg.alamar.com:id/alertTitle")
   public MobileElement alertMessage;
   @AndroidFindBy(id="com.android.packageinstaller:id/permission_deny_button")
   MobileElement LocationDenyButton;
   
   public void fillMobileTextbox(String mobile) {
           sendText(MobileText,mobile);
   }
   public void fillPasswordTextbox(String password) {
       sendText(PasswordText,password);
}
   public void clickOnSignInToAccount() {
	   clickElement(signInToAccount);
}
   public void clickOnDenyLocationButton() {
	   clickElement(LocationDenyButton);
   }
}
