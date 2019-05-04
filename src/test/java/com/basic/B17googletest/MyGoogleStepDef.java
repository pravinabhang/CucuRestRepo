package com.basic.B17googletest;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyGoogleStepDef {
	Response res;
	int stcode;
	@Given("^I wants to open google$")
	public void i_wants_to_open_google() throws Throwable {
	    System.out.println("Hitting Google.com");
	    res=RestAssured.given().get("http://google.com");
	}

	@Then("^I want to check status code$")
	public void i_want_to_check_status_code() throws Throwable {
	    stcode=res.statusCode();
		Assert.assertEquals(200, stcode);
	}
	
	@Then("^I want to check \"([^\"]*)\" status code$")
	public void i_want_to_check_status_code(String sc) throws Throwable {
	    System.out.println("Validating status code");
	    String sCode =Integer.toString(stcode);
	    Assert.assertEquals(sCode, sc);
	}
}
