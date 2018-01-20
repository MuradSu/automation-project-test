package com.fourstay.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/cucumber-report", "json:target/cucumber.json" }, 
	features = "src/test/resources/features", 
	glue = "com/fourstay/step_definitions", 
	tags = "@smoke", 
	dryRun = true 

		)

public class CukesRunner {

}
