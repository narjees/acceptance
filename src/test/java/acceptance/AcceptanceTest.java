package acceptance;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "classpath:features", // Assuming your feature files are in the "features" directory
    glue = "acceptance", // Package where your step definitions are located
    plugin = {"pretty", "html:target/cucumber-reports"} // Report configuration, you can adjust it as needed
)
public class AcceptanceTest {
}

