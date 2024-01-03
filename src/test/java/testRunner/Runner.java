package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        glue = {"stepDefinition", "hooks"},
        plugin = {"json:target/cucumber.json", "pretty",
                "html:target/cucumber-reports.html"},
        tags = "@Test",
        monochrome = false, // display the console output in a proper readable format
        dryRun = false, // to check the mapping is proper between feature file and step def file
        stepNotifications = false //enable step notifications
)



public class Runner {
    @AfterClass
    public static void afterClass() {

    }

}
