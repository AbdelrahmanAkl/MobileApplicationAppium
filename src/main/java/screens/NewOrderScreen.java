package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NewOrderScreen extends ScreenBase{

	public NewOrderScreen(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	@AndroidFindBy(id="dunkineg.alamar.com:id/nav_newOrder")
	MobileElement newOrderButton;
    @AndroidFindBy(xpath="(//android.widget.RelativeLayout[@class='android.widget.RelativeLayout'])[2]")
    MobileElement hotDrinks;
    @AndroidFindBy(xpath="(//android.widget.RelativeLayout[@class='android.widget.RelativeLayout'])[2]")
    MobileElement  AmericanoDrink;
    @AndroidFindBy(id="dunkineg.alamar.com:id/addToCardLayout")
    MobileElement  addButton;
    @AndroidFindBy(id="dunkineg.alamar.com:id/tv1")
    public MobileElement checkOutButton;
    public void  clickOnNewOrderButton() {
    	clickElement(newOrderButton);
    }
    public void clickOnHotDrinks() {
    	clickElement(hotDrinks);
    }
    public void chooseAmericanoDrink() {
    	clickElement(AmericanoDrink);
    }
    public void clickOnAddButton() {
    	clickElement(addButton);
    }
}
