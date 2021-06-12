package com.training.test.project.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column(name="STUDENT_ID")
	private long id;
	
	@Column(name="STUDENT_NAME")
	private String studentName;
	
	@Column(name="COURSE_NAME")
	private String courseName;
	
	

}
