package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/sw176/git/SLOTGAMES_MOBILES/SLOTGAMES/features/FrizzlingHot_AllUsecases.feature", glue={"stepDefinition_FrizzlingHot"})
public class FrizzlingHot_runner {
	
}