package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/LadyCharm_AllUsecases.feature", glue={"stepDefinition_LadyCharm"})
public class LadyCharm_runner {
	
}
