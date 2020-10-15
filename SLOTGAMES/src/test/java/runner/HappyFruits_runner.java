package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/HappyFruits_AllUsecases.feature", glue={"stepDefinition_HappyFruits"})
public class HappyFruits_runner {
	
}