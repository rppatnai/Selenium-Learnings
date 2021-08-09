import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC003_GET_Request {
	
	@Test
	void googleMapTest() 
	{
		//Specify base URI
		RestAssured.baseURI="https://maps.googleapis.com";
		
		//Request Object
		RequestSpecification httprequest= RestAssured.given();
		
		//Response Object
		Response response=httprequest.request(Method.GET,"/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&radius=1500&type=supermarket&key=AIzaSyBjGCE3VpLU4lgTqSTDmHmJ2HoELb4Jy1s");
		
		//print console in console window
		String responseBody=response.getBody().asString();
		System.out.println("Response body is "+responseBody);
		
		
		//Validating contenttype Headers
		String contentType=response.header("Content-type");
		System.out.println("Content tyle : "+contentType);
		Assert.assertEquals(contentType,"application/xml; charset=UTF-8\n");
		
		//Validating ContentEncoding header
		String contentEncoding=response.header("Content-Encoding");
		System.out.println("Content tyle : "+contentEncoding);
		Assert.assertEquals(contentEncoding,"gzip");
		
		
		
	

		
	}

}
