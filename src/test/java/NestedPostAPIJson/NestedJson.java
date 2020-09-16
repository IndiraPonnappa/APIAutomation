package NestedPostAPIJson;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import NestedPostAPIJson.Courses.ApiAutomation;
import NestedPostAPIJson.Courses.MobileAutomation;
import NestedPostAPIJson.Courses.WebAutomation;
import io.restassured.response.Response;

public class NestedJson {
	public static void main(String[] args) {
		
		List<WebAutomation> webs= new ArrayList<WebAutomation>();
		Courses.WebAutomation sel= new Courses.WebAutomation();
		sel.setCourseTitle("Selenium");
		sel.setPrice(4000);
		
		Courses.WebAutomation pro= new Courses.WebAutomation();
		pro.setCourseTitle("Protractor");
		pro.setPrice(5000);
		
		webs.add(sel);
		webs.add(pro);
		
		List<ApiAutomation> apis= new ArrayList<ApiAutomation>();
		Courses.ApiAutomation rest= new Courses.ApiAutomation();
		rest.setCourseTitle("Rest Assured");
		rest.setPrice(5000);
		
		Courses.ApiAutomation soap= new Courses.ApiAutomation();
		soap.setCourseTitle("Soap API Automation");
		soap.setPrice(3000);
		
		apis.add(rest);
		apis.add(soap);
		
		
		List<MobileAutomation> mob= new ArrayList<MobileAutomation>();
		Courses.MobileAutomation app= new Courses.MobileAutomation();
		app.setCourseTitle("Appium");
		app.setPrice(5000);
		
		mob.add(app);
		
			
		Courses course=new Courses();
		course.setWebAutomation(webs);
		course.setApiAutomation(apis);
		course.setMobileAutomation(mob);
		
		ServiceDetailsPojo sp= new ServiceDetailsPojo();
		sp.setInstructor("Indira");
		sp.setUrl("SoftwareTestingautomation.com");
		sp.setServices("Software Testing");
		sp.setExpertise("Software Testing");
		sp.setCourses(course);
		sp.setLinkedin("linkedin");
		
		Response postResponse=given()
				.auth().none()
				.header("Content-Tytpe","application/json")
				.when()
				.body(sp).log().all()
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
