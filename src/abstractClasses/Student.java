package abstractClasses;
import java.util.*;
import model.Course;
public abstract class Student {
	String name;
	int id;
	List<Course> courses;
	public Student(int id , String name , List<Course> courses) {
		this.id=id;
		this.name= name;
		this.courses=courses;
	}
	public void displayBasicInfo() {
		System.out.println("Name : "+name +"| ID : "+id);
	}
	public abstract void displayCourseDetails();
}
