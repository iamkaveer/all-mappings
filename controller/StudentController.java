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
import com.weeklyTest.mapping.model.Student;
import com.weeklyTest.mapping.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	//create student
	@PostMapping("/add-student")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	//get by id
	@GetMapping("/get-student/{id}")
	public Student getStudentsById(@PathVariable int id) {
		return studentService.getStudentById(id);
	}
	
	//update student by id
	@PutMapping("/update-student/{id}")
	public void updateStudent(@PathVariable int id,@RequestBody Student newStudent) {
		studentService.updateStudentById(id, newStudent);
    }
	
	//delete student by id
	
	@DeleteMapping("delete-student/{id}")
    public void deleteStudent(@PathVariable int id) {
		studentService.deleteStudentById(id);
    }
	
	//get all
	
	@GetMapping("/find-all-students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudent();
	}
	
	

}
