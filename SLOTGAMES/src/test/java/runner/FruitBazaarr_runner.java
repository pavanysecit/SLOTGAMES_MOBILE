package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/FruitBazaar_AllUsecases.feature", glue={"stepDefinition_FruitBazaar"})
public class FruitBazaarr_runner {
	
}