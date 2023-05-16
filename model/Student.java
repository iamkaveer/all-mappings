package com.weeklyTest.mapping.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@Column(name="student_name")
    private String name;
	@Column(name="student_age")
    private String age;
	@Column(name="mobile")
    private String phoneNumber;
	@Column(name="student_branch")
    private String branch;
	@Column(name="student_dept")
    private String department;
    
    @Embedded
    private Address address;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "STUDENT_COURSE_TABLE",
            joinColumns = {
                    @JoinColumn(name = "student_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "course_id", referencedColumnName = "courseId")
            }
    )
    private List<Course> courses;

}
