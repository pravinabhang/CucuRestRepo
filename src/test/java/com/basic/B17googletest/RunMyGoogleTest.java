package com.basic.B17googletest;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features={"src/test/resources/com/basic/B17googletest/"},//it is used when there are more than one feature files
	glue={"com/basic/B17googletest/"}		
)

public class RunMyGoogleTest {

}
