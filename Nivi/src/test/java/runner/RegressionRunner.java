package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/featurefile"},
        glue = {"stepdefination"},
        tags = "@RegressionTests",
        plugin = {"pretty","html:target/test-output/report.html"}

)
public class RegressionRunner {
}
