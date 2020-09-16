package NestedPostAPIJson;

import java.util.List;

public class Courses {
	private List<WebAutomation> webAutomation;
	private List<ApiAutomation> apiAutomation;
	private List<MobileAutomation> mobileAutomation;
	
	public List<WebAutomation> getWebAutomation() {
		return webAutomation;
	}
	public void setWebAutomation(List<WebAutomation> webAutomation) {
		this.webAutomation = webAutomation;
	}
	public List<ApiAutomation> getApiAutomation() {
		return apiAutomation;
	}
	public void setApiAutomation(List<ApiAutomation> apiAutomation) {
		this.apiAutomation = apiAutomation;
	}
	public List<MobileAutomation> getMobileAutomation() {
		return mobileAutomation;
	}
	public void setMobileAutomation(List<MobileAutomation> mobileAutomation) {
		this.mobileAutomation = mobileAutomation;
	}
	

	public static class WebAutomation{
		private String courseTitle;
		private double price;
		public String getCourseTitle() {
			return courseTitle;
		}
		public void setCourseTitle(String courseTitle) {
			this.courseTitle = courseTitle;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		

	}
	public static class ApiAutomation{
		private String courseTitle;
		private double price;
		public String getCourseTitle() {
			return courseTitle;
		}
		public void setCourseTitle(String courseTitle) {
			this.courseTitle = courseTitle;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		

	}
	public static class MobileAutomation{
		private String courseTitle;
		private double price;
		public String getCourseTitle() {
			return courseTitle;
		}
		public void setCourseTitle(String courseTitle) {
			this.courseTitle = courseTitle;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		

	}


}
