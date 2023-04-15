package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import screens.EditInformationScreen;
import screens.NewOrderScreen;
import screens.SignInScreen;
import screens.SignUPOrSignInScreen;
import screens.WelcomeScreen;

public class EditAccountInformationTest extends TestBase{
	WelcomeScreen welcomescreen;
	SignInScreen signinscreen;
	SignUPOrSignInScreen signuporsigninscreen;
	NewOrderScreen neworderscreen;
	EditInformationScreen editinformationscreen;
    @BeforeMethod
    public void setup() throws InterruptedException {
    	welcomescreen=new WelcomeScreen(driver);
		signinscreen =new SignInScreen(driver);
		signuporsigninscreen=new  SignUPOrSignInScreen(driver);
		neworderscreen=new  NewOrderScreen(driver);
		editinformationscreen=new EditInformationScreen(driver);
		welcomescreen.swipeScreen();
		welcomescreen.swipeScreen();
		welcomescreen.clickOnDoneButton();
		Thread.sleep(15000);
		signuporsigninscreen.clickOnSignInButton();
		Thread.sleep(7000);
		signinscreen.fillMobileTextbox("01126109651");
		signinscreen.fillPasswordTextbox("Heba12345#");
		signinscreen.clickOnSignInToAccount();
		signinscreen.clickOnDenyLocationButton();	
    }
    @Test
    public void EditAllAccountInformation() throws InterruptedException {
    	editinformationscreen.clickOnSideMenuButton();
    	Thread.sleep(2000);
    	editinformationscreen.clickOnEditInformationButton();
    	Thread.sleep(5000);
    	editinformationscreen.fillFirstName("Heba");
    	Thread.sleep(5000);
    	editinformationscreen.fillLastName("Nasser");
    	editinformationscreen.chooseDefaultDateFromCalender();
    	editinformationscreen.chooseGender();
    	Thread.sleep(5000);
    	editinformationscreen.clickBackButton();
    	editinformationscreen.clickOnUpdateButton();
    }
}
