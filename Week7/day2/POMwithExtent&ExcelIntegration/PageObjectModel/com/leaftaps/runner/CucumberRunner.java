package com.leaftaps.runner;

import org.testng.annotations.DataProvider;

import com.leaftaps.base.ProjectSpecificMethods;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/main/java/com/leaftaps/features"}, 
glue = {"com/leaftaps/page"}, 
dryRun = false,
publish=true,
tags = "@LT1202",
monochrome = true)
public class CucumberRunner extends ProjectSpecificMethods {
// Both the scenarios should execute in parallel mode 
	
	@DataProvider(parallel = true)
    public Object[][] scenarios(){
		return super.scenarios();
	}
}
