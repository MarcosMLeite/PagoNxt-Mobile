package screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import support.PlataformaMobile;

import java.time.Duration;

import static java.time.Duration.*;

public class Screen {

    protected AppiumDriver<MobileElement> driver;

    public Screen() {
        this.driver = PlataformaMobile.driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);
    }


    @AndroidFindBy(accessibility = "Contacts")
    public MobileElement cmpContato;


    @AndroidFindBy(id = "com.android.contacts:id/floating_action_button_container")
    public MobileElement cmpAddContato;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='First name']")
    public MobileElement cmpFirstName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Last name']")
    public MobileElement cmpLastName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Phone']")
    public MobileElement cmpPhone;

    @AndroidFindBy(id = "com.android.contacts:id/left_button")
    public MobileElement cmpCancelar;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.Button\n")
    public MobileElement cmpSalvarContato;

    @AndroidFindBy(id = "com.android.contacts:id/large_title")
    public MobileElement cmpNovoContato;
}
