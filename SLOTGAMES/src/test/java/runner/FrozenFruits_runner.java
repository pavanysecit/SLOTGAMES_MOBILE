package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/FrozenFruits_AllUsecases.feature", glue={"stepDefinition_FrozenFruits"})
public class FrozenFruits_runner {
	
}