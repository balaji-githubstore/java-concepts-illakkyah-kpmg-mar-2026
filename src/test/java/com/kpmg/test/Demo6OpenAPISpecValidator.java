package com.kpmg.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.atlassian.oai.validator.restassured.OpenApiValidationFilter;
import com.kpmg.model.Pet;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo6OpenAPISpecValidator {
	public static String baseUrl = "https://petstore.swagger.io/v2";

	@Test
	public void findValidPetById() {
		
		OpenApiValidationFilter validationFilter=new OpenApiValidationFilter("src/test/resources/petstore.yaml");
		String resource = "/pet/5";
	    Pet petResponse=RestAssured.given()
	    		.filter(validationFilter)
	    		.when().get(baseUrl + resource).then().statusCode(200)
	    		.extract().as(Pet.class);

	    System.out.println(petResponse.id);
	    System.out.println(petResponse.name);
	    System.out.println(petResponse.category.name);
	}

}
