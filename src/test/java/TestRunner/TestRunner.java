package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/BigProject-Web-Blast.json",
                "html:target/cucumber-reports/BigProject-Web-Blast.html"},
        features = "src/test/resources/Features",
        glue ={"StepDefinitions"},
        tags = "@Blast"
)

public class TestRunner {
}
