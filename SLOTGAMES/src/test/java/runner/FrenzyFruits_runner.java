package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/FrenzyFruits_AllUsecases.feature", glue={"stepDefinition_FrenzyFruits"})
public class FrenzyFruits_runner {
	
}