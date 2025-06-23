package support;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends BaseSteps {


    @After(order = 3)
    public void printScreen(Scenario scenario) throws InterruptedException {
        Thread.sleep(1000);

    }

    @After(value = "@fecharNavegador", order = 1)
    public void closeBrowser() {
        driver.quit();
    }

    @Before(value = "@fecharNavegadorBefore", order = 2)
    public void closeBrowserBefore() {
        driver.quit();
    }

    @After("@fecharGuia")
    public void fecharGuia() {
        driver.close();
    }
}
