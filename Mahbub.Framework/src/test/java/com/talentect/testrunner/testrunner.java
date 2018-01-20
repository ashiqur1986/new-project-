package com.talentect.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features= {"features"},
		glue= {"com.talentect.stepdef"},
		tags= {"@register"}
		)

public class testrunner extends AbstractTestNGCucumberTests  {

}
