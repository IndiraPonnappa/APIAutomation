package APITests;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import io.restassured.response.Response;

public class PostAPIRequest {

	public static void main(String[] args) {
		
		
		//Passing the payload as string(not recommended)
		/*String payLoad="{\"name\": \"morpheus\",\"job\": \"leader\"}";
		Response postResponse=given()
				.auth().none()
				.header("Content-Tytpe","application/json")
				.when()
				.body(payLoad)
				.post("https://reqres.in/api/users");
				System.out.println("The response body is :" +postResponse.asString());
				int statusCode= postResponse.getStatusCode();
				System.out.println("The status code is :"+statusCode);*/
		
		
		//Create a Hashmap to send the payload 
		HashMap<String,String> hm= new HashMap<String,String>();
		hm.put("name", "morpheus");
		hm.put("job", "leader");
		Response postResponse=given()
		.auth().none()
		.header("Content-Tytpe","application/json")
		.when()
		.body(hm)
		.post("https://reqres.in/api/users");
		System.out.println("The response body is :" +postResponse.asString());
		int statusCode= postResponse.getStatusCode();
		System.out.println("The status code is :"+statusCode);
		
		
		if(statusCode==201){
			
			System.out.println("Post request successfull");
		}
		else{
			
			System.out.println("Post request failed");
		}
		
		
		
	}
}
