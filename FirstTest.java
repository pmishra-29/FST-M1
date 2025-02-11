package Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class FirstTest {
	
	//GET https://petstore.swagger.io/v2/pet/findByStatus?status=alive
	@Test
	public void getRequestWithQueryParam() {
		
		//Create a response object

	Response response = 
		given().
			baseUri("https://petstore.swagger.io/v2/pet").
			header("Content-Type","application/json").
			queryParam("status","alive").
		when().
			get("/findByStatus");
	
	//Print the status code
	System.out.println(response.getStatusCode());
	
	//Print the response body
	System.out.println(response.getBody().asString());
	System.out.println(response.getBody().asPrettyString());
	
	//Print the response headers
	System.out.println(response.getHeaders().asList());
	//Extract and Print the pet status
	String actualPetStatus = response.then().extract().path("[0].status");
	
	//Assert the pet status with TestNG
	Assert.assertEquals(actualPetStatus, "alive");
	
	//RestAssured assertion
	response.then().statusCode(200).body("[0].status",equalTo("alive"));
		
	}
	
	//GET https://petstore.swagger.io/v2/pet/{petId}
	@Test
	public void getRequestWithPathParam() {
				given().
					baseUri("https://petstore.swagger.io/v2/pet").
					header("Content-Type","application/json").
					pathParam("petId",77232).
					log().all().
				when().
					get("/{petId}").
				then().
					statusCode(200).
					body("name",equalTo("Hansel"));
		
	}
	
	
}
	
	


