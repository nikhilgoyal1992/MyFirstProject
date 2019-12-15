package RestASSURED;
import java.util.Random;

import org.json.JSONObject;
import org.testng.annotations.Test;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class POST extends java.lang.Object {


	@Test(enabled = false)
	public void PostSimple()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		RequestSpecification reqspec = RestAssured.given();
		//JSONObject jobj = new JSONObject();
		//jobj.put("FirstName", "Nikhil");

		reqspec.header("content-type", "application/json");
		JSONObject json = new JSONObject();
		json.put("FIRSTNAME", 11);
		

		
		Response response = reqspec.request(Method.POST, "/register");
		System.out.println(response.getStatusCode());

	}


	@Test(enabled = true)
	public void PostusingGWT()
	{


		JSONObject json = new JSONObject();
		int randomid = new Random().nextInt(1000);
		json.put("id", randomid);
		json.put("title", "mytitle"+randomid);


		RestAssured.baseURI = "http://localhost:3000";
		RestAssured.given()
		.header("content-type", "application/json")
		.and()
		.body(json.toString())
		.when()
		.post("/posts")
		.then()
		.statusCode(200)
		.and()
		.log().all();

	}

	@Test(enabled = false)
	public void POSTUsingAUTHORIZATION()
	{
		
		
		int code =  RestAssured.given()
		.auth().preemptive()
		.basic("ToolsQA", "TestPassword")
		.when()
		.get("http://restapi.demoqa.com/authentication/CheckForAuthentication")
		.getStatusCode();
		System.out.println("status is " + code);


	}



















}