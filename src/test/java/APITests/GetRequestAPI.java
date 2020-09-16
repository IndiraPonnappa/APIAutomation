package APITests;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;

public class GetRequestAPI {

	public static void main(String[] args) {
		System.out.println("First API Test using rest assured");

		Response getResponse  =given()
				.param("Page", "2").auth().none()
				.header("Content-Type","application/json")
				.when()
				.get("https://reqres.in/api/users");
		/*.then()
		.statusCode(200)
		.body("page",equalTo(1));*/

		System.out.println("The response body is:" +getResponse.asString());
		int statusCode=getResponse.getStatusCode();
		System.out.println("The status code is :" +statusCode);
		long TimeTaken=getResponse.getTime();
		System.out.println("Time taken :" +TimeTaken);

		if(statusCode==200){
			System.out.println("Get request successfully executed");
		}
		else{
			System.out.println("Get request failed");
		}


	}

}
