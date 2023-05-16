package com.weeklyTest.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.weeklyTest.mapping.model.Course;
import com.weeklyTest.mapping.repository.ICourseRepository;

@Service
public class CourseService {
	@Autowired
	private ICourseRepository courseRepo;
	
	
	//create 
	public Course addCourse(Course newCourse) {
		return courseRepo.save(newCourse);
	}
	
	//get by id
	public Course getCourseById(int id) {
		return courseRepo.findById(id).get();
	}
	
	//get all
	public List<Course> getAllCourse(){
		return courseRepo.findAll();
	}
	
	//delete
	public void deleteCourseById(int id) {
		courseRepo.deleteById(id);
	}
	
	//update
	public void updateCourseById(int id,Course newCourse) {
		Course course = courseRepo.findById(id).get();
		
		course.setCourseId(newCourse.getCourseId());
		course.setDescription(newCourse.getDescription());
		course.setDuration(newCourse.getDuration());
		course.setTitle(newCourse.getTitle());
		course.setStudentList(newCourse.getStudentList());
		
		courseRepo.save(course);
	}
	

}
