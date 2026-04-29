package com.kpmg.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

/**
 * example for path parameter
 */
public class Demo2GetQueryParameter {
	public static String baseUrl = "https://petstore.swagger.io/v2";

	@Test
	public void findPetByValidStatus() {
		String resource = "/pet/findByStatus?status=sold";
		Response response = RestAssured.given().get(baseUrl + resource);

		System.out.println(response.statusCode());
		System.out.println(response.asString());

		Assert.assertEquals(response.statusCode(), 200);
	}
}
