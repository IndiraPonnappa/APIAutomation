package APITests;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;

import javax.print.DocFlavor.STRING;

import io.restassured.response.Response;

public class postAPIRequestComplexBody {

	public static void main(String[] args) {

		HashMap<String,Object> map= new HashMap<String,Object>();
		map.put("name", "morpheus");
		map.put("job", "leader");

		ArrayList<String> sk=new ArrayList<String>();
		sk.add("java");
		sk.add("C");

		map.put("Skills",sk);

		HashMap<String, Object> det= new HashMap<String,Object>();
		det.put("companyName", "XyZ");
		det.put("email", "xyz@gmail.com");

		map.put("details", det);



		Response postResponse=given()
				.auth().none()
				.header("Content-Tytpe","application/json")
				.when()
				.body(map).log().all()
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
