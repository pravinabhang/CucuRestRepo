package com.basic.MyF1Curcuit;

import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features={"src/test/resources/com/basic/MyF1Curcuit/"},//it is used when there are more than one feature files
	glue={"com/basic/MyF1Curcuit/"}		
)

public class RunMyCurcuitTest {

}
