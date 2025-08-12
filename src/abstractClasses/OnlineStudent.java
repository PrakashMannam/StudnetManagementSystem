package abstractClasses;
import java.util.*;
import model.Course;
public class OnlineStudent extends Student{
	public OnlineStudent(int id, String name , List<Course> courses) {
		super(id,name,courses);
	}
	public void displayCourseDetails() {
		System.out.println("Online Student courses");
		for(Course c:courses) {
			System.out.println(" - "+courses);
		}
	}
}
