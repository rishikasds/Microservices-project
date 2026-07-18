package com.example.course_service.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.course_service.daos.courseRepo;
import com.example.course_service.model.Course;


@RestController
@RequestMapping("/course")
public class courseController {
	 
    @Autowired
	private courseRepo repo;
    
    private static final Logger LOGGER = 
			LoggerFactory.getLogger(courseController.class);
	
	@PostMapping
	public Course createCourse(@RequestBody Course course) {
		LOGGER.info("Course add: {}", course);
	   return repo.addCourse(course);
	}
	
	@GetMapping("/{id}")
	public Course findById(@PathVariable int id) {
		LOGGER.info("Course find: id={}",id );
		return repo.findCourse(id);
		
	}
	
	@GetMapping
	public List<Course> findAll() {
		LOGGER.info("Find All  Courses");
		return repo.findAllCourses();
	}

}
