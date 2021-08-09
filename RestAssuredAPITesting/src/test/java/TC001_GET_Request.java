import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request {
	
	
	@Test
	void getWeatherDetails() 
	{
		//Specify base URI
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		
		//Request Object
		RequestSpecification httprequest= RestAssured.given();
		
		//Response Object
		Response response=httprequest.request(Method.GET,"/Hyderabad");
		
		//print console in console window
		String responseBody=response.getBody().asString();
		System.out.println("Response body is "+responseBody);
		
		
		//Status code Validation
		int StatusCode=response.getStatusCode();
		System.out.println("Status code is " +StatusCode);
		Assert.assertEquals(StatusCode, 200);
		
		//Status line verification
		String statusLine=response.getStatusLine();
		System.out.println("Status Line is :"+statusLine);
		Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
	}

}
