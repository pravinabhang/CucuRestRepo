package com.basic.getRequestSD;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.junit.Assert;

public class MyFirstepdef {
	
	Response resp;

	@Given("^user start the rest asured test$")
	public void user_start_the_rest_asured_test(){
		System.out.println("Starting of the GET request");
	}
	
	@When("^user hit the get request$")
	public void user_hit_the_get_request(){
		
		//Response resp = 
		resp = RestAssured.given().relaxedHTTPSValidation().
					when().get("https://ergast.com/api/f1/2017/circuits.json");
		
		//print response in string
		String respString = resp.asString();
		System.out.println(respString);
		
		//get all headers
		Headers heds = resp.getHeaders();
		System.out.println(heds);
		
	}
	
	
	@Then("^use checks the staus code (\\d+)$")
	public void use_checks_the_staus_code(int expStatusCode){
		//Get status code from the response
		//int ExpCode = Integer.parseInt(expStatusCode);
		int statusCode = resp.getStatusCode();
		Assert.assertTrue(expStatusCode==statusCode);
	}
	
	@Then("^user checks the count or size$")
	public void user_checks_the_count_or_size(){
		
		String limitValue = resp.getBody().jsonPath().getString("MRData.limit");
		Assert.assertEquals("30", limitValue);
		//resp.then().assertThat().body("MRData.limit", equalToIgnoringCase("30"));
		//verify the size
		resp.then().assertThat().body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
	}
	
//	@Then("user checks \"([^\"]*)\" value")
//	public void user_checks_circuitId_value(String expectedcircuitValue){
//		System.out.println("verify single string");
//		String actualCircuitValue = resp.getBody().jsonPath().getString("MRData.CircuitTable.Circuits.circuitId[0]");
//		Assert.assertEquals(expectedcircuitValue, actualCircuitValue);
//		System.out.println("verify single string");
//	}
	
	
	@Then("^user checks at path \"([^\"]*)\" with the \"([^\"]*)\" value$")
	public void user_checks_at_path_with_the_value(String path, String expValue){
		String actualCircuitValue = resp.getBody().jsonPath().getString(path);
		System.out.println(actualCircuitValue);
		Assert.assertEquals(expValue, actualCircuitValue);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
