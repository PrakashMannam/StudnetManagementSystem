package abstractClasses;

import abstractClasses.*;
import model.Course;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentlist = new ArrayList<>();

        System.out.print("Enter the number of Students: ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("\n--- Entering Details for Student " + (i + 1) + " ---");

            System.out.print("Is this a Regular or Online student? (R/O): ");
            String type = sc.nextLine();
            while (!type.equalsIgnoreCase("R") && !type.equalsIgnoreCase("O")) {
                System.out.print("Invalid input. Please enter 'R' or 'O': ");
                type = sc.nextLine();
            }

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("How many courses is this student taking? ");
            int courseCount = sc.nextInt();
            sc.nextLine();

            List<Course> courses = new ArrayList<>();

            for (int j = 0; j < courseCount; j++) {
                System.out.println("  → Course " + (j + 1));

                System.out.print("     Enter course name: ");
                String courseName = sc.nextLine();

                System.out.print("     Enter credit hours: ");
                int credits = sc.nextInt();
                sc.nextLine();

                courses.add(new Course(courseName, credits));
            }

            Student student;
            if (type.equalsIgnoreCase("R")) {
                student = new RegularStudent(id, name, courses);
            } else {
                student = new OnlineStudent(id, name, courses);
            }

            studentlist.add(student);
        }


        System.out.println("\n=== Student Details ===");
        for (Student s : studentlist) {
            s.displayBasicInfo();
            s.displayCourseDetails();
            System.out.println("--------------------");
        }

        
        sc.close();
    }
}
