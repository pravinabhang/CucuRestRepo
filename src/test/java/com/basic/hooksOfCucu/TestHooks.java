package com.basic.hooksOfCucu;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestHooks {
	
	RequestSpecification req;
	
	@Before
	public void testBaseURI(){
		
		RestAssured.baseURI = "https://ergast.com";
		RestAssured.basePath = "/api";
		req = RestAssured.given()
				.accept(ContentType.JSON);
				//.headers("","");
	}
	
	@Given("^user hit the get request$")
	public void user_hit_the_get_request(){
		Response resp = RestAssured.given().spec(req).relaxedHTTPSValidation().
				when().get("/f1/2017/circuits.json");
		resp.then().log().all();
		resp.then().log().status();
	}
	
	
	@After
	public void tearDown(){
		//Code the remove the data which was created 
		//cleanup code
		//databse connection close 
		System.out.println("In After 1 hook!");
	}
	
	@After
	public void tearDown1(){
		//Code the remove the data which was created 
		//cleanup code
		//databse connection close 
		System.out.println("In After 2 hook!");
	}

}
