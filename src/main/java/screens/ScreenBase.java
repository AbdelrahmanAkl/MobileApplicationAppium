package screens;





import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ScreenBase {
	AndroidDriver<MobileElement>   driver;
   
    public final long WAIT =700;
	public ScreenBase(AndroidDriver<MobileElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	public void waitForVisibility(MobileElement element) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
	public void clear(MobileElement element) {
        waitForVisibility(element);
        element.clear();
    }
	public void clickElement(MobileElement element) {
		waitForVisibility(element);
		element.click();
	}
	public void sendText(MobileElement element, String text) {
        waitForVisibility(element);
        element.sendKeys(text);
    }
	
	public void swipeScreen() {

	    TouchAction touchAction = new TouchAction(driver);

	    touchAction.longPress(PointOption.point(800,300))
	               .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
	               .moveTo(PointOption.point(80,400))
	               .release()
	               .perform();
	}
	public void clickBackButton(){
		driver.navigate().back();
		}
}
