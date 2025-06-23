package support;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverQA {

    public static MobileDriver driver;
    private static DriverQA instance;

    public static DriverQA getInstance() {
        if (instance == null) {
            instance = new DriverQA();
        }
        return instance;
    }

    public void validarTextoParcialmente(MobileElement elemento, String textoEsperado) {
        String textoDoElemento = elemento.getText();

        if (!textoDoElemento.contains(textoEsperado)) {
            System.out.println("Texto do elemento: '" + textoDoElemento + "' é diferente do texto esperado: '" + textoEsperado + "'");
            Assert.fail("Texto não corresponde parcialmente.");
        }
    }

    public MobileElement waitForVisibilityElement(MobileElement elemento, int timeInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
        wait.until(ExpectedConditions.visibilityOf(elemento));
        return elemento;
    }
    public void quit() {
        driver.quit();
    }

    public void close() {
        driver.close();
    }



}
