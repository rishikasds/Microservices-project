package com.example.course_service.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private int id;
	private String name;
	
	private List<Student> students = new ArrayList<>();

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	
   public Course() {
		
	}
   
   public Course(int id, String name) {
	this.id = id;
	this.name = name;
    }

	@Override
	public String toString() {
		return "course [id=" + id + ", name=" + name + ", students=" + students + "]";
	}

	}
