package DemoRunnerFiles;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/resources/featureFiles",
@CucumberOptions(features = "src/main/resources/features",
glue = "DemoStepDefinition")

public class RunDemoTest {	
}