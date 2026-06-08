package com.kpmg.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kpmg.model.Pet;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Demo7PostFromJson {

	public static String baseUrl = "https://petstore.swagger.io/v2";

	@Test
	public void addValidPetFromJSonTest() throws FileNotFoundException {
		
	FileInputStream file=new FileInputStream("src/test/resources/new_pet.json");
		
		JsonPath jsonPath=new JsonPath(file);
		
		String requestBody=jsonPath.prettify();
		
		System.out.println(requestBody);
		
		String resource = "/pet";


		Response response = RestAssured.given().header("Content-Type", "application/json").body(requestBody).when()
				.post(baseUrl + resource).then().statusCode(200).log().all().extract().response();

		System.out.println(response.statusCode());
		System.out.println(response.asString());

		Assert.assertEquals(response.statusCode(), 200);

		Pet petResponse = response.as(Pet.class);

		System.out.println(petResponse.id);
		System.out.println(petResponse.name);
		System.out.println(petResponse.category.name);
	}

}
