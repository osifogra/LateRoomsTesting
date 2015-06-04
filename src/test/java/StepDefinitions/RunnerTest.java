package StepDefinitions;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/resource",
        tags = {"@BookingAsGuestUser"}
)

public class RunnerTest {
}











