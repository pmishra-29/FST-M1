package Project;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GitHub_RestAssured_Project {
	
	RequestSpecification requestSpec;
	
	public String keyValue="ssh-ed25519 ***";
	int sshKeyId =0;
	
	@BeforeClass
	public void setUp() {
	//	RequestSpecifications
		requestSpec = new RequestSpecBuilder().
				setBaseUri("https://api.github.com/user/keys").
				addHeader("Authorization","token ***").
				addHeader("Content-Type","application/json").
				build();
	}


	@Test(priority = 1)
	public void postSSHKey() {
		
		Map <String, Object> reqBody = new HashMap<>();		
		reqBody.put("title","TestAPIKey");
		reqBody.put("key", keyValue);

		//Create a response object
	Response response = 
		given().spec(requestSpec).
			body(reqBody).
		when().log().all().post();
	
	// Assertion
	response.then().statusCode(201);
	
	sshKeyId =response.then().extract().path("id");

	}
	
	@Test(priority = 2)
	public void getSSHKey() {
				given().spec(requestSpec).pathParam("keyId", sshKeyId). // Set path parameter
				when().get("/{keyId}").
				then().statusCode(200);
	}
	

	@Test(priority = 3)
	public void deleteSSHKey() {
		given().spec(requestSpec).pathParam("keyId", sshKeyId). // Set path parameter
		when().delete("/{keyId}").
		then().statusCode(204); // Send GET request

	}
	
}
