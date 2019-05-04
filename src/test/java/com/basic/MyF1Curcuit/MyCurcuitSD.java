package com.basic.MyF1Curcuit;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

public class MyCurcuitSD {
	
	Response res;
	
	@Given("^use satrt the rest asured test$")
	public void use_satrt_the_rest_asured_test() throws Throwable {
	   res=RestAssured.given().get("https://ergast.com/api/f1/2018/circuits.json");
	}

	@When("^user hit the get request$")
	public void user_hit_the_get_request(){
	    
	}

	@Then("^user checks count or size$")
	public void user_checks_count_or_size(){
		String limitvalue=res.getBody().jsonPath().getString("MRData.limit");
		Assert.assertEquals("30", limitvalue);	    
		
		//verify size
		res.then().assertThat().body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
	}

	@Then("^user checks at path \"([^\"]*)\"$")
	public void user_checks_at_path(String arg1){
	    
	}
}
