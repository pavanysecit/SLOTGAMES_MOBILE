package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/sw176/git/SLOTGAMES_MOBILES/SLOTGAMES/features/20SplendidHot_AllUsecases.feature", glue={"stepDefinition_20SplendidHot"})
public class TwentySplendidHot_runner {
	
}