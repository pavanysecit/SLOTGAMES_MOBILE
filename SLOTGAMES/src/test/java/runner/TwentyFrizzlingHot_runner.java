package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/20FrizzlingHot_AllUsecases.feature", glue={"stepDefinition_20FrizzlingHot"})
public class TwentyFrizzlingHot_runner {
	
}