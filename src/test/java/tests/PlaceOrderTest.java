package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import screens.NewOrderScreen;
import screens.SignInScreen;
import screens.SignUPOrSignInScreen;
import screens.WelcomeScreen;

public class PlaceOrderTest extends TestBase{
	WelcomeScreen welcomescreen;
	SignInScreen signinscreen;
	SignUPOrSignInScreen signuporsigninscreen;
	NewOrderScreen neworderscreen;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		welcomescreen=new WelcomeScreen(driver);
		signinscreen =new SignInScreen(driver);
		signuporsigninscreen=new  SignUPOrSignInScreen(driver);
		neworderscreen=new  NewOrderScreen(driver);
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
	public void placeOrder() throws InterruptedException {
		neworderscreen.clickOnNewOrderButton();
		System.out.println("Wait");
		Thread.sleep(15000);
		neworderscreen.clickOnHotDrinks();
		Thread.sleep(15000);
		System.out.println("Wait");
		neworderscreen.chooseAmericanoDrink();
		neworderscreen.clickOnAddButton();
	}

}
