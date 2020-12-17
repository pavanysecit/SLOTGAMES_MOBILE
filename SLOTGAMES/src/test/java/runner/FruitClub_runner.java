package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/FruitClub_AllUsecases.feature", glue={"stepDefinition_FruitClub"})
public class FruitClub_runner {
	
}