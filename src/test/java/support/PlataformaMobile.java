package support;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class PlataformaMobile {

    public static AppiumDriver<MobileElement> driver;

    public static AppiumDriver<MobileElement> inicializarDriver() throws IOException {
        if (driver != null) {
            return driver;
        }

        Properties prop = getProp();
        String plataforma = prop.getProperty("properties.plataforma");

        if ("Mobile".equalsIgnoreCase(plataforma)) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("automationName", "UIAutomator2");

            // Abre o app de contatos
            capabilities.setCapability("appPackage", "com.android.contacts");
            capabilities.setCapability("appActivity", ".activities.PeopleActivity");

            // Permissões automáticas
            capabilities.setCapability("autoGrantPermissions", true);

            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } else {
            System.out.println("Deve definir plataforma como 'Mobile' no setup.properties");
        }

        return driver;
    }

    private static Properties getProp() throws IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream(
                "src" + File.separator + "test" + File.separator + "setup.properties"
        );
        props.load(file);
        return props;
    }
}
