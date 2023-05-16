package com.weeklyTest.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weeklyTest.mapping.model.Course;

public interface ICourseRepository extends JpaRepository<Course, Integer>{

}
