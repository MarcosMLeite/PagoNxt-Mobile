package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import support.DriverQA;
import support.PlataformaMobile;

@RunWith(Cucumber.class)
@CucumberOptions(

        tags = {"~@ignore","@contato"},
        features = {"src"},
        snippets = SnippetType.CAMELCASE,
        plugin = {"json:target/reports/CucumberReport.json"},
//				  "pretty"},
        monochrome = true,
        dryRun = false,
        glue = {"steps","support"})

public class RunnerTest{


    private Object SnippetType;

    @BeforeClass
    public static void inicio() throws Exception {
        PlataformaMobile.inicializarDriver();
    }

    @AfterClass
    public static void cleanup() throws Exception {
        if (PlataformaMobile.driver != null) {
            PlataformaMobile.driver.quit();
        }
    }}




