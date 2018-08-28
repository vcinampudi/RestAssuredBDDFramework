package qa.com.rest.test;

import org.testng.annotations.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class GetCallBDD {

	
	@Test
	public void test_NumberofCircuitsFor2017_Season() {
	
		/*given().
		when().
		then().
		assert().*/
		
		given().
		when().
		get("https://ergast.com/api/f1/2017/cicuits.json");
		
	}	
}
