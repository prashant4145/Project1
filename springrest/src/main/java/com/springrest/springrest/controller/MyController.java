package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Courses;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService cs;

	@GetMapping("/home")
	public String homeHandler() {
		return "Welcome to application";
	}

	// To get the courses
	@GetMapping("/courses")
	public List<Courses> getCourses() {
		return this.cs.getCourses();

	}
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable long courseId) {
		return this.cs.getCourse(courseId);
		
	}
	
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course) {
		return this.cs.addCourse(course);
		
		
	}
}
