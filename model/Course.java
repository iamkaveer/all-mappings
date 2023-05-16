package com.weeklyTest.mapping.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;
	@Column(name="course_title")
    private String title;
	@Column(name="course_des")
    private String description;
	@Column(name="course_duration")
    private String duration;
    @ManyToMany(mappedBy = "courses",fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Student> studentList;

}
