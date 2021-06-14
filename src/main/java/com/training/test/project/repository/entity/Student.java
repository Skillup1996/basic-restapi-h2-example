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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Student(long id, String studentName, String courseName) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", courseName=" + courseName + "]";
	}
	
	

}
