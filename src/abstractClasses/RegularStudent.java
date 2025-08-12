package abstractClasses;
import model.Course;
import java.util.*;
public class RegularStudent extends Student {
	public RegularStudent(int id , String name , List<Course> courses) {
		super(id, name , courses);
	}
	public void displayCourseDetails() {
		System.out.println("Regular Student Courses");
		for(Course c: courses) {
			System.out.println(" - "+c);
		}
	}
	
}
