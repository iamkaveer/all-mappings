package com.weeklyTest.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weeklyTest.mapping.model.Student;
import com.weeklyTest.mapping.repository.IStudentRepository;

@Service
public class StudentService {
	@Autowired
	private IStudentRepository studentRepo;
	
	//add student
	public Student addStudent(Student newStudent) {
		return studentRepo.save(newStudent);
	}
	
	//get student by id
	public Student getStudentById(int id) {
		return studentRepo.findById(id).get();
	}
	
	//get all student
	public List<Student> getAllStudent(){
		return studentRepo.findAll();
	}
	
	//update student by id
	public void updateStudentById(int id, Student newStudent) {
		Student stud = studentRepo.findById(id).get();
		stud.setId(newStudent.getId());
		stud.setName(newStudent.getName());
		stud.setAge(newStudent.getAge());
		stud.setBranch(newStudent.getBranch());
		stud.setDepartment(newStudent.getDepartment());
		stud.setPhoneNumber(newStudent.getPhoneNumber());
		stud.setAddress(newStudent.getAddress());
		
		studentRepo.save(stud);
	}
	//delete student
	public void deleteStudentById(int id) {
		studentRepo.deleteById(id);
	}

}
