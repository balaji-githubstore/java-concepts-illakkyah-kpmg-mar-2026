package com.kpmg.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kpmg.model.Pet;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo5GetPetValidationTest {
	public static String baseUrl = "https://petstore.swagger.io/v2";

	@Test
	public void findValidPetById() {
		String resource = "/pet/5";
	    Pet petResponse=RestAssured.given().when().get(baseUrl + resource).then().statusCode(200)
	    		.extract().as(Pet.class);

	    System.out.println(petResponse.id);
	    System.out.println(petResponse.name);
	    System.out.println(petResponse.category.name);
	}

}
