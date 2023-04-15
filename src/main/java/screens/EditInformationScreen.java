package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EditInformationScreen extends ScreenBase{

	public EditInformationScreen(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	@AndroidFindBy(xpath="//android.widget.ImageButton[@class='android.widget.ImageButton']")
	MobileElement sideMenuButton;
	@AndroidFindBy(xpath="(//android.widget.ImageView[@class='android.widget.ImageView'])[2]")
	MobileElement editInformationButton;
	@AndroidFindBy(id="dunkineg.alamar.com:id/fname_editor")
	MobileElement firstNameTextBox;
	@AndroidFindBy(id="dunkineg.alamar.com:id/lname_editor")
	MobileElement lastNameTextBox;
	@AndroidFindBy(id="dunkineg.alamar.com:id/DOB_editor")
	MobileElement calender;
	@AndroidFindBy(id="android:id/button1")
	MobileElement okButton;
	@AndroidFindBy(id="dunkineg.alamar.com:id/radioFemale")
	MobileElement gender;
	@AndroidFindBy(id="dunkineg.alamar.com:id/update_btn")
	MobileElement updateButton;
	public void clickOnSideMenuButton() {
		clickElement(sideMenuButton);
	}
	public void clickOnEditInformationButton() {
		clickElement(editInformationButton);
	}
	public void fillFirstName(String firstName) {
		sendText(firstNameTextBox,firstName);
	}
	public void fillLastName(String lastName) {
		sendText(lastNameTextBox,lastName);
	}
	void clickOnCalender() {
		clickElement(calender);
	}
	void clickOk() {
		clickElement(okButton);
	}
	public void chooseDefaultDateFromCalender() {
		clickOnCalender();
		clickOk();
	}
	public void chooseGender() {
		clickElement(gender);
	}
	public void clickOnUpdateButton() {
		clickElement(updateButton);
	}
}
