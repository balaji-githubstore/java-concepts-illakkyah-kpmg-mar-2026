package com.kpmg.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/**
 * example for path parameter
 */
public class Demo1GetPathParameter {
	public static String baseUrl = "https://petstore.swagger.io/v2";

	@Test
	public void findValidPetById() {
		String resource = "/pet/10";
		Response response = RestAssured.given().when().get(baseUrl + resource);
		System.out.println(response);

		System.out.println(response.statusCode());
		System.out.println(response.asString());
		
//		JsonPath json= response.jsonPath();
//		System.out.println(json.getInt("id"));
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertTrue(response.asString().contains("10"));
	}

	@Test
	public void findinvalidPetById() {
		String resource = "/pet/1878787";
		Response response = RestAssured.given().when().get(baseUrl + resource);
		System.out.println(response);

		System.out.println(response.statusCode());
		System.out.println(response.asString());

		Assert.assertEquals(response.statusCode(), 404);
		Assert.assertTrue(response.asString().contains("Pet not found"));
	}
	
	@Test
	public void findValidPetById2() {
		String resource = "/pet/10";
		String responseStr=RestAssured.given().when().get(baseUrl + resource).then().statusCode(200).extract().asString();

		Assert.assertTrue(responseStr.contains("10"));
	}

}
