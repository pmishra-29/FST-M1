package Examples;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecificationTest {
	
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	
	int petId =0;
	
	@BeforeClass
	public void setUp() {
	//	RequestSpecifications
		requestSpec = new RequestSpecBuilder().
				setBaseUri("https://petstore.swagger.io/v2/pet").
				addHeader("Content-Type","application/json").
				build();
	//	ResponseSpecifications
		responseSpec = new ResponseSpecBuilder().
				expectStatusCode(200).
				//expectBody("status",equalTo("alive")).
				expectResponseTime(lessThanOrEqualTo(3000L)).
				build();

	}
	

	@Test(priority = 1)
	public void addPetRecord() {
		//Post https://petstore.swagger.io/v2/pet
		Map <String, Object> reqBody = new HashMap<>();
		reqBody.put("id", 996600);
		reqBody.put("name", "Tintin");
		reqBody.put("status","alive");
		
		//Create a response object

	Response response = 
		given().spec(requestSpec).
			body(reqBody).
		when().post();
	
	//Extract the petId
	petId =response.then().extract().path("id");
	
	
	// Assertion
	response.then().spec(responseSpec).body("name", equalTo("Tintin"));
	
	}
	
	@Test(priority = 2)
	public void getPetRecord() {
		//GET https://petstore.swagger.io/v2/pet/{petId}
				given().spec(requestSpec).pathParam("petId", petId). // Set path parameter
				when().get("/{petId}").
				then().spec(responseSpec).body("status", equalTo("alive")); // Send GET request
	 
	}
	

	@Test(priority = 3)
	public void deletePetRecord() {
		//Delete https://petstore.swagger.io/v2/pet/{petId}
		given().spec(requestSpec).pathParam("petId", petId). // Set path parameter
		when().delete("/{petId}").
		then().spec(responseSpec).body("message", equalTo(""+petId)); // Send GET request

	}
	
}
