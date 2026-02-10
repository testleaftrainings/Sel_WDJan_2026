package runner;

import io.cucumber.testng.CucumberOptions;
import steps.CommonBase;


@CucumberOptions(features = {"src/test/java/features"}, 
glue = {"steps"}, 
dryRun = false,
publish=true,
tags = "@LT1202")
public class TC001_Login extends CommonBase{
	

}
