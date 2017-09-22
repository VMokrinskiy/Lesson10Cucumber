import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"C:/Users/VMokrinskiy/lesson10-2/src/test/resources/features/example.feature:11"},
plugin = {"json:target/cucumber-reports/2.json"},
monochrome = false,
glue = { "com.aplana" })
public class ExampleIT {
}
