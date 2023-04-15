package tests;

import org.testng.annotations.Test;
import org.testng.Assert;


import org.testng.annotations.BeforeMethod;


import screens.SignInScreen;
import screens.SignUPOrSignInScreen;
import screens.WelcomeScreen;
public class SignInTest extends TestBase{
	WelcomeScreen welcomescreen;
	SignInScreen signinscreen;
	SignUPOrSignInScreen signuporsigninscreen;
	@BeforeMethod
	public void setup() {
		welcomescreen=new WelcomeScreen(driver);
		signinscreen =new SignInScreen(driver);
		signuporsigninscreen=new  SignUPOrSignInScreen(driver);
	}
	@Test
	public void signInWithValidData() throws InterruptedException {
		welcomescreen.swipeScreen();
		welcomescreen.swipeScreen();
		welcomescreen.clickOnDoneButton();
		Thread.sleep(7000);
		signuporsigninscreen.clickOnSignInButton();
		Thread.sleep(7000);
		signinscreen.fillMobileTextbox("01126109651");
		signinscreen.fillPasswordTextbox("Heba12345#");
		signinscreen.clickOnSignInToAccount();
		Thread.sleep(5000);
		Assert.assertEquals(true,signinscreen.AssertionOnPermissionMessage.isDisplayed());
	}
	


}
