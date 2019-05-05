package com.basic.getRequestSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		features={"src/test/resources/com/basic/getRequestFF/GetRequestTesting.feature/"}
		)
		

public class RunmyfirstfeatureTest {


}
