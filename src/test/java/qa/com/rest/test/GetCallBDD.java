package qa.com.rest.test;

import org.testng.annotations.*;

import io.restassured.RestAssured;
import io.restassured.http.*;
import io.restassured.response.*;
import io.restassured.specification.RequestSpecification;
import io.restassured.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class GetCallBDD {
	
	@Test
	public void GetWeatherDetails()
	{   
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
 
		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
 
		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/Hyderabad");
 
		// Now let us print the body of the message to see what response 
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
 
	}
}