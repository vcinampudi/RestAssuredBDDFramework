package qa.com.rest.test;

import java.io.IOException;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

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
		Response response = httpRequest.request(Method.GET, "/Cape town");
		// Now let us print the body of the message to see what response 
		// we have recieved from the server
		String jsonString = response.getBody().asString();
		//System.out.println("Response Body is =>  " + jsonString);
		
		   ObjectMapper mapper = new ObjectMapper();
		      
		      //map json to student
		      try{
		    	  // JSON to Object
		         WeatherReport WeatherReport = mapper.readValue(jsonString, WeatherReport.class);		         
		         System.out.println(WeatherReport);
		         // Object to Json		         
		         jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(WeatherReport);
		         //System.out.println(jsonString);
		         
		         System.out.println(WeatherReport.getCity());
		      }
		      catch (JsonParseException e) { e.printStackTrace();}
		      catch (JsonMappingException e) { e.printStackTrace(); }
		      catch (IOException e) { e.printStackTrace(); }
		   }
	}
