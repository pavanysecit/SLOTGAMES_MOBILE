package runner;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/SoccerMania_AllUsecases.feature", glue={"stepDefinition_SoccerMania"}, plugin ={"com.cucumber.listener.ExtentCucumberFormatter:target/html/Report.html"})
public class SoccerMania_runner {

	
	@AfterClass
	public static void setup()
		{
		Reporter.loadXMLConfig(new File("src/test/java/extent-config.xml"));
		//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
		Reporter.setSystemInfo("User Name", "AJ");
		Reporter.setSystemInfo("Application Name", "Test App");
		Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
		Reporter.setSystemInfo("Environment", "Production");
		Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
		}
	}