package com.kpmg.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo4Put {

	public static String baseUrl = "https://petstore.swagger.io/v2";

	@Test
	public void updateValidPetTest() {
		String resource = "/pet";
		
		String requestBody="{\r\n"
				+ "    \"id\": 801,\r\n"
				+ "    \"category\": {\r\n"
				+ "        \"id\": 0,\r\n"
				+ "        \"name\": \"string-801\"\r\n"
				+ "    },\r\n"
				+ "    \"name\": \"doggie\",\r\n"
				+ "    \"photoUrls\": [\r\n"
				+ "        \"string\"\r\n"
				+ "    ],\r\n"
				+ "    \"tags\": [\r\n"
				+ "        {\r\n"
				+ "            \"id\": 0,\r\n"
				+ "            \"name\": \"string\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"status\": \"available\"\r\n"
				+ "}";
		
		
		Response response = RestAssured
				.given().header("Content-Type","application/json").header("api_key","special-key").body(requestBody)
				.when().put(baseUrl + resource).then().statusCode(200).log().all().extract().response();

		System.out.println(response.statusCode());
		System.out.println(response.asString());

		Assert.assertEquals(response.statusCode(), 200);
	}
	
}
