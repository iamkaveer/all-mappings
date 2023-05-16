package com.weeklyTest.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weeklyTest.mapping.model.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

}
