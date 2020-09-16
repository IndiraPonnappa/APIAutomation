package APITests;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class postApiUsingPojo {

	public static void main(String[] args) {
		
		PostApiPojo pp=new PostApiPojo("morpheus","leader", new String[] {"java","c"},"XyZ","xyz@gmail.com");
		Response postResponse=given()
				.auth().none()
				.header("Content-Tytpe","application/json")
				.when()
				.body(pp).log().all()
				.post("https://reqres.in/api/users");

		postResponse.prettyPrint();
		//System.out.println(postResponse.jsonPath().get("name"));
		System.out.println("The name is :" +postResponse.getBody().path("name"));
		System.out.println("The job is :" +postResponse.getBody().path("job") );
		System.out.println("Skill 1 is :" +postResponse.getBody().path("skills[0]") );
		System.out.println("Skill 2 is :" +postResponse.getBody().path("skills[1]") );
		System.out.println("Company name is :" +postResponse.getBody().path("details.companyName") );
		System.out.println("Email id is :" +postResponse.getBody().path("details.emailId") );


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
