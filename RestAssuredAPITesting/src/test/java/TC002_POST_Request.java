import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_POST_Request {
	
	@Test
	void RegistrationSuccessful() 
	{
		//Specify Base URI
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		
		//Request Object
		RequestSpecification httpRequest=RestAssured.given();
		
		
		//Request Payload sending along with post request
		JSONObject requestParams= new JSONObject();
		
		requestParams.put("FirstName","Rphan");
		requestParams.put("LastName","Patnaik");
		requestParams.put("UserName","Rohanpat");
		requestParams.put("Password","rohanxyz");
		requestParams.put("Email","rohanpatnai@gmail.com");
		
		
		
		httpRequest.header("Content-type","appication/json"); 
		httpRequest.body(requestParams.toJSONString());//Attach above data to the request
		
		//Response Object
		Response response=httpRequest.request(Method.POST,"/register");
		
		
		//print console in console window
		String responseBody=response.getBody().asString();
		System.out.println("Response body is "+responseBody);
		
		
		//Status code Validation
		int StatusCode=response.getStatusCode();
		System.out.println("Status code is " +StatusCode);
		Assert.assertEquals(StatusCode, 201);
		
		
		//Success Code Validation
		String successcode =response.jsonPath().get("SuccessCode");
		Assert.assertEquals(successcode, "OPERATION SUCCESS");
		
		
	}

}
