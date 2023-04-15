package screens;



import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class CreateNewAccountScreen extends ScreenBase{

	public CreateNewAccountScreen(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	@AndroidFindBy(xpath="//android.widget.EditText[1][@text='First Name']")
	MobileElement firstNameTextBox;
	@AndroidFindBy(xpath="//android.widget.EditText[2][@text='Last Name']")
	MobileElement lastNameTextBox;
	@AndroidFindBy(xpath="//android.widget.EditText[3][@text='Email']")
	MobileElement emailTextBox;
	@AndroidFindBy(xpath="//android.widget.LinearLayout/android.widget.EditText[@text='Mobile']")
	MobileElement mobileTextBox;
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Password']")
	MobileElement passwordTextBox;
	@AndroidFindBy(xpath="//android.widget.Button[@text='AGREE & SIGN UP']")
	MobileElement agreeAndSignUpButton;
	@AndroidFindBy(id="android:id/message")
	public MobileElement errorMessage;
	public void fillFirstName(String firstName) {
		sendText(firstNameTextBox,firstName);
	}
	public void fillLastName(String lastName) {
		sendText(lastNameTextBox,lastName);
	}
	public void fillEmail(String email) {
		sendText(emailTextBox,email);
	}
	public void fillMobile(String mobile) {
		sendText(mobileTextBox,mobile);
	}public void fillpassword(String password) {
		sendText(passwordTextBox,password);
	}
	public void clickOnAgreeAndSignUpButton() {
		clickElement(agreeAndSignUpButton);
	}
	

}
