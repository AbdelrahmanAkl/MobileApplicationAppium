package tests;

import org.testng.annotations.Test;










import screens.AccountVerificationScreen;
import screens.CreateNewAccountScreen;
import screens.SignUPOrSignInScreen;
import screens.WelcomeScreen;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class SignUpTest extends TestBase {

	WelcomeScreen welcomescreen;
	SignUPOrSignInScreen Signuporsigninscreen;
	CreateNewAccountScreen createnewaccountscreen;
	AccountVerificationScreen accountverificationscreen;
	@BeforeMethod
	void setup() {
		welcomescreen =new  WelcomeScreen(driver);
		Signuporsigninscreen=new SignUPOrSignInScreen(driver);
		createnewaccountscreen=new CreateNewAccountScreen(driver);
		accountverificationscreen=new AccountVerificationScreen(driver);

	}
	@Test
	public void singUpWithValidData() throws InterruptedException {

		welcomescreen.swipeScreen();
		welcomescreen.swipeScreen();
		welcomescreen.clickOnDoneButton();
		Thread.sleep(10000);
		System.out.println("wait1");
		Signuporsigninscreen.clickOnSignUpButtton();
		System.out.println("wait2");
		Thread.sleep(20000);
		createnewaccountscreen.fillFirstName("Abdelrahman");
		createnewaccountscreen.fillLastName("Ahmed");
		createnewaccountscreen.fillEmail("Abdelrahmanakl1997@gmail.com");
		createnewaccountscreen.fillMobile("01277029981");
		createnewaccountscreen.clickBackButton();
		createnewaccountscreen.fillpassword("Adfhtya@1532");
		createnewaccountscreen.clickOnAgreeAndSignUpButton();

	}
	@Test
	public void singUpWithEmptyData() throws InterruptedException {

		welcomescreen.swipeScreen();
		welcomescreen.swipeScreen();
		welcomescreen.clickOnDoneButton();
		Thread.sleep(7000);
		Signuporsigninscreen.clickOnSignUpButtton();
		Thread.sleep(7000);
		createnewaccountscreen.fillFirstName("");
		createnewaccountscreen.fillLastName("");
		createnewaccountscreen.fillEmail("");
		createnewaccountscreen.fillMobile("");
		createnewaccountscreen.clickBackButton();
		createnewaccountscreen.fillpassword("");
		createnewaccountscreen.clickOnAgreeAndSignUpButton();
		Thread.sleep(5000);
		Assert.assertEquals(true,createnewaccountscreen.errorMessage.isDisplayed());

	}



}
