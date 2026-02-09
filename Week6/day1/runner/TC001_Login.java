package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/java/features"}, glue = {"steps"}, dryRun = false,publish=true)
public class TC001_Login extends AbstractTestNGCucumberTests{
	

}
