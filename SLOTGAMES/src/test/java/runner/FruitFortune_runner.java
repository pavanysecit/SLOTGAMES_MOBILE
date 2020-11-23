package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/FruitFortune_AllUsecases.feature", glue={"stepDefinition_FruitFortune"})
public class FruitFortune_runner {
	
}