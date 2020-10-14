package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/TropicanaCasino_AllUsecases.feature", glue={"stepDefinition_TropicanaCasino"})
public class TropicanaCasino_runner {
	
}