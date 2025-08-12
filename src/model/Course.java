package model;

public class Course {
	private String courseName;
	private int creditedHours;
	public Course(String courseName , int creditedHours) {
		this.courseName = courseName;
		this.creditedHours = creditedHours;
	}
	public String getCourseName() {
		return courseName;
	}
	public int getCreditedHours() {
		return creditedHours;
	}
	public String toString() {
		return courseName +"("+creditedHours+"credits)";
	}
}
