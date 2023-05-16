package com.weeklyTest.mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.weeklyTest.mapping.model.Course;
import com.weeklyTest.mapping.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/add-course")
	public Course addBook(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
	
	@GetMapping("/get-course/{id}")
	public Course getCourseById(@PathVariable int id) {
		return courseService.getCourseById(id);
	}
	
	@PutMapping("/update-course/{id}")
	public void updateCourse(@PathVariable int id,@RequestBody Course newCourse) {
		courseService.updateCourseById(id, newCourse);
    }
	
	@DeleteMapping("delete-course/{id}")
    public void deleteCourse(@PathVariable int id) {
		courseService.deleteCourseById(id);
    }
	
	@GetMapping("/get-all-courses")
	public List<Course> getAllCourses(){
		return courseService.getAllCourse();
	}
	

}
