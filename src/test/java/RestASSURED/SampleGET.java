package RestASSURED;

import java.util.Random;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import netscape.javascript.JSObject;

public class SampleGET {

	
	
@Test
public void getMethod()
{
	
	RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	RequestSpecification reqspec = RestAssured.given();
	
	
	Response response = reqspec.request(Method.GET, "/Hyderabad");
	System.out.println(response.getStatusCode());
	System.out.println("==================");
	System.out.println(response.getBody().asString());
	
			
	
	
}
	
	
	
	
	
	
}
