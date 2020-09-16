package APITests;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.response.Response;

public class postAPIComplexBodyUsingJsonAPI {
	
	public static void main(String[] args) {
		
		JSONObject jo = new JSONObject();
		jo.put("name", "morpheus");
		jo.put("job", "leader");
		
		JSONArray ja= new JSONArray();
		ja.put("java");
		ja.put("c");
		jo.put("Skills", ja);
		
		JSONObject de = new JSONObject();
		de.put("companyName", "XyZ");
		de.put("email", "xyz@gmail.com");
		
		jo.put("details", de);
		Response postResponse=given()
				.auth().none()
				.header("Content-Tytpe","application/json")
				.when()
				.body(jo.toString()).log().all()
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
