package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ="Feature",
		glue = "com.stepdefinition"
		/*,
		tags = "@signin"*/
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
