package tests;


import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import screens.WelcomeScreen;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {
	public static AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
	WelcomeScreen welcomeScreen;


	@BeforeMethod
	public void openMobApp () throws MalformedURLException, InterruptedException  {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName","Android");
		caps.setCapability("automationName","UiAutomator2");
		caps.setCapability("platformVersion", "8.1");
		caps.setCapability("deviceName", "Pixel 3a API 27");
		caps.setCapability("app",System.getProperty("user.dir") + "/Apks/base.apk");
        driver = new AndroidDriver<MobileElement> (new URL("http://localhost:4723/wd/hub"), caps);
        Thread.sleep(6000);
	}
	@AfterMethod
	public void closeMobApp() {
		driver.quit();
	}
}
