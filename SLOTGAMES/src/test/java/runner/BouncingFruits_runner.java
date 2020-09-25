package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/BouncingFruits_AllUsecases.feature", glue={"stepDefinition_BouncingFruits"})
public class BouncingFruits_runner {
	
}