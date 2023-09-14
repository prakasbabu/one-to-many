package com.prakash;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.prakash.entity.Course;
import com.prakash.entity.Student;
import com.prakash.repo.CourseRepo;
import com.prakash.repo.StudentRepo;

@SpringBootApplication
public class CourseStudentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxApplicationContext = SpringApplication.run(CourseStudentApplication.class, args);
		
		CourseRepo daoCourse = ctxApplicationContext.getBean(CourseRepo.class);
		StudentRepo daoStudent = ctxApplicationContext.getBean(StudentRepo.class);
		
		
		Student student1 = new Student ();
		
		student1.setStudentName("Siva");
		student1.setStudentAddres("123 main st");
		student1.setStudentEmail("abc@gmail.com");
		
		Student student2 = new Student ();
		
		student1.setStudentName("Siva2");
		student1.setStudentAddres("1234 main st");
		student1.setStudentEmail("abcd@gmail.com");
		
		List <Student> students = new ArrayList<>() ;
		
		students.add(student2);
		students.add(student1);
		
		Course course = new Course ();
		
		course.setCourseName("Java");
		course.setCourseFee("1000");
		course.setCourseDuration("4 weeks");
		course.setStudents(students);
		
		
		
		Course savedCourse = daoCourse.save(course);
		

	}

}
