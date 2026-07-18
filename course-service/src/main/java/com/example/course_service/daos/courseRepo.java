package com.example.course_service.daos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.course_service.model.Course;

@Repository
public class courseRepo{
	private List<Course> courses = new ArrayList<>();
	
	public Course addCourse(Course course) {
		courses.add(course);
		return course;
		
	}
	
	public Course findCourse(int id) {
		return courses.stream()
				.filter(course -> course.getid()==id)
				.findFirst().orElseThrow();
		
		
	}
	
	public List<Course> findAllCourses(){
		return courses;
	}

}
